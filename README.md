# CalculateBMI
The purpose of this program is to use if-else-if condition statements to determine the weight status using the BMI we were  supposed to calculate before. 

We start by importing java. util.Scanner (used for user input). 
Next, we are supposed to ask the user to enter information such as their name, weight, and height. This information will be used to calculate 
BMI which we can then used to determine the weight status. Are they overweight, underweight, or is their weight considered normal? 
After we prompt the user to enter information, we then write the formula to calculate BMI: weight/height^2. 

We can use Math.pow to raise the height to the second power. Whatever value the user inputs, will be the thing that is considered in the calculations. 
Once we calculate, the BMI we must determine the weight status. This can be done by checking the values in the table and determining whether the user's BMI is greater than, less than, or equal to specific numbers. 
For example, we can use if-else-if to check if the user's BMI is a smaller or larger number. 
For example, if a BMI is close to 10.0 that means the weight status can be determined based on the number that has been calculated (which is the BMI - which was previously calculated using the weight and height the user inputted). 

This project will first calculate the BMI based on the values the user inputs. 
Then, it will check the BMI and give the user a correct weight status. 
You can use Math.pow() to fully calculate the BMI using the BMI formula: weight/height^2. 
The weight status will be calculated using if-else-if statements. 

For example,                           if BMI >= (a certain value ) <-- 

                                                                  Category(weight status) = "Normal weight";         <-- weight status 

                                                                  else if (BMI < (a certain value) 

                                                                  Category = "Underweight";       

---> if none of the above is true                 else 

                                                                  Category = "Obese";

This is how if-else-if works. The last "else" is there in case none of the above statements were true. 
-------------------------------PMR----------------------------------------
<+s>: This program allowed me to utilize Math.pow() again in an if-else-if assignment. 
I understand that I will most likely be using Math.pow() whenever I need to find the volume, area, or just when I'm using 
formulas especially as they get more complex. In addition, I was able to learn about if-else-if statements and how they are used in java. 
It was a bit confusing and tricky to understand how to set up the program but writing the step-by-step process down really did help. 

<-s>: Overall, the minor mistake I made was a reckless mistake. 
I finished writing my program and was ready to run it. I saw that there were no compile errors and I was feeling confident. 
I inputted the name and weight information but as soon as I got to height, I entered a number, an apostrophe, and another number. 
I didn't realize this would cause an error in the program. I spent 30 mins trying to figure out what went wrong. 
I looked back at my code, checked the lesson. Everything seemed to be fine so I tried again. This time, I didn't use an apostrophe. 
I simply added a space between the two numbers. To my surprise, the program finally worked and the output was displayed. I was relieved. 
 
Overall, this program was fun and I enjoyed using if-else-if even though sometimes it can be tedious to spend lots of time trying to understand 
what you're using it for. 
--------------------------------------------------------------------------
I'm glad I didn't get frustrated this time. I will be sure to remember this for future assignments. 

At first, I hadn't realized that I didn't convert height to meters and weight to kg. 
I set those while initializing both height and weight to then calculate the BMI. 
I needed to convert feet to inches, then inches to meters to successfully calculate the BMI.
