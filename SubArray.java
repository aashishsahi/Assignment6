import java.util.Scanner;
public class SubArray {
	
	
	void LongestLength(int arr[], int n)
	{
		int counter = 1, counter1 = 1;
		for(int i=1;i<n;i++)
		{
			
				if(arr[i]>arr[i-1])
				{
					counter++;
				}
				
				else
				{
					if(counter>counter1)
						counter1=counter;
					counter = 1;
				}
				if(counter==n)
				{
					counter1 = n;
				}
		}
		if(counter1==1)
			System.out.println("No increasing elements in array.");
		else
			System.out.println("Longest length of increasing sub array is: " + counter1);
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		SubArray a = new SubArray();
		a.LongestLength(arr, n);

	}

}
