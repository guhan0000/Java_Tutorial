
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,5,6,8,10,2,7,9};
		int max=arr[0];
		int min=arr[0];
		int temp=0;
		int len=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		1 2 3 4 5 6 7 8 9 10
//		}
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i>=(arr.length)/2)
			{
				System.out.print(arr[i]+" "+(arr[len-1-i])+" ");
			}
			
		}
		

	}

}
