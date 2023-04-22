# Milestone 1 - VocabBoost

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview

### Description

Allows users to memorize top 100 most commonly used words of a foreign language using flash cards. Also it keeps track of words mastered and words to keep studying.

### App Evaluation

[Evaluation of your app across the following attributes]
- **Category:** Education
- **Mobile:** Mobile is important for convenience as a phone is always on a person. Notifications also help remind the user to study.
- **Story:** Helps user connect with a country's culture, do well in school, or become independent when traveling.
- **Market:** Anyone wanting to learn a new language, is travelling, or a student.
- **Habit:** User can create a customized plan. Notifications also help remind the user to study. For example, let user set how many words to study per day before using the app, and notify user if it's not met.
- **Scope:** V1 would allow user to learn top 100 most commonly used words of a foreign language. V2 would allow user to learn school level vocabulary of their choice. V3 would allow user to choose a country they want to go, find the attractions, and learn words of that language.

## Product Spec

### 1. User Features (Required and Optional)

**Required Features**

* User can have options to choose a foreign language and category to learn (at least 2 options).
   - [X] Save a language choice using sharedPreferences 
* User can see the list of words of the category and their status (mastered or to learn)
   - [X] xml file was created
* User can see the English meaning of a word, click to see it in foreign language and decide if they remember it or not.
   - [X] xml file was created
* User can track progress - see lists of words mastered and words to study. 
   - [X] collect list of words for each language


**Stretch Features**
* Add text-to-speech to know how to pronounce a word
* User can receive push Notifications.
* Set the goal of learning: ex. how many words per day
* Log-in
* Searching destination and getting reccomendations of activities
    * Keep record of what the user did and rate their experience
* Option for user to choose different categories of words to learn (pop culture, dining, hospital)

### Milestone 2 (Unit 8):  Build Progress
1. Vocab List
<img src='https://user-images.githubusercontent.com/98482880/232628623-e4994ba0-f86b-4f67-9584-9e02ef63daad.png' title='Dictionary' width='' alt='Dictionary' />

<img width="1040" title="Spanish Vocab" src="https://user-images.githubusercontent.com/98507590/232638188-f233d3ef-7a33-4859-bdc9-156147a60934.png">

2. Screens
<img src='https://github.com/AndroidGroup12/VocabBoost/blob/main/walkthrough.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
GIF created with LiceCap  



### 2. Screen Archetypes

- Set-up Screen
  - Display languages user can learn and choose 
  
- Categories Screen
    - The different common categories of words to learn(100 most common, food, medical, nature, common noun/verbs)
- Learning Screen
  - Show the English meaning of the word
  - User can click to see the word in foreign language
  - Two/three buttons to let user choose if they remember this word or not
  
- Word List Screen
    - displays all the words(with translation) the user will learn

- Stats Screen
    - Display the number of words learned and number of words to learn

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Words Screen
* Learning Screen
    * after you click on a category, a flashcard study fragment is shown
* Stats Screen

**Flow Navigation** (Screen to Screen)

- Set-up Screen
  * => Words Screen



## Wireframes

[Add picture of your hand sketched wireframes in this section]

**Set up Screen**

<img src="https://user-images.githubusercontent.com/69126372/230789895-b6fe066b-26a4-47ae-8d97-648e9794efae.png" width=250>

**Words Screen**: After selecting a category, the list of words are shown

<img src="https://user-images.githubusercontent.com/69126372/230789944-28eabd10-378f-4773-914f-718082b25a3d.png" width=250>
<img src="https://user-images.githubusercontent.com/69126372/230790204-aa131071-0670-4848-bee0-24f546148fb0.png" width=250>

**Learning Screen**: click on flash card to see the foreign language word

<img src="https://user-images.githubusercontent.com/69126372/230790047-956cc129-8e76-4c40-bcf7-d1afd509af67.png" width=250>
<img src="https://user-images.githubusercontent.com/69126372/230790037-b2fc81a1-a4f8-4038-b962-6f3ac3e2c41e.png" width=250>

**Stats Screen**

<img src="https://user-images.githubusercontent.com/69126372/230790062-40539534-19b7-4afe-bd3f-c7c813444676.png" width=250>
