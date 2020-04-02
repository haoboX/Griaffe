package com.Griaffe.pojo;

public class Follow {

	Integer follow_id;
	Integer user_id;
	String user_name;
	Integer follow_user_id;
	String follow_user_name;
	public Integer getFollow_id() {
		return follow_id;
	}
	public void setFollow_id(Integer follow_id) {
		this.follow_id = follow_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getFollow_user_id() {
		return follow_user_id;
	}
	public void setFollow_user_id(Integer follow_user_id) {
		this.follow_user_id = follow_user_id;
	}
	public String getFollow_user_name() {
		return follow_user_name;
	}
	public void setFollow_user_name(String follow_user_name) {
		this.follow_user_name = follow_user_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((follow_id == null) ? 0 : follow_id.hashCode());
		result = prime * result + ((follow_user_id == null) ? 0 : follow_user_id.hashCode());
		result = prime * result + ((follow_user_name == null) ? 0 : follow_user_name.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
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
		Follow other = (Follow) obj;
		if (follow_id == null) {
			if (other.follow_id != null)
				return false;
		} else if (!follow_id.equals(other.follow_id))
			return false;
		if (follow_user_id == null) {
			if (other.follow_user_id != null)
				return false;
		} else if (!follow_user_id.equals(other.follow_user_id))
			return false;
		if (follow_user_name == null) {
			if (other.follow_user_name != null)
				return false;
		} else if (!follow_user_name.equals(other.follow_user_name))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (user_name == null) {
			if (other.user_name != null)
				return false;
		} else if (!user_name.equals(other.user_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Follow [follow_id=" + follow_id + ", user_id=" + user_id + ", user_name=" + user_name
				+ ", follow_user_id=" + follow_user_id + ", follow_user_name=" + follow_user_name + "]";
	}
	public Follow(Integer follow_id, Integer user_id, String user_name, Integer follow_user_id,
			String follow_user_name) {
		super();
		this.follow_id = follow_id;
		this.user_id = user_id;
		this.user_name = user_name;
		this.follow_user_id = follow_user_id;
		this.follow_user_name = follow_user_name;
	}
	public Follow() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
