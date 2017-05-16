package OOP._2_3_Constructors;

/**
 * Created by Garret on 12.02.2017.
 */
public class MyWindow {
    private double width,height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;
    public MyWindow(){
        this.width = 100;
        this.height = 200;
        this.numberOfGlass = 10;
        this.color = "Blue";
        this.isOpen = false;
    }
    public MyWindow(double width,double height){
        this.width = width;
        this.height = height;
    }
    public MyWindow(double width, double height,int numberOfGlass){
        this(width,height);
        this.numberOfGlass = numberOfGlass;
    }
    public MyWindow(double width,double height, int numberOfGlass,String color,boolean isOpen){
        this(width,height,numberOfGlass);
        this.color = color;
        this.isOpen = isOpen;
    }
    public void printFields(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
        System.out.println("Number of glass: "+numberOfGlass);
        System.out.println("Color: "+color);
        System.out.println("Is window opens? "+isOpen);
        System.out.println();
    }
        public static void main(String[] args) {
        MyWindow window1 = new MyWindow(32.5,68.2,2,"Red",true);
        window1.printFields();
        MyWindow windowDefault = new MyWindow();
        windowDefault.printFields();
        MyWindow[]arrayWindow = new MyWindow[4];
        arrayWindow[0] = new MyWindow();
        arrayWindow[1] = new MyWindow(46.4,79.5);
        arrayWindow[2] = new MyWindow(34.6,65.4,4);
        arrayWindow[3] = new MyWindow(56.7,123.4,6,"White",true);
        for (int i = 0;i<4;i++)
            arrayWindow[i].printFields();
        }
    }

