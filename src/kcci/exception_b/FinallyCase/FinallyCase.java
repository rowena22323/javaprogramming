package kcci.exception_b.FinallyCase;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class FinallyCase {
	public static void main(String[]args) {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');
		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(writer != null) {
//				writer.close();
//			}
// close�� ȣ�⹮���� IOException���ܰ� �߻��� �� �ִ�. 
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
		// finally �������� try~catch���� �ۼ��� �� �ִ�.
			try {
				if(writer != null)
					writer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}