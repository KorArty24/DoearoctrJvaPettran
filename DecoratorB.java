import java.awt.Color;

import acm.graphics.*;

public class DecoratorB implements IComponent {
	IComponent _component;

	public GRect AddedColor(GRect rect,Color color) {
		rect.setFillColor(color);
		return rect;
	} 

	public DecoratorB(IComponent component) {
		_component = component;
	}
	public GObject Operation() {
		GRect rect = new GRect (25,25,15,25);
		rect.setFilled(true);
		rect.setFillColor(Color.DARK_GRAY);
		GCompound com = new GCompound();
		com.add(rect);
		return com;
	}
	public GObject WithArcAdded() {
		return new GArc(10.5, 20, 20, 20);
	}
}
