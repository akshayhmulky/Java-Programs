package com.day9.abstractClass;

public class Runner {

	public static void main(String[] args) {
	
	Branch delhiBranch = new DelhiBranch();	
	Branch mumbaiBranch = new MumbaiBranch();
	
	delhiBranch.openAccount("pan card", "ration card", 2000);
	mumbaiBranch.openAccount("passport", "electricity bill", 2000);	
	}

}
