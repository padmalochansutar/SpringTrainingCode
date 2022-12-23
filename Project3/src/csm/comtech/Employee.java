package csm.comtech;

public class Employee {
	private int age;
	private String sex;
	private String mStatus;

	public Employee(int age, String sex, String mStatus) {
		super();
		this.age = age;
		this.sex = sex;
		this.mStatus = mStatus;
	}

	public void display() {
		if (sex.equals("F"))
		{
			System.out.println("she will work only in urban areas");
		}
		else if (sex.equals("M") && (age >= 20 && age <= 40)) 
		{
			System.out.println("he may work in anywhere");
		}
		else if (sex.equals("M") && (age > 40 && age <= 60)) 
		{
			System.out.println("he may work in urban area only");
		} 
		else 
		{
			System.out.println("ERROR");
		}
	}
}
