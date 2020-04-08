package lottogame;

import java.util.Random;
import java.util.Scanner;

public class LotoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int [] arr = {2,6,8,26,43,45};
		int [] arr2= {6,2,8,26,45,43};
		int n=0;
		int S3_num=0; // 3등 1/35,724 5개
		int S2_num=0; // 2등 5개번호 일치 + 보너스번호 일치 1/1,357,510
		int s1_num=0; // 1등 1/8,145,060 8백 14만 5천 60분의 1
		System.out.println("연산할 횟수를 입력하세요");
		int want_num=sc.nextInt();
		
		while(n<=want_num) {
			arr2=ran();
			
			int a=Roto(arr,arr2);
			//System.out.println("연산 횟수"+n +"번" + "맞은 번호 수=" + a +"개");
			
			if(a>=3) {
				//System.out.println("확률상 45/1 뚫음 ");
				S3_num++;	
			}
			if(a==6) {
				System.out.println("1등 당첨!!! 했습니다 ");
				System.out.println("연산 횟수 "+n +" 번 " + "맞은 번호 수=" + a +"개");
				s1_num++;
				//break;
			}
			n++;
		}
		
		System.out.println("확률상 45/1 뚫은 경우"+S3_num);
        System.out.println(n + "번 동안 "+" 1등이"+ s1_num +"번 나왔습니다.");
	}
	
	
	static int[] ran() {
		Random rn = new Random();
		int [] arr2= new int [6];
		//System.out.print("예상 번호");
		for(int i=0; i<6;i++) {
			int n=rn.nextInt(45)+1;
			arr2[i]=n;
			//System.out.printf("%d -- ",arr2[i]);
			
		}
		System.out.println();
		return arr2;
	}
	
	
	static int Roto(int[]arr, int[]arr2) {
		int num = 0;
		
		for(int i=0; i<6; i++) {
			for(int j=0;j<6;j++) {
				if(arr[i]==arr2[j] ) {
					num++;
				}
			}
		}
		
		return num;
	}
		
		
		
		

	
	

}
