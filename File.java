package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
		public static void main(String[] arg) throws IOException {
			FileInputStream in = null;
			FileOutputStream out = null;
			try
			{
				in = new FileInputStream("D:/eclipselibrary/JavaProject/src/com/input.txt");
				out = new FileOutputStream("D:/eclipselibrary/JavaProject/src/com/output.txt");
				int c;
				while((c=in.read())!=-1) {
					out.write(c);
				
				}
				
					}
			finally{
				if(in!=null) {
					in.close();
				}
				if(out !=null) {
					out.close();
				}
			}
			
		}
}
