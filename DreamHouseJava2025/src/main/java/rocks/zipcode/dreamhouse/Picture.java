package rocks.zipcode.dreamhouse;

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
    private Circle sun;
    private MyRectangle river;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
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
        terre.changeColor("white");
        terre.makeVisible();
        
        river = new MyRectangle();
        river.moveVertical(650);
        river.moveHorizontal(-100);
        river.changeSize(1920, 25);
        river.changeColor("blue");
        river.makeVisible();
        
        montagne = new Triangle();
        montagne.moveVertical(50);
        montagne.moveHorizontal(300);
        montagne.changeSize(500, 800);
        montagne.changeColor("gray");
        montagne.makeVisible();

        montagne2 = new Triangle();
        montagne2.moveVertical(50);
        montagne2.moveHorizontal(1200);
        montagne2.changeSize(500, 800);
        montagne2.changeColor("gray");
        montagne2.makeVisible();

        wall = new MyRectangle();
        wall.moveVertical(150);
        wall.moveHorizontal(600);
        wall.changeSize(300, 400);
        wall.changeColor("green");
        wall.makeVisible();

        wall = new MyRectangle();
        wall.moveVertical(150);
        wall.moveHorizontal(600);
        wall.changeSize(300, 400);
        wall.changeColor("green");
        wall.makeVisible();

        garage = new MyRectangle();
        garage.moveVertical(350);
        garage.moveHorizontal(250);
        garage.changeSize(350, 200);
        garage.changeColor("red");
        garage.makeVisible();   

        housedoor = new MyRectangle();
        housedoor.moveVertical(450);
        housedoor.moveHorizontal(725);
        housedoor.changeSize(50, 100);
        housedoor.changeColor("brown");
        housedoor.makeVisible();

        garagedoor = new MyRectangle();
        garagedoor.moveVertical(400);
        garagedoor.moveHorizontal(275);
        garagedoor.changeSize(300, 150);
        garagedoor.changeColor("brown");
        garagedoor.makeVisible(); 

        windowr = new Square();
        windowr.changeColor("red");
        windowr.moveHorizontal(650);
        windowr.moveVertical(200);
        windowr.makeVisible();

        windowg = new Square();
        windowg.changeColor("black");
        windowg.moveHorizontal(700);
        windowg.moveVertical(200);
        windowg.makeVisible();

        windowb = new Square();
        windowb.changeColor("blue");
        windowb.moveHorizontal(650);
        windowb.moveVertical(230);
        windowb.makeVisible();

        windowy = new Square();
        windowy.changeColor("yellow");
        windowy.moveHorizontal(680);
        windowy.moveVertical(230);
        windowy.makeVisible();

        roof = new Triangle();
        roof.changeSize(100, 400);
        roof.moveHorizontal(755);
        roof.moveVertical(90);
        roof.changeColor("gray");
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(980);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
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
            window.changeColor("white");
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
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
