
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static boolean exit_a = false;

    private static TimeUnit Unit = TimeUnit.MILLISECONDS;

    public static byte i = -1;

    private static void start() throws InterruptedException {
        TimeUnit Unit = TimeUnit.MILLISECONDS;
        Start board = new Start();
        if ( board.isVisible() == false ) {
            board.setVisible(true);
            board.toFront();
        }
        board.l1.setText("   B");
        Unit.sleep(1000);
        board.l2.setText("     &");
        Unit.sleep(1000);
        board.l3.setText("       B");
        Unit.sleep(1000);
        board.l4.setText("Game Library");
        Unit.sleep(2000);
        board.dispose();
    }

    public static void exit() throws InterruptedException {
        TimeUnit Unit = TimeUnit.MILLISECONDS;
        Exit exit = new Exit();
        if ( exit.isVisible() == false ) {
            exit.setVisible(true);
            exit.toFront();
        }
        Unit.sleep(3500);
        exit.dispose();
        System.exit(0);
    }

    public static void play() throws InterruptedException {
        SpacePiano board1 = new SpacePiano();
        Tictactoe board2 = new Tictactoe();
        TA board3 = new TA();
        switch ( i ) {
            case 0:
                exit();
                Unit.sleep(2000);
                System.exit(0);
                break;
            case 1:
                Main_SpacePiano.main();
                while ( exit_a == false ) {
                    if ( exit_a == true ) {
                        break;
                    }
                }
                board1.dispose();
                SP_Scores b = new SP_Scores();
                if ( b.isVisible() == false ) {
                    b.setVisible(true);
                    b.toFront();
                }
                Unit.sleep(4500);
                b.dispose();
                exit_a = true;
                break;
            case 2:
                Main_tictactoe.main();
                while ( exit_a == false ) {
                    if ( exit_a == true ) {
                        break;
                    }
                }
                board2.dispose();
                TTT_Scores t = new TTT_Scores();
                if ( t.isVisible() == false ) {
                    t.setVisible(true);
                    t.toFront();
                }
                Unit.sleep(4200);
                t.dispose();
                exit_a = true;
                break;
            case 3:
                Main_TA.main();
                while ( exit_a == false ) {
                    if ( exit_a == true ) {
                        break;
                    }
                }
                board3.dispose();
                TA_Scores a = new TA_Scores();
                if ( a.isVisible() == false ) {
                    a.setVisible(true);
                    a.toFront();
                }
                Unit.sleep(4500);
                a.dispose();
                exit_a = true;
                break;
        }
        Unit.sleep(270);
        i = -1;
        exit_a = false;
    }

    public static void main(String[] args) throws InterruptedException, URISyntaxException {
        start();
        SplashScreen sc1 = new SplashScreen("B.png");
        Unit.sleep(1800);
        sc1.dispose();
        SplashScreen sc2 = new SplashScreen("C.png");
        Unit.sleep(1800);
        sc2.dispose();
        SplashScreen sc3 = new SplashScreen("A.png");
        Unit.sleep(1800);
        sc3.dispose();
        ProductKey pk = new ProductKey();
        while ( ProductKey.cont == 0 ) {
            if ( ProductKey.cont == 1 ) {
                break;
            }
        }
        pk.dispose();
        byte times = 0;
        while ( times < 2 ) {
            Menu m = new Menu();
            if ( m.isVisible() == false ) {
            m.setVisible(true);
            m.toFront();
            }
            while ( i < 0 || i >= 4 ) {
            }
            m.dispose();
            play();
            times++;
        }
        exit();
        Unit.sleep(2000);
        System.exit(0);
    }
}
