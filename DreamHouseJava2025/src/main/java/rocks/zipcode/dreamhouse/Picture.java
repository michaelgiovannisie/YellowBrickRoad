package rocks.zipcode.dreamhouse;
import java.awt.Color;
import java.awt.LinearGradientPaint;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private MyRectangle terre;
    private Triangle montagne;
    private Triangle montagne2;
    private MyRectangle wall;
    private MyRectangle housedoor;
    private MyRectangle garage;
    private MyRectangle garagedoor;
    private Square windowr;
    private Square windowg;
    private Square windowb;
    private Square windowy;
    private Triangle roof;
    private Triangle mountaintip1;
    private Triangle mountaintip2;
    private Circle sun;
    private MyRectangle river;
    private MyRectangle ttrunk;
    private Triangle tleaf;
    private Triangle tleaf2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    public void windows(int x, int y) {
        windowr = new Square();
        windowr.changeColor("red");
        windowr.moveHorizontal(x + 650);
        windowr.moveVertical(y + 200);
        windowr.makeVisible();

        windowg = new Square();
        windowg.changeColor("green");
        windowg.moveHorizontal(x + 680);
        windowg.moveVertical(y + 200);
        windowg.makeVisible();

        windowb = new Square();
        windowb.changeColor("blue");
        windowb.moveHorizontal(x + 650);
        windowb.moveVertical(y + 230);
        windowb.makeVisible();

        windowy = new Square();
        windowy.changeColor("yellow");
        windowy.moveHorizontal(x + 680);
        windowy.moveVertical(y + 230);
        windowy.makeVisible();
    }

    public void tree(int x, int y) {
        ttrunk = new MyRectangle();
        ttrunk.changeColor("trunk");
        ttrunk.moveHorizontal(x - 45);
        ttrunk.moveVertical(y - 20);
        ttrunk.changeSize(20, 60);
        ttrunk.makeVisible();

        tleaf = new Triangle();
        tleaf.changeColor("leaf");
        tleaf.moveHorizontal(x - 25);
        tleaf.moveVertical(y - 50);
        tleaf.changeSize(70, 70);
        tleaf.makeVisible();

        tleaf2 = new Triangle();
        tleaf2.changeColor("leaf");
        tleaf2.moveHorizontal(x - 25);
        tleaf2.moveVertical(y - 80);
        tleaf2.changeSize(70, 70);
        tleaf2.makeVisible();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        terre = new MyRectangle();
        terre.moveVertical(500);
        terre.moveHorizontal(-100);
        terre.changeSize(1920, 300);
        terre.changeColor("grass");
        terre.makeVisible();
        
        river = new MyRectangle();
        river.moveVertical(650);
        river.moveHorizontal(-100);
        river.changeSize(1920, 25);
        river.changeColor("water");
        river.makeVisible();
        
        montagne = new Triangle();
        montagne.moveVertical(50);
        montagne.moveHorizontal(300);
        montagne.changeSize(500, 800);
        LinearGradientPaint gradient = new LinearGradientPaint(
        300, 50,           
        300, 850,          
        new float[] {0.0f, 0.1f, 0.4f, 1.0f},  
        new Color[] {
        Color.WHITE,                    
        Color.WHITE,
        Color.GRAY,                   
        new Color(60, 37, 21)           
    }
);
        montagne.changePaint(gradient);
        montagne.makeVisible();

        montagne2 = new Triangle();
        montagne2.moveVertical(50);
        montagne2.moveHorizontal(1200);
        montagne2.changeSize(500, 800);
        montagne2.changeColor("mountain");
        montagne2.makeVisible();

        mountaintip1 = new Triangle();
        mountaintip1.moveVertical(50);
        mountaintip1.moveHorizontal(300);
        mountaintip1.changeSize(50, 80);
        mountaintip1.changeColor("white");
        mountaintip1.makeVisible();

        mountaintip2 = new Triangle();
        mountaintip2.moveVertical(50);
        mountaintip2.moveHorizontal(1200);
        mountaintip2.changeSize(50, 80);
        mountaintip2.changeColor("white");
        mountaintip2.makeVisible();

        wall = new MyRectangle();
        wall.moveVertical(150);
        wall.moveHorizontal(600);
        wall.changeSize(300, 400);
        wall.changeColor("brick");
        wall.makeVisible();

        garage = new MyRectangle();
        garage.moveVertical(350);
        garage.moveHorizontal(250);
        garage.changeSize(350, 200);
        garage.changeColor("gray");
        garage.makeVisible();   

        housedoor = new MyRectangle();
        housedoor.moveVertical(450);
        housedoor.moveHorizontal(725);
        housedoor.changeSize(50, 100);
        housedoor.changeColor("wood");
        housedoor.makeVisible();

        garagedoor = new MyRectangle();
        garagedoor.moveVertical(400);
        garagedoor.moveHorizontal(275);
        garagedoor.changeSize(300, 150);
        garagedoor.changeColor("wood");
        garagedoor.makeVisible(); 

        roof = new Triangle();
        roof.changeSize(100, 400);
        roof.moveHorizontal(755);
        roof.moveVertical(90);
        roof.changeColor("gray");
        roof.makeVisible();

        sun = new Circle();
        sun.moveHorizontal(980);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        sun.setRadialSunGradient();


        this.windows(0, 0);
        this.windows(150, 0);
        this.windows(0, 100);
        this.windows(150, 100);
        this.tree(1300, 550);
        this.tree(1150, 500);
        this.tree(1000, 600);
        this.tree(200, 600);
        this.tree(100, 500);

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            garage.changeColor("black");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            garage.changeColor("red");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
