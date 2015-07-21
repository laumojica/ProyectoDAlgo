package CD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaA_1
{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		while(!(linea = reader.readLine()).equals("0 0")) {
			String parameters[] = linea.split(" ");
			int S = Integer.parseInt(parameters[0]);
			int N = Integer.parseInt(parameters[1]);

			String duracionesS[] = reader.readLine().split(" ");
			int[] duraciones = new int[N];
			for (int i = 0 ; i < N ; i++) {
				duraciones[i] = Integer.parseInt(duracionesS[i]);
			}
			int[][] matriz = new int[N+1][S+1];

			System.out.println(memoizacion(S, N, duraciones, matriz));
		}




	}

	public static int memoizacion(int s, int i, int[] duraciones, int[][] matriz)
	{
		int maxGeneral = 0;

		if(i < 0)
		{
			return 0;
		}
		assert(s >= 0);

		if(s == 0 || i == 0)
		{
			assert(matriz[i][s] == 0);
		}

		if(matriz[i][s] != 0)
		{
			return matriz[i][s];
		}

		int maxSinActual = memoizacion(s,i-1,duraciones,matriz);

		if(i > 0 && s > 0)
		{
			if(duraciones[i-1] > s)
			{
				matriz[i][s] = maxSinActual;
				return maxSinActual;
			}
			maxGeneral = maxSinActual;
			int maxConActual = memoizacion(s - duraciones[i-1], i-1 , duraciones , matriz) + duraciones[i-1];

			if(maxConActual > maxGeneral)
			{
				maxGeneral = maxConActual;
			}
			matriz[i][s] = maxGeneral;

		}


		return maxGeneral;

	}

}