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
		
		int maxSize = 0;
		int min=minV(array, N);
		int max=maxV(array, N);
		
		
				
		
		
		
//		for (int i = 0 ; i < N ; i++) {
//			for (int j = i+1; j <= N ; j++) {
//				int min = Integer.MAX_VALUE;
//				int max = Integer.MIN_VALUE;
//				for (int k = i ; k < j ; k++) {
//					min = Math.min(min, array[k]);
//					max = Math.max(max, array[k]);
//				}
//				
//				if (min != array[i] && max != array[j-1]) 
//					maxSize = Math.max(maxSize, j-i);
//			}
//		}
		return maxSize;
	}
}
