import javax.swing.*;
import java.awt.*;

public class Palf{
    public static void main(String []args){
        EventQueue.invokeLater(()->{
            JFrame frame=new PalfFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("PlafTest");
            frame.setVisible(true);
        });
    }
}

class PalfFrame extends JFrame {
    private JPanel buttonPanel;

    public PalfFrame(){


        buttonPanel=new JPanel();
        UIManager.LookAndFeelInfo[] infos=UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo info:infos){
            makeButton(info.getName(),info.getClassName());
        }
        add(buttonPanel);
        pack();
    }
    private void makeButton(String name,String className){
        JButton button=new JButton(name);
        buttonPanel.add(button);

        button.addActionListener(event->{
            try{
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
