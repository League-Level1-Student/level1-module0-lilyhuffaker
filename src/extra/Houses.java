package extra;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
public class Houses {
	static Robot ralph = new Robot("batman");
public static void main(String[] args) {
	 Random num = new Random();
	ralph.setPenWidth(5);	
	ralph.setSpeed(100);
	ralph.moveTo(20, 550);
	ralph.penDown();
	house();
	house();
	house();
	house();
	house();
	house();
	house();
	house();
	house();
	house();
}
static void house() {
	ralph.setAngle(0);
	ralph.move(100);
	ralph.setAngle(90);
	ralph.move(50);
	ralph.setAngle(180);
	ralph.move(100);
	ralph.setPenColor(0, 100, 0);
	ralph.setAngle(90);
	ralph.move(50);
	ralph.setPenColor(0, 0, 0);
}
}
