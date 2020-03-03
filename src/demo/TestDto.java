package demo;

public class TestDto {
<<<<<<< HEAD
	String university;
=======
	String schoolName;
>>>>>>> branch 'master' of https://github.com/jetyu/GitTest.git
	String name;
	int age;
	float price;

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TestDto [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

}
