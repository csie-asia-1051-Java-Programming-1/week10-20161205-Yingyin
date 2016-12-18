package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scn = new Scanner(System.in);
		Scanner scn=new Scanner(System.in);
		int [] data = new int [4];
		int kill=0;
		int nomean=0;
		System.out.println("請輸入骰子點數: ");
		for(int i=0;i<4;i++){
			data[i]=scn.nextInt();
		}
		for(int i=0;i<4;i++){
			if(data[i]<1||data[i]>6){
				System.out.println("您輸入的第"+(i+1)+"筆資料有錯請重新輸入: ");
				data[i]=scn.nextInt();
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(data[i]==data[j]){
					kill++;//16
				}
			}
		}
		//System.out.println(kill);
		if(kill==16){
			System.out.println("通殺");
		}else if(kill==10||kill==4){
			System.out.println("R");
		}else if(kill==6){
			int a=0,b=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(data[i]==data[j]&&i!=j){
						a=i;b=j;
					}
				}
			}System.out.println(data[a]+data[b]);
		}else if(kill==8){
			int a=0,b=0,c=0,d=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(data[i]==data[j]&&i!=j){
						a=i;b=j;
					}else if(data[i]==data[j]&&data[i]+data[j]!=data[a]+data[b]){
						c=i;d=j;
					}
				}
			}if(data[a]+data[b]>data[c]+data[d]){
				System.out.println(data[a]+data[b]);
			}else{
				System.out.println(data[c]+data[d]);
			}
		}

	}

}
