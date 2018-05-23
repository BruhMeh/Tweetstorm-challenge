import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TweetstormGenerator {

	public static final int TWEET_SIZE = 140;
	public static int TWEET_MIN_SIZE ;
	public static int TWEET_MAX_SIZE ;

	public static void main(String[] args) {
		// Get the whole text from argument an do the minimum processing. Removing lines break and such.
		String unprocessedTweets = args[0].trim().replaceAll("\n", "").replaceAll("\r", "");

		// To discover how many tweets should be necessary (without precision)
		int numOfTweets = unprocessedTweets.length() / TWEET_SIZE;

		// Max size of tweet based on prefix size ex. 10/15
		TWEET_MAX_SIZE = TWEET_SIZE - (String.valueOf(numOfTweets).length() * 2) - 1;
		TWEET_MIN_SIZE = (int) (TWEET_MAX_SIZE * 0.8);

		List<String> tweets = generateTweetStorm(unprocessedTweets);

		// Format and print on the screen
		printTweetStorm(tweets);

	}

	private static void printTweetStorm(List<String> tweets) {
		// Case only one tweet, index is not necessary
		if (tweets.size() >= TWEET_SIZE) {
			System.out.println(tweets.stream().findFirst().get());
		}
		for (int i = 0; i < tweets.size(); i++) {
			System.out.println(i + 1 + "/" + tweets.size() + " " + tweets.get(i));
		}
	}

	private static List<String> generateTweetStorm(String unprocessedTweets) {

		List<String> processedTweets = new ArrayList<>();

		// Case it fits in one tweet
		if (unprocessedTweets.length() <= TWEET_SIZE) {
			processedTweets.add(unprocessedTweets);
		} else {
			while (unprocessedTweets.length() > TWEET_MAX_SIZE) {
				String tweetCandidate = unprocessedTweets.substring(0, TWEET_MAX_SIZE);
				// To increase readability if there is an punctuation mark near end of tweet it will end there.
				if (tweetCandidate.lastIndexOf('.') >= TWEET_MIN_SIZE
						&& tweetCandidate.lastIndexOf('.') <= TWEET_MAX_SIZE) {
					tweetCandidate = tweetCandidate.substring(0, tweetCandidate.lastIndexOf('.') +1);
					
				} else if (tweetCandidate.lastIndexOf('!') >= TWEET_MIN_SIZE
						&& tweetCandidate.lastIndexOf('!') <= TWEET_MAX_SIZE) {
					tweetCandidate = tweetCandidate.substring(0, tweetCandidate.lastIndexOf('!') +1);
					
				} else if (tweetCandidate.lastIndexOf('?') >= TWEET_MIN_SIZE
						&& tweetCandidate.lastIndexOf('?') <= TWEET_MAX_SIZE) {
					tweetCandidate = tweetCandidate.substring(0, tweetCandidate.lastIndexOf('?') +1);
					
				} else if (tweetCandidate.lastIndexOf(',') >= TWEET_MIN_SIZE
						&& tweetCandidate.lastIndexOf(',') <= TWEET_MAX_SIZE) {
					tweetCandidate = tweetCandidate.substring(0, tweetCandidate.lastIndexOf(',') +1);
					
				} else {
					tweetCandidate = tweetCandidate.substring(0, tweetCandidate.lastIndexOf(' '));
				}
				processedTweets.add(tweetCandidate);
				unprocessedTweets = unprocessedTweets.substring(tweetCandidate.length() + 1);
			}
			processedTweets.add(unprocessedTweets);
		}
		return processedTweets;
	}
}
