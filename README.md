Coding Challenge 1

In many cases, a human expert might read a book and make a decision on the grade (i.e., year in school) for which they think the book is most appropriate. But an algorithm could likely figure that out too!

For this challenge, you’ll implement a program that calculates the approximate grade level needed to comprehend some text entered by the user. For example:

Text: Congratulations! Today is your day. You're off to Great Places! You're off and away!
Output : Grade 3

A number of “readability tests” have been developed over the years that define formulas for computing the reading level of a text. One such readability test is the Coleman-Liau index. The Coleman-Liau index of a text is designed to output that (U.S.) grade level that is needed to understand some text. The formula is:

Index = 0.0588 * L – 0.296 * S – 15.8

where L is the average number of letters per 100 words in the text, and S is the average number of sentences per 100 words in the text.
Consider the above-mentioned example. The text the user inputted has 65 letters, 4 sentences, and 14 words. 65 letters per 14 words is an average of about 464.29 letters per 100 words (because 65 / 14 * 100 = 464.29). And 4 sentences per 14 words is an average of about 28.57 sentences per 100 words (because 4 / 14 * 100 = 28.57). Plugged into the Coleman-Liau formula, and rounded to the nearest integer, we get an answer of 3 (because 0.0588 * 464.29 - 0.296 * 28.57 - 15.8 = 3): so this passage is at a third-grade reading level.

Submit your code with your output commented out at the end of your code. You are free to use C, C++, C#, Python or Java to implement this program.

Please upload your code to GitHub and submit the GitHub link for the same in a word document with your name on Canvas under the ‘Assignments’ tab.

** Note: If you have any questions regarding this coding challenge, feel free to post it in the weekly-challenge channel in discord!


Good Luck and Have Fun! 

 

