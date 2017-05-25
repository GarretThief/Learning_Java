package OOP.labs_2_7.devices;

public class Main {
    public static void main(String[] args) {

        Device[] devices = new Device[3];

        devices[0] = new Monitor("HP", 234f, "23d0", 1024, 768);
        devices[1] = new EthernetAdapter("Dell", 34f, "234f", 345, "df");
        devices[2] = new EthernetAdapter("Dell", 34f, "234f", 345, "df");

        for (Device device : devices) {
            System.out.println(device);
        }

        System.out.println(devices[0].equals(devices[1]));
        System.out.println(devices[1].equals(devices[2]));
        System.out.println(devices[0].equals(devices[2]));
    }
}