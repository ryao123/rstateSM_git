package cn.pojo;

import java.util.Date;

public class Users {
	private String cardId;//身份证号码
	private String name;//用户名
	private int gender;//性别
	private Date createTime;//注册时间
	private String password;//密码
	private int status;//用户状态
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Users(String cardId, String name, String password) {
		super();
		this.cardId = cardId;
		this.name = name;
		this.password = password;
	}
	public Users(String cardId, String password) {
		super();
		this.cardId = cardId;
		this.password = password;
	}
	public Users() {
		super();
	}
	
	
}
