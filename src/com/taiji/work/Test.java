package com.taiji.work;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Test {
	public static void main(String[] args) {
		int arr[]= {100,95,90,85,80,75,70,60};
		List<Student> list = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			Student s = new Student(i, "学生0"+i, arr[(int)(Math.random()*8)]);
			list.add(s);
		}
	List stu1 = CheckStudent(list, p -> p.getScore()==60);
	List stu2 = CheckStudent(list, p -> p.getScore()==70);
	List stu3 = CheckStudent(list, p -> p.getScore()==75);
	List stu4 = CheckStudent(list, p -> p.getScore()==80);
	List stu5 = CheckStudent(list, p -> p.getScore()==85);
	List stu6 = CheckStudent(list, p -> p.getScore()==90);
	List stu7 = CheckStudent(list, p -> p.getScore()==95);
	List stu8 = CheckStudent(list, p -> p.getScore()==100);
	
	System.out.println("60分学生数:"+stu1.size());
	System.out.println("70分学生数:"+stu2.size());
	System.out.println("75分学生数:"+stu3.size());
	System.out.println("80分学生数:"+stu4.size());
	System.out.println("85分学生数:"+stu5.size());
	System.out.println("90分学生数:"+stu6.size());
	System.out.println("95分学生数:"+stu7.size());
	System.out.println("100分学生数:"+stu8.size());
	}
	
	public static List<Student> CheckStudent(List<Student> list,Predicate<Student> s){
		return list.stream().filter(s).collect(Collectors.toList());
		
	}
}
