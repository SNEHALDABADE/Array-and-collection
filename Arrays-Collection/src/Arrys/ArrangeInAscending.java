package Arrys;

public class ArrangeInAscending {
	
	public static void main(String[] args)
	{
		int temp;
		int a[]=new int[3];
		 a [0]= 20;
		 a [1]= 40;
		 a [2]= 10;
		 
		 for(int i=0;i<3;i++)
		 {
			 for(int j=i+1;j<3;j++)
			 {
				 if(a[i]>a[j])           //Ascending and Descending
				 {
					 temp=a[j];
					 a[j]=a[i];
					 a[i]=temp;
				 }
			 }
			 System.out.println(a[i]);
		 }
	}

}
