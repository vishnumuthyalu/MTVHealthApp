# MTVHealth
MTV-Health Final Submission

Welcome to MTVHealth, your ultimate fitness companion! Whether you're a gym enthusiast or someone who's just starting out, we've got you covered. Our app is designed to help you achieve your fitness goals with ease and convenience. With our BMI calculator, you can easily track your progress and stay on top of your fitness journey. Our intuitive interface allows you to explore different muscle groups and access a wide range of exercises to target specific areas of your body. With MTVHealth, you can take control of your fitness and unlock your full potential. Let's start your journey to a healthier, fitter you!

-Within your app we have a page for a BMI calculator, page that displays muscle groups which you can click, once you click on a muscle group it will take you the next page to view exercises for that paticular muscle group you selected.

Our Porject has these java files: 
- BMIController (coded by Minh): BMICotroller is the controller consist of the constructor to store data from the user It also consist of getResultMessage that will display the user's data (weight etc...).

- BMIActivity (coded by Minh): BMIActivity will pull data from BMI Calculator and display the data for the user to see using view.

- DisplayExerciseActivity (coded by Thanush and Vishnu): The DisplayExerciseActivity class is responsible for displaying the lis tof exercises and an image related to the exercise on the screen. It reads the type exercise from a csv file, and populated them in the list. Whenever a particular exercise in the list is clicked, it opens a URL in youtube.

- ExercisesActivity (coded by Thanush and Vishnu): ExercisesActivity class is responsible for displaying the list of exercises categorized by body parts such as the chest, leg, shoulder, etc..  It allows the user to select a specific body part displays the exercises corresponding to it using the DisplayExerciseActivity.

- LayoutScreenActivity (coded by Thanush and Vishnu): Called when the activity is starting. This is where most initialization should go.

- MainActivity (coded by Thanush and Vishnu): MainActivity.java is the main entry point of the application. It displays a splash screen with a single button that leads to the next screen.

- The project has xml files located in the layout folder and the project also has csv file with all the exercise in the assets folder.
