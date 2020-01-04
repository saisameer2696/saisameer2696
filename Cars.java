package test1;
class Cars{
	String carprice;
	String carname;
	String carcompany;
	public String getCarprice() {
		return carprice;
	}
	
	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarcompany() {
		return carcompany;
	}
	public void setCarcompany(String carcompany) {
		this.carcompany = carcompany;
	}
	public Cars(String carprice, String carname,String carcompany) {
		super();
		this.carprice = carprice;
		this.carname = carname;
		this.carcompany=carcompany;
		
	}

}
