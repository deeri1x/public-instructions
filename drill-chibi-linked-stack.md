# Drill - Chibi Linked Stack

_(aka Tiny Tiered Terror)_

**Accept this project by going here:** https://classroom.github.com/a/OQa2459U



## Preamble

An explanation of [チビ](https://en.wikipedia.org/wiki/Chibi_(slang))("chibi"), if you're interested. 

It's best to start off small when dealing with linked structures. So we are. Hence the チビ. 

Usually we reach for a linked structure because we want the flexibility of adding things without worrying about running over some sort of capacity (like we would with an array). But we're going to create a very small stack that only holds 3 things...and still force you to use linked structures. 'cause learning.


Here are some details about the class - `ChibiLinkedStack` - that you will be making.

- it will be generic...so you can toss whatever reference type you want in it. But...
- ...it can only hold 3 things; if you try and push something into ole chibi-chan when it's full, it will throw an unchecked `FullStackException`. You'll have to make this custom exception class by yourself: here's a reasonable how-to: https://stackabuse.com/how-to-make-custom-exceptions-in-java/#customuncheckedexception 
  - Make sure you use the **Custom Unchecked Exception** section. Not the Checked stuff.
- it should use your `TwoEndedSll` under the hood (as its sole instance variable) 


## Skills Covered

Show you can...

- [ ] use a linked list to implement a Stack.


## Instructions

1. Copy your **working** `TwoEndedSll.java` file from that drill to the `main` package of this drill's Eclipse project.

    > _Note from JP:_  
    > _You can do this easily in Eclipse by dragging the `TwoEndedSll.java` file from your `drill-two-ended-sll` project to the `main` package in `drill-chibi-linked-stack` **while holding down the ctrl key**._

2. Create a `ChibiLinkedStack<T>` class that implements the given `PlainOldStack` interface. The behaviour of `ChibiLinkedStack<T>` is described in the [Preamble](#preamble):
   1. Use your `TwoEndedSll` class to get this job done - you should be pleasantly surprised at how quickly this goes, because `TwoEndedSll` does all the heavy lifting!
   2. if all the `ChibiLinkedStack` tests are passing, you can consider your `ChibiLinkedStack` to be working okay!
3. Complete the `App.java` run method so that when you run `Main.java`, the program behaves as expected by the `MainTests`.  
     1. I've added some useful methods in `App.java` to make your life easier.


## Example Run

Here is an example run of a working solution (user input in **bold**):


> Hi! I'm the Chibi Linked Stack app!  
Every word you enter on a line will be added to me.  
I will turn each word to uppercase before it is added.  
>  
> After every two words pushed onto me, I'll pop one.  
I will stop when you enter an empty line.  
Ready? Start entering words!  
> \> sky  
>  
> | SKY  
\----------  
>  
> \> why  
>  
> | WHY  
\----------  
> | SKY  
\----------  
That's 2 pushes! Popping [WHY]  
>  
> | SKY  
\----------  
>  
> \> nigh  
>  
> | NIGH  
\----------  
> | SKY  
\----------  
>    
> \> try  
>  
> | TRY  
\----------  
> | NIGH  
\----------  
> | SKY  
\----------  
That's 2 pushes! Popping [TRY]  
>  
> | NIGH  
\----------  
> | SKY  
\----------  
>  
> \> ply  
>  
> | PLY  
\----------  
> | NIGH  
\----------  
> | SKY  
\----------  
>  
> \>   
Done now! Thanks!


## Hints

- I'm serious when I say that this should be quick...you only need 5 methods (including the constructor) - 2 of those are one-liners, and the other 3 are very simple if/else statements! If you are writing a lot of code, reach out to JP.