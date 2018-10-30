package extra;

import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class Houses {
	static int[] Heights = {60,120,250};
	static String[] Style = {"Flat","Pointed"};
	static int HouseDistance = 25;
	
	public static void main(String[] args) {
		Random r = new Random();
    	
		Robot Lexikirus = new Robot();
		
		// Default Settings //
		int WinX = 1000;
    	int WinY = 500;		
		
		Lexikirus.penDown();
		Lexikirus.setSpeed(10);
		Robot.setWindowSize(WinX, WinY);
    	Lexikirus.setX(WinX-100); 
    	Lexikirus.setY(WinY-100);
    	Lexikirus.setRandomPenColor();
    	Lexikirus.setPenWidth(5);
    	Lexikirus.miniaturize();
 
		// Work //
    	for (int i=0;i<10;i++) {
    		Lexikirus.setAngle(90-90);
    		int Height = Heights[r.nextInt(3)];
    		Lexikirus.move(Height);
    		if (Style[r.nextInt(2)].equalsIgnoreCase("flat")) {
    			Lexikirus.setAngle(0-90);
    			Lexikirus.move(40);
    		} else {
    			int MoveDis = 25*(r.nextInt(2)+1);
    			
    			Lexikirus.setAngle(45-90);
    			Lexikirus.move(MoveDis);
    			Lexikirus.setAngle(-45-90);
    			Lexikirus.move(MoveDis);
    		}
    		Lexikirus.setAngle(-90-90);
    		Lexikirus.move(Height);
    		Lexikirus.setAngle(0-90);
    		Lexikirus.move(HouseDistance);
    	}
    	
	}
}
