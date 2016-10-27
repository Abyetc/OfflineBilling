package com.data;

import com.charging.TariffPackage;

public class UserData {
	private Info info;
	private Addition addition;
	private Calling calling;
	private DataTraffic dataTraffic;
	private Message message;
	private TariffPackage tariffPackage;
	
	
	public UserData(Info info, Addition addition, Calling calling, DataTraffic dataTraffic, Message message) {
		super();
		this.info = info;
		this.addition = addition;
		this.calling = calling;
		this.dataTraffic = dataTraffic;
		this.message = message;
	}

	
	public TariffPackage getTariffPackage() {
		return tariffPackage;
	}


	public void setTariffPackage(TariffPackage tariffPackage) {
		this.tariffPackage = tariffPackage;
	}


	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Addition getAddition() {
		return addition;
	}

	public void setAddition(Addition addition) {
		this.addition = addition;
	}

	public Calling getCalling() {
		return calling;
	}

	public void setCalling(Calling calling) {
		this.calling = calling;
	}

	public DataTraffic getDataTraffic() {
		return dataTraffic;
	}

	public void setDataTraffic(DataTraffic dataTraffic) {
		this.dataTraffic = dataTraffic;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
