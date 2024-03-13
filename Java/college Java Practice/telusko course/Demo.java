public class Demo {
	public static void main(String[] args) {
		int nums[][] = new int[3][4];
		// inr random=0;
		// int random=(int)Math.random()*100;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				nums[i][j] = (int) (Math.random() * 10);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();

			StringBuffer sb
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		for (int n[] : nums) {
			for (int m : n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}