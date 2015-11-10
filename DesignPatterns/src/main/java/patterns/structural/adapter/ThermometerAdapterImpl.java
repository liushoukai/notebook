package patterns.structural.adapter;

public class ThermometerAdapterImpl implements ThermometerAdapter {
	
	private CelciusThermometer ct;
	
	public ThermometerAdapterImpl(CelciusThermometer ct) {
		this.ct = ct;
	}

	@Override
	public double getCelsius() {
		return this.ct.getCelsius();
	}

	@Override
	public void setCelsius(double celsius) {
		this.ct.setCelsius(celsius);
	}

	@Override
	public double getFahrenheit() {
		return (this.getCelsius() * 9 / 5 + 32);
	}

	@Override
	public void setFahrenheit(double fahrenheit) {
		this.setCelsius((fahrenheit - 32) * 5 / 9);
	}

}
