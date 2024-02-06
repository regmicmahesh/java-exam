
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.*;

public class Distance extends JFrame implements ActionListener {

  // public Distance() {
  //
  // this.setSize(300, 300);
  // this.setLayout(new FlowLayout());
  //
  // JLabel hello = new JLabel("hello");
  // this.add(hello);
  //
  // }
  //
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(this, "Hello");
  }

  public Distance() {

    this.setSize(300, 300);
    this.setLayout(new BorderLayout());

    JTextField hello = new JTextField("Hello World");
    this.add(hello, BorderLayout.CENTER);

    JButton btn = new JButton("Show");
    btn.addActionListener(this);
    this.add(btn, BorderLayout.SOUTH);

  }

  public static void main(String[] args) {

    Distance d = new Distance();
    d.setVisible(true);

  }

}
