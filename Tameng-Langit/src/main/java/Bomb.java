import javax.swing.ImageIcon;

/**
 * 
 * @author 
 */
// Class untuk mengatur peluru musuh
public class Bomb extends Sprite {

	private final String bomb = "/img/bolapi(25).png";
	private boolean destroyed;

	/*
	 * Constructor
	 */
	public Bomb(int x, int y) {
		setDestroyed(true);
		this.x = x;
		this.y = y;
		ImageIcon ii = new ImageIcon(this.getClass().getResource(bomb));
		setImage(ii.getImage());
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public boolean isDestroyed() {
		return destroyed;
	}
}
