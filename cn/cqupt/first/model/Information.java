package cn.cqupt.first.model;

public class Information {
	public int id;
	public String name;
	public int age;
	public String gender;
	public int salary;
	
	public Information(int id ,String name , int age , String gender ,int salary){
		System.out.println("id:" + id + ",����:" + name + "����" + age + "�Ա�" + gender + "нˮ" + salary);
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public void add(int id ,String name , int age , String gender ,int salary){
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	
}
