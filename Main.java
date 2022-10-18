import java.awt.Color;

import acm.graphics.GCanvas;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.*;
import acm.io.*;

public class Main extends GraphicsProgram {
	public  void Display( IComponent comp) {
		add(comp.Operation(), 20,20);
	}
	
	public void run() {
		println("Decorator Pattern \n");
		IComponent component = new Component();
		GCanvas canv = new GCanvas();
		Display( component);
		Display(new DecoratorA(component));
		Display(new DecoratorB(component));
		DecoratorB b = new DecoratorB(new Component());
		GRect rec = (GRect) component.Operation();
		add(b.AddedColor(rec, Color.DARK_GRAY));
		
	}
}
