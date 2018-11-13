package extra;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.Random;

public class Houses {
	static int[] Heights = {30,60,80,120,250};
	static Color RoofColor = Color.red;
	static Color StreetColor = Color.GREEN;
	static Color WallColor = Color.blue;
	static String[] Style = {"Flat","Pointed","Lightly-Pointed"};
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
    	Lexikirus.setPenColor(WallColor);
    	Lexikirus.setPenWidth(5);
    	Lexikirus.miniaturize();
    	
 
		// Work //
    	for (int i=0;i<10;i++) {
        	Lexikirus.setPenColor(WallColor);
    		Lexikirus.setAngle(90-90);
    		int Height = Heights[r.nextInt(Array.getLength(Heights))];
    		Lexikirus.move(Height);
        	Lexikirus.setPenColor(RoofColor);
    		if (Style[r.nextInt(Array.getLength(Style))].equalsIgnoreCase("flat")) {
    			int MoveDis = 40*(r.nextInt(2)+1);
    			Lexikirus.setAngle(0-90);
    			Lexikirus.move(MoveDis);
    		} else if (Style[r.nextInt(Array.getLength(Style))].equalsIgnoreCase("pointed")) {
    			int MoveDis = 25*(r.nextInt(2)+1);
    			
    			Lexikirus.setAngle(45-90);
    			Lexikirus.move(MoveDis);
    			Lexikirus.setAngle(-45-90);
    			Lexikirus.move(MoveDis);
    		} else {
    			int MoveDis = 25*(r.nextInt(2)+1);
    			
    			Lexikirus.setAngle(-50);
    			Lexikirus.move(MoveDis);
    			Lexikirus.setAngle(-125);
    			Lexikirus.move(MoveDis);
    		}
        	Lexikirus.setPenColor(WallColor);
    		Lexikirus.setAngle(-90-90);
    		Lexikirus.move(Height);
        	Lexikirus.setPenColor(StreetColor);
    		Lexikirus.setAngle(0-90);
    		Lexikirus.move(HouseDistance);
    	}
    	
	}
}
