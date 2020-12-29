# Drill - Comparator Speedrun

_(aka Unnatural Orderings)_

**Accept this project by going here: https://classroom.github.com/a/uvIrNcRu**

## Preamble

While natural orderings are all well and good, sometimes they can be confining. I mean, who are **you** to tell **me** that the only way I can order my collection of owl pellets is by weight? What if I want to order them by date collected? Or girth? Or taste landscape? Huh?!? You're not the boss of me!

## Time Required

JP's times:

1. importing accepted GitHub repo into Eclipse: **00:42**
2. coding passing solution: **10:23**
3. punting solution back to GitHub repo: **00:43**
4. submitting and verifying result: **01:19**

Your target time for step 2: **42 minutes**


## Instructions

1. Complete `YouTubeVideo`:
   1. make it implement Comparable, using the natural ordering mentioned in the class documentation block.
   2. complete the **// TODO**
2. Complete the ** //TODO** entries in `Main`.

When you have properly completed (1) and (2), all tests in `MainTests` should pass.

Here is an example run of a working solution (user input in **bold**):

---
---

Name of video to add? **Salad Munching for Fun and Profit**

Name of creator? **crunchybunbuns**

Here are the vids as they appear at the start:  
1  => My Cat, My Killer[stubblyBeast] (likes: 0, cr: 2020-12-29, d: 02:23, v: 0, nc: 0)  
2  => Fashion Coward - SNL[Saturday Night Live] (likes: 75,000, cr: 2019-04-13, d: 02:03, v: 3,920,363, nc: 3)  
3  => Playing an RPG for the first time[Joel Haver] (likes: 233,000, cr: 2020-11-20, d: 03:08, v: 2,004,937, nc: 4)  
4  => Nice Stub[Hans Hans] (likes: 2, cr: 2020-11-21, d: 03:08, v: 0, nc: 0)  
5  => Salad Munching for Fun and Profit[crunchybunbuns] (likes: 0, cr: 2020-12-29, d: 10:00, v: 0, nc: 0)

Here are the vids in descending order of likes (natural order):  
1  => Playing an RPG for the first time[Joel Haver] (likes: 233,000, cr: 2020-11-20, d: 03:08, v: 2,004,937, nc: 4)  
2  => Fashion Coward - SNL[Saturday Night Live] (likes: 75,000, cr: 2019-04-13, d: 02:03, v: 3,920,363, nc: 3)  
3  => Nice Stub[Hans Hans] (likes: 2, cr: 2020-11-21, d: 03:08, v: 0, nc: 0)  
4  => My Cat, My Killer[stubblyBeast] (likes: 0, cr: 2020-12-29, d: 02:23, v: 0, nc: 0)  
5  => Salad Munching for Fun and Profit[crunchybunbuns] (likes: 0, cr: 2020-12-29, d: 10:00, v: 0, nc: 0)

Vids in ascending duration/reverse chronological creation date order:  
1  => Fashion Coward - SNL[Saturday Night Live] (likes: 75,000, cr: 2019-04-13, d: 02:03, v: 3,920,363, nc: 3)  
2  => My Cat, My Killer[stubblyBeast] (likes: 0, cr: 2020-12-29, d: 02:23, v: 0, nc: 0)  
3  => Nice Stub[Hans Hans] (likes: 2, cr: 2020-11-21, d: 03:08, v: 0, nc: 0)  
4  => Playing an RPG for the first time[Joel Haver] (likes: 233,000, cr: 2020-11-20, d: 03:08, v: 2,004,937, nc: 4)  
5  => Salad Munching for Fun and Profit[crunchybunbuns] (likes: 0, cr: 2020-12-29, d: 10:00, v: 0, nc: 0)

Vids in reverse alphabetic creator order:  
1  => My Cat, My Killer[stubblyBeast] (likes: 0, cr: 2020-12-29, d: 02:23, v: 0, nc: 0)  
2  => Salad Munching for Fun and Profit[crunchybunbuns] (likes: 0, cr: 2020-12-29, d: 10:00, v: 0, nc: 0)  
3  => Fashion Coward - SNL[Saturday Night Live] (likes: 75,000, cr: 2019-04-13, d: 02:03, v: 3,920,363, nc: 3)  
4  => Playing an RPG for the first time[Joel Haver] (likes: 233,000, cr: 2020-11-20, d: 03:08, v: 2,004,937, nc: 4)  
5  => Nice Stub[Hans Hans] (likes: 2, cr: 2020-11-21, d: 03:08, v: 0, nc: 0)

Vids in descending number of comments/descending number of views/alphabetic title order:  
1  => Playing an RPG for the first time[Joel Haver] (likes: 233,000, cr: 2020-11-20, d: 03:08, v: 2,004,937, nc: 4)  
2  => Fashion Coward - SNL[Saturday Night Live] (likes: 75,000, cr: 2019-04-13, d: 02:03, v: 3,920,363, nc: 3)  
3  => My Cat, My Killer[stubblyBeast] (likes: 0, cr: 2020-12-29, d: 02:23, v: 0, nc: 0)  
4  => Nice Stub[Hans Hans] (likes: 2, cr: 2020-11-21, d: 03:08, v: 0, nc: 0)  
5  => Salad Munching for Fun and Profit[crunchybunbuns] (likes: 0, cr: 2020-12-29, d: 10:00, v: 0, nc: 0)

The vids should still be in the order they started in:  
1  => My Cat, My Killer[stubblyBeast] (likes: 0, cr: 2020-12-29, d: 02:23, v: 0, nc: 0)  
2  => Fashion Coward - SNL[Saturday Night Live] (likes: 75,000, cr: 2019-04-13, d: 02:03, v: 3,920,363, nc: 3)  
3  => Playing an RPG for the first time[Joel Haver] (likes: 233,000, cr: 2020-11-20, d: 03:08, v: 2,004,937, nc: 4)  
4  => Nice Stub[Hans Hans] (likes: 2, cr: 2020-11-21, d: 03:08, v: 0, nc: 0)  
5  => Salad Munching for Fun and Profit[crunchybunbuns] (likes: 0, cr: 2020-12-29, d: 10:00, v: 0, nc: 0)

---
---

> **Thoughts**
> - don't forget to make defensive copies of the video list when you are displaying results
> - you should try to do at least one anonymous class and one lambda (though the tests don't care, it's good practice for you)

## Tests

Nothing new to report here.