package com.Griaffe.pojo;

public class Praise {
	Integer praise_id;
	Integer praise_post;
	Integer praise_user;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((praise_id == null) ? 0 : praise_id.hashCode());
		result = prime * result + ((praise_post == null) ? 0 : praise_post.hashCode());
		result = prime * result + ((praise_user == null) ? 0 : praise_user.hashCode());
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
		Praise other = (Praise) obj;
		if (praise_id == null) {
			if (other.praise_id != null)
				return false;
		} else if (!praise_id.equals(other.praise_id))
			return false;
		if (praise_post == null) {
			if (other.praise_post != null)
				return false;
		} else if (!praise_post.equals(other.praise_post))
			return false;
		if (praise_user == null) {
			if (other.praise_user != null)
				return false;
		} else if (!praise_user.equals(other.praise_user))
			return false;
		return true;
	}
	public Integer getPraise_id() {
		return praise_id;
	}
	public void setPraise_id(Integer praise_id) {
		this.praise_id = praise_id;
	}
	public Integer getPraise_post() {
		return praise_post;
	}
	public void setPraise_post(Integer praise_post) {
		this.praise_post = praise_post;
	}
	public Integer getPraise_user() {
		return praise_user;
	}
	public void setPraise_user(Integer praise_user) {
		this.praise_user = praise_user;
	}
	@Override
	public String toString() {
		return "praise [praise_id=" + praise_id + ", praise_post=" + praise_post + ", praise_user=" + praise_user + "]";
	}
	public Praise(Integer praise_id, Integer praise_post, Integer praise_user) {
		super();
		this.praise_id = praise_id;
		this.praise_post = praise_post;
		this.praise_user = praise_user;
	}
	public Praise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
