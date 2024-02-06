import java.rmi.*;
import java.rmi.registry.*;

public class BidhanClient {
  public static void main(String[] args) throws Exception {

    IBidhan b = (IBidhan) Naming.lookup("rmi://localhost:5000/bidhan");
    System.out.println(b.hello());

  }
}
