// Java program to demonstrate working of Comparator 
// interface 
package Collections;
import java.util.*; 
import java.lang.*; 
import java.io.*; 



public class Student {
	int rollno;
	String name, address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return this.rollno+" "+this.name+" "+this.address;
	}

}

class Sortbyroll implements Comparator<Student>{
	
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

class SortbyName implements Comparator<Student>{
		public int compare(Student a, Student b) {
			return a.name.compareTo(b.name);
		}
}

class Main{
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111,"Divya","Delhi"));
		ar.add(new Student(222,"Sakshi","Jaipur"));
		ar.add(new Student(333,"Lavina", "Agra"));
		
		System.out.println("Unsorted");
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar, new SortbyName());
		
		System.out.println("Sorted By Name:");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}

