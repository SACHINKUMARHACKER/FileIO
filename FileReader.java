package com;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
	public static void main(String[] arg) throws IOException{
		InputStreamReader cin = null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter Characters , 'q' to quit");
			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
				
			}while(c!='q');
		}
		finally {
			if(cin !=null) {
				cin.close();
			}
		}
		
		
	}
}
