package com.sri.patterns.command;

public class OffCommand implements Command {

	Television tv;

	public OffCommand(Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

}
