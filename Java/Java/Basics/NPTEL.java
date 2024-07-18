import javax.swing.*;

public class NPTEL extends JFrame {
    private JTextArea textArea;

    public NPTEL() {
        setTitle("Text-Based Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane);

        appendText("Welcome to the Text-Based Game!\n");
    }

    private void appendText(String text) {
        textArea.append(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NPTEL game = new NPTEL();
            game.setVisible(true);
        });
    }
}
