import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            MenuFrame frame=new MenuFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("第二次作业");
            frame.setVisible(true);
        });
    }
}
