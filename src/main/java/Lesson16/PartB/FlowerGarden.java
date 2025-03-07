import static java.lang.Integer.parseInt;

import java.util.ArrayList;

public class FlowerGarden {
	// create an arraylist instance variable
	ArrayList<String> flowers;

	// write a constructor
	public FlowerGarden() {
		flowers = new ArrayList<String>();
	}

	// write add flower
	public void addFlower(String flower) {
		this.flowers.add(flower);
	}

	// write get count
	public int getCount() {
		return this.flowers.size();
	}

	// write get flower name
	public String getFlowerName(int index) {
		return this.flowers.get(index).split(" ")[1];
	}

	// write in range
	public boolean inRange(int low, int high, String flower) {
		for (int i = low; i <= high; i++) {
			if (this.flowers.get(i).equals(flower)) {
				return true;
			}
		}

		return false;
	}

	// write find flower
	public int findFlower(String flower) {
		for (int i = 0; i < flowers.size(); i++) {
			if (this.flowers.get(i).split(" ")[1].equals(flower)) {
				return i;
			}
		}

		return -1;
	}

	// write max flower
	public String maxFlower() {
		String most = "None";
		int mostCount = 0;

		for (String flower : this.flowers) {
			int count = parseInt(flower.split(" ")[0]);
			String name = flower.split(" ")[1];

			if (count > mostCount) {
				most = name;
				mostCount = count;
			}
		}

		return most;
	}

	// write a toString
	@Override
	public String toString() {
		return this.flowers.toString();
	}
}