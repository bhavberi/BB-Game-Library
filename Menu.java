
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame {

    Menu() {
        initComponents();
    }

    void spActionPerformed(ActionEvent e) {
        Main.i = 1;
    }

    void tttActionPerformed(ActionEvent e) {
        Main.i = 2;
    }

    void taActionPerformed(ActionEvent e) {
        Main.i = 3;
    }

    void exActionPerformed(ActionEvent e) {
        Main.i = 0;
    }

    void initComponents() {
        sp = new JButton();
        ttt = new JButton();
        ta = new JButton();
        ex = new JButton();
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(Cursor.HAND_CURSOR);
        setResizable(false);
        setAlwaysOnTop(true);

        setTitle("B&B Game Library");
        Container contentPane = getContentPane();

        l1.setText("Welcome to the Game Library of Bhav !");
        l2.setText("Which Game would you like to play ?");
        l3.setText("B & B Game Library");

        sp.setText("Space Piano");
        sp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spActionPerformed(e);
            }
        });
        ttt.setText("Tic Tac Toe");
        ttt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tttActionPerformed(e);
            }
        });
        ta.setText("Tiny Army");
        ta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taActionPerformed(e);
            }
        });
        ex.setText("Exit");
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(31)
                                                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGap(69)
                                                .addComponent(ex, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                        .addGap(39)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(50)
                                                .addComponent(l2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(34)
                                                .addComponent(sp, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGap(34)
                                                .addComponent(ttt, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGap(14)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(34)
                                                .addComponent(ta, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGap(90)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(99)
                                                .addComponent(l3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addGap(31)
                                        .addComponent(l1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addGap(69)
                                        .addComponent(ex, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGap(39)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addGap(50)
                                        .addComponent(l2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addGap(34)
                                        .addComponent(sp, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addGap(34)
                                        .addComponent(ttt, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addGap(14)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addGap(34)
                                        .addComponent(ta, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addGap(90)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addGap(99)
                                        .addComponent(l3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    JButton sp, ttt, ta, ex;

    JLabel l1, l2, l3;

}
