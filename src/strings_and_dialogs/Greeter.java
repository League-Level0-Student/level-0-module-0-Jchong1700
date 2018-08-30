package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "Hey! "+ name);
}
}
