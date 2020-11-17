package Pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class CircleFrame extends JFrame implements KeyListener{

	private GraphicSystem panel = null;

	public CircleFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1200, 800);
		panel = new GraphicSystem();
		this.setContentPane(panel);
		addKeyListener(this);
	}

	public GraphicSystem getPanel() {
		return panel;
	}

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (!UserInput.list.contains(e.getKeyChar()+""))
		UserInput.list.add(e.getKeyChar()+"");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (UserInput.list.contains(e.getKeyChar()+""))
		UserInput.list.remove(e.getKeyChar()+"");
		
	}
}