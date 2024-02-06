import java.rmi.*;
import java.rmi.registry.*;

public class BidhanServer {
  public static void main(String[] args) throws Exception {

    HelloBidhan h = new HelloBidhan();
    Naming.rebind("rmi://localhost:5000/bidhan", h);

  }
}
