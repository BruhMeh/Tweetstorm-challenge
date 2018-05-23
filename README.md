# Tweetstorm-challenge

The challenge was solved using JavaSE built in library

# How to run

To run the application it is needed Java 8 or superior installed on the host machine.

On the jar folder use the command:
```
java -jar TweetstormGenerator.jar "TweetStormContent"
```

The output will be showed as expected result in for of print statements.

# Pratical example

- Input:
```
java -jar TweetstormGenerator.jar "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec iaculis neque nec erat sodales, in fermentum mauris laoreet. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla magna augue, faucibus in semper id, pellentesque at erat. Aliquam eu sapien fermentum dui rhoncus pretium. Nunc ultricies placerat scelerisque. Proin tempus turpis metus, sed scelerisque purus tristique ac. Nulla facilisi. In tempus sagittis ante, non laoreet eros fringilla id. Morbi auctor odio quam, in interdum nibh tincidunt eget. Vestibulum enim urna, iaculis sodales tempor sit amet, eleifend fringilla leo. Vestibulum dignissim mattis porta. Curabitur congue justo a blandit sodale."
```

- Output:
```
1/6 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec iaculis neque nec erat sodales, in fermentum mauris laoreet.
2/6 Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla magna augue, faucibus in semper id, pellentesque at erat.
3/6 Aliquam eu sapien fermentum dui rhoncus pretium. Nunc ultricies placerat scelerisque. Proin tempus turpis metus,
4/6 sed scelerisque purus tristique ac. Nulla facilisi. In tempus sagittis ante, non laoreet eros fringilla id. Morbi auctor odio quam,
5/6 in interdum nibh tincidunt eget. Vestibulum enim urna, iaculis sodales tempor sit amet, eleifend fringilla leo.
6/6 Vestibulum dignissim mattis porta. Curabitur congue justo a blandit sodale.
```

# Maintenance

The code itself is auto-explained, however comments are put on some parts of the code to further explain the logic behind some of the code blocks.

# Possible Future Improvements

- Unit cases testing to guarantee that the code works
- Refactor on generateTweetStorm method to use regex instead mutiple if/else statements
- Use of twitter API to effectively tweet things
- Increase even more readability with more punctuation marks and etc. 

