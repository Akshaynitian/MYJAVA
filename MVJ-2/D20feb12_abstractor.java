abstract class aeroplane { // this class is not 100% abstract as there is both abstract and non abstract
    // method are present
    abstract public void takeoff();

    abstract public void fly();

    public void landing() {
        System.out.println("AEROPLANE IS LANDING");
    }
}

class cargoplane extends aeroplane {
    public void takeoff() {
        System.out.println("CARGO PLANE IS TAKING OFF");// OVERRIDDING METHOD
    }

    public void fly() {
        System.out.println("CARGO PLANE ID FLYING"); // OVERRIDDING METHOD
    }

    public void alert() {
        System.out.println("ALERT.....");
    }
}

class passengerplane extends aeroplane {
    public void takeoff() {
        System.out.println("PASSENGER PLANE IS TAKING OFF");// OVERRIDDING METHOD
    }

    public void fly() {
        System.out.println("PASSENGER PLANE ID FLYING"); // OVERRIDDING METHOD
    }
}

public class D20feb12_abstractor {
    public static void main(String[] args) {
        aeroplane cp = new cargoplane();
        cp.takeoff();
        cp.fly();
        cp.landing();
        // cp.alert(); error comes as we can call only INHERITED and OVERRIDDING method
        // only using
        // parents type not SPECIALIZED method of child class
        ((cargoplane) cp).alert();
        System.out.println("--------------");
        aeroplane pp = new passengerplane();
        pp.takeoff();
        pp.fly();
        pp.landing();
    }
}
