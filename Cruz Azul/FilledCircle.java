
/**
 * Write a description of class Circle here.
 * 
 * @author Dr. Carlos Delgado
 * @version February 2015
 */

// The Circle class should extend the Shape class.
import java.awt.Color; 
/**
 * Write a description of class Triangle here.
 * 
 * @author Dr. Carlos Delgado
 * @version February 2015
 */
// The Circle class should extend the Shape class.
public class FilledCircle {
    //Add instance variables unique to the Circle.
    protected double rad;
    double xx;
    double yy;
    Color color;
    double pen;
    
    
    
    public FilledCircle(){

    }

    public FilledCircle(double x, double y, Color c, double p, double r)
    {
        xx=x;
        yy=y;
        color=c;
        pen=p;
        rad = r;
    }
    // Implement the Draw Method.
    public void draw(){
        // Tip you can draw a circle by calling StdDraw.circle 
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(pen);
        StdDraw.filledCircle(xx,yy,rad);
    }

}
