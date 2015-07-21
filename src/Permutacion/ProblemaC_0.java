package Permutacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaC_0 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1;
		String line2;
		while(!(line1 = reader.readLine()).equals("*") 
				&& !(line2 = reader.readLine()).equals("*")) {
			System.out.println(resolve(line1.toCharArray(),
					line2.toCharArray())?"Si":"No");
		}
	}

	public static boolean resolve(char[] line1, char[] line2) {
		if (line1.length != line2.length) return false;
		for (int i = 0 ; i < line1.length ; i++) {
			boolean found = false;
			for (int j = 0 ; !found && j < line2.length ; j++) {
				if (line1[i] == line2[j]) {
					found = true;
					line1[i] = 256;
					line2[j] = 256;
				}
			}
			if (!found) return false;
		}
		return true;
	}
}
