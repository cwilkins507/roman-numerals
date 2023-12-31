The big differences between Roman and Arabic numerals (the ones we use today) are that Romans didn't have a symbol for zero, and that numeral placement within a number can sometimes indicate subtraction rather than addition.
Here are the basics:
# I 
The easiest way to note down a number is to make that many marks - little I's. Thus I means 1, II means 2, III means 3. However, four strokes seemed like too many....
# V
So the Romans moved on to the symbol for 5 - V. Placing I in front of the V — or placing any smaller number in front of any larger number — indicates subtraction. So IV means 4. After V comes a series of additions - VI means 6, VII means 7, VIII means 8.
# X
X means 10. But wait — what about 9? Same deal. IX means to subtract I from X, leaving 9. Numbers in the teens, twenties and thirties follow the same form as the first set, only with X's indicating the number of tens. So XXXI is 31, and XXIV is 24.
# L
L means 50. Based on what you've learned, I bet you can figure out what 40 is. If you guessed XL, you're right = 10 subtracted from 50. And thus 60, 70, and 80 are LX, LXX and LXXX.
# C
C stands for centum, the Latin word for 100. A centurion led 100 men. We still use this in words like "century" and "cent." The subtraction rule means 90 is written as XC. Like the X's and L's, the C's are tacked on to the beginning of numbers to indicate how many hundreds there are: CCCLXIX is 369.
# D
D stands for 500. As you can probably guess by this time, CD means 400. So CDXLVIII is 448. (See why we switched systems?)
# M
M is 1,000. You see a lot of Ms because Roman numerals are used a lot to indicate dates. For instance, this page was written in the year of Nova Roma's founding, 1998 CE (Common Era; Christians use AD for Anno Domini, "year of our Lord"). That year is written as MCMXCVIII. But wait! Nova Roma counts years from the founding of Rome, ab urbe condita. By that reckoning Nova Roma was founded in 2751 a.u.c. or MMDCCLI.
# V
Larger numbers were indicated by putting a horizontal line over them, which meant to multiply the number by 1,000. Hence the V at left has a line over the top, which means 5,000. This usage is no longer current, because the largest numbers usually expressed in the Roman system are dates, as discussed above.

Write a convertor to convert from Arabic to Roman and vice-versa taking accounting for numbers between 1 and 3000....

--------------------------------------------

Given a positive integer number (eg 42) determine its Roman numeral representation as a String (eg "XLII").

You cannot write numerals like IM for 999. Wikipedia states "Modern Roman numerals are written by expressing each arabic digit separately, starting with the leftmost digit, and skipping any digit with a value of zero."
For example:

1990 -> "MCMXC" (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")

2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")

99 -> "XCIX" (90 -> "XC" + 9 -> "IX")

47 -> "XLVII" (40 -> "XL" + 7 -> "VII")

The 'digits' are as follows:

"I" -> 1

"II" -> 2

"III" -> 3

"IV" -> 4

"V" -> 5

"VI" -> 6

"VII" -> 7

"VIII" -> 8

"IX" -> 9

"X" -> 10

"XX" -> 20

"XXX" -> 30

"XL" -> 40

"L" -> 50

"LX" -> 60

"LXX" -> 70

"LXXX" -> 80

"XC" -> 90

"C" -> 100

"CC" -> 200

"CCC" -> 300

"CD" -> 400

"D" -> 500

"DC" -> 600

"DCC" -> 700

"DCCC" -> 800

"CM" -> 900

"M" -> 1000

"MM" -> 2000

"MMM" -> 3000

"MMMM" -> 4000
