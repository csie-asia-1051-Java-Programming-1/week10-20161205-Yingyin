package ex;
/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Person>personList=new ArrayList<Person>();
		String str="Y";
		
		//person.add(new Person("mike","M",172,65));
		//person.get(0).showInfo();
		while(!(str.equals("N")||str.equals("n"))){
			String name=null,sexs=null;int sex=0;float height=0;float weight=0;
			float BMI=0;
			System.out.println("add  name"+"\tsex"+"\theight"+"\t  weight: ");
			name=scn.next();
//			System.out.println("1");
			sex=scn.nextInt();
//			System.out.println("2");
			if(sex==1){
				sexs="M";
			}else if(sex==2){
				sexs="F";
			}
			height=scn.nextFloat();
//			System.out.println("3");
			weight=scn.nextFloat();
//			System.out.println("4");
			BMI=((float) weight/((height/100f)*(height/100f)));
			if(personList.size()==0){
				personList.add(new Person(name,sexs,height,weight));
			}else if(personList.size()==1){
				if(personList.get(0).getBMI()>BMI){
					personList.add(new Person(name,sexs,height,weight));
				}
				else{
					personList.add( 0,new Person(name,sexs,height,weight) );
				}
			}else{
				boolean flag = true;
				int i=0;
				while(flag&&i<personList.size()-1){
					if(i==0&&personList.get(0).getBMI()<BMI){
						personList.add(0,new Person(name,sexs,height,weight));
						flag=false;
					}else{
						if(personList.get(i).getBMI()>BMI&&personList.get(i+1).getBMI()<=BMI){
							personList.add(i+1,new Person(name,sexs,height,weight));
							flag=false;
						}else if(personList.get(personList.size()-1).getBMI()>BMI){
							personList.add(new Person(name,sexs,height,weight));
							flag=false;
						}else{
							i++;
						}
					}
				}
			}for(int a=0;a<personList.size();a++){
				personList.get(a).showInfo();
			}System.out.println("請問是否繼續(Y or N): ");
			str=scn.next();
		}
	}
}
class Person{
		private String name,sex;
		private float weight,height;
		public Person (String name1,String sex1,float height1,float weight1){
			name=name1;sex=sex1;weight=weight1;height=height1;
		}
		public String getName(){
			return name;
		}
		public String getSex(){
			return sex;
		}
		public float getweight(){
			return weight;
		}
		public float getHeight(){
			return height;
		}
		public float getBMI(){
			return ((float) weight/((height/100f)*(height/100f)));
		}
		public void showInfo(){
			System.out.println("     "+name+"\t"+sex+"\t"+height+"\t"+"  "+weight+"\t"+"  "+
		((float) weight/((height/100f)*(height/100f))));
	}

}
