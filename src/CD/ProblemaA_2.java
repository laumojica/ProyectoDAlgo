package CD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaA_2 
{
	public static void main(String[] args) throws IOException 
	{
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
			
			System.out.println(programacionDinamica(duraciones, N, S));

			
			
		}
	}
	
	public static int programacionDinamica(int[] duraciones, int i, int s)
	{
		
		int[][] matriz = new int[i+1][];
		
		for(int n = 0; n <= i; n++)
		{
			matriz[n] = new int[s+1];
			for(int m = 0; m <= s; m++)
			{
				matriz[n][m] = 0;
			}
		}
		
		for(int n = 1; n <= i; n++)
		{
			for(int w = 1; w <= s; w++)
			{
				
				int maxSinActual = matriz[n-1][w];
				if(duraciones[n-1] > w)
				{
					matriz[n][w] = maxSinActual;
				}
				else
				{
					int maxConActual = matriz[n-1][w-duraciones[n-1]] + duraciones[n-1];
					
					int maxGeneral = maxSinActual;
					if(maxConActual > maxGeneral)
					{
						maxGeneral = maxConActual;
					}
					
					matriz[n][w] = maxGeneral;
				}
				
			}
		}
		
		return matriz[i][s];
		
	}
	
}
