interface computer {
    void compilecode();
}

class laptop {
    public void compilecode() {
        System.out.println("YOU GOT 5 ERRORS");
    }
}

class desktop implements computer {
    public void compilecode() {
        System.out.println("YOU GOT 5 ERRORS and faster");
    }
}

class developers {

    public void buildapp(computer obj) {
        System.out.println("BUILDING APP");
        obj.compilecode();
    }
}

public class main {
    public static void main(String[] args) {
        // laptop obj = new laptop();
        computer obj = new desktop();
        developers dev = new developers();
        dev.buildapp(obj);
    }
}