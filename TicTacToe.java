import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    JPanel buttom_panel = new JPanel();
    JButton reset = new JButton();
    boolean player1_turn;
    boolean gameover;
    boolean xbol = false;
    boolean obol = false;

    TicTacToe(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setTitle("TicTacToe");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Icon.jpeg"));
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setBackground(new Color(51,51,51));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(153,153,153));
        textfield.setFont(new Font("Noto Serif", Font.PLAIN, 65));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        
        buttom_panel.setLayout(new BorderLayout());
        buttom_panel.setBounds(0,0,800,100);

        reset.setText("Restart");
        //reset.setBackground(Color.DARK_GRAY);
        reset.setFont(new Font("Comic sans", Font.ITALIC, 30));
        reset.setFocusable(false);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                if (e.getSource()==reset){
                    frame.dispose();

                    new TicTacToe();
                }

            }
        });

        button_panel.setLayout(new GridLayout(3,3,4,4));
        button_panel.setBackground(new Color(150,150,150));

        for(int i=0; i<9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Ink Free", Font.BOLD, 120));
            buttons[i].setBackground(new Color(27,27,27));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        buttom_panel.add(reset);
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);
        frame.add(buttom_panel, BorderLayout.SOUTH);


        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int i;

        for(i= 0; i < 9; i++){
            if(e.getSource()==buttons[i]){
                if(player1_turn){
                    if (buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(70,130,180));
                        buttons[i].setText("X");
                        buttons[i].setBackground(new Color(14,77,146));
                        player1_turn=false;
                        textfield.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(255,3,143));
                        buttons[i].setText("O");
                        buttons[i].setBackground(new Color(94,0,52));
                        player1_turn=true;
                        textfield.setText("X turn");
                        check();
                    }
                } 
            }

        }
        if (i == 0){
            new TicTacToe();
        }

    }

    public void firstTurn() {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(random.nextInt(2)==0){
            player1_turn=true;
            textfield.setText("X turn");
        } else {
            player1_turn=false;
            textfield.setText("O turn");
        }

    }

    public void check() {

        gameover = false;

        //x wins
        if((buttons[0].getText()=="X") && 
        (buttons[1].getText()=="X") &&
        (buttons[2].getText()=="X")){

            xWins(0,1,2);

            gameover = true;
        } 

        if((buttons[3].getText()=="X") && 
        (buttons[4].getText()=="X") &&
        (buttons[5].getText()=="X")){

            xWins(3,4,5);

            gameover = true;

        }

        if((buttons[6].getText()=="X") && 
        (buttons[7].getText()=="X") &&
        (buttons[8].getText()=="X")){

            xWins(6,7,8);

            gameover = true;

        }

        if((buttons[0].getText()=="X") && 
        (buttons[3].getText()=="X") &&
        (buttons[6].getText()=="X")){

            xWins(0,3,6);

            gameover = true;

        }

        if((buttons[1].getText()=="X") && 
        (buttons[4].getText()=="X") &&
        (buttons[7].getText()=="X")){

            xWins(1,4,7);

            gameover = true;

        }

        if((buttons[2].getText()=="X") && 
        (buttons[5].getText()=="X") &&
        (buttons[8].getText()=="X")){

            xWins(2,5,8);

           gameover = true;

        }

        if((buttons[0].getText()=="X") && 
        (buttons[4].getText()=="X") &&
        (buttons[8].getText()=="X")){

            xWins(0,4,8);

            gameover = true;

        }

        if((buttons[2].getText()=="X") && 
        (buttons[4].getText()=="X") &&
        (buttons[6].getText()=="X")){

            xWins(2,4,6);

            gameover = true;

        }
        

// O wins
        if((buttons[0].getText()=="O") && 
        (buttons[1].getText()=="O") &&
        (buttons[2].getText()=="O")){

            oWins(0,1,2);

            gameover = true;

        }

        if((buttons[3].getText()=="O") && 
        (buttons[4].getText()=="O") &&
        (buttons[5].getText()=="O")){

            oWins(3,4,5);

           gameover = true;

        }

        if((buttons[6].getText()=="O") && 
        (buttons[7].getText()=="O") &&
        (buttons[8].getText()=="O")){

            oWins(6,7,8);

            gameover = true;

        }

        if((buttons[0].getText()=="O") && 
        (buttons[3].getText()=="O") &&
        (buttons[6].getText()=="O")){

            oWins(0,3,6);

            gameover = true;

        }

        if((buttons[1].getText()=="O") && 
        (buttons[4].getText()=="O") &&
        (buttons[7].getText()=="O")){

            oWins(1,4,7);

            gameover = true;

        }

        if((buttons[2].getText()=="O") && 
        (buttons[5].getText()=="O") &&
        (buttons[8].getText()=="O")){

            oWins(2,5,8);
           gameover = true;

        }

        if((buttons[0].getText()=="O") && 
        (buttons[4].getText()=="O") &&
        (buttons[8].getText()=="O")){

            oWins(0,4,8);
            gameover = true;

        }

        if((buttons[2].getText()=="O") && 
        (buttons[4].getText()=="O") &&
        (buttons[6].getText()=="O")){

            oWins(2,4,6);
            gameover = true;

        }

      //  else {
        //    tie();
        //}

    }

    public void xWins(int a, int b, int c) {

        buttons[a].setBackground(new Color(0, 103, 12));
        buttons[b].setBackground(new Color(0, 103, 12));
        buttons[c].setBackground(new Color(0, 103, 12));

        for(int i=0; i<9;i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("X wins!");
        xbol = true;
    }
    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(new Color(0, 103, 12));
        buttons[b].setBackground(new Color(0, 103, 12));
        buttons[c].setBackground(new Color(0, 103, 12));

        for(int i=0; i<9;i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("O wins!");
        obol = true;
    } 

    public void tie(){
        
        if (xbol ==false && obol == false){
            
            for (int i=0; i<9; i++){
                buttons[i].setEnabled(false);
            }
    
            textfield.setText("Tie!");
        }

    }
    
}
