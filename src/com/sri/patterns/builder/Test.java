package com.sri.patterns.builder;

public class Test {

	public static void main(String[] args) {
		HttpClient httpClient = new HttpClient.HttpClientBuilder().method("POST").url("https://test.in")
				.secure("user", "pass").body("{}").build();
		System.out.println(httpClient);
	}

}
