import java.io.*;

public class D10_4_IO_operatioin {
    public static void main(String[] args) throws IOException {
        File dir = new File("PW");
        File file = new File("PW", "pw.txt");
        // file.createNewFile();
        FileWriter fw = new FileWriter(file, true);
        fw.write("PW");
        fw.write("\n");
        fw.write(65);
        fw.write(97);
        char ch[] = { 'j', 'a', 'v', 'a' };
        fw.write(ch);
        fw.close();
        System.out.println("OPEN pw.txt to see results");

    }
}
