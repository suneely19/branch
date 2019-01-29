package com.telecommunication.bo;

public class SimBo {
	
	private int id;
	private String size;
	private String type;
	private String simSerialNumber;
	private String simName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSimSerialNumber() {
		return simSerialNumber;
	}
	public void setSimSerialNumber(String simSerialNumber) {
		this.simSerialNumber = simSerialNumber;
	}
	public String getSimName() {
		return simName;
	}
	public void setSimName(String simName) {
		this.simName = simName;
	}
	@Override
	public String toString() {
		return "SimBo [id=" + id + ", size=" + size + ", type=" + type + ", simSerialNumber=" + simSerialNumber
				+ ", simName=" + simName + "]";
	}
	
	

}
