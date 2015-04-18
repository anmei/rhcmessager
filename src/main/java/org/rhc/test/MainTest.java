package org.rhc.test;

import org.apache.commons.lang3.RandomUtils;

public class MainTest {

	public static void main(String[] args) {
		Integer a = -128;
		Integer b = -128;
		System.out.println(a==b);

//		System.out.println(myconsistant.APPLE);
//		String a = new StringBuilder("java").append(" good").toString();
//		System.out.println("java good"==a.intern());
//		System.out.println(RandomUtils.nextInt(126, 128));
		
		
		
		
	}
	
	public static final class ThRunable implements Runnable{

		@Override
		public void run() {
			System.out.println("fs");
			
		}
		
	}
	
	
	enum myconsistant{
		URL("sd"),
		APPLE,
		ORIANGE,
		BANNAER;
		
		private String value;
		private myconsistant() {
		}
		private myconsistant(String v) {
			this.value=v;
		}
		
		@Override
		public String toString() {
			return this.value;
		}
		
	}
	
}


