package com.telecommunication.bo;

public class NetworkBo {
	private int id;
	private String networkName;
	private String registeredName;
	private String registerDate;
	private String mainBranchLocation;
	private String ceo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public String getRegisteredName() {
		return registeredName;
	}
	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getMainBranchLocation() {
		return mainBranchLocation;
	}
	public void setMainBranchLocation(String mainBranchLocation) {
		this.mainBranchLocation = mainBranchLocation;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	@Override
	public String toString() {
		return "NetworkBo [id=" + id + ", networkName=" + networkName + ", registeredName=" + registeredName
				+ ", registerDate=" + registerDate + ", mainBranchLocation=" + mainBranchLocation + ", ceo=" + ceo
				+ "]";
	}
	
	

}
