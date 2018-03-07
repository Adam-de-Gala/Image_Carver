package seam_carving;

import java.util.ArrayList;

public class Tester {

	
	public static void main(String args[])
	{

//		
		double reduceBY = .75;
		String imageName = "castle.jpg";
		
		ImageProcessor ip = new ImageProcessor(imageName);
		ip.picture.show();
		Picture newPic = ip.reduceWidth(reduceBY);
		newPic.show();
//	
	
	}
}
