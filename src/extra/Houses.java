package extra;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
public class Houses {
	static Robot ralph = new Robot("batman");
	static Random rand = new Random();
public static void main(String[] args) {
	ralph.setPenWidth(5);	
	ralph.setSpeed(100);
	ralph.moveTo(20, 550);
	ralph.penDown();
	for (int i = 0; i <10; i++) {
		house();
	}
}
static void house() {
	int numm = rand.nextInt(190)+60;
	ralph.setAngle(0);
	ralph.move(numm);
	ralph.setAngle(90);
	ralph.move(50);
	ralph.setAngle(180);
	ralph.move(numm);
	ralph.setPenColor(0, 100, 0);
	ralph.setAngle(90);
	ralph.move(50);
	ralph.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
}
}
