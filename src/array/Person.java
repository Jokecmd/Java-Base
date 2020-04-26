package array;

public class Person {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	

}
