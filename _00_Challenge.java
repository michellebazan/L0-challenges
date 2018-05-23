//*** Code marked by this is used for testing. DO NOT ALTER IT.

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class _00_Challenge {

	@Test
	void test() {
		String in1 = JOptionPane.showInputDialog("enter a number");
		String in2 = JOptionPane.showInputDialog("enter a number");
		int x = Integer.parseInt(in1);
		int y = Integer.parseInt(in2);
		int testX = x;//***
		int testY = y;//***
		
		//write code here that swaps the value of x and y
		
		int xx = x;
		x = y;
		y = xx;
		
		assertEquals(testX, y);//***
		assertEquals(testY, x);//***
	}
	
}
