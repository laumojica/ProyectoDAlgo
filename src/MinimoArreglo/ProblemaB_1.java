package MinimoArreglo;

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

	
	public static int resolve(int N, int[] array) {
		
		int maxSize =0;
		
		int limInf;
	    int limSup ; 
	    int maxVal;
	    int minVal;   
		  
		  
		  for (limInf = 0; limInf < N-1; limInf++)
		  {
		    if (array[limInf] >= array[limInf+1])
		      break;
		  }
		  
		  for(limSup = N - 1; limSup > 0; limSup--)
		  {
		    if(array[limSup] <= array[limSup-1])
		      break;
		  }
		  		  
		  maxVal = array[limInf]; 
		  minVal = array[limInf];
		  
		  for(int i = limInf + 1; i <= limSup; i++)
		  {
		    if(array[i] > maxVal) maxVal = array[i];
		    if(array[i] < minVal) minVal = array[i];
		  }
		  
		  
		  for( int i = 0; i < limInf; i++)
		  {
		    if(array[i] >= minVal)
		    {  
		      limInf = i;
		      break;
		    }      
		  } 
		  
		  
		  for( int i = N -1; i >= limSup+1; i--)
		  {
		    if(array[i] <= maxVal)
		    {
		      limSup = i;
		      break;
		    } 
		  }
		  
		  
		maxSize= limSup-limInf+1;
		
		return maxSize;
	}
}
