package com.kita.jaeyong;

public class ChamJoVariable {

	
	
	// 참조변수를 받는 메소드
	static void printArr(int[] arr) {
		System.out.print("[");

		for (int i : arr) {
			System.out.print(i +",");
		}
		System.out.println("]");
	}

	static int sumArr(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
			}
		}
	}

	
	
	
	// 일반메소드
	static void add(int a) {
		a = 5;
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {

		// 참조 메소드 호출
		int[] arr1 = new int[] {3,2,1,6,5,4};
		System.out.println(arr1[0]);  // 메소드호출 전에는 인덱스[0] = 3
		printArr(arr1);
		sortArr(arr1);
		printArr(arr1);
		System.out.println(sumArr(arr1));
		System.out.println(arr1[0]);	// 메소드 호출후에는 인덱스[0] = 1
		
		
		System.out.println("------------");
		
		
		
		// 일반메소드 호출
		int a = 10;
		add(a); 		// 여기서만 5로되고
		System.out.println(a); // 다시 원래a의 변수값은 10 그대로 ( 즉 변경 안되었단 뜻 )
	}
	
	// 참조메소드는 매개변수를 배열로 받을경우 직접 그 주소를 찾아가 값을 변경한다면
	// 일반 메소드는 기본변수를 사용하기에 직접 주소에 닿을수없어 호출후,
	// 다시 돌아옴
	
	// 현재상황까진 jvm , call stack 현상을 생각하면됨
	// 호출되었을때만 메모리에 올라가고 사용이 끝나면 메모리에서 사라짐 
	

}
