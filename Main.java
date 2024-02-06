import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String args[]) throws IOException {

    FileReader f = new FileReader("data.txt");

    char data[] = new char[1024];

    f.read(data);

    System.out.println(String.join(' ', data...));


  }
}
