package Pong;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class CircleMain {
	
	private CircleWorld world = null;

	public CircleMain() {
		
		CircleFrame frame = new CircleFrame();
		frame.setVisible(true);
		
		world = new CircleWorld();
		// erstmaliges darstellen des world Objektes mit der Methode setGraphicSystem 
		// die zwar in der CircleWorld Klasse ist aber von dort aus die Klasse  aufruft
		world.setGraphicSystem(frame.getPanel());
		world.init(); //Objekte konstruieren
		world.run(); //GameLoop
	}

	public static void main(String[] args) {
		System.out.println("test");
		new CircleMain();
	}
}
