package org.fileclass;
import java.io.*;
import java.util.*;
public class FileReadWords {
	
	public static void main(String[] args) {
		try
		{
			int count=0;
			String pathname="D:\\GUHAN_PRGMR\\guhan.txt";
			File file=new File(pathname);
			file.mkdirs();
			Scanner scanner=new Scanner(file);
			FileReader reader=new FileReader(pathname);
//			while (scanner.hasNext()) {
//				
//				System.out.println(scanner.next());
//				count++;
//			}
////			System.out.println(count);
//			while (scanner.hasNextLine()) {
//				System.out.println(scanner.nextLine());
//				
//				
//			}
			int ch;
			while((ch=reader.read())!=-1)
			{
				System.out.println((char)ch);
			}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
	}

}
