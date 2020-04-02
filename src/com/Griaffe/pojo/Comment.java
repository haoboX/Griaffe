package com.Griaffe.pojo;

public class Comment {
	Integer comment_id;
	Integer comment_post;
	Integer comment_user;
	String comment_content;
	String comment_user_name;
	String comment_date;
	public Integer getComment_id() {
		return comment_id;
	}
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	public Integer getComment_post() {
		return comment_post;
	}
	public void setComment_post(Integer comment_post) {
		this.comment_post = comment_post;
	}
	public Integer getComment_user() {
		return comment_user;
	}
	public void setComment_user(Integer comment_user) {
		this.comment_user = comment_user;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public String getComment_user_name() {
		return comment_user_name;
	}
	public void setComment_user_name(String comment_user_name) {
		this.comment_user_name = comment_user_name;
	}
	public String getComment_date() {
		return comment_date;
	}
	public void setComment_date(String comment_date) {
		this.comment_date = comment_date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment_content == null) ? 0 : comment_content.hashCode());
		result = prime * result + ((comment_date == null) ? 0 : comment_date.hashCode());
		result = prime * result + ((comment_id == null) ? 0 : comment_id.hashCode());
		result = prime * result + ((comment_post == null) ? 0 : comment_post.hashCode());
		result = prime * result + ((comment_user == null) ? 0 : comment_user.hashCode());
		result = prime * result + ((comment_user_name == null) ? 0 : comment_user_name.hashCode());
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
		Comment other = (Comment) obj;
		if (comment_content == null) {
			if (other.comment_content != null)
				return false;
		} else if (!comment_content.equals(other.comment_content))
			return false;
		if (comment_date == null) {
			if (other.comment_date != null)
				return false;
		} else if (!comment_date.equals(other.comment_date))
			return false;
		if (comment_id == null) {
			if (other.comment_id != null)
				return false;
		} else if (!comment_id.equals(other.comment_id))
			return false;
		if (comment_post == null) {
			if (other.comment_post != null)
				return false;
		} else if (!comment_post.equals(other.comment_post))
			return false;
		if (comment_user == null) {
			if (other.comment_user != null)
				return false;
		} else if (!comment_user.equals(other.comment_user))
			return false;
		if (comment_user_name == null) {
			if (other.comment_user_name != null)
				return false;
		} else if (!comment_user_name.equals(other.comment_user_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", comment_post=" + comment_post + ", comment_user=" + comment_user
				+ ", comment_content=" + comment_content + ", comment_user_name=" + comment_user_name
				+ ", comment_date=" + comment_date + "]";
	}
	public Comment(Integer comment_id, Integer comment_post, Integer comment_user, String comment_content,
			String comment_user_name, String comment_date) {
		super();
		this.comment_id = comment_id;
		this.comment_post = comment_post;
		this.comment_user = comment_user;
		this.comment_content = comment_content;
		this.comment_user_name = comment_user_name;
		this.comment_date = comment_date;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
