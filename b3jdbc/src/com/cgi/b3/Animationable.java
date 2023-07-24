package com.cgi.b3;

// added interface
public interface Animationable {
	public static final int r=45;
	int x=20;
	
	default  String drawable(String medium) {
		
		return null;
	}

	void animate(int x,int y);
}
