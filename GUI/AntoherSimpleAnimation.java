package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import GUI.SimpleAnimation.MyDrawPanel;

class AnotherSimpleAnimation {
    JFrame frame;
    JLabel label;
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(event -> label.setText("Ouch!"));

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(event -> frame.repaint());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500,400);
        frame.setVisible(true);
        
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            Random random = new Random();

            Color startColor = new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256));
            Color endColor = new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256));

            GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);
            g2d.setPaint(gradientPaint);
            g2d.fillOval(70, 70, 100, 100);

        }
    }
    public static void main(String[] args) {
        AnotherSimpleAnimation anotherSimpleAnimation = new AnotherSimpleAnimation();
        anotherSimpleAnimation.go();
    }
     
}