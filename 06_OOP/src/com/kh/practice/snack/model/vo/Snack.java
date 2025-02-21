package com.kh.practice.snack.model.vo;

public class Snack {


private String SnackKind;
private String SnackName;
private String SnackFlavor;
private int SnackNumOf;
private int SnackPrice;

public Snack(){
	
}

public Snack(String SnackKind, String SnackName, String SnackFlavor, int SncakNumOf, int SnackPrice) {
	
	super();
	this.SnackKind = SnackKind;
	this.SnackName = SnackName;
	this.SnackFlavor = SnackFlavor;
	this.SnackNumOf = SnackNumOf;
	this.SnackPrice = SnackPrice;
	
}

public String getSnackKind() {
	return SnackKind;
}

public void setSnackKind(String snackKind) {
	SnackKind = snackKind;
}

public String getSnackName() {
	return SnackName;
}

public void setSnackName(String snackName) {
	SnackName = snackName;
}

public String getSnackFlavor() {
	return SnackFlavor;
}

public void setSnackFlavor(String snackFlavor) {
	SnackFlavor = snackFlavor;
}

public int getSnackNumOf() {
	return SnackNumOf;
}

public void setSnackNumOf(int snackNumOf) {
	SnackNumOf = snackNumOf;
}

public int getSnackPrice() {
	return SnackPrice;
}

public void setSnackPrice(int snackPrice) {
	SnackPrice = snackPrice;
	return kind + "(" + name + "-"+flavor +")" + numOf + "개" + price + "원";
}
}

