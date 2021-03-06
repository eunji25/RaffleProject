package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("ResellRDTO")
public class ResellRDTO {

	int resell_rno;
	int memberno;
	String nickname;
	String rafflename;
	String total_price;
	String attend_amount;
	String per_price;
	int viewcnt;
	String deadline;
	String text;
	String image;
	String image1;
	String image2;
	
	public ResellRDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResellRDTO(int resell_rno, int memberno, String nickname, String rafflename, String total_price,
			String attend_amount, String per_price, int viewcnt, String deadline, String text, String image,
			String image1, String image2) {
		super();
		this.resell_rno = resell_rno;
		this.memberno = memberno;
		this.nickname = nickname;
		this.rafflename = rafflename;
		this.total_price = total_price;
		this.attend_amount = attend_amount;
		this.per_price = per_price;
		this.viewcnt = viewcnt;
		this.deadline = deadline;
		this.text = text;
		this.image = image;
		this.image1 = image1;
		this.image2 = image2;
	}

	public int getResell_rno() {
		return resell_rno;
	}
	public void setResell_rno(int resell_rno) {
		this.resell_rno = resell_rno;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRafflename() {
		return rafflename;
	}
	public void setRafflename(String rafflename) {
		this.rafflename = rafflename;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public String getAttend_amount() {
		return attend_amount;
	}
	public void setAttend_amount(String attend_amount) {
		this.attend_amount = attend_amount;
	}
	public String getPer_price() {
		return per_price;
	}
	public void setPer_price(String per_price) {
		this.per_price = per_price;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	
	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	@Override
	public String toString() {
		return "ResellRDTO [resell_rno=" + resell_rno + ", memberno=" + memberno + ", nickname=" + nickname
				+ ", rafflename=" + rafflename + ", total_price=" + total_price + ", attend_amount=" + attend_amount
				+ ", per_price=" + per_price + ", viewcnt=" + viewcnt + ", deadline=" + deadline + ", text=" + text
				+ ", image=" + image + ", image1=" + image1 + ", image2=" + image2 + "]";
	}
	


	
	
	
	
	
}
