import java.util.Scanner;
import java.io.File;

public class hotel {
    public static void main(String[] args) {
        System.out.print("hello");
        boolean flag;

        try {

            File file = new File("Restaurentmenu.pdf");
            
            // creates a new file
            File[] listOfFiles = file.listFiles(); 

            for (int i = 0; i < listOfFiles.length-1; i++) 
             {

             if (listOfFiles[i].isDirectory())
            {
                readFile(listOfFiles[i].getPath());
            }
            else
            {
                methodA(listOfFiles[i],listOfFiles[i+1])
             }
    }file.createNewFile();

            // flag the file to be read-only
            flag = file.setReadOnly();

            System.out.println("Is File is read-only ? : "
                    + flag);

            // checking whether Is file writable
            flag = file.canWrite();
            System.out.println("Is File is writable ? : "
                    + flag);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the HRA");
        int hra = scanner.nextInt();

    }

    private static void methodA(File file, File file2) {
    }

    private static void readFile(String path) {
    }

}
