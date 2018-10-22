package DataReader;


import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		ScreenReader sr;
		SRTree tree;
		try {
			 sr = new ScreenReader();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		try {
			tree = new SRTree("tree.txt");
			// tree = new SRTree(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			sr.out(e.getMessage());
			return;
		}
		tree.TraverseBFS(sr);
	}
}
