
/*
Doménica Rentería Berrospe A01208964
Problem 31 -  Determine whether a given integer number is prime

Algorithm
    1. Create a variable and assign it a number
    2. Create a 'flag' variable
    3. Using a for, we're going to check if it's only divisible by 1 and itself
    4. Inside the for, by using an if, we determine if it's a prime, if it is, the flag's
    turn to true, else it stays as false
    5. Depending on the flag's value, it prints true/false

Test Cases
    All the test cases given by the problem
        7 (prime)
    At least 2 test cases developed by the student
        23 (prime)
        8 (not prime)
*/

// first test

val num1 = 7
var flag1 = false
for (i in 2..num1 / 2)
{
  if (num1 % i == 0) {
      flag1 = true
      break
   }
}
if (!flag1)
    println("$num1 true")
else
    println("$num1 false")

// second test

val num2 = 23
var flag2 = false
for (i in 2..num2 / 2)
{
    if (num2 % i == 0) {
        flag2 = true
        break
    }
}
if (!flag2)
    println("$num2 true")
else
    println("$num2 false")

// 3rd test

val num3 = 8
var flag3 = false
for (i in 2..num3 / 2)
{
    if (num3 % i == 0) {
        flag3 = true
        break
    }
}
if (!flag3)
    println("$num3 true")
else
    println("$num3 false")
