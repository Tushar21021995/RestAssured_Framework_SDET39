package genericLibrary;

import java.util.Random;

/**
 * This class will contain generic method related to java
 * @author Tushar
 */
public class JavaLibrary
{
	public int getRandomNum()
	{
		/**
		 * This method will return the random number
		 * @author Tushar
		 */
		
		Random ran = new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum;
		
	}
	
	

}
