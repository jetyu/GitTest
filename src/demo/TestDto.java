package demo;

public class TestDto {
	int id;
	String name;
	String gender;
	int age;
 
	String universityName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public String toString() {
		return "TestDto [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", price=" + price
				+ ", universityName=" + universityName + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", getPrice()=" + getPrice()
				+ ", getUniversityName()=" + getUniversityName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
