public class Electronic {
    protected boolean isOn;

    public Electronic() {
        this.isOn = false;
    }

    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Electronic device is now on.");
        } else {
            System.out.println("Electronic device is already on.");
        }
    }

    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Electronic device is now off.");
        } else {
            System.out.println("Electronic device is already off.");
        }
    }
}
