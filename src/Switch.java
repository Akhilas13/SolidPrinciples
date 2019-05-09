public class Switch {

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    private boolean isOn;

}

class SwitchOnOff{

    public static void main(String[] args) {
        Switch s = new Switch();

        s.setOn(false);

        if (s.isOn())
            s.setOn(false);
        else
            s.setOn(true);

        System.out.println(s.isOn());

    }

}
