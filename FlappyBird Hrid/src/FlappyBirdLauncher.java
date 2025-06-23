import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class FlappyBirdLauncher {
    public static void main(String[] args) throws Exception {
        int boardWidth = 1200;//changed
        int boardHeight = 750;//changed

        JFrame frame = new JFrame("Flappy Bird");
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //new
        frame.setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        JButton startButton = new JButton("Start Game");
        JButton quitButton = new JButton("Quit");
        menuPanel.add(startButton);
        menuPanel.add(quitButton);
        frame.add(menuPanel, BorderLayout.CENTER);
        frame.setVisible(true);
        startButton.addActionListener(_ -> {
          frame.remove(menuPanel);
          FlappyBird game = new FlappyBird();
          frame.add(game);
          frame.pack();
          game.requestFocusInWindow();
          frame.revalidate();
      });

      quitButton.addActionListener(_ -> System.exit(0));
    }
}