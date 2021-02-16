/*
Question 3
[Java Programming]
[25 Marks]


Consider the following skeleton for a Robot class, which has private fields for storing the
location of aRobot object, its name, and the direction it’s facing (North for a direction parallel to 
the positive y axis,South for the negative y axis, East for the positive x axis, or West for the
negative x axis). It also hasstub methods for constructing a Robot object, changing the direction,
and moving the location of therobot in the direction it’s facing. 
*/

public class Robot
{
private String name;
private char direction; //’N’,’S’,’E’, or ’W’
privateintxLoc, yLoc; // the (x, y) location of the robot
// Initialize name, direction, and (x, y) location
public Robot(String name, char dir, int x, int y) { ... }
public String toString()
{
return name + " is standing at (" + x + "," + y + ") and facing"
+ direction);
}
// turn 90 degrees clockwise, e.g. ’N’ changes to ’E’, ’E’ to ’S’, ...
public void turnClockwise() { ... }
// turn 90 degrees counterclockwise, e.g. ’N’ to ’W’, ’W’ to ’S’, ...
public void turnCounterClockwise() { ... }
// move numSteps in direction you are facing,
// e.g. if ’N’ 3 steps, then y increases 3
public void takeSteps(intnumSteps) { ... }
} 

/*(a) Complete the constructor, the turnClockwisemethod, turnCounterClockwise, and the takeStepsmethod. 
Make sure your constructor validates its input. */



/*(b) Write Java code to create an array of 5 robots. Use a for loop to fill in the array so that the n-th
robot is named “robot n”, and it starts off life facing east at location (n, n). */