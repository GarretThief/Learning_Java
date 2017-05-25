package OOP._2_7_Inheritance_and_Polymorphism;

/**
 * Created by Garret on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Monitor[] monitor = new Monitor[2];
        Device[] devices = new Device[6];
       // EthernetAdapter[] ethernetAdapters = new EthernetAdapter[2];

        devices[0] = new Monitor("Samsung",4535.34f,"123A3E456FD",1280,1024);
        devices[1] = new Monitor("LG",2345.45f, "234FKJG4565FD",1024,768);
        devices[2] = new Device("Dell",345,"FDRE3456");
        devices[3] = new Device("Sony",23465.45f,"3785FR45FGH3");
        devices[4] = new EthernetAdapter("TP-Link",600,"GRJ45734FJO",700,"MAC123");
        devices[5] = new EthernetAdapter("D-Link",505,"GRJ457Y46JO",720,"MAC123453");


        for (Device value: devices)
            System.out.println((value));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(devices[4].equals(devices[5]));
    }
}
