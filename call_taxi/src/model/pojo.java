package model;

public class pojo{

	private int id;
	private String name;
	private String phn_no;
	private String password;


	public pojo() {

	}

	public pojo(int id, String name, String phn_no, String password) {

		this.id = id;
		this.name = name;
		this.phn_no = phn_no;
		this.password = password;
	}

	public pojo(String name, String phn_no, String password) {

		this.name = name;
		this.phn_no = phn_no;
		this.password = password;
	}


	public pojo(String phn_no, String password) {

		this.phn_no = phn_no;
		this.password = password;
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

	public String getPhn_no() {
		return phn_no;
	}

	public void setPhn_no(String phn_no) {
		this.phn_no = phn_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString()
	{
		return "[ ID :" +id+ " Name :" +name+ " Phone Number :"+phn_no+ " Password :"+password+"]";
	}






}