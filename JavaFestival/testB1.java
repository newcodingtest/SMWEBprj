
public class testB1 {

	public static void main(String[] args) {
		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(findKim(names));
	}
	
	public static String findKim(String[] location) {
		int x = 0;
		for (int i = 0; i < location.length; i++) {
			if (location[i] == "Kim") {
				x = i;
			}
		}

		return "김서방은 " + (x + 1) + "에 있다";
	}
}