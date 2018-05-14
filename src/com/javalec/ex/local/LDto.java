package com.javalec.ex.local;

public class LDto {

	String r_code;
	String r_name;
	String intro;
	String seat_num;
	
	public LDto(String r_code, String r_name, String intro, String seat_num) {
		// TODO Auto-generated constructor stub
		this.r_code = r_code;
		this.r_name = r_name;
		this.intro = intro;
		this.seat_num = seat_num;
	}

	public String getR_code() {
		return r_code;
	}

	public void setR_code(String r_code) {
		this.r_code = r_code;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getSeat_num() {
		return seat_num;
	}

	public void setSeat_num(String seat_num) {
		this.seat_num = seat_num;
	}

	
}
