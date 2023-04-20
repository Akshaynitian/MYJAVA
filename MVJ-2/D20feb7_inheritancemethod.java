class aeroplane {
    public void takeoff() {
        System.out.println("AEROPLANE IS TAKING OFF");
    }

    public void fly() {
        System.out.println("AEROPLANE ID FLYING");
    }
}

class cargopalne extends aeroplane {
    public void fly() {
        System.out.println("AEROPLANE ID FLYING AND OVERRIDDING METHOD"); // OVERRIDDING METHOD
    }
}

class passengerplane extends aeroplane {
    public void carrypassenger() { // SPECIALIZED METHOD
        System.out.println("GOODS");
    }
}

public class D20feb7_inheritancemethod {
    public static void main(String[] args) {
        cargopalne cp = new cargopalne();
        cp.takeoff();
        cp.fly();
        passengerplane pp = new passengerplane();
        pp.takeoff();
        pp.fly();
    }
}
