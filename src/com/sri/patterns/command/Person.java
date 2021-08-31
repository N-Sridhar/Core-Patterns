package com.sri.patterns.command;

public class Person {

	public static void main(String[] args) {

		Television tv = new Television();

		RemoteControll remote = new RemoteControll();

		OnCommand on = new OnCommand(tv);
		remote.setCommand(on);
		remote.pressButton();

		OffCommand off = new OffCommand(tv);
		remote.setCommand(off);
		remote.pressButton();
	}

}
