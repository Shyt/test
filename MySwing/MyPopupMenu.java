package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPopupMenu {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        //Сплывающее меню при клике на правую кнопку мыши
        JPopupMenu jPopupMenu = new JPopupMenu();
        JMenuItem cup = jPopupMenu.add(new JMenuItem("Cup"));
        jPopupMenu.add(new JMenuItem("Copy"));
        jPanel.setComponentPopupMenu(jPopupMenu);

        cup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(1);
            }
        });
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        jFrame.setTitle("Test");

        return jFrame;
    }
}
