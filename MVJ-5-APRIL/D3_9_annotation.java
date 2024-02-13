import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

@interface cricketplayer {

    String country() default "india";

    int age() default 34;
}

@cricketplayer
class virat {
    @cricketplayer
    private int innings;
    private int runs;

    @cricketplayer

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

}

public class D3_9_annotation {
    public static void main(String[] args) {
        virat v = new virat();
        Class c = v.getClass();
        Annotation a = c.getAnnotation(cricketplayer.class);
        cricketplayer cp = (cricketplayer) a;
        String country = cp.country();
        int age = cp.age();
        System.out.println(age + " " + country);
    }
}
