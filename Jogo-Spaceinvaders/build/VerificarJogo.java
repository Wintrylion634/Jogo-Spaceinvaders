import javax.swing.*;
import java.awt.image.BufferedImage;
public class VerificarJogo {
    public static void main(String[] args) throws Exception {
        try {
            for (String nome : new String[]{"fundo.png", "nave.gif", "inimigo_1.gif", "inimigo_2.gif", "missel.png", "game_over.jpg", "tela de titulo.jpg"}) {
                var url = jogolp2.Fundo.class.getResource("/imagens/" + nome);
                if (url == null) throw new AssertionError("Ausente: " + nome);
                var icon = new ImageIcon(url);
                if (icon.getIconWidth() <= 0 || icon.getIconHeight() <= 0) throw new AssertionError("Imagem invalida: " + nome);
                System.out.println(nome + ": " + icon.getIconWidth() + "x" + icon.getIconHeight());
            }
            SwingUtilities.invokeAndWait(() -> {
                var painel = new jogolp2.Fundo();
                painel.setSize(500, 400);
                var tela = new BufferedImage(500, 400, BufferedImage.TYPE_INT_RGB);
                var g = tela.createGraphics();
                painel.paint(g);
                g.dispose();
                try { javax.imageio.ImageIO.write(tela, "png", new java.io.File(args[0])); }
                catch (Exception e) { throw new RuntimeException(e); }
            });
            System.out.println("OK: recursos do JAR e renderizacao do jogo.");
            System.exit(0);
        } catch (Throwable e) { e.printStackTrace(); System.exit(1); }
    }
}
