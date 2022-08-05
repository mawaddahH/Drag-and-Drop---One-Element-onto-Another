# Drag-and-Drop---One-Element-onto-Another
Assignment 2 W9D5 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Create automation scripts using Selenium for dragging and dropping one element into another.
- STEP 1: Find a website a drag and drop option
- STEP 2: Evoke the browser
- STEP 3: Navigate to the website
- STEP 4: Find the web elements to drag and drop
- STEP 5: Drag and drop

## Answer
I used a ["fullcalendar"](https://fullcalendar.io/docs/v3/external-dragging-demo) website

### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code.
I used "Actions` class and `dragAndDrop` method

```md
Actions a = new Actions(driver);
a.dragAndDrop(source, target).build().perform();
```

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183198929-6458b1f9-a076-4369-85fb-f41be7599af3.png" width=60% height=60%>
</p>


---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183204321-c784b2ae-c044-499d-bf3a-31e38c48af90.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/183204184-21fd52f6-dda1-4330-ab71-598d77738978.mp4

</p>
