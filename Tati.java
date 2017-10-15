package meurobot;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Tati - a robot by (your name here)
 */
public class Tati extends AdvancedRobot
{
	public void run() {
	
		boolean angulo = true;
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setBodyColor(Color.magenta);  //corpo
		setGunColor(Color.black); //arma
		setRadarColor(Color.magenta) ;//radar
		setBulletColor(Color.red);  //Bala
		setScanColor(Color.yellow);  //varredura
			while(true)
		 {
		 	if (angulo ==true)
			{
			for (int voltasDir=0; voltasDir<4; voltasDir++) 
		 	{
			setAhead(100); 
			setTurnRight(90);
			setTurnGunRight(90);
			setFire(1);
			execute(); 
			
			}
			for (int voltasEsq=4; voltasEsq>0;voltasEsq--) 
			{
			ahead(100);
			turnLeft(90);
			turnGunLeft(180);
			}
			angulo = false;
			}
			else
			{
			for (int voltasDi=0; voltasDi<8; voltasDi++) 
		 	{
			ahead(100);
			turnRight(90);
			turnGunRight(90);
			}
			for (int voltasEs=4; voltasEs>0;voltasEs--) 
			{
			ahead(100);
			turnLeft(90);
			turnGunLeft(180);
			}
			angulo = true;
				}
			}
			}

	public void onScannedRobot(ScannedRobotEvent e) {
		
		//replace the next line with any behavior you wold like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
		System.out.println("Levei um tiro!");
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {		
	back(20);
		System.out.println("Bati na parede!");
	}	
}
