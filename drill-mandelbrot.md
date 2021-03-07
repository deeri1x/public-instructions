# Drill - Mandelbrot

_(aka It's seahorses all the way down....)_


**Accept this project by going here:** https://classroom.github.com/a/Cmvp57R4


## Preamble

The Mandelbrot Set is...well, it kinda has to be experienced to be believed. [Here's](https://youtu.be/C3JWXbUpXUU) an interesting video exploration of one part of it.

Although not nearly as beautiful, text versions of the Set are kinda cool, too. Here's an example of a file created by this drill - it's 600 characters wide and 400 characters high, made solely of the letters a through g:

![text mandy](images/mandy.png) 

You're going to be given a working text-Mandelbrot-creating app that uses loops to get the job done; your job will be to remove the loops and replace them with recursive calls.


## Skills Covered

Show you can...

- [ ] implement recursive methods.


## Instructions

1. Examine the `App.java` class provided - it has three methods containng `// TODO` markers - these three methods need to be rewritten into recursive method + recursive wrapper pairs so that they still do their jobs.
2. If your code is working, then all the tests in the `test` package will run green. (**But look at the [hints below](#hints) before jumping right to testing!**) These aren't your usual unit tests, so here's some explanation of what they do:
   1. `No_Loops_Me_Bucko_Tests` just examines your solution for the words `for` and `while` to make sure you don't have any loops in there! (It's a rough way of doing this, so be careful - I wouldn't suggest using the words `for` or `while` in any comments you make!)
   2. `Images_Match_Tests` runs your App at different resolutions and compares the resulting files against ones I've created.


## Example Run

No example runs for this one!

If you want to run the app to generate some Mandelbrot Set files of your own, just play with the toy main provided:


  ```java
  ViewPort viewport = new ViewPort(-2, 0.5, -1.0, 1.0);
  
  // choose different widths and heights: ideally, they should be a
  // 3:2 ratio ... don't go too big (like past 1000), because the 
  // App can take a long time to run and the resulting files won't
  // really be viewable!

  int width = 150;
  int height = 100;

  // the maxIterations controls how "accurate" the image will be...in
  // a text version like this, larger numbers won't make a huge 
  // difference, but if these were "real" images....
  int maxIterations = 100;
  
  CartesianPlane plane = new CartesianPlane(width, height, viewport);

  String filename = "my-mandy.txt";

  new App(maxIterations, plane).run(filename);
  ```
  
If you use the above code, and run your main, it'll create a file called `my-mandy.txt` in the root of your Eclipse project folder. Take a gander at it with something like Notepad...you'll need to zoom out to really see anything! :)

## Hints

- don't run the tests at first - just run the main and examine the resulting file - it'll be easier to see with your eyes what's wrong instead of looking at the test result output!
- since it's easy to mess up recursion so that it's infinite, if your app is taking a long time running the main, you've likely got an infinite recursion going on - hit the stop button and figure out why 