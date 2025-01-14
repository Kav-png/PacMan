import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21; // rows on the pacman board
        int columnCount = 19; // columns on the pacman board
        int tileSize = 32; // pixel size of each square on the board
        int boardWidth = columnCount * tileSize; // pixel size of the board
        int boardHeight = rowCount * tileSize; // pixel size of the board

        JFrame frame = new JFrame("Pac man"); // create new JFrame with the library
        // frame.setVisible(false);
        frame.setSize(boardWidth, boardHeight); // set the dimensions
        frame.setLocationRelativeTo(null); // centers 
        frame.setResizable(false); // not able to change the dimensions of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close whenever you exit the window

        PacMan pacmanGame = new PacMan(); // create new pac man class and add it to the frame (self-contained, modular )
        frame.add(pacmanGame);
        frame.pack(); // size components so that all the classes are at their preferred size
        pacmanGame.requestFocus();
        frame.setVisible(true); // shows the window
    }
}
