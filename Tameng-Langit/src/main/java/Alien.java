import javax.swing.ImageIcon;

/**
 * 
 * @author 
 */

// Class untuk mengatur musuh
public class Alien extends Sprite {
	
    private Bomb bomb;
    private final String Barongan = "/img/Barongan(50).png";

    /*
     * Constructor
     */
    public Alien(int x, int y) {
        this.x = x;
        this.y = y;

        bomb = new Bomb(x, y);
        ImageIcon ii = new ImageIcon(this.getClass().getResource(Barongan));
        setImage(ii.getImage());

    }

    public void act(int direction) {
        this.x += direction;
    }

    /*
     * Getters & Setters
     */
    
	public Bomb getBomb() {
		return bomb;
	}

}