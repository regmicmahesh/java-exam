import java.rmi.*;

public class Client {
  public static void main(String args[]) throws Exception {
    Adder a = (Adder)Naming.lookup("rmi://localhost:5000/rmiserver");
    int s = a.add(34, 4);
    System.out.println("Sum="+s);
  }
}
