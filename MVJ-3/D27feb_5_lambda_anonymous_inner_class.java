import javax.sound.sampled.SourceDataLine;

interface car {
    void drive(int age, int avg); // understood abstract abd public method
}

interface bus {
    void driving();
}

public class D27feb_5_lambda_anonymous_inner_class {
    public static void main(String[] args) {
        car obj = (int age, int avg) -> {
            System.out.println("LETS DRIVE");
            System.out.println(age + " " + avg);
        };
        obj.drive(18, 15);
        bus b = () -> System.out.println("LETS DRIVING"); //because there is no parameter in driving() method
        //and only a particular line statement is required to execute then do this 
        b.driving();
    }
}