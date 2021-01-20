# Drill - Always Sorted List

_(aka Order Up!)_

**Accept this project by going here:** https://classroom.github.com/a/0QrSzDkr

## Special Warning! (ooooh...scary!)

The intention of this drill is to get you to experience what the process of adding things in order to a list of things is like. Since you'd kinda defeat this purpose by just sorting the list using Collections.sort, I'll be doing random spot-checks of submitted entries for use of any kind of sort method! (And if I find it being used, you'll have to "(re)do it right" and resubmit...by the deadline.)

## Preamble

I want you to start getting a feel for solving a problem without a lot of `// TODOs` telling you what to do, step-by-step. (I worry that when you do too many things like this, you simple start following instructions blindly and not actually thinking about what you're trying to create. Being aware of the big picture is important.)

## Time Required

JP's times:

1. importing accepted GitHub repo into Eclipse: **00:59**
2. coding passing solution: **09:22**
3. punting solution back to GitHub repo: **00:36**
4. submitting and verifying result: **01:38**

Your target time for step 2: **38 minutes**

## Skills Covered

Show you can...

- [ ] create a class from scratch that uses generics.
- [ ] determine the methods to create for a class by the tests available for that class.
- [ ] determine the code to write by observing how a finished product works.


## Instructions

1. Create an `AlwaysSortedList` class that represents a list that you can add things to. Every time you add something to the `AlwaysSortedList`, the items in the list should remain in natural order:
   1. I'd suggest using an ArrayList field to hold your items. (An array is going to cause complicated problems - trust me, I tried.) 
   2. if all the `AlwaysSortedList` tests all pass, you can consider your `AlwaysSortedList` working okay!
2. Complete the `App.java` run method so that when you run `Main.java`, the program behaves as expected by the `MainTests`.  
     1. I've added a useful method in `AlwaysSortedList` that removes some of the drudgery.


Here is an example run of a working solution (user input in **bold**):

---
---

Hi! I'm the Always Sorted List app!  
Every word you enter on a line will be added to me in order.  
I will turn each word to lowercase before it is added.  
I will keep the words in alphabetic order.  

I will show you my contents after every word.  
I will stop when you enter an empty line.  
Ready? Start entering words!  
\> **unicycle**  
contents: [unicycle]

\> **FABULOUS**  
contents: [fabulous, unicycle]

\> **SLIPped**  
contents: [fabulous, slipped, unicycle]

\> **slipped**  
contents: [fabulous, slipped, slipped, unicycle]

\> **aardvark**  
contents: [aardvark, fabulous, slipped, slipped, unicycle]

\>   
Done now! Thanks!

---
---
