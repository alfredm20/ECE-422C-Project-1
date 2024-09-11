# ECE-422C-Project-1

Problem 1 (30 points)

Write Java code to find the n adjacent digits in the 1000-digit number that have the greatest product, where n is
between 2 and 20. Your code should take as input the value of n (e.g., 4) and output the greatest product using
at most n digits (e.g., 5832 or the sequence “0100” evaluating to 1). You can assume no overflow issues will
happen.

Inputs
n (int): the number of maximum adjacent digits
s (String): A 1000-digit number to search through, (not a matrix)
See above for example input. n will be on its own line, followed by s on the next line. It will be entered via
standard input.

Constraints
s.length() = 1000
2 ≤ 𝑛 ≤ 20

Output
Print the largest product formed by at most n adjacent numbers on its own line to the console.
Problem 2 (35 points) - Write a Java program that takes as input a paragraph as a String and identifies if any of
the words in the paragraph is a $1.00 word. The value of each word is calculated by adding up the value of each

Problem 2 (35 points) - 

Write a Java program that takes as input a paragraph as a String and identifies if any of
the words in the paragraph is a $1.00 word. The value of each word is calculated by adding up the value of each
one of its characters. Each letter in the alphabet is worth its position in pennies i.e. a = 1, b=2... y=25, z=26.
Capital and lowercase letters have the same values. All non-alpha characters have a value of $0.00. Words will
be delimited using spaces

Example Input:
The wicked wizard`s wily wraith garnishes his master`s pasta with garlic.

Example Output:
wizard`s
garnishes

Inputs
s (String): the input string which contains a paragraph in English. It will be entered via standard input.

Constraints
0 ≤ 𝑠. 𝑙𝑒𝑛𝑔𝑡ℎ ≤ 10!⬚

Output
Print any $1.00 words to the console as they are in input to the console with each word on its own line. Note
that you have to print out the word exactly as it appears in the input sentence.

Problem 3 (30 points) - 

Write a Java program that takes as input a sentence as a String, parses each word in the
sentence, and identifies what part of speech each word is. For this assignment, you will need to do some
research to learn more about part-of-speech tagging. Additionally, you will have to choose and download a
Java-based Part-of-speech tagger and incorporate into your own program. For example, you could try to use the
Stanford Log-linear Part-Of-Speech Tagger or do some research and find another suitable library. For this
problem, create and submit an executable JAR file that includes the tagger you used in addition to the source
code.

Example Input:
I was slowly walking to the park with my over enthusiastic dog when he bit me, and I shouted, Ouch!

Example Output:
I_PRP was_VBD slowly_RB walking_VBG to_TO the_DT park_NN with_IN my_PRP$ over_IN enthusiastic_JJ dog_NN when_WRB he_PRP bit_VBD me_PRP ,_, and_CC I_PRP shouted_VBD ,_, Ouch_NNP !_.

Inputs
s (String): the input string which contains a paragraph in English. It will be entered via standard input. See above for example input.

Output: 
A printed and tagged line to the console. Your output may not look exactly like this depending on what
library and models you use in your speech tagger. See above for example output.

Problem 4 (5 points) – 

What do you expect (and like) to learn in this class? If we have time at the end of the
semester to go through additional topics related to software engineering, Java or object-oriented programming,
what would you like us cover? Please write your answers in a text file and include it in your zip file.

