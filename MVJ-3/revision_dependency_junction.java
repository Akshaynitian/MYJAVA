class student {
    private heart h;

    public student(heart h) {
        this.h = h;
    }

    public void call() {
        System.out.println("BECAUSE OF CALL");
        h.heartbeat();
    }

    public void setH(heart h) {
        this.h = h;
    }

    public void callOne() {
        System.out.println("BECAUSE OF CALLONE");
        h.heartbeat();
    }
}

class heart { //dependent object on student
    public void heartbeat() {
        System.out.println("HEART IS IMPORTANT");
    }

    public void dependency() {

    }
}

public class revision_dependency_junction {
    public static void main(String[] args) {
        heart h = new heart();
        student s = new student(h);// constructor injection
        s.call();
        s.setH(h);
        s.callOne();
    }
}
