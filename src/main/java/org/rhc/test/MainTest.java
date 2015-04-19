package org.rhc.test;

import java.util.concurrent.Executor;


public class MainTest {

//	static ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>(){
//		@Override
//		protected Integer initialValue() {
//			return 1;
//		}
//	};
	
	public static void main(String[] args) {
//		Integer a = -128;
//		Integer b = -128;
//		System.out.println(a==b);
//		System.out.println(myconsistant.APPLE);
//		String a = new StringBuilder("java").append(" good").toString();
//		System.out.println("java good"==a.intern());
//		System.out.println(RandomUtils.nextInt(126, 128));
		
//		threadlocal.set(threadlocal.get().intValue()+1);
//		System.out.println(Thread.currentThread().getName()+" "+threadlocal.get());
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				int i=0;
//				while(i++ < 1){
//					threadlocal.set(threadlocal.get().intValue()+1);
//				}
//				System.out.println(Thread.currentThread().getName()+" "+threadlocal.get());
//			}
//		});
		
		
		new MyExecutor().execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hahha");
			}
			
		});
		
	
	}
	
	static class MyExecutor implements Executor{

		@Override
		public void execute(Runnable command) {
			command.run();
			
		}
		
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


