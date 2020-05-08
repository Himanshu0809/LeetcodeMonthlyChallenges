package LeetcodeMayChallenge;

public class checkIfItIsAStraightLine {
	public boolean checkStraightLine(int[][] coordinates) {
		if (coordinates.length == 2) {
			return true;
		}
		int x = coordinates[0][0];
		int y = coordinates[0][1];
		for (int i = 2; i < coordinates.length; i++) {
			if ((coordinates[0][0] - coordinates[1][0])
					* (coordinates[i][1] - y) != (coordinates[0][1] - coordinates[1][1]) * (coordinates[i][0] - x)) {
				return false;
			}
		}
		return true;
	}
}
