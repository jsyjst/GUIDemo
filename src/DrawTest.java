import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame=new DrawFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class DrawFrame extends JFrame{
    public DrawFrame(){
        DrawComponent drawComponent=new DrawComponent();
        drawComponent.setBackground(Color.black);
        add(drawComponent);
        pack();
    }
}
class DrawComponent extends JComponent{
    private static final int DEFAULT_WIDTH=400;
    private static final int DEFAULT_HEIGHT=400;
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        double leftX=100;
        double topY=100;
        double width=200;
        double height=150;
        Rectangle2D rect=new Rectangle2D.Double(leftX,topY,width,height);
        g2.setPaint(Color.BLUE);
        g2.draw(rect);

        Ellipse2D ellipse2D=new Ellipse2D.Double();
        ellipse2D.setFrame(rect);
        g2.setPaint(Color.CYAN);
        g2.draw(ellipse2D);
        g2.setPaint(Color.RED);
        g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));

        double centerX=rect.getCenterX();
        double centerY=rect.getCenterY();
        double radius=150;
        Ellipse2D circle=new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
        g2.setPaint(Color.blue);
        g2.draw(circle);
    }
    public Dimension getPreferredSize(){return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
