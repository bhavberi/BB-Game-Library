
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tictactoe extends JFrame {

    public static Main_tictactoe main = new Main_tictactoe();

    Tictactoe() {
        initComponents();
    }

    void button1ActionPerformed(ActionEvent e) {
        if ( button1.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button1.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button1.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button2ActionPerformed(ActionEvent e) {
        if ( button2.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button2.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button2.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button3ActionPerformed(ActionEvent e) {
        if ( button3.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button3.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button3.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button4ActionPerformed(ActionEvent e) {
        if ( button4.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button4.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button4.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button5ActionPerformed(ActionEvent e) {
        if ( button5.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button5.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button5.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button6ActionPerformed(ActionEvent e) {
        if ( button6.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button6.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button6.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button7ActionPerformed(ActionEvent e) {
        if ( button7.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button7.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button7.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button8ActionPerformed(ActionEvent e) {
        if ( button8.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button8.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button8.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void button9ActionPerformed(ActionEvent e) {
        if ( button9.getText().equals("") ) {
            if ( Main_tictactoe.player_a_turn == true ) {
                button9.setText("X");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = false;
            } else {
                button9.setText("O");
                Main_tictactoe.check();
                Main_tictactoe.player_a_turn = true;
            }
        }
    }

    void initComponents() {
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(Cursor.HAND_CURSOR);
        setResizable(false);
        setAlwaysOnTop(true);

        setTitle("Tic Tac Toe");
        Container contentPane = getContentPane();

        button1.setText("");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        button2.setText("");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });
        button3.setText("");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });
        button4.setText("");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4ActionPerformed(e);
            }
        });
        button5.setText("");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5ActionPerformed(e);
            }
        });
        button6.setText("");
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6ActionPerformed(e);
            }
        });
        button7.setText("");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7ActionPerformed(e);
            }
        });
        button8.setText("");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8ActionPerformed(e);
            }
        });
        button9.setText("");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9ActionPerformed(e);
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
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    JButton button1;

    JButton button2;

    JButton button3;

    JButton button4;

    JButton button5;

    JButton button6;

    JButton button7;

    JButton button8;

    JButton button9;
}
