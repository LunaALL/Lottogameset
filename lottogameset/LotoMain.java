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
		int S3_num=0; // 3�� 1/35,724 5��
		int S2_num=0; // 2�� 5����ȣ ��ġ + ���ʽ���ȣ ��ġ 1/1,357,510
		int s1_num=0; // 1�� 1/8,145,060 8�� 14�� 5õ 60���� 1
		System.out.println("������ Ƚ���� �Է��ϼ���");
		int want_num=sc.nextInt();
		
		while(n<=want_num) {
			arr2=ran();
			
			int a=Roto(arr,arr2);
			//System.out.println("���� Ƚ��"+n +"��" + "���� ��ȣ ��=" + a +"��");
			
			if(a>=3) {
				//System.out.println("Ȯ���� 45/1 ���� ");
				S3_num++;	
			}
			if(a==6) {
				System.out.println("1�� ��÷!!! �߽��ϴ� ");
				System.out.println("���� Ƚ�� "+n +" �� " + "���� ��ȣ ��=" + a +"��");
				s1_num++;
				//break;
			}
			n++;
		}
		
		System.out.println("Ȯ���� 45/1 ���� ���"+S3_num);
        System.out.println(n + "�� ���� "+" 1����"+ s1_num +"�� ���Խ��ϴ�.");
	}
	
	
	static int[] ran() {
		Random rn = new Random();
		int [] arr2= new int [6];
		//System.out.print("���� ��ȣ");
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
