package com.sri.patterns.templatemethod;

public class XMLDataRenderrer extends DataRenderer {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		return "Processed " + data;
	}

}
