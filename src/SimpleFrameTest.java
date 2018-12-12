import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            SimpleFrame simpleFrame=new SimpleFrame();
            simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            simpleFrame.setTitle("Hello World");
            simpleFrame.setVisible(true);
        });
    }
}
class SimpleFrame extends JFrame{

    public SimpleFrame(){
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int screenHeight=screenSize.height;
        int screenWidth=screenSize.width;
        setSize(screenWidth/2,screenHeight/2);
        setLocationByPlatform(true);

        Image image=new ImageIcon("C:\\Users\\残渊\\Desktop\\Android picture\\ic_fruit.png").getImage();
        setIconImage(image);
    }
}
