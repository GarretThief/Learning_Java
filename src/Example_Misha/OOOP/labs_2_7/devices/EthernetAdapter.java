package OOP.labs_2_7.devices;

/**
 * Created by Марiна on 10.02.2017.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufactures, float price, String serialNumber, int speed, String mac) {
        super(manufactures, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        super.setClassName(this.getClass().getSimpleName());
        return super.toString() +
                " \n speed=" + speed +
                ",\n mac='" + mac + '\'' +
                '}'+ "\n \n";
    }

    @Override
    public boolean equals(Object inputObject) {
        if (this == inputObject) return true;
        if (!(inputObject instanceof EthernetAdapter)) return false;
        if (!super.equals(inputObject)) return false;

        EthernetAdapter that = (EthernetAdapter) inputObject;

        if (speed != that.speed) return false;
        return mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }

}
