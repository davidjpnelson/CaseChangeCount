import java.io.IOException;

public class CaseChangeCount {

  public static void main(String[] args) throws IOException {
    char ch, ignore;
    int changes = 0;

    System.out.println("Enter a letter to change its case. Enter a period to stop.");

    do {
      ch = (char) System.in.read();
      if (ch >= 'a' && ch <= 'z') {
        ch -= 32;
        changes++;
        System.out.println(ch);
      } else if (ch >= 'A' && ch <= 'Z') {
        ch += 32;
        changes++;
        System.out.println(ch);
      }
    } while (ch != '.') ;
    System.out.println("Total case changes: " + changes);
  }
}
