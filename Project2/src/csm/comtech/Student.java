package csm.comtech;

public class Student {
	private int noclsHeld;
	private int noClsAttend;
	private double percentage;
	private String medicalc;
	public Student(int noclsHeld, int noClsAttend, double percentage,String medicalc) {
		super();
		this.noclsHeld = noclsHeld;
		this.noClsAttend = noClsAttend;
		this.percentage = percentage;
		this.medicalc=medicalc;
	}
	public void examAllowed() {
		if(percentage>=75) {
			 if(medicalc.equals("yes")) {
				System.out.println("Student is  allowed to exam");
			 }
			System.out.println("student is allowed exam");
		}
		else if(medicalc.equals("yes")) {
			System.out.println("Student is  allowed to exam");
		}
		else if(medicalc.equals("no")) {
			System.out.println("Student is  not allowed to exam");
		}
			
	}
	}

