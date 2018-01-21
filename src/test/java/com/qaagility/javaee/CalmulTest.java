package com.qaagility.javaee;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;
 
public class CalmulTest {
  Calcmul calcmul = new Calcmul();

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalmul() {
        assertEquals("Result", 18, calcmul.mul());
      }
	
}
