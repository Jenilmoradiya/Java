package corejava;

public class dsabubblesort {
	
	
	
		public static void main(String[] args) {
			int a[]= {5,4,3,2,1};
			int i,j;
			int temp;
			for(i=0; i<a.length -1; i++) {
				for(j=0; j<a.length-i-1; j++) {
					
					if (a[j]>a[j+1]) {
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
					 
				}
				 
			}
	          for(i=0; i<a.length ; i++) {
	        	  System.out.println(+a[i]);
	          }
		}

	 

}
