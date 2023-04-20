class calc {
    public int add(int array[]) {
        int result = 0;
        for (int ele : array) {
            result = result + ele;
        }
        return result;
    }
}

public class twofeb1 {
    public static void main(String[] args) {
        calc obj = new calc();

        int addition = obj.add(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(addition);
    }
}
