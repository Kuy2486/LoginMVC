package model;

import java.util.List;

public class PostMutterLogic {
	
	//常に最初に上書きする
	public void execute(Mutter mutter, List<Mutter> mutterList) {
		mutterList.add(0, mutter);
	}
}
