
import java.util.Scanner;

public class Main_tictactoe {

    public static boolean player_a_turn = true, player_b_won = false, player_a_won = false;

    public static boolean draw = false, play_again = false;

    private static byte firstTurn = 0;

    public static String won = "";

    private static Scanner sc = new Scanner(System.in);

    public static Tictactoe board = new Tictactoe();

    private static Main main = new Main();

    public static void main(String[] args) {
        if ( board.isVisible() == false ) {
            board.setVisible(true);
            board.toFront();
        }
    }

    public static void main() {
        board.button1.setText("");
        board.button2.setText("");
        board.button3.setText("");
        board.button4.setText("");
        board.button5.setText("");
        board.button6.setText("");
        board.button7.setText("");
        board.button8.setText("");
        board.button9.setText("");
        player_a_turn = true;
        player_b_won = false;
        player_a_won = false;
        draw = false;
        play_again = false;
        won = "";
        firstTurn = 0;
        if ( board.isVisible() == false ) {
            board.setVisible(true);
            board.toFront();
        }
    }

    public static void check() {
        if ( board.button1.getText().equals("X") ) {
            if ( board.button4.getText().equals("X") ) {
                if ( board.button7.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        if ( board.button1.getText().equals("X") ) {
            if ( board.button5.getText().equals("X") ) {
                if ( board.button9.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        if ( board.button1.getText().equals("X") ) {
            if ( board.button2.getText().equals("X") ) {
                if ( board.button3.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        if ( board.button3.getText().equals("X") ) {
            if ( board.button5.getText().equals("X") ) {
                if ( board.button7.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        if ( board.button3.getText().equals("X") ) {
            if ( board.button6.getText().equals("X") ) {
                if ( board.button9.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        if ( board.button7.getText().equals("X") ) {
            if ( board.button8.getText().equals("X") ) {
                if ( board.button9.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        if ( board.button4.getText().equals("X") ) {
            if ( board.button5.getText().equals("X") ) {
                if ( board.button6.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        if ( board.button2.getText().equals("X") ) {
            if ( board.button5.getText().equals("X") ) {
                if ( board.button8.getText().equals("X") ) {
                    player_a_won = true;
                    player_b_won = false;
                    won = "Player X has won";
                }
            }
        }
        
        if ( board.button1.getText().equals("O") ) {
            if ( board.button4.getText().equals("O") ) {
                if ( board.button7.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( board.button1.getText().equals("O") ) {
            if ( board.button5.getText().equals("O") ) {
                if ( board.button9.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( board.button1.getText().equals("O") ) {
            if ( board.button2.getText().equals("O") ) {
                if ( board.button3.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( board.button3.getText().equals("O") ) {
            if ( board.button5.getText().equals("O") ) {
                if ( board.button7.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( board.button3.getText().equals("O") ) {
            if ( board.button6.getText().equals("O") ) {
                if ( board.button9.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( board.button7.getText().equals("O") ) {
            if ( board.button8.getText().equals("O") ) {
                if ( board.button9.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( board.button4.getText().equals("O") ) {
            if ( board.button5.getText().equals("O") ) {
                if ( board.button6.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( board.button2.getText().equals("O") ) {
            if ( board.button5.getText().equals("O") ) {
                if ( board.button8.getText().equals("O") ) {
                    player_a_won = false;
                    player_b_won = true;
                    won = "Player O has won";
                }
            }
        }
        if ( (board.button1.getText().equals("X")) || (board.button1.getText().equals("O")) ) {
            if ( (board.button2.getText().equals("X")) || (board.button2.getText().equals("O")) ) {
                if ( (board.button3.getText().equals("X")) || (board.button3.getText().equals("O")) ) {
                    if ( (board.button4.getText().equals("X")) || (board.button4.getText().equals("O")) ) {
                        if ( (board.button5.getText().equals("X")) || (board.button5.getText().equals("O")) ) {
                            if ( (board.button6.getText().equals("X")) || (board.button6.getText().equals("O")) ) {
                                if ( (board.button7.getText().equals("X")) || (board.button7.getText().equals("O")) ) {
                                    if ( (board.button8.getText().equals("X")) || (board.button8.getText().equals("O")) ) {
                                        if ( (board.button9.getText().equals("X")) || (board.button9.getText().equals("O")) ) {
                                            draw = true;
                                            won = "The Match has drawn";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if ( player_b_won == true || player_a_won == true || draw == true ) {
            board.setVisible(false);
            Main.exit_a = true;
        }
    }
}
