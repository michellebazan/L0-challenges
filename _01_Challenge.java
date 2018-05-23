//*** Code marked by this is used for testing. DO NOT ALTER IT.

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class _01_Challenge {

	@Test
	void test() {
		String in1 = JOptionPane.showInputDialog("enter a number");
		String in2 = JOptionPane.showInputDialog("enter a number");
		String in3 = JOptionPane.showInputDialog("enter a number");
		int x = Integer.parseInt(in1);
		int y = Integer.parseInt(in2);
		int z = Integer.parseInt(in3);
		
		//write code here that rearranges the values of x, y, and z 
		//to be in ascending (increasing) order
		
		if( x > y) {
			int xx = x;
			x = y;
			y = xx;
		}  if (x > z) {
			int zz = z;
			x = z;
			z = zz;
		}
		
		assertTrue(x < y);//***
		assertTrue(x < z);//***
	}

}
