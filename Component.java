import acm.graphics.*;

public class Component implements IComponent {
	
	private static final int x0= 10;
	private static final int y0 = 10;
	private static final int width = 25;
	private static final int height = 30;
	
	public GObject Operation() {
		return new GRect(x0,y0, width, height);
		}
}
