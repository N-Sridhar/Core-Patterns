package com.sri.patterns.templatemethod;

public class CSVDataRenderrer extends DataRenderer {

	@Override
	public String readData() {
		return "CSV Data";
	}

	@Override
	public String processData(String data) {
		return "Processed " + data;
	}

}
