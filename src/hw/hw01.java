package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int data[][]=new int[x][3];
		for(int i=0;i<x;i++){
			for(int j=0;j<3;j++){
				data[i][j]=scn.nextInt();
				while(data[i][j]<0){
					System.out.println("您輸入的資料錯誤,請再輸入一次:");
					data[i][j]=scn.nextInt();
				}
			}
		}
		for(int i=0;i<x;i++){
			fun1(data[i][0],data[i][1],data[i][2]);
		}
	}
	public static void fun1(int a,int b,int c){
		if(a+b+c<=300&&a+b+c>=0){
			if(a>=60&&b>=60&&c>=60){
				//System.out.println("1");
				System.out.println("P");
			}else if(((a<60&&b>=60&&c>=60)||(a>=60&&b<60&&c>=60)||(a>=60&&b>=60&&c<60))&&a+b+c>=220){
				//System.out.println("2");
				System.out.println("P");
			}else if(((a<60&&b>=60&&c>=60)||(a>=60&&b<60&&c>=60)||(a>=60&&b>=60&&c<60))&&a+b+c<220){
				//System.out.println("3");
				System.out.println("M");
			}else if(((a<60&&b<60&&c>=80)||(a<60&&b>=80&&c<60)||(a>=80&&b<60&&c<60))){
				//System.out.println("4");
				System.out.println("M");
			}else{
				//System.out.println("5");
				System.out.println("F");
			}
		}

	}

}
