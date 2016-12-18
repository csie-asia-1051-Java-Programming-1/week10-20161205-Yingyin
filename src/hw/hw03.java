package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Student>student=new ArrayList<Student>();
//		student.add(new Student("mike","104021074",85,100,50));
//		student.get(0).showInfo();
		String str="Y";
		while(!(str.equals("N")||str.equals("n"))){
			String name=null,id=null;int score1=0, score2=0, score3=0;
			float Avg=0;
			System.out.println("name   id   score1   score2   score3: ");
			name=scn.next();id=scn.next();
			score1=scn.nextInt();
			score2=scn.nextInt();
			score3=scn.nextInt();
			while(score1<0||score1>100){
				System.out.println("您輸入的score1成績有錯:");
				score1=scn.nextInt();
			}
			while(score2<0||score2>100){
				System.out.println("您輸入的score2成績有錯:");
				score2=scn.nextInt();
			}
			while(score3<0||score3>100){
				System.out.println("您輸入的score3成績有錯:");
				score3=scn.nextInt();
			}
			Avg=(float) (score1+score2+score3)/3;
			if(student.size()==0){
				student.add(new Student(name,id,score1,score2,score3));
			}else if(student.size()==1){
				if(student.get(0).getAvg()>Avg){
					student.add(new Student(name,id,score1,score2,score3));
				}else{
					student.add(0,new Student(name,id,score1,score2,score3));
				}
			}else{
				boolean flag=true;int i=0;
				while(flag&&i<student.size()-1){
					if(i==0&&student.get(0).getAvg()<Avg){
						student.add(0,new Student(name,id,score1,score2,score3));
						flag=false;//personList.get(personList.size()-1).getBMI()>BMI
					}else{
						if(student.get(i).getAvg()>Avg&&student.get(i+1).getAvg()<=Avg){
							student.add(i+1,new Student(name,id,score1,score2,score3));
						}else if(student.get(student.size()-1).getAvg()>Avg){
							student.add(new Student(name,id,score1,score2,score3));
							flag=false;
						}else{
							i++;
						}
					}
				}
			}for(int a=0;a<student.size();a++){
				student.get(a).showInfo();
			}System.out.println("請問是否繼續(Y or N): ");
			str=scn.next();
			if(str=="N"||str=="n"){
				System.out.println("謝謝使用本系統!!");
			}
		}
	}

}
class Student {
	private String name,id;
	private int score1,score2,score3;
	public Student(String name1,String id1,int scorea,int scoreb,int scorec){
		name=name1;id=id1;score1=scorea;score2=scoreb;score3=scorec;
	}
	public float getAvg(){
		return (score1+score2+score3)/3;
	}
	public void showInfo(){
		System.out.println("     "+name+"\t"+id+"\t"+score1+"\t"+"  "+score2+"\t"+"  "+score3+"\t"+
				((float) (score1+score2+score3)/3));

	}

}
