package OOP.labs_2_7.devices;

/**
 * Created by Марiна on 10.02.2017.
 * 1) Base class Device (manufacturer(String), price(float), serialNumber(String));
 * 2) Subclasses Monitor (resolutionX(int), resolutionY(int))
 * and EthernetAdapter(speed (int), mac (String));
 * Add getters/setters and constructor to each class
 */
public abstract class Device {
    private String className = this.getClass().getSimpleName();
    private String manufactures;
    private float price;
    private String serialNumber;

    public Device(String manufactures, float price, String serialNumber) {
        this.manufactures = manufactures;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return  className +
                " \n manufactures='" + manufactures + ",\n" +
                " price=" + price + ",\n" +
                " serialNumber='" + serialNumber;
    }

    @Override
    public boolean equals(Object inputObject) {
        if (this == inputObject) return true;
        if (!(inputObject instanceof Device)) return false;

        Device device = (Device) inputObject;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufactures.equals(device.manufactures)) return false;
        if (!serialNumber.equals(device.serialNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = manufactures != null ? manufactures.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
