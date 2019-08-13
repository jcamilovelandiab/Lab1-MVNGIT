package edu.escuelaing.arem.TareaMVNGIT;

import java.util.Scanner;
import java.lang.Math; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc =  new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
        	int data = sc.nextInt();
        	list.add_back(data);
        	System.out.println("adding the data: "+data);
        }
        System.out.println("SUM -> "+list.sum());
        double mean = (double)list.sum()/(double)list.getSize();
        System.out.println("MEAN -> "+mean);
        double stDeviation = 0;
        for(int i=0; i<n; i++) {
        	stDeviation += Math.pow(list.find(i)-mean, 2);
        }
        stDeviation= Math.sqrt(stDeviation/(double)(list.getSize()-1));
        System.out.println("STANDARD DEVIATION -> "+stDeviation);
    }
}
