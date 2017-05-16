package OOP.labs_2_7.devices;


public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufactures, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufactures, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }


    @Override
    public String toString() {
        super.setClassName(this.getClass().getSimpleName());
        return super.toString() +
                " \n resolutionX= " + resolutionX +
                ", \n resolutionY= " + resolutionY +
                '}' + " \n \n";
    }


    @Override
    public boolean equals(Object inputObject) {
        if (this == inputObject) return true;
        if (!(inputObject instanceof Monitor)) return false;
        if (!super.equals(inputObject)) return false;

        Monitor monitor = (Monitor) inputObject;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}