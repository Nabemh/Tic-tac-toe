// import javax.swing.*;
// import java.awt.*;

// public class Window1 extends JWindow{
    
//     JFrame welcome = new JFrame("Tic-Tac-Toe");
//     JLabel logoLabel = new JLabel();
//     JLabel textLabel = new JLabel();
//     JPanel splash = new JPanel();
        

//    Window1(){

//       welcome.setTitle("TicTacToe");
//       welcome.setSize(800,800);
//       welcome.setLocationRelativeTo(null);

//       textLabel.setText("Tic-Tac-Toe");
//       textLabel.setHorizontalAlignment(SwingConstants.CENTER);
//       textLabel.setFont(new Font("Ink Free", Font.BOLD, 25));


//       splash.add(logoLabel, BorderLayout.CENTER);
//       splash.add(textLabel, BorderLayout.SOUTH);

//    }

//    public void displayWindow() {

//       setVisible(true);

//       Timer timer = new Timer(4000, e -> {
//          setVisible(false);
//          dispose();
//          new TicTacToe();
//       });
//       timer.setRepeats((false));
//       timer.start();


//    }
// }

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {

    public SplashScreen() {
        // Set up the JWindow
        setSize(800, 800);
        setLocationRelativeTo(null); // Center on screen

        // Create a JPanel to hold the components
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBackground(Color.WHITE);

        // Load the logo image
        ImageIcon logoIcon = new ImageIcon("splashlogo2.jpeg");
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a JLabel for the text
        JLabel textLabel = new JLabel("Tic-Tac-Toe");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setFont(new Font("Ink Free", Font.BOLD, 35));
        //textLabel.setBounds(0,0,800,100);

        // Add components to the content pane
        contentPane.add(logoLabel, BorderLayout.CENTER);
        contentPane.add(textLabel, BorderLayout.SOUTH);

        // Add the content pane to the JWindow
        getContentPane().add(contentPane);
    }

    public void showSplashScreen() {
        // Display the splash screen
        setVisible(true);

        // Set a timer to close the splash screen after 3 seconds
        Timer timer = new Timer(3000, e -> {
            setVisible(false);
            dispose();
            // After closing the splash screen, launch the main application
            // For example:
            // new MainApplicationFrame().setVisible(true);
            new TicTacToe();
        });
        timer.setRepeats(false);
        timer.start();
    }

    // public static void main(String[] args) {
    //     // Create and display the splash screen
 
    //     SplashScreen splashScreen = new SplashScreen();
    //     splashScreen.showSplashScreen();
    // }
}
