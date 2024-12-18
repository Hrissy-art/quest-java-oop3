public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!flying) {
            flying = true;
            System.out.println(this.getName() + " takes off in the sky.");
        }
    }

    @Override
    public void ascend(int met) {
        if (flying) {
            altitude += met;
            System.out.println(this.getName() + " flies upward, altitude: " + altitude);
        }
    }
    @Override
    public void descend(int met) {
        if (flying && altitude > 0) {
            altitude -= met;
            if (altitude < 0) {
                altitude = 0;
            }
            System.out.println(this.getName() + " flies downward, altitude: " + altitude);
        }

    }


    @Override
    public void land() {
        if (altitude == 0) {
            flying = false;
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + " is too high, it can't land.");
        }
    }

    @Override
    public void glide() {
        if (flying) {
            System.out.println(this.getName() + " glides into the air.");
        }    }
}
