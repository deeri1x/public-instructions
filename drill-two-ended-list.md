# Drill - Two-Ended List

_(aka You'll Never See the End of It...)_


**Accept this project by going here:** https://classroom.github.com/a/0SUAT9YE

## Caution!

This drill's class is used in the other 2 drills in this checkpoint, so you must complete this one first!

## Warning!!

This has to be a **real linked list** - you can't just use another thing (like an array or ArrayList) under the hood and _pretend_ to be a linked list. It's gotta be the Real Deal, folks. I'll be checking!

## Preamble

You're going to be making a `TwoEndedSll` class, representing a singly-linked list that has some specific properties.

Here are the details:

- it will be generic...so you can toss whatever reference type you want in it.
- you can both **add** and **remove** from this list - but only at its **head** or **tail** - no adding/removing middle bits! (this is a blessing, of course)
- if you attempt to remove from an empty list, it'll throw a `NoSuchElementException`.
- even though we can add/remove from either end of this list, when we get its contents, they are always in order from head to tail.
- you _should_ make your Node class a static member class. What does that mean? It should be located _inside_ your `TwoEndedSll` class and declared as `private static Node<T>`. Of course, I realize I can't force you to do so. But still...practice good practice, folks!

Of the three drills in this checkpoint, this will easily take the longest to complete. But there's an upside: the list you create in this drill makes the other two drills a snap, so the time you spend here will pay off.


## Skills Covered

Show you can...

- [ ] create a singly-linked list structure from scratch.


## Instructions

1. Create a `TwoEndedSll<T>` class in the `main` package. This class represents a list that you modify and its behaviour is described in the [Preamble](#preamble):
   1. if all the `TwoEndedSll` tests pass, consider that puppy done!
2. Complete the `App.java` run method so that when you run `Main.java`, the program behaves as expected by the `MainTests`.  
     1. I've added a useful method in `App.java` that removes some of the drudgery.


## Example Run

Here is an example run of a working solution (user input in **bold**):

> Hi! I'm the Two-Ended List app!  
Every word you enter on a line will be added to me in alternating head/tail order.  
I will turn each word to lowercase before it is added.  
>  
> I will show you my contents after every word.  
I will stop when you enter an empty line.  
Ready? Start entering words!  
> \> **FOO**  
contents: [foo]  
>  
> \> **bar**  
contents: [foo, bar]
>  
> \> **baz**  
contents: [baz, foo, bar]
>  
> \> **nod**  
contents: [baz, foo, bar, nod]
>  
> \> **quz**  
contents: [quz, baz, foo, bar, nod]
>  
> \> **bork**  
contents: [quz, baz, foo, bar, nod, bork]
>  
> \>   
Done now! Thanks!


## Hints

- If you don't draw pictures of your list as you're doing this, you will **go insane**. I promise you this.
- You might find the [linked list section](http://opendatastructures.org/ods-java/3_Linked_Lists.html) in the online text a useful reference. 