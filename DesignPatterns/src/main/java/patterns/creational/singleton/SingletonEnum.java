package patterns.creational.singleton;

public enum SingletonEnum {

	INSTANCE {
		private String property = String.valueOf(System.currentTimeMillis());

		@Override
		protected String getProperty() {
			return this.property;
		}

	};

	protected abstract String getProperty();

}
