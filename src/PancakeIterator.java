import java.util.ArrayList;

public class PancakeIterator implements Iterator {
	private ArrayList<MenuItem> items;
	private int position = 0;

	public PancakeIterator(ArrayList newItems){
		items = newItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		}else{
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}
}
