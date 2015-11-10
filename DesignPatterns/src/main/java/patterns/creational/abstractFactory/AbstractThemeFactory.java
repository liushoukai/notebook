package patterns.creational.abstractFactory;

public abstract class AbstractThemeFactory {
	
	public abstract Panel newPanel();
	public abstract Button newButton();
	
	public static AbstractThemeFactory newInstance(String runtimeArgs) {
		if (runtimeArgs == "light") {
			return new LightThemeFactory();
		} else {
			return new DarkThemeFactory();
		}
    }
	
}
