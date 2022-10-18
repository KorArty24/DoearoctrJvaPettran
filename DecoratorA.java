import java.awt.Color;

import acm.graphics.*;
public class DecoratorA implements IComponent {
	
//instance variable	
private IComponent _component;

public DecoratorA (IComponent component) {
	_component = component;
}
public GObject Operation() {
GCompound comp = new GCompound();
comp.add( _component.Operation());
GOval oval = new GOval(10,10,15, 15);
oval.setFillColor(Color.blue);
comp.add(oval, 45, 20);	
	return comp;	
}
}

