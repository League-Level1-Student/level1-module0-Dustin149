/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the Internet, and put its URL in a String variable (from your browser, right click on the image, and select â€œCopy Image Addressâ€�)
        String Image = "https://cdn1.epicgames.com/ue/item/OlbertsLowPolyForest_screenshot10-min-1920x1080-bbb8039f43406b1fd7bd4ddc49eeeffd.png";
		// 2. create a variable of type "Component" that will hold your image
        Component Holder;
		// 3. use the "createImage()" method below to initialize your Component
        Holder = createImage(Image);
        Holder.setVisible(true);
		// 4. add the image to the quiz window
        quizWindow.add(Holder);
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String Response = JOptionPane.showInputDialog("What is the dominating color in the image?");
		// 7. print "CORRECT" if the user gave the right answer
        if (Response.equalsIgnoreCase("Green")) {
        	JOptionPane.showMessageDialog(null, "Correct!");
        } else {
        	JOptionPane.showMessageDialog(null, "Incorrect!");
        }
		// 8. print "INCORRECT" if the answer is wrong
        
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(Holder);
		// 10. find another image and create it (might take more than one line of code)
        Holder = createImage("http://i.imgur.com/aTCwt5U.jpg");
		// 11. add the second image to the quiz window
        quizWindow.add(Holder);
		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question
        Response = JOptionPane.showInputDialog("What kind of environment is this?");
		// 14+ check answer, say if correct or incorrect, etc.
        if (Response.equalsIgnoreCase("Desert")) {
        	JOptionPane.showMessageDialog(null, "Correct!");
        } else {
        	JOptionPane.showMessageDialog(null, "Incorrect!");
        }

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





