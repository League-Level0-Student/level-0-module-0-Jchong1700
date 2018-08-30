package strings_and_dialogs;
import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	public static void main(String[] args) {
		Robot dia = new Robot();
		dia.miniaturize();
		dia.setSpeed(100);
		dia.moveTo(10, 30);
		dia.penDown();
		dia.turn(90);
		dia.move(100);
		dia.turn(180);
		dia.move(50);
		dia.turn(-90);
		dia.move(85);
		for (int i = 0; i < 9; i++) {
		dia.turn(20);
		dia.move(10);
			}
		dia.hide();}

}
