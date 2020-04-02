package com.Griaffe.pojo;

public class Post implements Comparable{

	Integer post_id;
	String  post_name;
	Integer post_user;
	String  post_image;
	Integer post_praise_num;
	String  post_user_name;
	String  post_date;
	public Integer getPost_id() {
		return post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public Integer getPost_user() {
		return post_user;
	}
	public void setPost_user(Integer post_user) {
		this.post_user = post_user;
	}
	public String getPost_image() {
		return post_image;
	}
	public void setPost_image(String post_image) {
		this.post_image = post_image;
	}
	public Integer getPost_praise_num() {
		return post_praise_num;
	}
	public void setPost_praise_num(Integer post_praise_num) {
		this.post_praise_num = post_praise_num;
	}
	public String getPost_user_name() {
		return post_user_name;
	}
	public void setPost_user_name(String post_user_name) {
		this.post_user_name = post_user_name;
	}
	public String getPost_date() {
		return post_date;
	}
	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((post_date == null) ? 0 : post_date.hashCode());
		result = prime * result + ((post_id == null) ? 0 : post_id.hashCode());
		result = prime * result + ((post_image == null) ? 0 : post_image.hashCode());
		result = prime * result + ((post_name == null) ? 0 : post_name.hashCode());
		result = prime * result + ((post_praise_num == null) ? 0 : post_praise_num.hashCode());
		result = prime * result + ((post_user == null) ? 0 : post_user.hashCode());
		result = prime * result + ((post_user_name == null) ? 0 : post_user_name.hashCode());
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
		Post other = (Post) obj;
		if (post_date == null) {
			if (other.post_date != null)
				return false;
		} else if (!post_date.equals(other.post_date))
			return false;
		if (post_id == null) {
			if (other.post_id != null)
				return false;
		} else if (!post_id.equals(other.post_id))
			return false;
		if (post_image == null) {
			if (other.post_image != null)
				return false;
		} else if (!post_image.equals(other.post_image))
			return false;
		if (post_name == null) {
			if (other.post_name != null)
				return false;
		} else if (!post_name.equals(other.post_name))
			return false;
		if (post_praise_num == null) {
			if (other.post_praise_num != null)
				return false;
		} else if (!post_praise_num.equals(other.post_praise_num))
			return false;
		if (post_user == null) {
			if (other.post_user != null)
				return false;
		} else if (!post_user.equals(other.post_user))
			return false;
		if (post_user_name == null) {
			if (other.post_user_name != null)
				return false;
		} else if (!post_user_name.equals(other.post_user_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", post_name=" + post_name + ", post_user=" + post_user + ", post_image="
				+ post_image + ", post_praise_num=" + post_praise_num + ", post_user_name=" + post_user_name
				+ ", post_date=" + post_date + "]";
	}
	public Post(Integer post_id, String post_name, Integer post_user, String post_image, Integer post_praise_num,
			String post_user_name, String post_date) {
		super();
		this.post_id = post_id;
		this.post_name = post_name;
		this.post_user = post_user;
		this.post_image = post_image;
		this.post_praise_num = post_praise_num;
		this.post_user_name = post_user_name;
		this.post_date = post_date;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(((Post)o).post_id<this.post_id) {
			return -1;
		}
		if(((Post)o).post_id>this.post_id) {
			return 1;
		}
		return 0;
	}
	
	
	
	
	
}
