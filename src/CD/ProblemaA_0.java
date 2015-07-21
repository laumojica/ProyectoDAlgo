package CD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaA_0 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(!(line = reader.readLine()).equals("0 0")) {
			String parameters[] = line.split(" ");
			int S = Integer.parseInt(parameters[0]);
			int N = Integer.parseInt(parameters[1]);
			
			String durationsS[] = reader.readLine().split(" ");
			int[] durations = new int[N];
			for (int i = 0 ; i < N ; i++) {
				durations[i] = Integer.parseInt(durationsS[i]);
			}
			
			System.out.println(resolve(S, N, durations));
		}
	}

	public static int resolve(int S, int N, int[] durations) {
		return resolveRecurs(S, N, durations);
	}
	
	public static int resolveRecurs(int s, int i, int[] durations) {
		if (s == 0 || i == 0) return 0;
		else if (durations[i-1] > s) return resolveRecurs(s, i-1, durations);
		else return Math.max(resolveRecurs(s, i-1, durations), 
				resolveRecurs(s-durations[i-1], i-1, durations) + durations[i-1]);
	}

}
