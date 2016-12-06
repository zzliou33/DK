package com.hanbit.java;

public class FirstClass {

		int number ;
		int sum;
		//멤버변수는 초기값을 갖고있다.
		//지역변수는 초기화를 안해주면 안된다
		//0, null, false
		FirstClass(int number){
			this.number = number;
		}
		int getNumber(){
			return number;
		}
		
		int addNumber(int add) {
			number += add;
			
			int sum = number;
			this.sum = sum;
			//this는 class에 있는 객체를 가리킴
			return number;
		}

}
