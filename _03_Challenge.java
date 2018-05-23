//*** Code marked by this is used for testing. DO NOT ALTER IT.

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class _03_Challenge {

	@Test
	void test() {
		String in1 = JOptionPane.showInputDialog("enter a number");
		String in2 = JOptionPane.showInputDialog("enter a number");
		
		
		// Change the code below so that newString is equal to 
		// in1 concatenated (combined) with in2
		String newString = in1 + in2;
		System.out.println(newString);
		assertEquals(newString, in1 + in2); //***
	}

}
