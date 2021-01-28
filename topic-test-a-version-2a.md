# Topic Test A - Version 2A

**Accept this project by going here:** link will be given by JP in Discord

**TIME ALLOWED:** 50 minutes  

## Time Details

JP's times:

1. importing accepted GitHub repo into Eclipse: **00:32**
2. coding passing solution: **09:16**
3. punting solution back to GitHub repo: **00:37**
4. submitting and verifying result: **01:19**

Assuming you take 4x as long (**38 minutes**) to complete (2) as I did, you should be able to complete this test from start to finish in about **43 minutes**

## Preamble

This test is a **timed** drill, meant to give you the opportunity to illustrate your mastery of the techniques you've practiced in non-timed drills.

I assume you've been keeping pace with the drill checkpoints, have gone through the practice coding test, and are totally comfortable with the process of getting code from GitHub and submitting it there. If these assumptions are incorrect...buckle up.

## Skills Assessed

You will show that you can, under time-pressure:

- [ ] modify a class so that it implements Comparable
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

1. Alter the `Customer` class so that it implements `Comparable<Customer>`. 
   1. The natural ordering for `Customer` should be **descending numeric order of recognitionRating**. 
   2. It should pass all the tests in `CustomerComparableTests` if you have done so correctly.
2. Create a `CustomerNameComparator` class in the `main` package that implements `Comparator<Customer>`. 
   1. The comparator should **first** compare by **customer name (case-insensitive)** and then by **drinkDifficultyRating (ascending numeric order)** if the customer names are the same. 
   2. It should pass all the tests in `CustomerNameComparatorTests` if you have done so correctly.
3. Turn the `Server` class provided into a **parameterized generic class**, using the documentation in `Server.java` to guide you. **Also complete the single `//TODO` in the class.** 
   1. Your modified class should pass all the tests in `ServerTests` if you have done these things correctly.
4. Complete the given `main` by doing all the steps marked with `//TODO` - you will be using your modified `Server` class. When you run `main`, here is an example of what it should look like in the console (user input is shown in **bold**):

---
Barista name? **Llevi**   

New customer's name? **Hatoon**  

New customer's recognition rating? **1**  

New customer's drink difficulty? **2**   
  
  
Llevi is serving:   
Istvan (who is a new face)  
Dipuo (who is a regular)  
Hatoon (who is seen every now and then)  

After sorting by natural order... 

Llevi is serving:  
Dipuo (who is a regular)  
Hatoon (who is seen every now and then)  
Istvan (who is a new face)  

---

Your completed `main` should also pass all tests in `MainTests`.


## Marks

> _**Note**  
> Checkstyle and PMD warnings only have a bearing on your mark if your work is the A range, so don't worry about them unless everything is compiling and all your tests are running green!_ 

### Grade: F

- no attempt, or the code present is wildly incorrect

### Grade: D

- few, if any, files compile - but there is enough code present that *would have* worked correctly, if not for some *minor* syntax issues, that the instructor can tell the student was at least on the right track 

### Grade: C range

- at least **2** of `Customer`, `CustomerDrinkPriceComparator`, and `Server` must be compiling
- at least _some_ tests are passing - and not for trivial reasons
- where you fall in this range will be a judgement call

### Grade: B range

- no compilation problems
- any test errors/failures are limited to `MainTests` - all other tests are passing
- where you fall in this range will depend on how close you came to completing `Main`

### Grade: A range

- no compilation problems
- no tests with errors or failures
- the number of checkstyle and pmd warnings present determines where in this range you are:
  - no warnings: A+
  - 1 or 2 warnings: A
  - 3 or more warnings: A-