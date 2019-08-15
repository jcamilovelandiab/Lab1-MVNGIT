package edu.escuelaing.arem.TareaMVNGIT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest{
	@Test
	public void meanTest() throws IOException {
		 LinkedList<Integer> list = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
        	Integer number = Integer.parseInt(str);
        	list.add_back(number);
        }
        Double value = App.mean(list);
        assertEquals(String.format(Locale.US, "%.2f", value),"638.90");
        br.close();
	}
	
	@Test
	public void standardDeviationTest() throws IOException {
		 LinkedList<Integer> list = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
        	Integer number = Integer.parseInt(str);
        	list.add_back(number);
        }
        Double value = App.standardDeviation(list);
        assertEquals(String.format(Locale.US, "%.5f", value),"625.63398");
        br.close();
	}
}
