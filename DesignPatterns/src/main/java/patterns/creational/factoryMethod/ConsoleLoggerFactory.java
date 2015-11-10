package patterns.creational.factoryMethod;

public class ConsoleLoggerFactory implements LoggerFactory {

	@Override
	public Logger getLogger() {
		return new ConsoleLogger();
	}
	
	private class ConsoleLogger implements Logger {
		@Override
		public void info(String msg) {
			System.out.printf("Log %s in console", msg);
		}
	}

}
