# Drill - Probealicious Hash Table

_(aka I've Been Probed! Linearly!)_


**Accept this project by going here:** https://classroom.github.com/a/MlWPe3rv


## Preamble

So you're thinking of doing this hash table drill? Well, stay a while, and listen.

For this drill, you'll be building a hashtable that uses [open addressing](https://en.wikipedia.org/wiki/Open_addressing) with linear probing to handle collisions.

> The online textbook [talks about this stuff, too](http://opendatastructures.org/ods-java/5_2_LinearHashTable_Linear_.html) - but man, the code there is kind of inscrutable...not a huge fan. Plus there are some features it doesn't implement. But still...it could get you started.

Here are some details about the class - `MyHashtable` - that you will be making:

- it implements two interfaces:
  - a `PlainOldMap<K, V>` interface, which gives you the map-like methods `MyHashtable` must have, and
  - a `Reportable` interface, which gives you some additional methods which let the unit tests dig under the hood of your class a bit
- it will be generic...so you can toss whatever Key/Value pairs you want in it.
- it **does** have a fixed capacity (which is pretty weird for hash tables, but the task was already big enough, so we'll leave resizing out). If you try to add something into a full MyHashtable, it'll throw a custom unchecked exception called `FullHashtableException`.
- it uses [lazy deletion](https://en.wikipedia.org/wiki/Lazy_deletion) to implement removals 
- I'd like to see you use an array under the hood to implement this, please. No ArrayLists.


## Skills Covered

Show you can...

- [ ] make a hash table that uses open addressing to handle collisions.
- [ ] implement lazy deletion in an open-addressed hash table.


## Instructions

1. Create a `MyHashtable<K, V>` class that implements the given `PlainOldMap<K, V>`  **and** `Reportable` interfaces. The behaviour of `MyHashtable<K, V>` is described in the [Preamble](#preamble) and the interfaces are documented to help you figure things out there:
   1. if all the `MyHashtable` tests are passing, you can consider your `MyHashtable` to be working okay!
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

- make sure you understand how open addressing works for collisions...draw a few pictures out and try a couple of scenarios out on paper. It'll help give you direction when you start coding.
- if you make a nice static member class for your array elements, this assignment becomes _soooo_ much easier to deal with. My member class had fields to hold whether the element was empty or deleted (plus of course fields for the key and value!). Methods that help you figure whether a given element is available to be used for an insert, and whether a given element matches a given key, are pretty useful here, too IMO.
  - don't forget a nice `toString` here as well - it'll make the `contentList` method a lot less messy.
- instead of having an array with a bunch of nulls, consider instead populating it with a bunch of **empty** elements - that way you don't have to deal with the usual crap that nulls bring 
  - _counterargument: by doing this, you increase the amount of space your hash table requires by quite a bit! As with all things, there are costs and tradeoffs!_