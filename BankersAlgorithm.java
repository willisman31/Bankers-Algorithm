import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

public class BankersAlgorithm { // rename me

	int[] available; // array of available resources
	int[][] max; // matrix of max resources by thread- threads -> rows; resources -> columns
	int[][] allocation; // matrix of current allocation by thread
	int[][] need; // matrix of "need" by thread - difference between current allocation and max allocation by thread

	// Initialize the current status of max, allocation, and available from configs
	void initializeStatus() {
		File[] configs = {
			File("./resources.txt"),
			File("./allocation.txt"),
			File("./available.txt") };
		for (int i = 0; i < configs.length; i++) {
			Scanner configScanner = new Scanner(config[i]);
			configScanner.read(
	}

	void initializeAvailable() {
		for (int i = 0; i < allocation.length; i++) {
			for (int j = 0; j < allocation[i].length; j++) {
				available[i] -= allocation[j][i];
			}
		}
	}

	void initializeNeed() {
		for (int i = 0; i < need.length; i++) {
			for (int j = 0; j < need[i].length; j++) {
				need[i][j] = max[i][j] - allocation[i][j];
			}
		}
	}

	void makeRequest(int thread, int resource, int amount) throws Exception{ // thread is row_num of max or allocation; resource is column num
		if ((available[resource] -= amount) >= 0 && need[thread][resource] >= amount) {
			available[resource] -= amount;
			allocation[thread][resource] += amount;
			need[thread][resource] -= amount;
		} else {
			throw new Exception("");
		}
	}

	static int[] copy_array(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		return arr2;
	}

	void check-safety() {
		int m = 
		int[] work = copy_array(available);
		boolean[] finish = new boolean[work.length];
		// TODO
		return;
	}

	// Create custom object and run bankers algorithm against it
	// this class should be renamed for the object and have a
	// method for the algorithm.  Main is elsewhere.

}

