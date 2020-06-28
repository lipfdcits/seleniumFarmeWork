package lpf.driver.tools;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Camm 
{
	static Robot rbt;

	 static{
	 try {
	 rbt=new Robot();
	 } catch (AWTException e) {e.printStackTrace();}
	 }
	public  static void password6(int a,int b,int c,int d,int e,int f) 
	{

        //Robot rbt = null;
		rbt.keyPress(a+96);
        rbt.keyPress(b+96);
        rbt.keyPress(c+96);
        rbt.keyPress(d+96);
        rbt.keyPress(e+96);
        rbt.keyPress(f+96);
        rbt.keyPress(KeyEvent.VK_ENTER);
      };
      
      public  static void password8(int a,int b,int c,int d,int e,int f,int g,int h) 
  	{

          //Robot rbt = null;
  		  rbt.keyPress(a+96);
          rbt.keyPress(b+96);
          rbt.keyPress(c+96);
          rbt.keyPress(d+96);
          rbt.keyPress(e+96);
          rbt.keyPress(f+96);
          rbt.keyPress(g+96);
          rbt.keyPress(h+96);
          rbt.keyPress(KeyEvent.VK_ENTER);
        };
	
}
