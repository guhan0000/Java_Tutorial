package org.arrays;

import java.util.ArrayList;

public class ReturnDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2,2,3,4,4,5};
		 ArrayList<Integer>arrayList=new ArrayList<Integer>();
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 arrayList.add(arr[i]);
				 }
			 }
		 }
System.out.println(arrayList);
	}

}
//for(int i=0;i<arr.length;i++)
//{
//	for(int j=1+1;j<arr.length;j++)
//	{
//		if(arr[i]==arr[j])
//		{
//			temp[i]=arr[i];
//		}
//	}
//}
//for(int i=0;i<temp.length;i++)
//{
//	System.out.println(temp[i]);
//}
