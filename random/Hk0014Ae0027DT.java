/* Source code file name : Hk0014Ae0027Normalize.java
	Himanshu Koyalkar, Aditya Krishna Edara
	02/07/2017	*/
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
	public class Hk0014Ae0027DT {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the file name and take care that it is in the same directory of this program");
	String s = scan.next();
	BufferedReader br2=null,br=null;
	FileReader fr = null;
	try {
			fr = new FileReader(s);
			br = new BufferedReader(fr);
			br2 = new BufferedReader(fr);
			String sCurrentLine,result;
			String[] parts;
			String[] parts2;
			int j=0,i=0,x=0,y=0,z=0,count=0;
			br = new BufferedReader(new FileReader(s));
			while ((sCurrentLine = br.readLine()) != null) {
				if(!sCurrentLine.contains("@") && sCurrentLine.length()>1){
				sCurrentLine = sCurrentLine.trim();
				sCurrentLine = sCurrentLine.replaceAll("\\s+"," ");
					count++;
					parts = sCurrentLine.split("\\s+");
					y = parts.length;
				}
			}
			System.out.println("No of attributes and No of vectors are "+y+" and "+count+" respectfully");
			float[][] floatArray = new float[count][y];
			while ((sCurrentLine = br2.readLine()) != null) {
				if(!sCurrentLine.contains("@") && sCurrentLine.length()>1){
				sCurrentLine = sCurrentLine.trim();
				sCurrentLine = sCurrentLine.replaceAll("\\s+"," ");
				parts2 = sCurrentLine.split("\\s+");
				for (j = 0; j < y; j++) {
         				String numberAsString = parts2[j];
        			 	floatArray[i][j] = Float.parseFloat(numberAsString);
      					}
				i++;			
				}
			}
		for(i=0;i<count;i++){
		for(j=0;j<y;j++){
		System.out.print(floatArray[i][j]);
		System.out.print("\t");
		}
		System.out.println("");}
		}catch (Exception ex) {

			ex.printStackTrace();
		}
}
}


