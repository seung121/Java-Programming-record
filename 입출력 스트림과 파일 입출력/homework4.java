import java.io.*;
import java.util.Vector;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String> word = new Vector<String>();
		String FileName = "C:\\Users\\강승아\\Desktop\\words.txt";
	
		try {
			Scanner fileScanner = new Scanner(new FileReader(FileName));
			while(fileScanner.hasNext()) {
				word.add(fileScanner.nextLine());
			}
			fileScanner.close();
			}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	
		int Size = word.size();
		int value = 0;
	
		while(true)
		{
			System.out.print("단어 >> ");
			String WORD = scanner.next();
			if(WORD.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for(int i = 0; i < Size; i ++) {
				if(word.get(i).startsWith(WORD))
				{
					System.out.println(word.get(i));
					value = 1;
				}
			}
			
			if (value == 0)
				System.out.println("단어를 찾을 수 없습니다.");
			
			if (value == 1)  
				value = 0;
			
		}
	}
}