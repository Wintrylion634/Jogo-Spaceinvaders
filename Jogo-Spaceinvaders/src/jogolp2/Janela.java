package jogolp2;

import javax.swing.JFrame;

public class Janela extends JFrame {
        
    public Janela() {

        Fundo jogo = new Fundo();
        add(jogo);
        setTitle("Jogo de LP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        javax.swing.SwingUtilities.invokeLater(() -> jogo.requestFocusInWindow());
    
    }

}

