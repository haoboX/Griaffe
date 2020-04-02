package com.Griaffe.pojo;

public class Darkroom {
	Integer dark_id;
	Integer dark_user;
	String dark_date;
	public Integer getDark_id() {
		return dark_id;
	}
	public void setDark_id(Integer dark_id) {
		this.dark_id = dark_id;
	}
	public Integer getDark_user() {
		return dark_user;
	}
	public void setDark_user(Integer dark_user) {
		this.dark_user = dark_user;
	}
	public String getDark_date() {
		return dark_date;
	}
	public void setDark_date(String dark_date) {
		this.dark_date = dark_date;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dark_date == null) ? 0 : dark_date.hashCode());
		result = prime * result + ((dark_id == null) ? 0 : dark_id.hashCode());
		
		result = prime * result + ((dark_user == null) ? 0 : dark_user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Darkroom other = (Darkroom) obj;
		if (dark_date == null) {
			if (other.dark_date != null)
				return false;
		} else if (!dark_date.equals(other.dark_date))
			return false;
		if (dark_id == null) {
			if (other.dark_id != null)
				return false;
		} else if (!dark_id.equals(other.dark_id))
			return false;
		
		if (dark_user == null) {
			if (other.dark_user != null)
				return false;
		} else if (!dark_user.equals(other.dark_user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "darkroom [dark_id=" + dark_id + ", dark_user=" + dark_user + ", dark_date=" + dark_date
				+  "]";
	}
	public Darkroom(Integer dark_id, Integer dark_user, String dark_date) {
		super();
		this.dark_id = dark_id;
		this.dark_user = dark_user;
		this.dark_date = dark_date;
		
	}
	public Darkroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
