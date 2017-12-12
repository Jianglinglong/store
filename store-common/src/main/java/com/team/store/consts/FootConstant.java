package com.team.store.consts;
public enum FootConstant {
	USER_FOOT("user:foot:"),
	GOODS(":goods:"),
	_GOODS("goods:"),
	USER_TIME("user:time:");
	
	private String value;

	public String getValue() {
		return value;
	}
	
	private FootConstant(String value) {
		this.value = value;
	}
}
