# Glossary 

# assignment statement: assigns a value to a name (variable).
# On the left of the assignment operator  =  is a name. On the right of the assignment token is an expression which is evaluated by the Python interpreter
# assignment token = is Python’s assignment token. Do not confuse it with equals, which is an operator for comparing values.
# composition: The ability to combine simple expressions and statements into compound statements and expressions in order to represent complex computations concisely.
# concatenate: To join two strings end-to-end.
# data type: A set of values. The type of a value determines how it can be used in expressions. So far, the types you have seen are integers (int), floating-point numbers (float), and strings (str).
# evaluate: To simplify an expression by performing the operations in order to yield a single value.
# expression: A combination of variables, operators, and values that represents a single result value.
# float: A Python data type which stores floating-point numbers. Floating-point numbers are stored internally in two parts: a base and an exponent.
# floor division: An operator (denoted by the token //) that divides one number by another and yields an integer, or, if the result is not already an integer, it yields the next smallest integer.
# int: A Python data type that holds positive and negative whole numbers.
# keyword: A reserved word that is used by the compiler to parse program; you cannot use keywords like if, def, and while as variable names.
# modulus operator: An operator, denoted with a percent sign ( %), that works on integers and yields the remainder when one number is divided by another.
# operand: One of the values on which an operator operates.
# operator: A special symbol that represents a simple computation like addition, multiplication, or string concatenation.
# rules of precedence: The set of rules governing the order in which expressions involving multiple operators and operands are evaluated.
# state snapshot: A graphical representation of a set of variables and the values to which they refer, taken at a particular instant during the program’s execution.
# statement: An instruction that the Python interpreter can execute. So far we have only seen the assignment statement, but we will soon meet the import statement and the for statement.
# str: A Python data type that holds a string of characters.
# value: A number or string (or other things to be named later) that can be stored in a variable or computed in an expression.
# variable: A name that refers to a value.
# variable name: A name given to a variable. Variable names in Python consist of a sequence of letters (a..z, A..Z, and _) and digits (0..9) that begins with a letter.
# In best programming practice, variable names should be chosen so that they describe their use in the program, making the program self documenting.

# Value and Data Types

type("Hello, World!") #Function will output: <class 'str'>

# variable name conventions
# always start with lower case
# sentences should be connected via underscore "_"

# Python keywords
# and	as	assert	break	class	continue
# def	del	elif	else	except	exec
# finally	for	from	global	if	import
# in	is	lambda	nonlocal	not	or
# pass	raise	return	try	while	with
# yield	True	False	None

len("hello") #is an expression that triggers a functions which will tell me how many character a string has

# Operator are tokens which  represent computations like + - * /
# The values the operator uses are called operands.

# use division
# with decimals
min = 645
hrs = min / 60
print(hrs)
# without decimal --> whole numbers --> floor division
min = 645
hrs = min // 60
print(hrs)

#Type Converters
int(3.9999)             # Output: 3 | This doesn't round to the closest int!
int(minutes / 60)       # Output: 10
int("2345")             # Output: 2345 as an int |  Parse a string to produce an int
int("23 bottles")       # Wrong
float(17)               # Output: 17.0 | Parse int to produce float
float("123.45")         # Output: 123.45 | Parse string to produce float
str(17)                 # Output: '17' | Parse int to produce string
str(123.45)             # Output: '123.45' | Parse float to produce string

#Combine Int & String
min = 645
hrs = min // 60
hrs_as_string = str(hrs) # converts int into string for concentation
print("I have " + hrs_as_string + " hours left.")

# The order of operation: evaluation depends on the rules of precedence (PEDMAS)

# Parentheses have the highest precedence and can be used to force an expression to evaluate in the order you want
# Exponentiation has the second highest precedence, so 2**1+1 is 3 and not 4, and 3*1**3 is 3 and not 27
# Division and both Multiplication operators have the same precedence,
# which is higher than Addition and Subtraction,
# which also have the same precedence. So 2*3-1 yields 5 rather than 4, and 5-2*2 is 1, not 6.
2 ** 3 ** 2 # The right-most ** operator gets done first!
(2 ** 3) ** 2 # Use parentheses to force the order you want! --> first left, then rest

