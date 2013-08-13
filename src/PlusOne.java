import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PlusOne {

//	public int[] plusOne(int[] digits) {
//        int jin = 1;
//		for(int i=digits.length-1; i>=0; i--){
//        	digits[i] += jin;
//        	if(digits[i] >= 10){
//        		digits[i] %= 10
//        	}
//        }
//    }
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Gu\\Desktop\\pics.txt")));
		String line;
		while((line = reader.readLine()) != null){
			String[] token = line.split("_",4);
			System.out.println("/"+token[0]+"/"+token[1]+"/"+token[2]+"/"+line);
		}
		reader.close();
	}

}
