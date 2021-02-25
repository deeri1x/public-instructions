# Drill - Always Sorted Linked List

_(aka End It Never of See the You'll...)_

**Accept this project by going here:** https://classroom.github.com/a/aqnRqGqd


## Preamble

This will be the last drill you'll be dealing directly with linked lists, so...yay?

Anywho, your task here is to create an `AlwaysSortedLinkedList` class that has the following properties:

- it will be generic...so you can toss whatever reference type you want in it...as long as that class implements Comparable!
- any time an element is added to this list, the list must be in order based on the natural ordering of its elements.
- it will implement the `SimpleList` interface that's included in the starting project.
- it will **also** implement the `Iterable<E>` interface; this means you can for-each through your `AlwaysSortedLinkedList` objects! Cool.
- you _should_ make your Iterator class a non-static member class (so it's declared `private Iterator<E>` and inside your `AlwaysSortedLinkedList` class). It needs to be non-static, because it needs to access instance variables of its enclosing class. Of course, I realize I can't force you to do so. But still...practice good practice, folks!



## Skills Covered

Show you can...

- [ ] implement an `Iterator<E>`.
- [ ] make a class implement more than one Java interface.
- [ ] create a linked structure from scratch.



## Instructions

1. Create a `AlwaysSortedLinkedList<E>` class in the `main` package. This class represents a list that you can add things to and its behaviour is described in the [Preamble](#preamble):
   1. if all the `AlwaysSortedList` tests pass, consider that puppy done!
2. Complete the `App.java` run method so that when you run `Main.java`, the program behaves as expected by the `MainTests`.  
     1. I've added a useful method in `App.java` that removes some of the drudgery.


## Example Run

Here is an example run of a working solution (user input in **bold**):

> Enter a list of words separated by spaces.  
If the word has a + in front of it, I'll add it.  
If the word has a - in front of it, I'll remove it.  
Otherwise, I'll ignore it.  
I'll stop when you enter a # for the word.  
Let's begin!
>    
> Your words> **-egad! +zoinks! +gadzooks! +wowzers! +egad! +zoinks! #**  
>  
> Here are the words, in order:  
> egad! gadzooks! wowzers! zoinks! zoinks! 


## Hints

- Feel free to use any linked list class you have created so far (in the drills or assignment one) to implement your `AlwaysSortedLinkedList`. You will likely have to modify that class a little bit to make it useful here.