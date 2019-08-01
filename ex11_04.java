// 사용방법 : ex11_04
import java.io.*;

public class ex11_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c;
		try {
			FileInputStream in = new FileInputStream("a.txt");
			FileOutputStream out = new FileOutputStream("b.txt");
			
			while((c = in.read()) != -1)
				out.write(c);
			
			in.close();
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
