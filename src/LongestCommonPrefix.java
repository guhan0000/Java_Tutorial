import java.util.*;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String arr[]= {"Flower","Flow","Flight"};
		Arrays.sort(arr);
//		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i].toLowerCase();
		}
//		for(String str:arr)
//			{
//				System.out.println(str);
//			}
		
		System.out.println(arr[0].substring(0, 1));
	}
}
