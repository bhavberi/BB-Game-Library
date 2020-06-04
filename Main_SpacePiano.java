
import java.awt.Color;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main_SpacePiano {

    public static boolean correct = false;

    private static SpacePiano board = new SpacePiano();

    private static Scanner sc = new Scanner(System.in);

    private static Random rndm = new Random();

    private static TimeUnit Unit = TimeUnit.MILLISECONDS;

    private static long[] highest = {0};

    public static int count = 3000;

    public static String l1 = "", l3 = "", t1 = "", t2 = "";

    private static long score = -1;

    public static void main(String[] args) {
        score = -1;
        board.setBackground(Color.white);
        board.a1.getParent().setBackground(Color.white);
        board.a2.getParent().setBackground(Color.white);
        board.a3.getParent().setBackground(Color.white);
        board.a4.getParent().setBackground(Color.white);
        if ( board.isVisible() == false ) {
            set_start();
            board.setVisible(true);
            set_start();
            board.l2.setText("0");
            board.t2.setText("Start");
            board.toFront();
        }

    }

    public static void main() {
        score = -1;
        board.setBackground(Color.white);
        board.a1.getParent().setBackground(Color.white);
        board.a2.getParent().setBackground(Color.white);
        board.a3.getParent().setBackground(Color.white);
        board.a4.getParent().setBackground(Color.white);
        if ( board.isVisible() == false ) {
            set_start();
            board.setVisible(true);
            set_start();
            board.l2.setText("0");
            count = 3000;
            board.t2.setText("Start");
            board.toFront();
        }
    }

    public static void time() {
        count -= 2;
        if ( count == 0 ) {
            board.t2.setText("Out of Time");
        }
        if ( count > 0 ) {
            int misec = count % 1000;
            int sec = count / 1000;
            int min = sec / 60;
            board.t2.setText(min + " : " + sec + " . " + misec);
        }
    }

    public static void set_start() {
        int i;
        i = rndm.nextInt(3);
        switch ( i ) {
            case 0:
                board.d1.setBackground(Color.black);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.white);
                break;
            case 2:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.black);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.white);
                break;
            case 3:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.black);
                board.d4.setBackground(Color.white);
                break;
            case 1:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.black);
                break;
        }
        i = rndm.nextInt(3);
        switch ( i ) {
            case 1:
                board.c1.setBackground(Color.black);
                board.c2.setBackground(Color.white);
                board.c3.setBackground(Color.white);
                board.c4.setBackground(Color.white);
                break;
            case 2:
                board.c1.setBackground(Color.white);
                board.c2.setBackground(Color.black);
                board.c3.setBackground(Color.white);
                board.c4.setBackground(Color.white);
                break;
            case 3:
                board.c1.setBackground(Color.white);
                board.c2.setBackground(Color.white);
                board.c3.setBackground(Color.black);
                board.c4.setBackground(Color.white);
                break;
            case 0:
                board.c1.setBackground(Color.white);
                board.c2.setBackground(Color.white);
                board.c3.setBackground(Color.white);
                board.c4.setBackground(Color.black);
                break;
        }
        i = rndm.nextInt(3);
        switch ( i ) {
            case 1:
                board.b1.setBackground(Color.black);
                board.b2.setBackground(Color.white);
                board.b3.setBackground(Color.white);
                board.b4.setBackground(Color.white);
                break;
            case 2:
                board.b1.setBackground(Color.white);
                board.b2.setBackground(Color.black);
                board.b3.setBackground(Color.white);
                board.b4.setBackground(Color.white);
                break;
            case 3:
                board.b1.setBackground(Color.white);
                board.b2.setBackground(Color.white);
                board.b3.setBackground(Color.black);
                board.b4.setBackground(Color.white);
                break;
            case 0:
                board.b1.setBackground(Color.white);
                board.b2.setBackground(Color.white);
                board.b3.setBackground(Color.white);
                board.b4.setBackground(Color.black);
                break;
        }
        i = rndm.nextInt(3);
        switch ( i ) {
            case 1:
                board.a1.setBackground(Color.black);
                board.a2.setBackground(Color.white);
                board.a3.setBackground(Color.white);
                board.a4.setBackground(Color.white);
                break;
            case 2:
                board.a1.setBackground(Color.white);
                board.a2.setBackground(Color.black);
                board.a3.setBackground(Color.white);
                board.a4.setBackground(Color.white);
                break;
            case 3:
                board.a1.setBackground(Color.white);
                board.a2.setBackground(Color.white);
                board.a3.setBackground(Color.black);
                board.a4.setBackground(Color.white);
                break;
            case 0:
                board.a1.setBackground(Color.white);
                board.a2.setBackground(Color.white);
                board.a3.setBackground(Color.white);
                board.a4.setBackground(Color.black);
                break;
        }

    }

    private static void set_after() {
        int i;
        board.a1.setBackground(board.b1.getBackground());
        board.a2.setBackground(board.b2.getBackground());
        board.a3.setBackground(board.b3.getBackground());
        board.a4.setBackground(board.b4.getBackground());

        board.b1.setBackground(board.c1.getBackground());
        board.b2.setBackground(board.c2.getBackground());
        board.b3.setBackground(board.c3.getBackground());
        board.b4.setBackground(board.c4.getBackground());

        board.c1.setBackground(board.d1.getBackground());
        board.c2.setBackground(board.d2.getBackground());
        board.c3.setBackground(board.d3.getBackground());
        board.c4.setBackground(board.d4.getBackground());

        i = rndm.nextInt(3);
        switch ( i ) {
            case 1:
                board.d1.setBackground(Color.black);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.white);
                break;
            case 2:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.black);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.white);
                break;
            case 3:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.black);
                board.d4.setBackground(Color.white);
                break;
            case 0:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.black);
                break;
        }
    }

    public static void check() throws InterruptedException {
        if ( correct = true ) {
            set_after();
            correct = false;
            score++;
            board.l2.setText(Long.toString(score + 1));
            if ( score <= 80 && score > 0 ) {
                count = 3000;
            }
            if ( score > 80 && score <= 150 ) {
                count = 2500;
            }
            if ( score > 150 && score <= 235 ) {
                count = 2100;
            }
            if ( score > 235 && score <= 300 ) {
                count = 2000;
            }
            if ( score > 300 && score <= 399 ) {
                count = 1800;
            }
            if ( score > 399 && score <= 480 ) {
                count = 1500;
            }
            if ( score > 480 ) {
                count = 1200;
            }
            board.timer.restart();
        }
        if ( board.a1.getParent().getBackground().equals(Color.red) || board.a2.getParent().getBackground().equals(Color.red) || board.a3.getParent().getBackground().equals(Color.red) || board.a4.getParent().getBackground().equals(Color.red) || board.t2.getText().equals("Out of Time") ) {
            Unit.sleep(2337);
            board.timer.stop();
            board.dispose();
            SP_Scores b = new SP_Scores();
            if ( board.t2.getText().equals("Out of Time") ) {
                l1 = ("Time Out");
            } else {
                l1 = ("You have clicked wrong tile");
            }
            l3 = (Long.toString(score));
            try {
                FileInputStream fis = new FileInputStream("ab.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                highest = (long[]) ois.readObject();
                ois.close();
            } catch ( Exception e ) {
            }
            if ( highest[0] < score ) {
                t1 = ("New highest scores.");
                highest[0] = score;
                try {
                    FileOutputStream fos = new FileOutputStream("ab.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(highest);
                    oos.close();
                } catch ( Exception e ) {
                }
            } else if ( highest[0] > score ) {
                t1 = ("Highest Scores are :- ");
                t2 = (Long.toString(highest[0]));
            } else if ( highest[0] == score ) {
                t1 = ("Scores similar to Highest Scores");
            }
            Main.exit_a = true;
        }
    }

}
