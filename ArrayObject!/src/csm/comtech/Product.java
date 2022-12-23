package csm.comtech;

class Product {
	int pr_id;
	String pr_name;
	Product(int pid,String n){
		pr_id=pid;
		pr_name=n;
	}
      public void display() {
    	  System.out.println("prodect id"+pr_id+"product name"+pr_name);
      }
}
