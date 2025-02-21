package edu.kh.oop.cls.run;

package edu.kh.test1;

import java.until.Scanner;



public class Test1 {

	

		public static <Scanner> void main(String[] args) {

			Scanner sc = new Scanner(System.in);



			while(true) {

				System.out.print ("2 ~ 9 사이 정수 입력 : ");

				

				int input = sc.nextInt();// 1번째

				if (input >= 2 && input <=9){// 2번째

					for (int num = 1; num <=9 ; num++){
					System.out.printf("%d %d = %d\n", input, num, input * num);// 3번째

				}	

					break; // 4번째

		}else {

			System.out.println("2이상 9이하의 정수만 입력해주세요.");

			}

				

			}

			

		}

}

