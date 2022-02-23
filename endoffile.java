import java.util.Scanner;

public class endoffile {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i = 0;
      while (sc.hasNext()) {
         String str = sc.nextLine();
         if (str.contains("end-of-file")) {
            i++;
            System.out.println(i + " " + str);
            break;
         } else {
            i++;
            System.out.println(i + " " + str);
         }
      }
      sc.close();
   }
}
