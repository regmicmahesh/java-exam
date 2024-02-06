import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class ChatServer {

  public static void main(String[] args) throws Exception {
    DatagramSocket server = new DatagramSocket(1337);

    byte[] buf = new byte[1024];
    DatagramPacket dp = new DatagramPacket(buf, buf.length);
    server.receive(dp);

    InetAddress ip = dp.getAddress();
    int port = dp.getPort();

    String res = "Hello from server!";
    buf = res.getBytes();

    dp = new DatagramPacket(buf, buf.length, ip, port);
    server.send(dp);

  }
}
