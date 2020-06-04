
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SpacePiano extends JFrame {

    private static Main_SpacePiano main = new Main_SpacePiano();

    private static SpacePiano sp = new SpacePiano();

    SpacePiano() {
        initComponents();
    }

    public static Timer timer = new Timer(2, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Main_SpacePiano.time();
        }
    });

    void d1ActionPerformed(ActionEvent e) {
    }

    void d2ActionPerformed(ActionEvent e) {
    }

    void d3ActionPerformed(ActionEvent e) {
    }

    void d4ActionPerformed(ActionEvent e) {
    }

    void c1ActionPerformed(ActionEvent e) {
    }

    void c2ActionPerformed(ActionEvent e) {
    }

    void c3ActionPerformed(ActionEvent e) {
    }

    void c4ActionPerformed(ActionEvent e) {
    }

    void b1ActionPerformed(ActionEvent e) {
    }

    void b2ActionPerformed(ActionEvent e) {
    }

    void b3ActionPerformed(ActionEvent e) {
    }

    void b4ActionPerformed(ActionEvent e) {
    }

    void a1ActionPerformed(ActionEvent e) throws InterruptedException {
        if ( !(a1.getParent().getBackground().equals(Color.red) && sp.t2.getText().equals("Out of Time")) ) {
            if ( a1.getBackground().equals(Color.black) ) {
                Main_SpacePiano.correct = true;
            } else {
                Main_SpacePiano.correct = false;
                a1.getParent().setBackground(Color.red);
                a1.setBackground(Color.red);
            }
            Main_SpacePiano.check();
        }
    }

    void a2ActionPerformed(ActionEvent e) throws InterruptedException {
        if ( !(a2.getParent().getBackground().equals(Color.red) && sp.t2.getText().equals("Out of Time")) ) {
            if ( a2.getBackground().equals(Color.black) ) {
                Main_SpacePiano.correct = true;
            } else {
                Main_SpacePiano.correct = false;
                a2.getParent().setBackground(Color.red);
                a2.setBackground(Color.red);
            }
            Main_SpacePiano.check();
        }
    }

    void a3ActionPerformed(ActionEvent e) throws InterruptedException {
        if ( !(a3.getParent().getBackground().equals(Color.red) && sp.t2.getText().equals("Out of Time")) ) {
            if ( a3.getBackground().equals(Color.black) ) {
                Main_SpacePiano.correct = true;
            } else {
                Main_SpacePiano.correct = false;
                a3.getParent().setBackground(Color.red);
                a3.setBackground(Color.red);
            }
            Main_SpacePiano.check();
        }
    }

    void a4ActionPerformed(ActionEvent e) throws InterruptedException {
        if ( !(a4.getParent().getBackground().equals(Color.red) && sp.t2.getText().equals("Out of Time")) ) {
            if ( a4.getBackground().equals(Color.black) ) {
                Main_SpacePiano.correct = true;
            } else {
                Main_SpacePiano.correct = false;
                a4.getParent().setBackground(Color.red);
                a4.setBackground(Color.red);
            }
            Main_SpacePiano.check();
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
        l1 = new JLabel();
        l2 = new JLabel();
        t1 = new JLabel();
        t2 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(Cursor.HAND_CURSOR);
        setResizable(false);
        setAlwaysOnTop(true);

        setTitle("Space Piano");
        Container contentPane = getContentPane();

        l1.setText("Your Scores are : ");
        t1.setText("Time left is : ");
        t2.setText("Start");

        d1.setBackground(Color.white);
        d1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1ActionPerformed(e);
            }
        });
        d2.setBackground(Color.white);
        d2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2ActionPerformed(e);
            }
        });
        d3.setBackground(Color.white);
        d3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d3ActionPerformed(e);
            }
        });
        d4.setBackground(Color.white);
        d4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d4ActionPerformed(e);
            }
        });
        c1.setBackground(Color.white);
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1ActionPerformed(e);
            }
        });
        c2.setBackground(Color.white);
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c2ActionPerformed(e);
            }
        });
        c3.setBackground(Color.white);
        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c3ActionPerformed(e);
            }
        });
        c4.setBackground(Color.white);
        c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c4ActionPerformed(e);
            }
        });
        b1.setBackground(Color.white);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1ActionPerformed(e);
            }
        });
        b2.setBackground(Color.white);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2ActionPerformed(e);
            }
        });
        b3.setBackground(Color.white);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b3ActionPerformed(e);
            }
        });
        b4.setBackground(Color.white);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b4ActionPerformed(e);
            }
        });
        a1.setBackground(Color.white);
        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a1ActionPerformed(e);
                } catch ( InterruptedException ex ) {
                    Logger.getLogger(SpacePiano.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        a2.setBackground(Color.white);
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a2ActionPerformed(e);
                } catch ( InterruptedException ex ) {
                    Logger.getLogger(SpacePiano.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        a3.setBackground(Color.white);
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a3ActionPerformed(e);
                } catch ( InterruptedException ex ) {
                    Logger.getLogger(SpacePiano.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        a4.setBackground(Color.white);
        a4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a4ActionPerformed(e);
                } catch ( InterruptedException ex ) {
                    Logger.getLogger(SpacePiano.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                                                .addComponent(d1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(d2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(d3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(d4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(c1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(b1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(a1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(l2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(t1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(t2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(d1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d4, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(c1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c4, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(b1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b4, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(a1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a4, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(l1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(t1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }


    JButton d1, d2, d3, d4;

    JButton c1, c2, c3, c4;

    JButton b1, b2, b3, b4;

    JButton a1, a2, a3, a4;

    JLabel l1, l2, t1, t2;

}
