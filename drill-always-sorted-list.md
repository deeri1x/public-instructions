# Drill - Always Sorted List

_(aka Order Up!)_

Estimated completion time: 80 minutes

**Accept this project by going here:** https://classroom.github.com/a/0QrSzDkr

## Special Warning! (ooooh...scary!)

The intention of this drill is to get you to experience what the process of adding things in order to a list of things is like. Since you'd kinda defeat this purpose by just sorting the list using Collections.sort, I'll be doing random spot-checks of submitted entries for use of any kind of sort method! (And if I find it being used, you'll have to "(re)do it right" and resubmit...by the deadline.)

## Another Special Warning (but this one's not threatening)

As mentioned in the [More generics screencast](https://youtu.be/FLVZzE-Rhn4?t=142), I've decided to turn some compiler warnings back on, so you're going to see extra warnings show up (they'll be labelled as type`Java Problem`). **These warnings have no effect on your mark - I only care about the PMD and Checkstyle warnings.**

## Preamble

I want you to start getting a feel for solving a problem without a lot of `// TODOs` telling you what to do, step-by-step. (I worry that when you do too many things like this, you simple start following instructions blindly and not actually thinking about what you're trying to create. Being aware of the big picture is important.)


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
     1. I've added a useful method in `App.java` that removes some of the drudgery.


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

## Hints

- we did a simple add in order algorithm in lecture 2; you can use it...but since we're dealing with a more complex situation (adding when there's 2 or more things already in the list), you'll have to do some looping
- try to use some helper methods to make your code both readable **and** easy for you to develop. For example, here's my `add` method:

    ```java
    if (orderedThings.isEmpty()) {
      orderedThings.add(thingBeingAdded);
    } else {
      addInOrder(thingBeingAdded);
    }
    size++;
    ```
    Notice how this reads pretty much like English. Of course, I now need to code up `addInOrder`...but that's OK
- you will find inserting in order easier if you think about looking _one step ahead_ of your current position in the list