import java.util.ArrayList;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {100,0,-1};
		int arr2[]= {8,11,5};
		int temp=0;
		int res[]=new int [6];
		ArrayList<Integer>arrayList= new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			arrayList.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			arrayList.add(arr2[i]);
		}
//		System.out.println(arrayList);
//		for(int i=0;i<arrayList.size();i++)
//		{
//			res[i]=arrayList.get(i);
//		}
//		for(int i=0;i<arrayList.size();i++)
//		{
//			for(int j=i+1;j<arrayList.size();j++)
//			{
//				if(res[i]>res[j])
//				{
//					temp=res[i];
//					res[i]=res[j];
//					res[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<res.length;i++)
//		{
//			System.out.println(res[i]);
//		}
		for(int i=0;i<arrayList.size();i++)
		{
			for(int j=i+1;j<arrayList.size();j++)
			{
				if(arrayList.get(i)>arrayList.get(j))
				{
					temp=arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j,temp);
				}
			}
		}
		System.out.println(arrayList);
	}

}
