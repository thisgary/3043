package com.thisgary.lecture.class6.class13.supplementary.PACKAGE7;

//Fig. 14.20: RadioButtonTest. java
//Testing RadioButtonFrame.
import javax. swing. JFrame;
public class RadioButtonTest
{
	public static void main( String[] args )
	{
		
		RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
		radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioButtonFrame. setSize( 300, 100 ); // set frame size
		radioButtonFrame.setVisible( true ); // display frame
	} //end main
} //end class RadioButtonTest