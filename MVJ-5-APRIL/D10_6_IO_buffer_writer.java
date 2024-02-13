import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class D10_6_IO_buffer_writer {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = { 'p', 'w', 's', 'j' };
        bw.write(ch);
        bw.newLine();
        bw.close();
    }

}
