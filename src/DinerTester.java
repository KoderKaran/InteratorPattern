public class DinerTester {
	public static void main(String[] args) {
		PancakeMenu pancakeHouseMenu = new PancakeMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}
}
