# Drill - Comparator Sorting

_(aka **Orderly** Pack Rat)_

Estimated completion time: **50 minutes**

**Accept this project by going here: https://classroom.github.com/a/lDmfAUPV**


## Preamble

We're going to revisit the Inventory we created a while back in the [Comparable Sorting Drill](https://github.com/MRU-CSIS-2503-202101-001/public-instructions/blob/main/drill-comparable-sorting.md). If you haven't done it, you'll have to complete it first and then come back here, because you'll need your working solution from *there* to start *here*.

I'll wait for you to come back if necessary....

...  
...

OK, let's continue!

In this drill, we're going to alter our Inventory so that it can sort items in ways other than their natural order...all through the magic of Comparators.


## Skills Covered

Show you can...

- [ ] make a class implement more than one Java interface.
- [ ] sort an ArrayList<T> via Comparator<T> using `Collections.sort`.
- [ ] implement a Comparator in its own class.
- [ ] implement a Comparator inline via an anonymous class.
- [ ] implement a Comparator inline via a simple lambda.

## Instructions

**Since we need to use your source code from the Comparable Sorting Drill, we have a few extra steps to do to get started:**

1. Import this drill's starting code as per normal.
2. Copy your `Inventory.java` and `Item.java` files from your comparable sorting drill project into the `main` package folder of your new project.
3. Rename the `getSorted` method in `Inventory` to `getSortedValue`.
4. Close your comparable sorting drill in Eclipse - you don't want to accidentally work on _that_ code instead of _this_ drill's code!

Now we're ready to begin. Here's what you need to do:

1. Alter the `Item` class in the following ways:
   1. Your `Item` from last time already implements `Comparable<Item>`. Now make it **also** implement `FakeDateTime`. (This is not nearly as hard as you may think it is.)
   2. Change every instance of `LocalDateTime.now()` to `FakeDateTime.createFrom(name, value)`.
   3. Change the current `toString` to the following:
    
      ```java
      @Override
      public String toString() {
        String formattedPickup = DateTimeFormatter
          .ofLocalizedDateTime(FormatStyle.SHORT)
          .format(pickedUp);
        
        return String.format("%s [%s] (v:%d, w:%.1f, d:%d, t:%s)",
        name, formattedPickup, value, weight, durability, itemType);
      }  
      ```
    
   4. We'll need a way to allow users of Item to compare Items by their itemType, so add this constant:

      ```java
      public static final Comparator<Item> ItemTypeComparator =
      (item1, item2) -> item1.itemType.compareTo(item2.itemType);
      ```

    **If you have done (1) correctly, all tests in `ItemTests` will pass.**

2. Alter your `Inventory` class in the following ways:
   1. add a `getSortedPickup` method that returns a `List<Item>` in chronological pickup order
   2. add a `getSortedWeightName` method that returns a `List<Item>` in ascending weight then alphabetic name order
   3. add a `getSortedItemTypeDurability` method that returns a `List<Item>` in ascending itemType then ascending durability order

    **If you have done (2) correctly, all tests in all `Inventory_blahblah_Tests` files will pass.**
    
3. The `App` code is already complete - no work to do here!

    **If you have done (1) and (2) correctly, all tests in `MainTests` will pass.**
    
Here is an example of what a completed solution would look like in the console when run (user input in **bold**):

---
---

Here's what we have already....  
== NOT SORTED ==  
You are carrying 5 items:  
001 - biscuit [2020-12-30, 5:52 a.m.] (v:2, w:0.5, d:0, t:FOOD)  
002 - potion of healing [2020-12-30, 7:02 a.m.] (v:3, w:0.3, d:1, t:POTION)  
003 - yo-yo [2021-01-01, 12:50 a.m.] (v:45, w:0.2, d:12, t:WEAPON)  
004 - glaive [2021-01-03, 7:51 a.m.] (v:100, w:10.0, d:4, t:WEAPON)  
005 - turnip [2020-12-30, 4:51 a.m.] (v:1, w:0.5, d:0, t:FOOD)

How do you want to view your inventory? 

1 - no sorting  
2 - descending value (natural order)  
3 - chronological order of pickup  
4 - ascending weight / alphabetical name  
5 - item type / ascending durability  

Your choice? **3**

== PICKUP ORDER ==  
You are carrying 5 items:  
001 - turnip [2020-12-30, 4:51 a.m.] (v:1, w:0.5, d:0, t:FOOD)  
002 - biscuit [2020-12-30, 5:52 a.m.] (v:2, w:0.5, d:0, t:FOOD)  
003 - potion of healing [2020-12-30, 7:02 a.m.] (v:3, w:0.3, d:1, t:POTION)  
004 - yo-yo [2021-01-01, 12:50 a.m.] (v:45, w:0.2, d:12, t:WEAPON)  
005 - glaive [2021-01-03, 7:51 a.m.] (v:100, w:10.0, d:4, t:WEAPON)

Here's our inventory - it should be in the same order as earlier:  
== NOT SORTED ==  
You are carrying 5 items:  
001 - biscuit [2020-12-30, 5:52 a.m.] (v:2, w:0.5, d:0, t:FOOD)  
002 - potion of healing [2020-12-30, 7:02 a.m.] (v:3, w:0.3, d:1, t:POTION)  
003 - yo-yo [2021-01-01, 12:50 a.m.] (v:45, w:0.2, d:12, t:WEAPON)  
004 - glaive [2021-01-03, 7:51 a.m.] (v:100, w:10.0, d:4, t:WEAPON)  
005 - turnip [2020-12-30, 4:51 a.m.] (v:1, w:0.5, d:0, t:FOOD)

---
---

> **Thoughts**
> - the `getSortedBlahBlah` methods you're making in `Inventory` all follow the same pattern, so once you get one, the others will fall into place quickly. Don't panic.
> - typically in a real-world scenario, you'll choose **one** way of creating a Comparator. Our solution is using multiple ways purely for educational reasons!


## Tests

Nothing to see here.
