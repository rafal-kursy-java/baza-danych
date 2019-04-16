import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie1 {
	public static void main(String[] args) throws IOException {
		List<String> wyrazy1 = new ArrayList<>();
		Scanner sc1 = new Scanner(new File("input1.txt"));
		while (sc1.hasNextLine()) {

			wyrazy1.add(sc1.nextLine());

		}
		//System.out.println(wyrazy1);
		List<String> wyrazy2 = new ArrayList<>();
		Scanner sc2 = new Scanner(new File("input2.txt"));
		while (sc2.hasNextLine()) {
			wyrazy2.add(sc2.nextLine());
		}
		//System.out.println(wyrazy2);
		FileWriter fw = new FileWriter("Output.txt");
		for (int i = 0; i < wyrazy1.size(); i++) {
			String[] tmp1 = wyrazy1.get(i).split(";");
			String[] tmp2 = wyrazy2.get(i).split(";");
			
			for (int j = 0; j < tmp2.length; j++) {
				try {
					Integer.parseInt(tmp2[j]);
					
				} catch (Exception e) {
					fw.write(wyrazy1.get(i)+" invalid row to validate");
					fw.write("\n");
				
				}
			}
			
			if (tmp1.length < tmp2.length) {
				fw.write(wyrazy1.get(i)+" less numbers");
				fw.write("\n");
			
			}
			
			if ( tmp1.length > tmp2.length) {
				System.out.println(wyrazy1.get(i)+" more numbers");
			}
			
		}
		fw.close();
	}

}
