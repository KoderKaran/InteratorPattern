public class DinerMenuIterator implements Iterator{
	private MenuItem[] items;
	private int position = 0;

	public DinerMenuIterator(MenuItem[] newItems){
		items = newItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
}
