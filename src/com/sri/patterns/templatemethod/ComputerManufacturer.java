package com.sri.patterns.templatemethod;

public abstract class ComputerManufacturer {

	public void buildComputer() {
		String hardDisk = addHardDisk();
		String ram = addRam();
		String keyboard = addKeyboard();

		System.out.println("Building: " + hardDisk + " + " + ram + " + " + keyboard);
	}

	public abstract String addHardDisk();

	public abstract String addRam();

	public abstract String addKeyboard();
}
