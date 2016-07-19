package com.ssmm.controller;

public class Value {
	 private String vaule1;
	 private String vaule2;
	public String getVaule1() {
		return vaule1;
	}
	public void setVaule1(String vaule1) {
		this.vaule1 = vaule1;
	}
	public String getVaule2() {
		return vaule2;
	}
	public void setVaule2(String vaule2) {
		this.vaule2 = vaule2;
	}
	@Override
	public String toString() {
		return "Value [vaule1=" + vaule1 + ", vaule2=" + vaule2 + "]";
	}
}
