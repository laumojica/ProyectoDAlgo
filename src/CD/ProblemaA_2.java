package CD;

/**
 * DISE�O Y AN�LISIS DE ALGORITMOS (ISIS 1105) 
 * PROYECTO- Problema A- Programaci�n din�mica
 * Jorge Andr�s de los Rios (201011164)
 * Laura Camila Mojica L�pez (201212513)
 */
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
	
	/**
	 * M�todo que permite calcular la m�xima capacidad basado en programaci�n din�mica
	 * @param duraciones	las duraciones de las canciones
	 * @param i	el n�mero de canciones
	 * @param s	la capacidad del cd
	 * @return	La maxima duraci�n que se puede almacenar en el cd
	 */
	public static int programacionDinamica(int[] duraciones, int i, int s)
	{
		
		int[][] matriz = new int[i+1][];		//Inicializa la matriz donde se van a asignar los maximos
		
		for(int n = 0; n <= i; n++)
		{
			matriz[n] = new int[s+1];
			for(int m = 0; m <= s; m++)
			{
				matriz[n][m] = 0;		//Inicializa la matriz con 0, para poder asignar los valores m�ximos
			}
		}
		

       //Recorre la matriz de tama�o N*S asignando los elementos maximos a cada iteraci�n en su respectiva ubicaci�n
		 
		for(int n = 1; n <= i; n++)
		{
			for(int w = 1; w <= s; w++)
			{
				
				int maxSinActual = matriz[n-1][w];
				if(duraciones[n-1] > w)
				{
					matriz[n][w] = maxSinActual;	//Si la duraci�n no excede la capacidad m�xima del cd, asigne el valor anterior a la posicion
				}
				else
				{
					int maxConActual = matriz[n-1][w-duraciones[n-1]] + duraciones[n-1];	//Tome el elemento que se tiene en n-1, w-duraciones[n-1] y sumele la duraci�n actual para obtener el nuevo maximo
					
					int maxGeneral = maxSinActual;
					if(maxConActual > maxGeneral)
					{
						maxGeneral = maxConActual;		//Establezca el m�ximo entre todos los elementos
					}
					
					matriz[n][w] = maxGeneral;		//En el ultimo elemento de la matriz quedar� el maximo general el cual es la maxima capacidad a almacenar en el cd.
				}
				
			}
		}
		
		return matriz[i][s];
		
	}
	
}
