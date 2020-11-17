package Pong;

import javax.swing.JLabel;

public class CircleWorld {
	
	// 
	private GraphicSystem graphicSystem;
	
	//Objekte für die Welt
	private Dot dot;
	private Player player;
	private HitBox playerH;
	private HitBox dotH;
	private Cube cube;
	private HitBox cube1;
	private Collider player11;
	private Collider cube22;
	private boolean collide;
	private boolean collide2;
	private Player2 player2;
	private Collider player22;
 public static int counterp1 = 0;
public static int counterp2 = 0;

	
	//HitBox dot1 = new HitBox(dot.x,dot.x,dot.y,dot.y);
	// Initialisiert die Welt einmalig am Anfang
	public void init() {
		collide = false;
		collide2 = false;
		dot = new Dot(20, 20);
		player = new Player(50, 350);
		player2 = new Player2(1100, 350);
		player22 = new Collider(player2.getX(), player2.getY());
		//player1 = new HitBox(p1.getX(), p1.getX(), p1.getY(), p1.getY());
		//dot1 = new HitBox(dot.getX(),dot.getX()+500,dot.getY(),dot.getY()+500);
		//player1 = new HitBox(10, 15, 10, 15);
		//dot1 = new HitBox(16,21,16,21);
		cube = new Cube(500,350);
		//cube1 = new HitBox(cube.getX(), cube.getX(),cube.getY(),cube.getY());
		player11 = new Collider(player.getX(),player.getY());
		cube22 = new Collider(cube.getX(), cube.getY());
	}
	
	
	//HitBox player1 = new HitBox(p1.getX(), p1.getX()+1, p1.getY(), p1.getY()+1);

	
	public void run() {
		//Gameloop
		
		
		while (true) {
			collide = false;
			//Userinput
			player.update();
			player2.update();
			//Bewegung für Gegenstand
			cube.update();
			//update graphics
			player11.updatePlayer(player);
			player22.updatePlayer2(player2);
			
			cube22.updateCube(cube);
			//update Collider for collision detection
			
			collide = cube22.hit(player11);	
			cube.collided(collide);
			collide = cube22.hit(player22);
			cube.collided(collide);		
			//Grafikdarstellung
			graphicSystem.clear();
			graphicSystem.drawCube(cube);
			graphicSystem.drawPlayer(player);
			graphicSystem.drawPlayer2(player2);
			graphicSystem.drawCounter();
			graphicSystem.redraw();
		}
	}

	public void setGraphicSystem(GraphicSystem p) {
		graphicSystem = p;
	}



}