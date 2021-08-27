package com.sri.patterns.templatemethod;

public class Test {

	public static void main(String[] args) {
//		XMLDataRenderrer renderer = new XMLDataRenderrer();
//		renderer.render();

		DesktopManufacturer desktop = new DesktopManufacturer();
		desktop.buildComputer();
		
		LaptopManufacturer laptop = new LaptopManufacturer();
		laptop.buildComputer();
	}
}
