package csm.comtech;
public class descendingOrder {
	public static void main(String[] args) {
		int[] a= new int[]{6,5,8,7,2};
		int t=0;
		System.out.println("Elements of  array is:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
			}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			System.out.println(a[i]);
		}
		}
	
	}

