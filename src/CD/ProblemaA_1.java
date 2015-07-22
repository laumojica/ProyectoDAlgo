package CD;

/**
 * DISEÑO Y ANÁLISIS DE ALGORITMOS (ISIS 1105) 
 * PROYECTO- Problema A-Memoización
 * Jorge Andrés de los Rios (201011164)
 * Laura Camila Mojica López (201212513)
 */

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
			
			//Inicializa la matriz con N+1, S+1 para incluir un elemento de salida 0,..,n-1,n
			
			int[][] matriz = new int[N+1][S+1];		

			System.out.println(memoizacion(S, N, duraciones, matriz));
		}




	}

	/**
	 * metodo que permite el calculo de la maxima capacidad por memoización
	 * @param s	la capacidad del cd
	 * @param i	el numero de canciones
	 * @param duraciones	las duraciones de las canciones
	 * @param matriz	estructura donde se almacenaran los resultados.
	 * @return	la maxima capacidad que se puede almacenar en el cd
	 */
	public static int memoizacion(int s, int i, int[] duraciones, int[][] matriz)
	{
		int maxGeneral = 0; 		// variable en la que se va a acumular la maxima capacidad

		if(i < 0)					//No se puede llenar algo si no se tienen objetos
		{
			return 0;
		}
		assert(s >= 0);				//Se asegura de entrada que la capacidad sea mayor a cero

		if(s == 0 || i == 0)		//Si en alguno de los casos la recurrencia resulta en capacidad 0 o sin elementos para evaluar, introduzca cero en la posición
		{
			assert(matriz[i][s] == 0);
		}

		if(matriz[i][s] != 0)		// Si es una capacidad valida retornela, último de los casos base
		{
			return matriz[i][s];
		}

		int maxSinActual = memoizacion(s,i-1,duraciones,matriz);		//variable donde se lleva un máximo sin incluir el elemento actual

		if(i > 0 && s > 0)
		{
			if(duraciones[i-1] > s)		//Si la duración no supera la capacidad del CD, coloquelo como maximo
			{
				matriz[i][s] = maxSinActual;
				return maxSinActual;
			}
			maxGeneral = maxSinActual;
			int maxConActual = memoizacion(s - duraciones[i-1], i-1 , duraciones , matriz) + duraciones[i-1];	//Se realiza la recursión para incluir en el maximo, el elemento actual y asi obtener el maximo general 

			if(maxConActual > maxGeneral)
			{
				maxGeneral = maxConActual;
			}
			matriz[i][s] = maxGeneral; //Asignelo a la matriz

		}
		return maxGeneral;		//Retorna la maxima capacidad que se puede almacenar en el cd

	}

}