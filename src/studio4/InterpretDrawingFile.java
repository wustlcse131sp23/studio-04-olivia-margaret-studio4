package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		StdDraw.clear();
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		boolean isFilled = in.nextBoolean();
		if (shapeType.equals("triangle")) {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			double [] x = {parameterOne, parameterThree, parameterFive};
			double [] y = {parameterTwo, parameterFour, parameterSix};
			if (isFilled) {
				StdDraw.filledPolygon(x,y);
			}
			else {
				StdDraw.polygon(x,y);
			}
		}
		else if (shapeType.equals("rectangle")) {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();
		if (isFilled) {
			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else {
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		}
		else {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();
			if (isFilled) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
	}
}
