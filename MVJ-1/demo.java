class calc {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public double add(double n1, double n2) {
        double result = n1 + n2;
        return result;
    }
}

public class demo {
    public static void main(String[] args) {
        calc obj = new calc();
        int addition = obj.add(4, 3);
        System.out.println(addition);
        double add = obj.add(2.5, 5.6);
        System.out.println(add);
    }

}
