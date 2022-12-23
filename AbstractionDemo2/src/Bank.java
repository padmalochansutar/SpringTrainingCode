

public abstract class Bank {
		private double Balance;
		Bank(double Balance){
			this.Balance=Balance;
		}
		
		public double getBalance() {
			return Balance;
		}

		abstract void deposit();
		}
	class BankA extends Bank{
		BankA(double Balance) {
			super(Balance);
			
		}

		public void deposit() {
			System.out.println("Balance"+getBalance());
		}
	}
	class BankB extends Bank{
		BankB(double Balance) {
			super(Balance);
			// TODO Auto-generated constructor stub
		}

		public void deposit() {
			System.out.println("Balance"+getBalance());
	}
	}

	class BankC extends Bank{
		BankC(double Balance) {
			super(Balance);
			// TODO Auto-generated constructor stub
		}

		public void deposit() {
			System.out.println("Balance"+getBalance());
	}
	}
	class Call{
		public static void main(String[]args) {

			Bank bA=new BankA(100);
			Bank bB=new BankB(150);
			Bank bC=new BankC(200);
			bA.deposit();
			bB.deposit();
			bC.deposit();
			
		}
	}


