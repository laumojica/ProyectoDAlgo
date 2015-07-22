package MinimoArreglo;

/**
 * DISEÑO Y ANÁLISIS DE ALGORITMOS (ISIS 1105) 
 * PROYECTO- Problema B
 * Jorge Andrés de los Rios (201011164)
 * Laura Camila Mojica López (201212513)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemaB_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(!(line = reader.readLine()).equals("0")) {
			int N = Integer.parseInt(line);
			
			String arrayS[] = reader.readLine().split(" ");
			int[] array = new int[N];
			for (int i = 0 ; i < N ; i++) {
				array[i] = Integer.parseInt(arrayS[i]);
			}
			
			System.out.println(resolve(N, array));
		}
	}

	/**
	 * Método que permite conocer el tamaño del subarreglo minimo a ordenar
	 * @param array arreglo de números de entrada
	 * @param N tamaño del arreglo
	 * @return	int tamaño del mínimo subarreglo a ordenar
	 */
	public static int resolve(int N, int[] array) {
		
		int maxSize =0;
		
		int limInf;
	    int limSup ; 
	    int maxVal;
	    int minVal;   
		  	  
	    
	    //P1: Encuentra la posición del límite inferior donde deja de estar ordenado ascendentemente
	    
	    
		  for (limInf = 0; limInf < N-1; limInf++)
		  {
		    if (array[limInf] >= array[limInf+1])
		      break;
		  }
		  
		//P2: Encuentra la posición del límite superior donde deja de estar ordenado descendentemente
		  
		  for(limSup = N - 2; limSup > 1; limSup--)
		  {
		    if(array[limSup+1] <= array[limSup])
		      break;
		  }
		  
		  //P3: Asigna el valor de la posición del límite superior e inferior como maximo valor y mínimo valor respectivamente
		  
		  
		  maxVal = array[limSup]; 
		  minVal = array[limInf];
		  
		  //P4: Verifica que entre los límites ya establecidos no haya un número mayor o menor dependiendo de la variable, de no ser así estas variables cambian
		  
		  for(int i = limInf + 1; i <= limSup; i++)
		  {
		    if(array[i] > maxVal) maxVal = array[i];
		    if(array[i] < minVal) minVal = array[i];
		  }
		  
		  //P5: Halla la posición en la cual una variable es mayor al valor mínimo
		  
		  for( int i = 0; i < limInf; i++)
		  {
		    if(array[i] >= minVal)
		    {  
		      limInf = i;
		      break;
		    }      
		  } 
		  
		//P6: Halla la posición en la cual una variable es menor al valor maximo
		  
		  for( int i = N -1; i >= limSup+1; i--)
		  {
		    if(array[i] <= maxVal)
		    {
		      limSup = i;
		      break;
		    } 
		  }
		  
		//P7: Para hallar el tamaño del subarreglo se resta la posición del límite superior al inferior  
		  
		maxSize= limSup-limInf+1;
		
		return maxSize;
	}
}
