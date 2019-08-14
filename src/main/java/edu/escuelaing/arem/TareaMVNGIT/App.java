package edu.escuelaing.arem.TareaMVNGIT;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math; 

/**
 * @author Juan Camilo Velandia Botello
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {

        LinkedList<Integer> list = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
        	Integer number = Integer.parseInt(str);
        	list.add_back(number);
        }
        System.out.println("SUMA -> "+sum(list));
        double mean = mean(list);
        System.out.println("MEAN -> "+mean);
        System.out.println("STANDARD DEVIATION -> "+standardDeviation(list));
        
        br.close();
    }
    
    /**
     * @param list The linked list on which the mean will be calculated.
     * @return The mean calculated from the list elements.
     */
    public static double mean(LinkedList<Integer> list) {
    	int n = list.getSize();
    	return (double)sum(list)/(double)n;
    }
    
    /**
     * @param list The linked list on which the standard deviation will be calculated.
     * @return The standard deviation calculated from the list elements.
     */
    public static double standardDeviation(LinkedList<Integer> list) {
    	int n = list.getSize();
    	double mean= mean(list), stDeviation = 0;
    	Node<Integer> temp = list.getHead();
		for(int i=0; i<list.getSize(); i++) {
			int xi = temp.getData();
			stDeviation += Math.pow(xi-mean, 2);			
			temp = temp.getNext();
		}
    	return Math.sqrt(stDeviation/(double)(n-1));
    }
    
    /**
     * @param list The linked list on which the sum of its elements will be calculated.
     * @return The sum of the list elements.
     */
    public static int sum(LinkedList<Integer> list) {
    	int sum = 0;
    	Node<Integer> temp = list.getHead();
		for(int i=0; i<list.getSize(); i++) {
			sum += temp.getData();
			temp = temp.getNext();
		}
		return sum;
    }
  
}
