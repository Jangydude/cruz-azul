import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args)
    {
        StdDraw.setXscale (-6,6);
        StdDraw.setYscale (-6,6);
        
        Circle blu = new Circle (0,0,Color.BLUE,0.1,3.8);
        blu.draw();
        Square red = new Square (0,0,Color.RED,0.3,3.5);
        red.draw();
        FilledCircle white = new FilledCircle (0,0,Color.WHITE,0.07,1.3);
        white.draw();
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledRectangle(0,0,0.32,1);
        StdDraw.filledRectangle(0,0,1,0.32);
        StdDraw.setFont(new Font("Arial",Font.BOLD , 25));
        StdDraw.text(0,2,"DEPORTIVO");
        StdDraw.text(0,-2.2,"CRUZ AZUL");
        StdDraw.setFont(new Font("Arial",Font.BOLD , 7));
        StdDraw.text(1.7,-1.9,"MR");
        StdDraw.setFont(new Font("Arial",Font.BOLD , 40));
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.text(-3.15,-2.4,"M",310);
        StdDraw.text(-2.2,-3.3,"E",325);
        StdDraw.text(-0.7,-3.8,"X",350);
        StdDraw.text(0.75,-3.85,"I",10);
        StdDraw.text(1.95,-3.45,"C",30);
        StdDraw.text(3,-2.55,"O",50);
        //StdDraw.setPenColor(Color.BLUE);
        StdDraw.setFont(new Font("Courier",Font.BOLD , 70));
        StdDraw.text(-3.8,0.2,"*",5);
        StdDraw.text(-3.2,1.55,"*",5);
        StdDraw.text(-2.14,2.5,"*",25);
        StdDraw.text(-0.95,3.1,"*",15);
        StdDraw.text(0.6,3.2,"*",5);
        StdDraw.text(2.3,2.6,"*",35);
        StdDraw.text(3.3,1.6,"*",25);
        StdDraw.text(3.7,0.2,"*",5);
    }
}
