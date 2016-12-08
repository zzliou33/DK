package com.hanbit.java;

public class Loop {

	public static void main(String[] args) {
		/*
		 * countDown 함수를 만들어서 
		 * 입력받은 숫자부터 0까지 출력하시오.
		 */
		countDown(10);
		countDown(-10);
		countDown(0);
		countDown2(10);
		countDown3(10);
		countDown5(10);
	}
	static void countDown(int num) {
		
		System.out.print(num + "부터 0까지의 출력값 : [ ");
		if(num>0) {
			for(int i=num ; i>=0 ; i--) {
			System.out.print(i + " ");
			}
		}
		else if(num<0) {
			for(int i=0 ; i>=num ; i--) {
				System.out.print(i + " ");
			}
		}
		else {
			System.out.print(0+" ");
		}
		System.out.println("]\n");
	}
	
	static void countDown2(int num) {
		while(num>=0) {
			System.out.print(num-- + " ");
			
		}
		System.out.println();
	}
	static void countDown3(int num) {
		
		while(true) {
			System.out.print(num-- + " ");
			
			if(num < 0) {
				break;
			}
		}
		System.out.println();
	}
	static void countDown4(int num) {
		if(num<0) {
			return;
		}
		System.out.println(num);
		
		countDown4(--num);
	}
	
	static void countDown7(int input) {
		int[] numbers = new int[input + 1];
		
		int init = input;
		
		for (int num : numbers) {
			numbers[init - input] = input--;
		}
		
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	
	/**
	 * for-each 사용
	 * 
	 * @param input
	 */
	static void countDown6(int input) {
		int[] numbers = new int[input + 1];
		
		for (int num : numbers) {
			System.out.println(input--);
		}
	}
	
	/**
	 * 재귀함수(Recursive Function) 사용
	 * 
	 * @param input
	 */
	static void countDown5(int input) {
		if (input < 0) {
			return;
		}
		
		System.out.println(input);
		
		countDown5(--input);
	}
	
}
