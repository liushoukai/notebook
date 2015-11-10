package patterns.creational.abstractFactory;

public class DarkThemeFactory extends AbstractThemeFactory {
	
	@Override
	public Panel newPanel() {
		return new DarkPanel();
	}

	@Override
	public Button newButton() {
		return new DarkButton();
	}
	
	private class DarkPanel implements Panel {
	
	}
	
	private class DarkButton implements Button {
		
	}

}
