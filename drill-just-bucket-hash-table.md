# Drill - Just Bucket Hash Table

_(aka Awwww....bucket.)_


**Accept this project by going here:** https://classroom.github.com/a/w8BpOSld

## Preamble

So you're thinking of doing this hash table drill? Well, I hope you like buckets.

For this drill, you'll be building a hashtable that uses [chaining with linked lists](https://en.wikipedia.org/wiki/Hash_table#Separate_chaining_with_linked_lists) to handle collisions.

> The online textbook [talks about this stuff, too](http://opendatastructures.org/ods-java/5_1_ChainedHashTable_Hashin.html), but it's not quite as useful as it is with its open addressing discussion. 

Here are some details about the class - `MyHashtable` - that you will be making:

- it implements two interfaces:
  - a `PlainOldMap<K, V>` interface, which gives you the map-like methods `MyHashtable` must have, and
  - a `Reportable` interface, which gives you some additional methods which let the unit tests dig under the hood of your class a bit
- it will be generic...so you can toss whatever Key/Value pairs you want in it.
- it **does not** have a fixed capacity. So any calls to `isFull` should return `false`.
- I'd like to see you use an array under the hood to hold the buckets. Each bucket is a linked list - you can use your own from the Simple Linked List drill, or you can use the `LinkedList<E>` class in Java if you wish.


## Skills Covered

Show you can...

- [ ] make a hash table that uses chaining with linked lists to handle collisions.


## Instructions

1. Create a `MyHashtable<K, V>` class that implements the given `PlainOldMap<K, V>`  **and** `Reportable` interfaces. The behaviour of `MyHashtable<K, V>` is described in the [Preamble](#preamble) and the interfaces are documented to help you figure things out there:
   1. **there are two methods in the `Reportable` interface - `capacity` and `backingArrayContents` - that are marked as `default`. This means they have a default implementation...which means that you don't have to code them up! Wild!**
   2. if all the `MyHashtable` tests are passing, you can consider your `MyHashtable` to be working okay!
2. Complete the `App.java` run method so that when you run `Main.java`, the program behaves as expected by the `MainTests`.  
     1. I've added some useful methods in `App.java` to make your life easier.


## Example Run

Here is an example run of a working solution (user input in **bold**):


> Hi! I'm a simple Hashtable app!   
> Enter in a 2-or-more letter word that is a palindrome.  
(I'm not actually gonna check if the word *is* a palindrome!)  
I will add it to the hashtable, using the number of letters as a key.  
The value for the key will be a list of palindromes with that many letters.  
>  
> When you enter an empty line, I will then ask you to enter a number.  
I will then show you a list of palindromes that have that number of letters.  
Ready? Start entering palindromes!  
palindrome? **aha**  
palindrome? **kook**  
palindrome? **rotor**  
palindrome? **redder**  
palindrome? **racecar**  
palindrome? **rotator**  
palindrome? **level**  
palindrome? **noon**  
palindrome? **naan**  
palindrome?   
num letters? **4**  
Here are the palindromes I have with 4 letters:  
\- kook  
\- noon  
\- naan  



## Hints

- make sure you understand how chaining works for collisions...draw a few pictures out and try a couple of scenarios out on paper. It'll help give you direction when you start coding.
- IMO, it's worth your while to make two static member classes for your array elements:
  - the first is a class that holds the key/value pairs themselves - it can be very simple. A well-chosen `toString` would do wonders here.
  - the second is a class to represent a bucket: remember that a bucket holds a list of some sort, with each element of the list being a key/value pair object. You can use anything that implements List here, from Java's `LinkedList` or `ArrayList` classes or even your simple linked list from last drill.
- instead of having an array with a bunch of nulls, consider instead populating it with a bunch of **empty** elements - that way you don't have to deal with the usual crap that nulls bring  