# Operations on strings: you cannot perform mathematical operations on strings, even if the strings look like numbers

fruit = "banana"
baked_good = " nut bread"
print(fruit + baked_good) #concatenation

# // will use floor division: rounds down to nearest whole number
# / a single slash character for classic division

# Input (will ask for an input
n = input("Please enter your name: ")

# Composition
# most useful features of programming languages is their ability to take small building blocks and compose them into larger chunks

#Example 
#Iteration 1
response = input("What is your radius? ") #ask for inout
r = float(response)
area = 3.14159 * r**2
print("The area is ", area)

#Iteration 2 --> improved
r = float( input("What is your radius? ") )
print("The area is ", 3.14159 * r**2)

#Iteration 3 --> even more shortended but hard to read 
print("The area is ", 3.14159*float(input("What is your radius?"))**2)
# Such compact code may not be most understandable for humans
# Ever in doubt about whether to compose code or fragment it into smaller steps?
# try to make it as simple as you can for the human to follow.
# The tutors' choice would be the first case above, with four separate steps.

# The Modulus Operator --> works in int and gives remainder

q = 7 / 3 #Devider
r = 7 % 3  #Remainder
print(q,r)

# modulus operator is useful: check whether one number is divisible by another: if x % y is 0, then x is divisible by y.

total_secs = int(input("How many seconds, in total? Tell me: "))
hours = total_secs // 3600 # total_secs devided by the seconds per hours (3600) without showing  a remainder --> whole number
secs_still_remaining = total_secs % 3600 #calculated the remainder of the operation above
minutes =  secs_still_remaining // 60 #remainder devided by mins per hour without showing a remainder
secs_finally_remaining = secs_still_remaining  % 60 #remainder of secs to give sec left pout

print("Hrs =", hours, "  mins =", minutes,"secs =", secs_finally_remaining)


###########
#Exercises#
###########

# 1: Take the sentence: All work and no play makes Jack a dull boy. Store each word in a separate variable, then print out the sentence on one line using print.
a = ("All ")
b = ("work ")
c = ("and ")
d = ("no ")
e = ("play ")
f = ("Jack ")
g = ("a ")
h = ("dull ")
i = ("boy ")
print(a + b + c + d + e + f + g + h + i)

# 2: Add parenthesis to the expression 6 * 1 - 2 to change its value from 4 to -6.
res_2 = 6 * (1 - 2)
print (res_2)

# 3: Place a comment before a line of code that previously worked, and record what happens when you rerun the program.
# NameErro: name 'res_2 is not defined'

# 4: Enter bruce + 4 at the prompt. An error occurs. Assign a value to bruce so that bruce + 4 evaluates to 10.
bruce = 6
print(bruce + 4)

#5: The formula for computing the final amount if one is earning compound interest
P = 10000 # principal amount aka inital investment
n = 12 # annual nominal interest rate
r = 0.08 # number of times the interest is compounded per year
t=int(input("How many year will the money be compounded for? Write number here: ")) #number of years as user input

A = (P*(1+r/n)**n*t) #The final amount is

print("The final amount is: ")
print(A)

#6: Evaluate the following numerical expressions in your head, then use the Python interpreter to check your results:
print(5%2) #1
print(9%5) #4
print(15%12) #3
print(12%15) #12
print(6%6) #0
print(0%7) #0
print(7%0) #not working, as you can not divide or modulo int by zero 

#7: You look at the clock and it is exactly 2pm. You set an alarm to go off in 51 hours. At what time does the alarm go 
# off? (Hint: you could count on your fingers, but this is not what we’re after. If you are tempted to count on your 
# fingers, change the 51 to 5100.)

time_now = 14 #pm
time_until_alarm = 51 #hours
hours_left_after_day = time_until_alarm%24
alarm_time = time_now + hours_left_after_day
print(alarm_time)

#8: Write a Python program to solve the general version of the above problem. 
# Ask the user for the time now (in hours), and ask for the number of hours to wait. 
# Your program should output what the time will be on the clock when the alarm goes off.

