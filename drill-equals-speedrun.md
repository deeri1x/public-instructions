# Drill - Equals Speedrun

_(aka ...But Some Objects Are More Equal Than Others)_

**Accept this project by going here: https://classroom.github.com/a/5zaDB-D6**

## Preamble

*You get the idea of a speedrun now, so let's leave that bit out.*

This drill will get you to implement `equals` and `hashCode` for a class. Of course, this begs the question: **Why would we want to do such a thing?**

Hopefully, you have an answer for that, 'cause it's the kind of thing you need to know.

## Time Required

JP's times:

1. importing accepted GitHub repo into Eclipse: **00:50**
2. coding passing solution: **03:40**
3. punting solution back to GitHub repo: **00:38**
4. submitting and verifying result: **01:21**

Your target time for step 2: **15 minutes**


## Instructions

1. Add an `equals()` to `Dice`, using the class documentation to guide you. Since you're implementing `equals`, you should of course implement `hashCode()` as well. Good thing Eclipse can generate both for you, yes? 
2. Complete the  **//TODO** entries in the `main` method in the `Main` class provided, using the documentation to guide you.
   1. If you have completed (1) and (2) properly, you will pass all the tests in `MainTests`.
   2. You might find it useful to run your main if your tests aren't passing. Here is what you should see in the console for a correctly working main:

---
---

What number are you looking for? **7**

Sorry...no 7 in [4, 11, 2, 18, 18, 1, 6, 9]

What dice number are you looking for? **9**

Found at least one 9(W)! It's at index 7.

---
---

> **Thoughts**
> - choosing certain settings when you generate your equals and hashCode will stop Checkstyle from barking at you 


## Tests

*I think you've got a handle on `MainTests` now, so no need for the jibber-jabber.*

