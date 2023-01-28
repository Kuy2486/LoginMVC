package model;


public class LoginLogic {
	
	//実行して、Passが1234ならtrueを返す
	public boolean execute(User user) {
		
		if(user.getPass().equals("1234")) {return true;}
		return false;
	}

}
