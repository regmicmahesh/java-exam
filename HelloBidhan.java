import java.rmi.*;
import java.rmi.server.*;

interface IBidhan extends Remote {
  String hello() throws RemoteException;
}

public class HelloBidhan extends UnicastRemoteObject implements IBidhan {

  HelloBidhan() throws RemoteException {
    super();
  }

  public String hello(){
    return "Hello Bidhan!!";
  }
}
