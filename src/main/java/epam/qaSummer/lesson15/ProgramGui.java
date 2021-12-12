package epam.qaSummer.lesson15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ProgramGui {
    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(400, 300);
        JPanel panel = new JPanel();
        JButton btn = new JButton("ok");
        JTextField textField1 = new JTextField("                 ");
        btn.addActionListener(e -> textField1.setText("click"));
        JTextField textField2 = new JTextField("                 ");
        JTextField textField3 = new JTextField("                 ");
        JButton btn1 = new JButton("sum");
        btn1.addActionListener(e -> textField3.setText(textField1.getText()+textField2.getText()));
//        btn.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                btn.setText("click");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                btn.setText("press");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                btn.setText("release");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                btn.setText("enter");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                btn.setText("exit");
//            }
//        });
        panel.add(btn);
        panel.add(btn1);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textField3);
        win.setContentPane(panel);
        win.setVisible(true);
    }
}
