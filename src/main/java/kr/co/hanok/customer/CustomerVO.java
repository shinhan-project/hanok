package kr.co.hanok.customer;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CustomerVO {
	//고객
	private int customer_id;
	private String customer_name;
	private String customer_pwd;
	private String cutomer_address;
	private String customer_tel;
	private Timestamp customer_created;
	
	//한옥
	private int hanok_id;
	private int owner_id;
	private String hanok_name;
	private String hanok_tel;
	private String hanok_address;
	private String hanok_url;
	private String hanok_description;
	private boolean[] hanok_service;
	private String hanok_serviceETC;
	private int status;
	private double hanok_score;
	
	private String hanok_imgName;
	
	//객실
	private int room_id;
	private String room_name;
	private int room_price;
	private int room_size;
	private int max_capacity;
	private String room_service;
	
	private String room_imgName;
	
	//리뷰
	private int review_id;
	private String review_title;
	private String review_content;
	private Timestamp review_date;
	private int rating;
	
	//예약
	private int reservations_id;
	private Timestamp checkin;
	private Timestamp checkout;
	private Timestamp res_created_at;
	private Timestamp res_modified_at;
	private String res_status;
	private int reservation_price;
	private String reservation_name;
	
	//결제
	private int pay_id;
	private int pay_price;
	private Timestamp pay_date;
	private String pay_type;
	private Timestamp pay_created_at;
	private Timestamp pay_modified_at;
	
}
