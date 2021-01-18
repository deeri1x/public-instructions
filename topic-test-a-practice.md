# Topic Test A - Practice

**Accept this project by going here: https://classroom.github.com/a/ausKjeCt**


## Time Required

JP's times:

1. importing accepted GitHub repo into Eclipse: **00:33**
2. coding passing solution: **14:51**
3. punting solution back to GitHub repo: **00:31**
4. submitting and verifying result: **01:20**

Assuming you take 4x as long (**60 minutes**) to complete (2) as I did, you should be able to complete this practice test from start to finish in about **65 minutes**


## Preamble

This is a **practice** test, meant to see how well you've mastered the techniques you've practiced in non-timed drills.

This practice test is a _little_ harder (IMO) than the real deal, so will likely take you a little longer. This is on purpose.

Try not to look at the [solution video](https://youtu.be/CIiVeAmFWbs) before giving this practice test your best effort. *Trying and stumbling is infinitely more effective than passively watching.*

If you get stuck on something, make note of it and get better at it before the real test!

## Skills Assessed

You will show that you can, under time-pressure:

- [ ] modify a class so that it implements Comparable using multiple fields
- [ ] create a Comparator that compares using multiple fields
- [ ] turn a type-specific class into a parameterized generic class
- [ ] sort a collection using `Collections.sort`
- [ ] declare and initialize an array
- [ ] perform common tasks that you have learned in 1501 and 1502, including - but not limited to:
  - [ ] reading Strings and ints from the keyboard
  - [ ] printing to the console
  - [ ] instantiating a class
  - [ ] calling methods on an object, including ones from the public interfaces of classes you have not written
- [ ] read unit tests written in JUnit and assertJ syntax
- [ ] read Java documentation

## Hints & Suggestions Before You Begin

- log into GitHub
- open up the folder where you keep your Eclipse projects in Windows Explorer / Mac Finder
- have a Git Bash (Windows) / Terminal (Mac) open in the location where you keep your Eclipse projects
- have Eclipse open and ready to roll
- close any other open projects in Eclipse
- stay focused on one task at a time; it is really easy to get intimidated and/or lost in code if you stop focusing!
- get things compiling, even if you have to stub things out; it'll both increase your mark and also get your tests running...which is also important to your mark
- even if you can't complete the `main` fully, try to do as much as you can (like getting input) to get some partial marks

## Instructions

I **strongly** recommend working on these steps in this order, but you could do 3 before 1 and 2 and still be ok.

> _**Important Note**  
>  Because of how the submission system works, if you have any classes that DON'T compile, the results of your submission won't show your tests behaving the same way as they do in Eclipse. So try really hard to get your classes to compile, even if you have to stub out some things!_

1. Alter the `Benefit` class so that it implements `Comparable<Benefit>`. 
   1. The natural ordering for `Benefit` should be first by **descending numeric order of valuation**, then by **ascending numeric order of rarity**, and finally by **case-insensitive alphabetic order on the description**.
   2. It should pass all the tests in `BenefitComparableTests` if you have done so correctly.
2. Create a `BenefitRarityProductComparator` class in the `main` package that implements `Comparator<Benefit>`. 
   1. The comparator should **first** compare **ascending on the product of rarity and valuation** and then by **standard String compareTo (i.e. lexicographic ordering) on the description** if that product is the same. 
   2. It should pass all the tests in `BenefitRarityProductComparatorTests` if you have done so correctly.
3. Turn the `UsefulnessEvaluator` class provided into a **parameterized generic class**, using the documentation in `UsefulnessEvaluator.java` to guide you. **Also complete the 2 `//TODO` in the class.** 
   1. Your modified class should pass all the tests in `UsefulnessEvaluatorTests` if you have done these things correctly.
4. Complete the given `main` by doing all the steps marked with `//TODO` - you will be using your modified `UsefulnessEvaluator` class. When you run `main`, here is an example of what it should look like in the console (user input is shown in **bold**):

---

Friend name? **The Dude**  

Friend age? **47**  

Benefit name? **a rug**  

Benefit value? **1**  

Benefit rarity? **0**  


The Dude has these useful things:  
humour (2:4)  
a car (3:10)  
a rug (1:0)  

After sorting by natural order...  

The Dude has these useful things:  
a car (3:10)  
humour (2:4)  
a rug (1:0)  

After sorting by rarity...  

The Dude has these useful things:  
a rug (1:0)  
humour (2:4)  
a car (3:10)  
 
---

Your completed `main` should also pass all tests in `MainTests`.

## Marks

This is similar to how the "real" coding test will be marked.

> **Note**  
> Checkstyle and PMD warnings only have a bearing on your mark if your work is the A range, so don't worry about them unless everything is compiling and all your tests are running green! 

### Grade: A range

- no compilation problems
- no tests with errors or failures
- the number of checkstyle and pmd warnings present determines where in this range you are:
  - no warnings: A+
  - 1 or 2 warnings: A
  - 3 or more warnings: A-

### Grade: B range

- no compilation problems
- any test errors/failures are limited to `MainTests` - all other tests are passing
- where you fall in this range will depend on how close you came to completing `Main`

### Grade: C range

- at least **2** of `Benefit`, `BenefitRarityProductComparator`, and `UsefulnessEvaluator` must be compiling
- at least _some_ tests are passing - and not for trivial reasons
- where you fall in this range will be a judgement call

### Grade: D

- few, if any, files compile - but there is enough code present that *would have* worked correctly, if not for some *minor* syntax issues, that the instructor can tell the student was at least on the right track 

### Grade: F

- no attempt, or the code present is wildly incorrect
