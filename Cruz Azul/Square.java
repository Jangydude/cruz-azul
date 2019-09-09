
/**
 * This class extends the abstract class Shape
 * You can use it as a base for your lab.
 * 
 * @author Dr. Carlos Delgado
 * @version February 2015
 */

import java.awt.Color;


public class Square 
{
    // The length
    protected double side;
    double xx;
    double yy;
    Color color;
    double pp;
    double ss;

    /**
     * Constructor for objects of class Square
     */
    public Square()
    {
        
        
    }

    /**
     * Constructor for objects of class Square
     * 
     * @param  col   Color
     * @param  pen   pen's radius
     * 
     */
    public Square(double x, double y, Color c, double p, double s)
    {
        xx=x;
        yy=y;
        color=c;
        pp=p;
        ss= s;
    }
    
      
    
    /**
     * Method that implements the abstract draw method
     * 
     * @return     void
     */
    public void draw()
    {
       StdDraw.setPenColor (color);
       StdDraw.setPenRadius (pp);
       StdDraw.filledSquare (xx,yy, ss/2);   // in the Graphics library you pass the radius ... OK
        
    }
}