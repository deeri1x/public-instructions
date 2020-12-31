# Drill - Generics Grab Bag

_(aka Should You **Really** Stick Your Hand In There?)_

Estimated completion time: **50 minutes**

**Accept this project by going here: https://classroom.github.com/a/uvIrNcRu**

## Preamble

This one's kinda all over the place, hence the name. You'll be using generics, though - that's for sure. And chickens.


## Instructions

1. Complete `Chicken`:
   1. read the class documentation and make the class implement `equals` (and of course, `hashCode`) as directed.
2. Complete `BunkBed`:
   1. read the class documentation block and make the class use generics as directed.
3. Complete `PickyBag`:
   1. read the class documentation block and make the class use generics as directed.
4. Complete the **// TODO** entries in `App`.

When you have properly completed (1), (2), (3), and (4), all tests in `MainTests` should pass.

Here is an example run of a working solution (user input in **bold**):

---
---

Time to use a generic bunk!   
1 - Integers on top | Strings on bottom, or  
2 - Duration on top | Duration on botom, or  
3 - a Bunkable thing on the top | a Comparable thing on the bottom?

Your choice? **1**

Here's an <Integer, String> BunkBed:  
What int goes on top? **41**

What String goes on bottom? **boy am I tired**


RESULT:  
on top: 41  
on bottom: boy am I tired

Time to use a generic PickyBag!  
1 - Bag should hold ints, or  
2 - Bag should hold Chickens, or  
3 - Bag should hold Collections?

Your choice? **2**

Adding [Linda Lee (2), Rhoda (4), Cthenlu (4000000)] to this picky bag:  
Here's what's in the picky bag now: [Linda Lee (2), Rhoda (4), Cthenlu (4000000)]  

What chicken should we try to add (weeks name)?   
**3 Henlet**

After trying to add Henlet (3), here's what's in the picky bag now:   [Linda Lee (2), Rhoda (4), Cthenlu (4000000), Henlet (3)]

Closing my eyes and pulling something out of this bag..  .
....and I pull out a Cthenlu (4000000)

---
---

> **Thoughts**
> - don't forget to make defensive copies of the video list when you are displaying results
> - you should try to do at least one anonymous class and one lambda (though the tests don't care, it's good practice for you)

## Tests

Nothing new to report here.