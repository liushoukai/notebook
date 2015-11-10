package patterns.behavioral.iterator;

public class ConcreteContainer implements Container<String> {

	private String[] content = new String[] { "aa", "bb", "cc" };

	@Override
	public Iterator<String> iterator() {
		return new NameIterator();
	}

	class NameIterator implements Iterator<String> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return content.length > index ? true : false;
		}

		@Override
		public String next() {
			if (this.hasNext()) {
				return content[index++];
			}
			return null;
		}

	}

}
