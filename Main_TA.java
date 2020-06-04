
import java.awt.Color;
import java.io.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main_TA {

    public static boolean correct = true;

    public static boolean exit = false;

    private static TA board = new TA();

    private static Random rndm = new Random();

    private static TimeUnit Unit = TimeUnit.MILLISECONDS;

    public static String l3 = "", t1 = "", t2 = "";

    private static long[] highest = {0};

    private static long score = 0;

    public static void main() {
        score = 0;
        if ( board.isVisible() == false ) {
            set_start();
            board.setVisible(true);
            set_start();
            board.l2.setText("0");
            board.toFront();
            TA.timer.start();
        }
    }

    private static void set_start() {
        int i;
        i = rndm.nextInt(3);
        switch ( i ) {
            case 0:
                board.d1.setBackground(Color.black);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.white);
                break;
            case 1:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.black);
                board.d3.setBackground(Color.white);
                board.d4.setBackground(Color.white);
                break;
            case 2:
                board.d1.setBackground(Color.white);
                board.d2.setBackground(Color.white);
                board.d3.setBackground(Color.black);
                board.d4.setBackground(Color.white);
                break;
            case 3:
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
        board.b1.setBackground(Color.white);
        board.b2.setBackground(Color.white);
        board.b3.setBackground(Color.white);
        board.b4.setBackground(Color.white);
        board.a1.setBackground(Color.white);
        board.a2.setBackground(Color.white);
        board.a3.setBackground(Color.white);
        board.a4.setBackground(Color.white);
    }

    public static void set_after() {
        int i;
        if ( board.a1.getBackground().equals(Color.black) || board.a2.getBackground().equals(Color.black) || board.a3.getBackground().equals(Color.black) || board.a4.getBackground().equals(Color.black) ) {
            correct = false;
            TA.timer.stop();
            board.dispose();
            try {
                Unit.sleep(2999);
            } catch ( InterruptedException ex ) {
                Logger.getLogger(Main_TA.class.getName()).log(Level.SEVERE, null, ex);
            }
            l3 = (Long.toString(score));
            try {
                FileInputStream fis = new FileInputStream("TA.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                highest = (long[]) ois.readObject();
                ois.close();
            } catch ( Exception e ) {
            }
            if ( highest[0] < score ) {
                t1 = ("New highest scores.");
                highest[0] = score;
                try {
                    FileOutputStream fos = new FileOutputStream("TA.txt");
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
        } else {
            afterAttack();
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
    }

    private static void afterAttack() {

        if ( board.a1.getBackground().equals(Color.lightGray) ) {
            board.a1.setBackground(Color.white);
        } else if ( board.a2.getBackground().equals(Color.lightGray) ) {
            board.a2.setBackground(Color.white);
        } else if ( board.a3.getBackground().equals(Color.lightGray) ) {
            board.a3.setBackground(Color.white);
        } else if ( board.a4.getBackground().equals(Color.lightGray) ) {
            board.a4.setBackground(Color.white);
        }

        if ( board.b1.getBackground().equals(Color.lightGray) ) {
            board.b1.setBackground(Color.white);
        } else if ( board.b2.getBackground().equals(Color.lightGray) ) {
            board.b2.setBackground(Color.white);
        } else if ( board.b3.getBackground().equals(Color.lightGray) ) {
            board.b3.setBackground(Color.white);
        } else if ( board.b4.getBackground().equals(Color.lightGray) ) {
            board.b4.setBackground(Color.white);
        }

        if ( board.c1.getBackground().equals(Color.lightGray) ) {
            board.c1.setBackground(Color.white);
        } else if ( board.c2.getBackground().equals(Color.lightGray) ) {
            board.c2.setBackground(Color.white);
        } else if ( board.c3.getBackground().equals(Color.lightGray) ) {
            board.c3.setBackground(Color.white);
        } else if ( board.c4.getBackground().equals(Color.lightGray) ) {
            board.c4.setBackground(Color.white);
        }

        if ( board.d1.getBackground().equals(Color.lightGray) ) {
            board.d1.setBackground(Color.white);
        } else if ( board.d2.getBackground().equals(Color.lightGray) ) {
            board.d2.setBackground(Color.white);
        } else if ( board.d3.getBackground().equals(Color.lightGray) ) {
            board.d3.setBackground(Color.white);
        } else if ( board.d4.getBackground().equals(Color.lightGray) ) {
            board.d4.setBackground(Color.white);
        }
        if ( board.a1.getBackground().equals(Color.cyan) ) {
            board.a1.setBackground(Color.lightGray);
        } else if ( board.a2.getBackground().equals(Color.cyan) ) {
            board.a2.setBackground(Color.lightGray);
        } else if ( board.a3.getBackground().equals(Color.cyan) ) {
            board.a3.setBackground(Color.lightGray);
        } else if ( board.a4.getBackground().equals(Color.cyan) ) {
            board.a4.setBackground(Color.lightGray);
        }

        if ( board.b1.getBackground().equals(Color.cyan) ) {
            board.b1.setBackground(Color.lightGray);
        } else if ( board.b2.getBackground().equals(Color.cyan) ) {
            board.b2.setBackground(Color.lightGray);
        } else if ( board.b3.getBackground().equals(Color.cyan) ) {
            board.b3.setBackground(Color.lightGray);
        } else if ( board.b4.getBackground().equals(Color.cyan) ) {
            board.b4.setBackground(Color.lightGray);
        }

        if ( board.c1.getBackground().equals(Color.cyan) ) {
            board.c1.setBackground(Color.lightGray);
        } else if ( board.c2.getBackground().equals(Color.cyan) ) {
            board.c2.setBackground(Color.lightGray);
        } else if ( board.c3.getBackground().equals(Color.cyan) ) {
            board.c3.setBackground(Color.lightGray);
        } else if ( board.c4.getBackground().equals(Color.cyan) ) {
            board.c4.setBackground(Color.lightGray);
        }

        if ( board.d1.getBackground().equals(Color.cyan) ) {
            board.d1.setBackground(Color.lightGray);
        } else if ( board.d2.getBackground().equals(Color.cyan) ) {
            board.d2.setBackground(Color.lightGray);
        } else if ( board.d3.getBackground().equals(Color.cyan) ) {
            board.d3.setBackground(Color.lightGray);
        } else if ( board.d4.getBackground().equals(Color.cyan) ) {
            board.d4.setBackground(Color.lightGray);
        }
    }

    public static void check() {

        if ( correct = true ) {
            score++;
            board.l2.setText(Long.toString(score));
        }
        switch ( (int) score ) {
            case 50:
                TA.timer.setDelay(1750);
                TA.timer.setInitialDelay(1750);
                TA.timer.restart();
                break;
            case 100:
                TA.timer.setDelay(1450);
                TA.timer.setInitialDelay(1450);
                TA.timer.restart();
                break;
            case 150:
                TA.timer.setDelay(1150);
                TA.timer.setInitialDelay(1150);
                TA.timer.restart();
                break;
            case 200:
                TA.timer.setDelay(910);
                TA.timer.setInitialDelay(910);
                TA.timer.restart();
                break;
            case 250:
                TA.timer.setDelay(790);
                TA.timer.setInitialDelay(790);
                TA.timer.restart();
                break;
            case 300:
                TA.timer.setDelay(744);
                TA.timer.setInitialDelay(744);
                TA.timer.restart();
                break;
            case 350:
                TA.timer.setDelay(700);
                TA.timer.setInitialDelay(700);
                TA.timer.restart();
                break;
            case 400:
                TA.timer.setDelay(650);
                TA.timer.setInitialDelay(650);
                TA.timer.restart();
                break;
            default:
                break;
        }
    }

}
