import javax.swing.*;

public class First extends JApplet {
  public void init() {
    JLabel lbl = new JLabel("This is japplet");
    this.add(lbl);
  }
}
/* 
<applet code="First.class" width="300" height="300">
</applet>
*/
