package com.Qa.hs.tests;

import org.testng.annotations.Test;

import com.Qs.hs.keyword.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest() {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}

}
