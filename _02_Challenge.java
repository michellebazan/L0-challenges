//*** Code marked by this is used for testing. DO NOT ALTER IT.

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class _02_Challenge {

	@Test
	void test() {
		String in1 = JOptionPane.showInputDialog("enter a number");
		int x = Integer.parseInt(in1);
		int testX = x; //***
		
		// write code here that will make x and even number if an odd number
		// was entered. And make it odd if an even number was entered.
		x += 1;
		
		//	if(x % 2 == 0) {
		//		x =3;
		//	}
			
		//	else if(x % 2 == 1) {
		//		x = 2; 
		//	}
		
		assertTrue(testX%2==0?x%2==1:x%2==0); //***
		
	}

	}
