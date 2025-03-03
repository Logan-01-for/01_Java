package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;



public class PracticeService {

	/*
	 * 길이가 9인 배열을 선언 및 할당하고, 
	 * 1부터 9까지의 값을 반복문을 이용하여
순서대로 배열의 각 인덱스 요소에 대입하고 
출력한 후 짝수 번째 인덱스 
값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	 * */
	public void practice1(){
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7,8,9}; // 원본
		int[] copyArr1 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
			System.out.println("arr 주소 : " + arr);
			System.out.println("copyArr1 주소 : " + copyArr1);
	
			System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("copyArr1 : " + Arrays.toString(arr));
			int[] copyArr2 = new int[arr.length];
			System.arraycopy(arr, 0, copyArr2, 0, arr.length);
			
			System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
			
			int[] copyArr3 = Arrays.copyOf(arr, arr.length);
			System.out.println("copyArr3 : "+ Arrays.toString(copyArr3));
			
			System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
			System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
			System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
			
			for(int i1 = 0; i1 < arr.length; i1++) {
				copyArr1[i1] = arr[i1];
			System.out.println();
		}
		
		}	
		
	}

	public void practice2(){
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 
		 * 9부터 1까지의 값을 반복문을 이용하여
			순서대로 배열의 각 인덱스 요소에 대입하고 
			출력한 후
			홀수 번째 인덱스 값의 합을 출력하세요. 
			(0 번째 인덱스는 짝수로 취급)
		 * */
		int[] arr = new int[9];
		int [] arr1;
		int[] arr11 = {9,8,7,6,5,4,3,2,1};
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		
		System.out.println("arr :" + Arrays.toString(arr));
		
		
	}

	public void practice3(){
		/*
		 *사용자에게 입력 받은 양의 정수만큼 
		 *배열 크기를 할당하고
			1부터 입력 받은 값까지 
			배열에 초기화한 후 출력하세요.
		 * */
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println("arr :" + Arrays.toString(arr));
		
	}
	
	public void practice4(){
		
		/*
		 * 정수 5개를 입력 받아 
		 * 배열을 초기화 하고
			검색할 정수를 하나 입력 받아 
			배열에서 같은 수가 있는 인덱스를 찾아 출력.
			배열에 같은 수가 없을 경우 
			“일치하는 값이 존재하지 않습니다“ 출력
		 * */
		for(int i = 0; i< 5.; i++) {
			
		}
		int[] arr = {1,2,3,4,5};
		
		for(int x =0; x< 5; x++) {
			
			
		}
		
		break;	
		System.out.println("arr :" + Arrays.toString(arr));
		
	}
	
	/*
	 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
	 * 검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 
		위치하는지 인덱스를 출력하세요.
	 * */
	
	public void practice5(){
		// 1. 사용자에게 문자열 입력 받기
		System.out.println("문자열 :");
		
		
		// 2. 사용자가 입력한 문자열을 하나하나 char 배열에 넣기
		// -> 사용자가 입력한 문자열의 길이만큼의 char 배열을 할당
		char [] arr = new char [str.length()];
		// 반복문을 통해 str.charAt(i) 값을 arr[i]에 담는 과정
		for(int i = 0; i < arr.length; i++) {
			arr[i]= str.charAt(i);
		}
		// 3. 문자 입력 받기 (검색할 문자)
		System.out.println("문자 :");
		char ch = sc.nextLine().charAt(0);
		
		// 4. 검색할 문자가 문자열에 몇개사 존재하는지, 어느 인덱스에 있는 지 파악
		int count = 0;// 검색할 문자가 몇개 들어있는지 세어줄 변수
		// 문자열에서 동일한 문자가 발견 될 때마다 1씩 증가
		
		// 반복문 수행 전 문자열 출력
		System.out.println(str = "에" + ch + "가 존재하는 위치(인덱스) :");
		
		// arr 배열의 인덱스마다 접근하기 위해 반복문 사용
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {// 해당 인덱스 값이 검색될 문자와 같을 경우
			System.out.print(i + " ");
						
			count++; // 그리고 count 값을 1 증가!
			}
		}
	System.out.println();
	System.out.println(ch + "개수 :" + count);
	}

	public void practice6(){
		
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 
		 * 그 값만큼 정수형 배열을 선언 및 할당하고
			배열의 크기만큼 사용자가 직접 값을 입력하여 
			각각의 인덱스에 값을 초기화 하세요.
			그리고 배열 전체 값을 나열하고 
			각 인덱스에 저장된 값들의 합을 출력하세요.
		 * */
			
			int[] arr = {4,-4,3,-3,2};
			
			int[] copyArr1 = new int[arr.length];
			for(int i = 0; i < arr.length; i++) {
				copyArr1[i] = arr[i];
				
			System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("copyArr1 : " + Arrays.toString(arr));
			
			int[] copyArr2 = new int[arr.length];
			System.arraycopy(arr, 0, copyArr2, 0, arr.length);
			
			System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
			
			System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
			System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
			System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
			System.out.println("copyArr4 : " + Arrays.toString(copyArr4));
	}
	
	public void practice7(){
		
		/*
		 * 주민등록번호 번호를 입력 받아 
		 * 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
		 * */
		
	}

	public void practice8(){
		/*
		 * 3이상인 홀수를 입력 받아 
		 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
			중간 이후부터 끝까지는 
			1씩 감소하여 내림차순으로 값을 넣어 
			출력하세요.
			단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
			다시 정수를 받도록 하세요.
		 * */
		
		for(int i = 0; i < arr.length; i++) {
		}
	
		}
		
		public void practice9(){
			/*
			 * 10개의 값을 저장할 수 있는 
			 * 정수형 배열을 선언 및 할당하고,
				1~10 사이의 난수를 발생시켜 
				배열에 초기화한 후 출력하세요.
			 * */
			int[] arr = new int[];
			int random = (int)(Math.random() * 45 + 1); // 1 ~ 45
			[i] = random;
			for(int x =0; x< i; x++) {
				if(random == lotto[x]) {
					i--;
					break;
		}
	}
		}
		
		public void practice10(){
			/*
			 * 10개의 값을 저장할 수 있는 
			 * 정수형 배열을 선언 및 할당하고,
				1~10 사이의 난수를 
				발생시켜 배열에 초기화 후
				배열 전체 값과 그 값 중에서 
				최대값과 최소값을 출력하세요.
			 * */
			int[] arr = new int[10];
			arr[0] =1;
			arr[1] =2;
			arr[2] =3;
			arr[3] =4;
			arr[4] =5;
			arr[5] =6;
			arr[6] =7;
			arr[7] =8;
			arr[8] =9;
			arr[9] =10;
		
			System.out.println();
		}
		
		public void practice11(){
			/*
			 * 10개의 값을 저장할 수 있는 정수형 배열을 
			 * 선언 및 할당하고
				1~10 사이의 난수를 발생시켜 
				중복된 값이 없게 배열에 초기화한 후 
				출력하세요.
			 * */
		int [] arr = new int[10];
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		arr[5] =6;
		arr[6] =7;
		arr[7] =8;
		arr[8] =9;
		arr[9] =10;
		
		int random = (int)(Math.random() * 45 + 1); // 1 ~ 45
		for(int x =0; x< i; x++) {
			
		if(random = [x]) {
			i--;
			break;
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i;
				}
			}
		}
		}
		
		public void practice12(){
			/*
			 * 로또 번호 자동 
			 * 생성기 프로그램을 만들기.
			(중복 값 없이 
			오름차순으로 정렬하여 출력하세요.)*/
			public void createLottoNumber() {
			int[] lotto = new int[6];
			for(int i = 0; i< lotto.length; i++) {
			int random = (int)(Math.random() * 45 + 1); // 1 ~ 45
			lotto[i] = random;
			for(int x =0; x< i; x++) {
			if(random == lotto[x]) {
					i--;
					break;
						}
					}
			System.out.println(Arrays.toString(lotto) );
					
				}
			}
		
			/*
			 * 문자열을 입력 받아 
			 * 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
				문자의 개수와 함께 출력하세요.
			 * */
			public void practice13(){
			//1. 사용자에게 문자열 입력 받기
			System.out.println("문자열 : ");
			String str = sc.nextLine();
			
			//2. 해당 문자열의 문자들을 char[]에담ㄱㅣ
			char[] arr = new char[str.length()];
			
			for(int i= 0; i < arr.length; i++) {
				
			}
			//3. char 배열에서 중복 값 존재할 경우 출력 X
			int count = 0; // 문자개수 세기용 변수
			
			System.out.println("문자열에 있는 문자 :");
			
			for(int i = 0; i < arr.length; i++) {
				
				boolean flag = true; // 중복 체크용 flag 변수
				 
				// 중복 값이 있는지 검사하는 for
				for(int j = 0; j< i; j++) {
					if(arr[i] == arr[j]) {//비교
						flag = false; // 중복 발생 했을때
						break;
					}
				}
				
				if(flag) {// 중복이 발생하지 않았을 경우
					
					// if문
					if(i == 0) { // 첫번째 문자
						System.out.println(arr[i]);
					} else { // 0번 인덱스가 아닌 글자
						System.out.println("< " + arr[i]);
					}
					count++; // 중복 아닐때만 count 갯수 늘리기
				}
			}
				System.out.println();
				System.out.println("문자 개수 : " + count);
			}
			
			
			/*
			 * 사용자가 입력한 배열의 길이만큼의 
			 * 문자열 배열을 선언 및 할당하고
			배열의 인덱스에 넣을 값 역시 
			사용자가 입력하여 초기화 하세요.
			단, 사용자에게 배열에 값을 
			더 넣을지 물어보고 몇 개를 더 입력할 건지,
			늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
			사용자가 더 이상 입력하지 않겠다고 하면 
			배열 전체 값을 출력하세요.
			 * */
		public void practice14(){
			
			
			// 1. 첫 배열 크기 지정
			System.out.println("배열의 크기를 입력하세요 : ");
			int size = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
			
			String[] arr = new String[size];
			
			// 2. 첫 배열에 저장할 문자열 입력받기
			for (int i =0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
			}
			
			// 3. 반복이 시작되는 구간 부터 while 작성하여 내부에 종료조건 만들어서 break;
			while(true) {
				System.out.println("더 값을 입력하시겠습니끼?(y/n) : ");
				char ch = sc.next().charAt(0);
				
			// 4. 값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') {
				
				// 5. 더 입력받을 개수 입력 받기
				System.out.println("더 입력하고 싶은 개수");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력 받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력 받기
				for (int i = 0; i < newArr.length; i++) {
					
					if(i < arr.length) // 인덱스의 크기가 기존 배열보다 작을경우 (깊은 복사)
						// 인덱스의 크기가 기존 배열 보다 클 경우 (새로운 값 입력 받기)
						newArr[i] = arr[i];// 기존 배열 요소 값 복사
				}else {
					System.out.println((i+1) + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				
				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입 (얕은 복사)
				// 더 입력?  y
				// 위코드를 반복할때 기존 배열인 arr 의 길이를 기준으로
				// 새 배열(newArr)의 크기를 할당하기 
				arr =newArr;
			
				
			} else if (ch == 'n' || ch == 'N') { // 값을 더 입력하지 않을 경우
				break; // while 반복문 종료
				
			}else { // 잘못 입력한 경우
			System.out.println();
			}
			// 값을 더 입력하지 않을 경우
			// 잘못 입력한 경우
				
				
				
				
				
			}
		int[] arr = new int[3];
		
		arr[0] = 1;
		
		}
		
		
		
		}
		
		
		
		
		
	
