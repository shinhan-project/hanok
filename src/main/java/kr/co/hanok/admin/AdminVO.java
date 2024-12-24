package kr.co.hanok.admin;

import lombok.Data;

@Data
public class AdminVO {
	//관리자
	private int admin_id;
	private String admin_pwd;
	private String admin_email;
}
