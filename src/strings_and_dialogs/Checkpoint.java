package strings_and_dialogs;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	
	String color = JOptionPane.showInputDialog("What's your favorite color of the rainbow? \n eg.(r,o,y,g,b,p)");
JOptionPane.showMessageDialog(null, color + " is a great color!" );
	Robot kotori = new Robot();
	kotori.setSpeed(80);
	kotori.penDown();
	if(color.equalsIgnoreCase("red")|| color.equalsIgnoreCase("r"))  {
	kotori.setPenColor(255, 0, 0);}
	if(color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("o")) {kotori.setPenColor(255, 128, 0);}
	if(color.equalsIgnoreCase("yellow") || color.equalsIgnoreCase("y")) {kotori.setPenColor(255, 255, 0);}
	if(color.equalsIgnoreCase("green") || color.equalsIgnoreCase("g")) {kotori.setPenColor(0, 255, 0);}
	if(color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("b")) {kotori.setPenColor(0, 0, 255);
	}
	if(color.equalsIgnoreCase("purple") || color.equalsIgnoreCase("p")) {kotori.setPenColor(127, 0, 255);}
	
	kotori.hide();
	kotori.turn(90);
	kotori.move(100);
	kotori.turn(360/3);
	kotori.move(100);
	kotori.turn(360/3);
	kotori.move(100);
}
}
