import java.util.Scanner;
import java.util.Formatter;
import java.io.FileWriter;

public class FileWriterTest {

public static void main(String[] args){

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Name: ");
    String name=sc.nextLine();
    System.out.println("Enter email: ");
    String email=sc.nextLine();

    FileWriter fw = null;
    Formatter f = null;

    try{

         fw = new FileWriter("C:\\Users\\Ahmet Emir Doğan\\OneDrive\\Masaüstü\\fileWriter.txt",true);
         f = new Formatter(fw);
         if(!name.isEmpty() && !email.isEmpty()) {
             f.format("%s, %s\n", name, email);
         }

    }catch(Exception e){

       System.err.println("Something went wrong :" + e.getMessage());

    }finally{
        if(f != null) f.close();
    }



}

}
