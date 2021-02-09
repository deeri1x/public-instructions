# Bug/Change List

- [2021.02.04] 
  - file: `Main.java`
  - fix: change `return new GraphicalMarbleColumnDisplay(column, inHand, inHandComparator);` -> `return new NullMarbleColumnDisplay(column, inHand, inHandComparator);`
  - notes: until you get your MarbleColumn working, nothing but the NullMarbleColumnDisplay will work without blowing up when you run main!
- [2021.02.04] 
  - file: `App_Tests.java`
  - fix: delete it!
  - notes: I misthunk this one folks. Just do the StartupEngine tests and consider the D level done.
- [2021.02.09]
  - file: `GrabBag_Pull_Probability_Tests.java`
  - notes: the probability should have been 2.0/7 instead of 1.0/7 for drawing a "2" (since there are 2 of them). I decreased the margin of error to make the test a bit more accurate, too.
  - fixes: 
    - change line 93 to `double expected2344Drawn = (2.0 / 7) * (1.0 / 6) * (3.0 / 5) * (2.0 / 4);`
    - change lines 99-101 to:

      ```java
      assertThat(prob1223Drawn).isEqualTo(expected1223Drawn, within(0.001));
      assertThat(prob3444Drawn).isEqualTo(expected3444Drawn, within(0.001));
      assertThat(prob2344Drawn).isEqualTo(expected2344Drawn, within(0.001));
      ```