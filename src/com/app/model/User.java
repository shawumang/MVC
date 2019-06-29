package com.app.model;

public class User {
int id;
String user;
String pass;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "User [id=" + id + ", user=" + user + ", pass=" + pass + "]";
}

}
