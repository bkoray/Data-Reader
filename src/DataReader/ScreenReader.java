package DataReader;


import java.util.Stack;

import com.davykager.tolk.Tolk;

import net.sourceforge.olduvai.treejuxtaposer.drawer.TreeNode;

public class ScreenReader {
	private String name;

	public ScreenReader() throws Exception {
		super();
		Tolk.load();
		this.name = Tolk.detectScreenReader();
		if (this.name == null) {
			throw new Exception("Screen Reader not found!");
		}
	}
	public void out(String text) {
		Tolk.output(text);
	}
}
