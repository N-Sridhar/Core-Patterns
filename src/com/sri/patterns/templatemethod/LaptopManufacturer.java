package com.sri.patterns.templatemethod;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "Laptop Hard Disk";
	}

	@Override
	public String addRam() {
		return "Laptop Ram";
	}

	@Override
	public String addKeyboard() {
		return "Laptop Keyboard";
	}

}
