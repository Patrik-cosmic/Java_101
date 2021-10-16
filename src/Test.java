import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
 public static void main(String ... args) throws IOException {
       System.setIn(new FileInputStream("src\\file.txt"));
       Scanner scan = new Scanner(System.in);
       System.out.println(scan.nextInt());
       System.out.println(scan.next());
       System.out.println(scan.next());
       System.out.println(scan.next());
       System.out.println(scan.next());
       System.out.println(scan.next());
       char first = scan.next().charAt(0);
       System.out.println(first);
//     System.out.println("Write something: ");
       //char first = scan.next().charAt(0);

                 // String_obj => "Suman"
                 // String_obj.charAt(int_object)   => char_obj
                //  String_obj.charAt(0)   => "Suman" => 'S'

 }
}
