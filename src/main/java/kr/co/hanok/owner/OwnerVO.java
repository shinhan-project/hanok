package kr.co.hanok.owner;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class OwnerVO {
	//사장님
	private int owner_id;
	private String owner_pwd;
	private String owner_name;
	private String owner_address;
	private String owner_email;
	private String owner_tel;
	private int businessNum;
	private Timestamp ownercreated;
}
