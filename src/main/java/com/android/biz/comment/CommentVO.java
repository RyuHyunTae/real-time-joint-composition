package com.android.biz.comment;

public class CommentVO {
	String id;
	String comment;
	String seq;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "CommentVO [id=" + id + ", comment=" + comment + ", seq=" + seq + "]";
	}
	
}
