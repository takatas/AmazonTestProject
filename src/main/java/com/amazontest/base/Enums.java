package com.amazontest.base;



public class Enums {
	public enum BrowserType {
		
		CHROME,
		FIREFOX

	}
	
	public enum findElementType{
		
		ID,
		NAME,
		XPATH,
		CSSSELECTOR
		
	}
	public enum UserType {
		
		AMAZON_TEST("stakatas@gmail.com", "SonerTest" );

		private final String userName;
		private final String password;
		
		UserType(String userName, String password){
			this.userName = userName;
			this.password = password;
			
		}
		public String getUserName() {
			return userName;
		}

		public String getPassword() {
			return password;
		}
	}



}
