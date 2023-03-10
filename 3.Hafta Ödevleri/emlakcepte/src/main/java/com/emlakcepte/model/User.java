package com.emlakcepte.model;

import java.time.LocalDateTime;
import java.util.List;

import com.emlakcepte.model.enums.UserType;

public class User {

	private int id;
	private String name;
	private String mail;
	private String password;
	private UserType type;
	private LocalDateTime createDate;
	private List<Realty> realtyList;
	private List<Realty> favoriteRealtyList;
	private List<Message> messages;
	private List<Search> searches;

	public User() {
		super();
	}

	public User(String name, String mail, String password, UserType type, List<Realty> realtyList) {
		super();
		this.name = name;
		this.mail = mail;
		this.password = password;
		this.type = type;
		this.realtyList = realtyList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public List<Realty> getRealtyList() {
		return realtyList;
	}

	public void setRealtyList(List<Realty> realtyList) {
		this.realtyList = realtyList;
	}

	public List<Realty> getFavoriteRealtyList() {
		return favoriteRealtyList;
	}

	public void setFavoriteRealtyList(List<Realty> favoriteRealtyList) {
		this.favoriteRealtyList = favoriteRealtyList;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Search> getSearches() {
		return searches;
	}

	public void setSearches(List<Search> searches) {
		this.searches = searches;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + ", password=" + password + ", type=" + type
				+ ", createDate=" + createDate + "]";
	}

}
