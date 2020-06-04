
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TA extends JFrame {

    private static Main_TA main = new Main_TA();

    private static TA sp = new TA();

    TA() {
        initComponents();
    }

    public static Timer timer = new Timer(2000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Main_TA.set_after();
        }
    });

    void z1ActionPerformed(ActionEvent e) {
        if ( a1.getBackground().equals(Color.black) ) {
            a1.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( b1.getBackground().equals(Color.black) ) {
            b1.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( c1.getBackground().equals(Color.black) ) {
            c1.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( d1.getBackground().equals(Color.black) ) {
            d1.setBackground(Color.cyan);
            Main_TA.check();
        }
    }

    void z2ActionPerformed(ActionEvent e) {
        if ( a2.getBackground().equals(Color.black) ) {
            a2.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( b2.getBackground().equals(Color.black) ) {
            b2.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( c2.getBackground().equals(Color.black) ) {
            c2.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( d2.getBackground().equals(Color.black) ) {
            d2.setBackground(Color.cyan);
            Main_TA.check();
        }
    }

    void z3ActionPerformed(ActionEvent e) {
        if ( a3.getBackground().equals(Color.black) ) {
            a3.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( b3.getBackground().equals(Color.black) ) {
            b3.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( c3.getBackground().equals(Color.black) ) {
            c3.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( d3.getBackground().equals(Color.black) ) {
            d3.setBackground(Color.cyan);
            Main_TA.check();
        }
    }

    void z4ActionPerformed(ActionEvent e) {
        if ( a4.getBackground().equals(Color.black) ) {
            a4.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( b4.getBackground().equals(Color.black) ) {
            b4.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( c4.getBackground().equals(Color.black) ) {
            c4.setBackground(Color.cyan);
            Main_TA.check();
        } else if ( d4.getBackground().equals(Color.black) ) {
            d4.setBackground(Color.cyan);
            Main_TA.check();
        }
    }

    void initComponents() {
        d1 = new JButton();
        d2 = new JButton();
        d3 = new JButton();
        d4 = new JButton();
        c1 = new JButton();
        c2 = new JButton();
        c3 = new JButton();
        c4 = new JButton();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        a1 = new JButton();
        a2 = new JButton();
        a3 = new JButton();
        a4 = new JButton();
        z1 = new JButton();
        z2 = new JButton();
        z3 = new JButton();
        z4 = new JButton();
        l1 = new JLabel();
        l2 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(Cursor.HAND_CURSOR);
        setAlwaysOnTop(true);
        setResizable(false);

        setTitle("Tiny Army");
        Container contentPane = getContentPane();

        l1.setText("Your Scores are : ");

        z1.setText(" - O - ");
        z1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z1ActionPerformed(e);
            }
        });
        z2.setText(" - O - ");
        z2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z2ActionPerformed(e);
            }
        });
        z3.setText(" - O - ");
        z3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z3ActionPerformed(e);
            }
        });
        z4.setText(" - O - ");
        z4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z4ActionPerformed(e);
            }
        });

        d1.setBackground(Color.white);
        d2.setBackground(Color.white);
        d3.setBackground(Color.white);
        d4.setBackground(Color.white);
        c1.setBackground(Color.white);
        c2.setBackground(Color.white);
        c3.setBackground(Color.white);
        c4.setBackground(Color.white);
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        a1.setBackground(Color.white);
        a2.setBackground(Color.white);
        a3.setBackground(Color.white);
        a4.setBackground(Color.white);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(d1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(d2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(d3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(d4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(c1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(b1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(a1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(z1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(z2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(z3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(z4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(l2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(d1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(c1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(b1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(a1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(z1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(z2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(z3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(z4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(l1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    JButton d1, d2, d3, d4;

    JButton c1, c2, c3, c4;

    JButton b1, b2, b3, b4;

    JButton a1, a2, a3, a4;

    JButton z1, z2, z3, z4;

    JLabel l1, l2;
}
