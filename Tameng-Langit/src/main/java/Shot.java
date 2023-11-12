import javax.swing.ImageIcon;

// Class untuk mengatur tembakan player
public class Shot extends Sprite {

    private String shot = "/img/Keris(50).png";
    private final int H_SPACE = 6;
    private final int V_SPACE = 1;

    public Shot() {
    }

    public Shot(int x, int y) {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(shot));
        setImage(ii.getImage());
        setX(x + H_SPACE);
        setY(y - V_SPACE);
    }
}