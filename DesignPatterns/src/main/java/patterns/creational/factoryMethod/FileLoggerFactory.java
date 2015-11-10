package patterns.creational.factoryMethod;

public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger getLogger() {
		return new FileLogger();
	}

	private class FileLogger implements Logger {
		@Override
		public void info(String msg) {
			System.out.printf("Log %s in file", msg);
		}
	}

}
