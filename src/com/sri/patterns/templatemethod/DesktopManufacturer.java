package com.sri.patterns.templatemethod;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "Desktop Hard Disk";
	}

	@Override
	public String addRam() {
		return "Desktop Ram";
	}

	@Override
	public String addKeyboard() {
		return "Desktop Keyboard";
	}

}
