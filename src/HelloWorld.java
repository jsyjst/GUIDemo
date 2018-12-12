import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame=new HelloWorldFrame();
            frame.setTitle("Hello World");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class HelloWorldFrame extends JFrame{
    public HelloWorldFrame(){
        add(new HelloWorldComponent());
        pack();
    }
}
class HelloWorldComponent extends JComponent{
    public static final int MESSAGE_X=75;
    public static final int MESSAGE_Y=100;

    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;

    public void paintComponent(Graphics g){
        g.drawString("Hello World",MESSAGE_X,MESSAGE_Y);
    }
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
