package Permutacion;

/**
 * DISEÑO Y ANÁLISIS DE ALGORITMOS (ISIS 1105) 
 * PROYECTO- Problema C
 * Jorge Andrés de los Rios (201011164)
 * Laura Camila Mojica López (201212513)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ProblemaC_1 {
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1;
		String line2;
		while(!(line1 = reader.readLine()).equals("*") 
				&& !(line2 = reader.readLine()).equals("*")) {
			System.out.println(permute(line1.toCharArray(),
					line2.toCharArray())?"Si":"No");
		}
	}


	/**
	 * Método que permite convertir cada caracter a un valor establecido
	 * @param linep arreglo de caracteres de linea de entrada
	 * @return	int[] un arreglo de enteros con las variables asignadas
	 */
	
	public static int[] convertidor(char[] linep)
	{
		int[] arreglo = new int[linep.length];
		
		//P1: Se le asigna un valor dependiendo de la letra que se deba procesar a cada posición
		
		for(int i=0; i< linep.length;i++)
		{
			char pos = linep[i];
			
			if(pos=='a')arreglo[i]=1; else if(pos==' ')arreglo[i]=0;
			else if(pos=='b')arreglo[i]=2;else if(pos=='c')arreglo[i]=3;
			else if(pos=='d')arreglo[i]=4;else if(pos=='e')arreglo[i]=5;
			else if(pos=='f')arreglo[i]=6;else if(pos=='g')arreglo[i]=7;
			else if(pos=='h')arreglo[i]=8;else if(pos=='i')arreglo[i]=9;
			else if(pos=='j')arreglo[i]=10;else if(pos=='k')arreglo[i]=11;
			else if(pos=='l')arreglo[i]=12;else if(pos=='m')arreglo[i]=13;
			else if(pos=='n')arreglo[i]=14;else if(pos=='o')arreglo[i]=15;
			else if(pos=='p')arreglo[i]=16;else if(pos=='q')arreglo[i]=17;
			else if(pos=='r')arreglo[i]=18;else if(pos=='s')arreglo[i]=19;
			else if(pos=='t')arreglo[i]=20;else if(pos=='u')arreglo[i]=21;
			else if(pos=='v')arreglo[i]=22;else if(pos=='w')arreglo[i]=23;
			else if(pos=='x')arreglo[i]=24;else if(pos=='y')arreglo[i]=25;
			else if(pos=='z')arreglo[i]=26;else if(pos=='ñ')arreglo[i]=27;
			
		}
				
		return arreglo;
		
	}
	

	/**
	 * Método que permite ordenar de manera ascendete los valores del arreglo
	 * @param line arreglo de caracteres de linea de entrada
	 * @return	ArrayList<Integer> lista de enteros con los valores ordenados
	 */
	
	public static ArrayList<Integer> sortInventado(char[] line)
	{
		int[] arraP = convertidor(line);
                
        ArrayList<Integer> ordenada = new ArrayList<Integer>();
        
        //P2: Se crea un ArrayList para cada conjunto de valores
        
        ArrayList<Integer> lista0 = new ArrayList<Integer>();ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();ArrayList<Integer> lista3 = new ArrayList<Integer>();
		ArrayList<Integer> lista4 = new ArrayList<Integer>();ArrayList<Integer> lista5 = new ArrayList<Integer>();
		ArrayList<Integer> lista6 = new ArrayList<Integer>();ArrayList<Integer> lista7 = new ArrayList<Integer>();
		ArrayList<Integer> lista8 = new ArrayList<Integer>();ArrayList<Integer> lista9 = new ArrayList<Integer>();
		ArrayList<Integer> lista10 = new ArrayList<Integer>();ArrayList<Integer> lista11 = new ArrayList<Integer>();
		ArrayList<Integer> lista12 = new ArrayList<Integer>();ArrayList<Integer> lista13 = new ArrayList<Integer>();
		ArrayList<Integer> lista14 = new ArrayList<Integer>();ArrayList<Integer> lista15 = new ArrayList<Integer>();
		ArrayList<Integer> lista16 = new ArrayList<Integer>(); ArrayList<Integer> lista17 = new ArrayList<Integer>();
		ArrayList<Integer> lista18 = new ArrayList<Integer>();ArrayList<Integer> lista19 = new ArrayList<Integer>();
		ArrayList<Integer> lista20 = new ArrayList<Integer>();ArrayList<Integer> lista21 = new ArrayList<Integer>();
		ArrayList<Integer> lista22 = new ArrayList<Integer>();ArrayList<Integer> lista23 = new ArrayList<Integer>();
		ArrayList<Integer> lista24 = new ArrayList<Integer>();ArrayList<Integer> lista25 = new ArrayList<Integer>();
		ArrayList<Integer> lista26 = new ArrayList<Integer>();ArrayList<Integer> lista27 = new ArrayList<Integer>();
		
				
		for(int i=0;i <arraP.length;i++)
		{
			//P3: Dependiendo del valor que tenga cada posición se agrega en su ArrayList correspondiente
			
			if(arraP[i]==0)lista0.add(arraP[i]); if(arraP[i]==1)lista1.add(arraP[i]);
			if(arraP[i]==2)lista2.add(arraP[i]);if(arraP[i]==3)lista3.add(arraP[i]);
			if(arraP[i]==4)lista4.add(arraP[i]);if(arraP[i]==5)lista5.add(arraP[i]);
			if(arraP[i]==6)lista6.add(arraP[i]);if(arraP[i]==7)lista7.add(arraP[i]);
			if(arraP[i]==8)lista8.add(arraP[i]);if(arraP[i]==9)lista9.add(arraP[i]);
			if(arraP[i]==10)lista10.add(arraP[i]);if(arraP[i]==11)lista11.add(arraP[i]);
			if(arraP[i]==12)lista12.add(arraP[i]);if(arraP[i]==13)lista13.add(arraP[i]);
			if(arraP[i]==14)lista14.add(arraP[i]);if(arraP[i]==15)lista15.add(arraP[i]);
			if(arraP[i]==16)lista16.add(arraP[i]);if(arraP[i]==17)lista17.add(arraP[i]);
			if(arraP[i]==18)lista18.add(arraP[i]);if(arraP[i]==19)lista19.add(arraP[i]);
			if(arraP[i]==20)lista20.add(arraP[i]);if(arraP[i]==21)lista21.add(arraP[i]);
			if(arraP[i]==22)lista22.add(arraP[i]);if(arraP[i]==23)lista23.add(arraP[i]);
			if(arraP[i]==24)lista24.add(arraP[i]);if(arraP[i]==25)lista25.add(arraP[i]);
			if(arraP[i]==26)lista26.add(arraP[i]);if(arraP[i]==27)lista27.add(arraP[i]);
			
		}
				
		// P4: Se agrega de forma ascendente los valores de cada ArrayList al ArrayList ordenado
		
		if(!lista0.isEmpty())ordenada.addAll(lista0);
		if(!lista1.isEmpty())ordenada.addAll(lista1);		
		if(!lista2.isEmpty())ordenada.addAll(lista2);
		if(!lista3.isEmpty())ordenada.addAll(lista3);
		if(!lista4.isEmpty())ordenada.addAll(lista4);
		if(!lista5.isEmpty())ordenada.addAll(lista5);
		if(!lista6.isEmpty())ordenada.addAll(lista6);
		if(!lista7.isEmpty())ordenada.addAll(lista7);
		if(!lista8.isEmpty())ordenada.addAll(lista8);
		if(!lista9.isEmpty())ordenada.addAll(lista9);
		if(!lista10.isEmpty())ordenada.addAll(lista10);
		if(!lista11.isEmpty())ordenada.addAll(lista11);
		if(!lista12.isEmpty())ordenada.addAll(lista12);
		if(!lista13.isEmpty())ordenada.addAll(lista13);
		if(!lista14.isEmpty())ordenada.addAll(lista14);
		if(!lista15.isEmpty())ordenada.addAll(lista15);
		if(!lista16.isEmpty())ordenada.addAll(lista16);
		if(!lista17.isEmpty())ordenada.addAll(lista17);
		if(!lista18.isEmpty())ordenada.addAll(lista18);
		if(!lista19.isEmpty())ordenada.addAll(lista19);
		if(!lista20.isEmpty())ordenada.addAll(lista20);
		if(!lista21.isEmpty())ordenada.addAll(lista21);
		if(!lista22.isEmpty())ordenada.addAll(lista22);
		if(!lista23.isEmpty())ordenada.addAll(lista23);
		if(!lista24.isEmpty())ordenada.addAll(lista24);
		if(!lista25.isEmpty())ordenada.addAll(lista25);
		if(!lista26.isEmpty())ordenada.addAll(lista26);
		if(!lista27.isEmpty())ordenada.addAll(lista27);
			
		
		return ordenada;
		
	}
	
	
	/**
	 * Método que permite saber si una línea es permutación de la otra
	 * @param line 1 arreglo de caracteres de linea de entrada
	 * @param line 2 arreglo de caracteres de linea de entrada
	 * @return	boolean si las dos lineas son permutaciones
	 */
	
	public static boolean permute(char[] line1, char[] line2)
	{
		//P5: Llama el método de ordenamiento teniendo como parámetro las líneas de entrada
		
		ArrayList<Integer> l1= sortInventado(line1);
		ArrayList<Integer> l2= sortInventado(line2);
		
		String m1 = "";
	    String m2 = "";
		
       //P6 y P7: Convierte cada ArrayList a un String
	    
	   for(int i=0; i< l1.size();i++)
       {
    	   m1+=l1.get(i);
       }
		
       for(int i=0; i< l1.size();i++)
       {
    	   m2+=l2.get(i);
       }
		
	    
	    System.out.println("La cadena 1 es: "+m1);
	    System.out.println("La cadena 2 es: "+m2);
	    
	    //P8: Compara las dos cadenas de texto
	    
	    if(m1.equals(m2))
	        return true;
	    return false;
	}


}
