import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

interface Adder extends Remote {
  public int add(int x, int y) throws RemoteException;
}

public class AdderRemote extends UnicastRemoteObject implements Adder {

  AdderRemote() throws RemoteException {
    super();
  }

  public int add(int x, int y) {
    return x + y;
  }

}
