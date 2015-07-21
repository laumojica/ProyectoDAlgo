package MinimoArreglo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.bind.ValidationEvent;

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

	
	public static int minV(int[]array, int N)
	{
		int min=array[0];
		
		for(int i=1; i<N;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		
		
		return min;
	}
	public static int maxV(int[]array, int N)
	{
		int max=array[0];
		
		for(int i=1; i<N;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		
		
		return max;
	}
	
	public static int resolve(int N, int[] array) {
		
		int maxSize =0;
		
		int valIn=0;
		int valInter=0;
		int valFinInt=0;
		int valFin=0;
		
		for (int i=0;i<N-1;i++)
		{
			if(array[i]<=array[i+1])
			{
				valInter=array[i+2];
				
				
			}
			else
				break;
		}
		System.out.println("Es in "+valInter);
		for (int i=0;i<N;i++)
		{
			if(array[i]<=valInter){
				valIn++;
			}
			else
				break;
		}
			
		for (int i=N-2;i>0;i--)
		{
			if(array[i+1]>=array[i])
			{
				valFinInt=array[i-1];
				
			}
			else
				break;
		}
		
		System.out.println("Es fin "+valFinInt);
		for (int i=N-1;i>0;i--)
		{
			if(array[i]>=valFinInt){
				valFin++;
			}
			else
				break;
		}
		System.out.println("ValIN "+ valIn );
		System.out.println("valFIn "+valFin);
		
		maxSize= N-valFin-valIn;
		
		return maxSize;
	}
}
