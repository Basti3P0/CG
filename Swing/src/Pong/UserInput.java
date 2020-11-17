package Pong;

import java.util.ArrayList;

public class UserInput {
// everything a user can press on keyboard or mouse
	
	public static ArrayList<String> list = new ArrayList<>();
	public int mousePressedX, mousePressedY, mouseMovedX, mouseMovedY, mouseButton;
	public char keyPressed;

// ... is returned as a data set
	public UserInput(int mpx, int mpy, int mmx, int mmy, int mb, char kp) {
		mousePressedX = mpx;
		mousePressedY = mpy;
		mouseMovedX = mmx;
		mouseMovedY = mmy;
		mouseButton = mb;
		keyPressed = kp;
	}
	
	public ArrayList<String> getPressedKeys() {
		return list;
		
	}
}