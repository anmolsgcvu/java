// Java program to read content from one file
// and write it into another file

// Custom paths for this program
// Reading from - gfgInput.txt
// Writing to - gfgOutput.txt

// Importing input output classes
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Class
class GFG {

    // Main driver method
    public static void main(String[] args) {
        try {
            File Obj = new File("myfile.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "
                        + Obj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileReader fr = new FileReader("myfile.txt");
            FileWriter fw = new FileWriter("myfile.txt");
            String str = "";

            int i;
            while ((i = fr.read()) != -1) {
                str += (char) i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println(
                    "File reading and writing both done");
        } catch (IOException e) {
            System.out.println(
                    "There are some IOException");
        }
    }
}
