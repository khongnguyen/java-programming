package com.smartosc.training.Tran_Thanh.Week1.hw.thread;

public class Demo {
	public static void main(String [] args) {
		System.out.println("START!");
		
		MyThread t1 = new MyThread("Thread #1");
		MyThread t2 = new MyThread("Thread #2");
		MyThread t3 = new MyThread("Thread #3");
		
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Thread is shut down!");
			}
		}
		System.out.println("Thread is finished!");
	}
}
