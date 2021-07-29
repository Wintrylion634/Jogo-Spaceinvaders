package jogolp2;

import javax.swing.JFrame;

public class Janela extends JFrame {
        
    public Janela() {

        add(new Fundo());
        setTitle("Jogo de LP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    
    }

}
