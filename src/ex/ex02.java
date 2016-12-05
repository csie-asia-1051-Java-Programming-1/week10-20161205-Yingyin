package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
	      int a=sca.nextInt();
	      
	      System.out.println(summer(a));
	      System.out.println(summer2(a));
		}

		
		public static float summer(float a){
			float sum=0;
			if(a<120){
				sum=(float)(a*2.1);
				
			}else if(a>=121 && a<=330){
				sum=(float)(252+(a-120)*3.02);
				
			}else if(a>=331 && a<=500){
				sum=(float)(252+634.2+(a-330)*4.39);
				
			}else if(a>=501 && a<=700){
				sum=(float)(252+634.2+746.3+(a-500)*4.97);
				
			}else if(a>=701){
				sum=(float)(252+634.2+746.3+994+(a-700)*5.63);
			}
			
			return sum;
		}
		public static float summer2(float a){
			float sum1=0;
			if(a<120){
				sum1=(float)(a*2.10);
				
			}else if(a>=121 && a<=330){
				sum1=(float)((120*2.10)+(a-120)*2.68);
				
			}else if(a>=331 && a<=500){
				sum1=(float)((120*2.10)+(210*2.68)+(a-330)*3.61);
				
			}else if(a>=501 && a<=700){
				sum1=(float)((120*2.10)+(210*2.68)+(170*3.61)+(a-500)*4.01);
				
			}else if(a>=701){
				sum1=(float)((120*2.10)+(210*2.68)+(170*3.61)+(200*4.01)+(a-700)*4.50);
			}
			
			return sum1;
		}
	}