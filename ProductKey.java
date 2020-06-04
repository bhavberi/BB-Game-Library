
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ProductKey extends JFrame {

    ProductKey() throws URISyntaxException {
        initComponents();
        setVisible(true);
    }

    public void b2actionPerformed(ActionEvent e) throws URISyntaxException {
        final URI uri = new URI("https://www.theunpublished.co.in");
        open(uri);
    }

    public void b1actionPerformed(ActionEvent e) {
        dispose();
        cont=1;
    }

    void initComponents() throws URISyntaxException {
        final URI uri = new URI("https://www.theunpublished.co.in");

        l1 = new JLabel();
        l2 = new JLabel();
        b1 = new JButton();
        b2 = new JButton();

        l1.setText("You are in Trial Version");
        l2.setText("You can run only any two games one time each, or one game two times in one run.");
        b1.setText("Continue");

        b2.setText("<HTML>Buy <FONT color=\"#00099\"><U>now</U></FONT>.</HTML>");
        b2.setHorizontalAlignment(SwingConstants.LEFT);
        b2.setBorderPainted(false);
        b2.setOpaque(false);
        b2.setBackground(Color.WHITE);
        b2.setToolTipText(uri.toString());

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    b2actionPerformed(e);
                } catch ( URISyntaxException ex ) {
                    Logger.getLogger(ProductKey.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1actionPerformed(e);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(Cursor.HAND_CURSOR);
        setResizable(false);
        setAlwaysOnTop(true);

        setTitle("Buy Full Version");
        Container contentPane = getContentPane();

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(l2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(b1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(13)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(l1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(l2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(b1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addGap(13)
                                        .addComponent(b2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    private static void open(URI uri) {
        if ( Desktop.isDesktopSupported() ) {
            try {
                Desktop.getDesktop().browse(uri);
            } catch ( IOException e ) {
            }
        }
    }

    JLabel l1, l2;

    JButton b1, b2;
    
    public static byte cont=0;
}
