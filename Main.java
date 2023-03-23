import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //Gets user's screen size
		int width = (int) screenSize.getWidth();	//Gets user's screen size
		int height = (int) screenSize.getHeight();	//Gets user's screen size
		int[][] array = new int[width][height];	 	//Define a new array to contain zero and one data
		
		
		
		JFrame frame = new JFrame("Gridle");	//Setting up a new frame
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setLocationRelativeTo(null);
	      frame.setSize(width, height);
	      frame.setLocationByPlatform( true );
	     
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); //We will define pixel color on this image
        ImageIcon icon = new ImageIcon( image );
        JLabel field = new JLabel(icon);
        frame.add(field);
        Color mywhite = new Color (255,255,255,0);	//We will use white,since image is coming all black at first
	    int white = mywhite.getRGB(); 
	     for(int x=0; x<width; x++) {
				for(int y=0; y<height; y++) {	//Firstly we color all the pixels to white
					
					array[x][y]=0;				
				}
				
			}
		
	     for(int x=0; x<width; x++) {
				for(int y=0; y<height; y++) {
					
					Random hardness= new Random();
					int hard=hardness.nextInt(10)+1;	//You can set noise by changing hardness
														//it's %50 now
					if(hard>8 && array[x][y]==0) {		//We randomly define some pixels to black
						
					array[x][y]=1;						//We apply this to our two dimensional array
					
					
					}
				}
				
			}       
        	 
                     	for(int x1=0; x1<width; x1++) {
                     		
                     	
         				for(int y=0; y<height; y++) {
         					
         					if(array[x1][y]==1) {
         					
         					image.setRGB(x1, y, white);			//Now,we change defined pixels to white,if we are already on	
         					}									//a white pixel,we pass by
         				}
         				
                     	}
             
    	      
	     frame.setVisible(true);			//Finally,we set our frame visible
        		       
	}

	}


