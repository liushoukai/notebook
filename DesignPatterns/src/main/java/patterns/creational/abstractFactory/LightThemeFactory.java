package patterns.creational.abstractFactory;

public class LightThemeFactory extends AbstractThemeFactory {


	private class LightPanel implements Panel {
		
	}
	
	private class LightButton implements Button {
		
	}

	@Override
	public Panel newPanel() {
		return new LightPanel();
	}

	@Override
	public Button newButton() {
		return new LightButton();
	}


}
