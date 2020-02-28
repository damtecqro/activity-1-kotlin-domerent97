
/*
Doménica Rentería Berrospe A01208964
Problem 05 - Reverse a list

Algorithm
    1. Create a variable (list) with the original list using the mutableListOf()
    2. Create a new variable. Assign the value to the reverse of the original list by implementing a
        function called asReverse() which will reverse the list.
    3. Print the new list.

Test Cases
    All the test cases given by the problem
        1, 1, 2, 3, 5, 8
    At least 2 test cases developed by the student
        54, 2, 3, 5, 1, 10
        456, 23, 1, 2, 3
*/

val list1 = mutableListOf(1, 1, 2, 3, 5, 8);
val reversed1 = list1.asReversed();
val list2 = mutableListOf(54, 2, 3, 5, 1, 10);
val reversed2 = list2.asReversed();
val list3 = mutableListOf(456, 23, 1, 2, 3);
val reversed3 = list3.asReversed();
println(reversed1);
println(reversed2);
println(reversed3);