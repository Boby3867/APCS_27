package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public String name;
	public int age;
	public String breed;
	

	public Dog(){
	name = "Clifford";
	age = 3;
	breed = "big red dog";
	}
	public Dog(String a){
	name = a;
	age = 1;
	breed = "dog dog";
	}
	public Dog(String a, String b){
	name = a;
	age = 1;
	breed = b;
	}
	public Dog(String a, int b){
	name = a;
	age = b;
	breed = "dog dog";
	}

	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void setBreed(String a){
		breed = a;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int a = (int) (Math.random() * 2) + 1;
		if(a == 1){
		return true;
		}
		else{
		return false;
		} 
	}
	public void bark(){
		System.out.println(name + " Barks");
	}
}
