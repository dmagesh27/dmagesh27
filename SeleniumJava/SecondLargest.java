package SeleniumJava;

public class SecondLargest {

	public static void main(String[] args) {

		int largest=0;
		int secondlargest=0;
		
		int num[]= {55,9,55,7,53,57};
		
		//int len=num.length;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				secondlargest=largest;
				largest=num[i];
			}
			else if(num[i]>secondlargest)
			{
				secondlargest=num[i];
			}
			
		}
		
		System.out.println("Second largest in the given array is : "+secondlargest);
	}

}
