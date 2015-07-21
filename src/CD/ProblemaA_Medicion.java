package CD;

import java.text.*;
import java.util.*;

public class ProblemaA_Medicion {
	public static void main(String[] args) {
		resolve(0,0,new int[0]);
		DecimalFormat format=new DecimalFormat("0.000");
		Random random=new Random(0);
		for (int S=1; S<=1000000; S*=10) {
			for (int N=1; N<=1000; N*=10) {
				int durations[]=new int[N];
				for (int i=0; i<N; i++) {
					durations[i]=random.nextInt(S)+1;
				}


				long initialTime=System.nanoTime();
				resolve(S,N,durations);
				long finalTime=System.nanoTime();

				long deltaTimeNS=finalTime-initialTime; // Tiempo en nanosegundos
				double deltaTimeMS=1.0*deltaTimeNS/1000000.0; // Tiempo en milisegundos

				System.out.println("S,N="+S + "," + N);
				System.out.println("Ingenua" + ", time="+deltaTimeNS+"ns ("+format.format(deltaTimeMS).replace(',','.')+"ms)");
			}
		}
	}

	public static int resolve(int S, int N, int[] durations) {
		return ProblemaA_0.resolve(S,N,durations);
	}
}
