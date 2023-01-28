package model;

import java.io.Serializable;

//つぶやきbeans
public class Mutter implements Serializable{

	//フィールド
	private int id;
	private String userName;
	private String text;
	
	//コンストラクタ
	public Mutter() {}
	public Mutter(String userName, String text) {
		this.userName =userName;
		this.text = text;
	}
	public Mutter(int id, String userName, String text) {
		this.id = id;
		this.userName =userName;
		this.text = text;
	}
	
	//getter
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getText() {
		return text;
	}
}
