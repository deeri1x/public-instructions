# Drill - Keyboard Input Speedrun

_(aka Feeling Inconsoleable)_

**Accept this project by going here: https://classroom.github.com/a/S2z3JFLh**

## Preamble

A speedrun is meant to practice running through some basic skills as quickly as possible. Unlike non-speedrun drills, where you're typically asked to build a custom class and then "drive" it a bit, a speedrun drill is meant to be done solely in your `public static void main`.

## Time Required

JP's times:

1. importing accepted GitHub repo into Eclipse: **00:50**
2. coding passing solution: **05:16**
3. punting solution back to GitHub repo: **00:46**
4. submitting and verifying result: **01:18**

Your target time for step 2: **21 minutes**


## Instructions

1. Complete the **//TODO** entries in the `main` method in the `Main` class provided, using the documentation to guide you.
   1. If you have completed the tasks properly, you will pass all the tests in `MainTests`.
   2. You might find it useful to run your main if your tests aren't passing. Here is an example of a correctly working main (user input in **bold**):

---

What is your name? **Levi the Grim**  

How old are you, Levi the Grim? **22**

If I were half that age, I'd be 11.0.  

Gimme at least two words. Separate them with spaces: **all must pass**  

The first word that you gave me was "all".  

---

> **Crud you gotta deal with**
> - the name can have spaces in it, so choose your Scanner method appropriately
> - there are different ways to read an int; I tend to favour always grabbing console input as a String and then converting it to the desired type if necessary. You don't **have** to do it this way...but then there are certain things you'll need to deal with otherwise....
> - careful about finding half the given age - what kind of division are we doing here?...
> - you'll need to round the result of dividing the given age by 2 and then showing the correct number of decimal places. Think `printf` or `format`....
> - grabbing the part of a String before the first space means finding the first space!
> - how do you put double-quotes into a String again?...


## Tests

> *Since this is the first week of drills, I'll explain in detail what's going on with testing. After the first week, I'll assume you're cool with it.*
Your code is being tested through `MainTests.java`. Although it looks kinda scary, all that's going on is this:

1. The test is told what things to "type" when prompted by your `main` code. For example, in the "Bronco Billy" test, the things "typed" will be: **Bronco Billy**, **74**, and **right turn, Clyde** - in that order.
2. The test then runs the main, "typing" its input and observing what comes out in the console. That output is checked line-by-line with the Strings you see in the `List.of` part of the test. Your output has to match these Strings **exactly** - the order, spelling, and even capitalization all have to match for the test to pass. Using the `Compare Actual With Expected Test Result` mini-button is a **lifesaver** here!