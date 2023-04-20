class aeroplane {
    public void takeoff() {
        System.out.println("AEROPLANE IS TAKING OFF");
    }

    public void fly() {
        System.out.println("AEROPLANE IS FLYING");
    }
}

class cargopalne extends aeroplane {
    public void takeoff() {
        System.out.println("CARGO PLANE IS TAKING OFF");// OVERRIDDING METHOD
    }

    public void fly() {
        System.out.println("CARGO PLANE ID FLYING AND OVERRIDDING METHOD"); // OVERRIDDING METHOD
    }
}

class passengerplane extends aeroplane {
    public void takeoff() {
        System.out.println("PASSENGER PLANE IS TAKING OFF");// OVERRIDDING METHOD
    }

    public void fly() {
        System.out.println("PASSENGER PLANE ID FLYING AND OVERRIDDING METHOD"); // OVERRIDDING METHOD
    }
}

class airport {
    public void poly(aeroplane ref) {
        ref.takeoff();
        ref.fly();
        System.out.println("---------------------------");
    }
}

public class D20feb11_polymorphism {
    public static void main(String[] args) {
        cargopalne cp = new cargopalne();
        passengerplane pp = new passengerplane();
        airport air = new airport();
        air.poly(cp);
        air.poly(pp);
    }
}
