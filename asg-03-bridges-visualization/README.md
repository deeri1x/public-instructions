# ASG-03 : BRIDGES Visualizations

## _(aka Let's Get Visual, Visual)_

**GitHub Link**: https://classroom.github.com/a/e--cjS6k

**DUE:** Apr 09 (F) by end of the day (a.k.a. 11:59PM or whenever JP gets up)

**Late Policy:** no lates on this one...I gotta get these suckers marked!

## Submissions

Submissions are a bit different this time; since there are no GitHub Actions to run, you simply have to push your work up to your repo before the deadline. No submission button to push this time.

## Preamble

I wanted to make this last assignment have two qualities:

- each grade-level should be finishable in a reasonably short amount of time (since you only have a week to complete it...and this week is the last full week of the semester and you're prolly kinda busy with other coursework), and
- it should be fun...or, at the very least, "neat"

I *think* it succeeds in having these qualities.


### The Goal

To use BRIDGES to visualize a data structure you construct and populate with real-world data from Kaggle.

## Could you say that in English, please?

Point taken.

#### BRIDGES

There's this thing called SIGSCE (the Special Interest Group Computer Science Education). It's a pretty important organization in the CS education world. They have an annual Technical Symposium (here's [this year's web page](https://sigcse2021.sigcse.org/)) where CS educators basically do show-and-tell.

> BTW - I never _go_ to these things - 'cause hella-expensive - but I still like looking through the stuffs.

One of the things that caught my eye this year was [BRIDGES](http://bridgesuncc.github.io/index.html) - it provides a framework to do two things easily:

1. connect to some curated, trimmed-down data sources, and
2. create visualizations for data strutures

We're going to take advantage of 2 and use a site called [Kaggle](https://www.kaggle.com/) to get some real-world data another way.


#### Kaggle

Kaggle is just cool. [Here's a 1-minute video about it.](https://www.youtube.com/watch?v=TNzDMOg_zsw)

We're not going to be diving deep into Kaggle - though I hope you are intrigued by what you see there - and will instead be using it simply as a place to grab some interesting datasets in CSV format.


## Before Getting Started

There are two quick steps you have to do before starting this project:

1. Follow the [quick tutorial for Eclipse users here](http://bridgesuncc.github.io/bridges_setup_java_eclipse.html) 
    - if you don't want to do the whole thing, AT LEAST do `Step 2: Create Bridges Account` or you're pooched
2. Take a quick scan of the [other tutorials](http://bridgesuncc.github.io/tutorials/Overview.html) available as well...some of them could come in handy...
2. [Register for a free Kaggle account](https://www.kaggle.com/account/login?phase=startRegisterTab&returnUrl=%2Fshivamb%2Fnetflix-shows).

## Overviews of Each Level

The levels in this assignment are handled in a different way than the last two assignments.

Instead of needing to climb the ladder from F+ to A+, you'll instead choose a path:

### The Easy Way

- [The Path of the D](d-level.md)

### The Middling Way

- [The Path of the C That Leads to the B](c-level.md)
- [The Path of the B That Leads to the A-](b-level.md)
- [The Path of the A-](a-minus-level.md)

### The Somewhat Challenging Way

- [The Path of the A+](a-plus-level.md)

## Demos?

Nope. Not this go-round. 

## Converting CSVs To a Standard Format

Some of the CSVs you find on Kaggle might contain "foreign" characters, or come from operating systems other than yours. This can cause problems when you try and parse its contents on your system.

Also, dealing with other people's data can be frustrating at times...you might find some "dirty data" - data that's not formatted consistently, or is missing, or is bunged up in some way. Ah, the real world...it is cruel and vindictive at times.

## Consulting the BRIDGES API

You'll have to do some reading of their API to figure some things out; dig around a bit - it's pretty well laid out. You can always ask questions if you get stuck.