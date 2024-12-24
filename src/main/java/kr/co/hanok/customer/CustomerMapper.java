package kr.co.hanok.customer;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
	List<CustomerVO> list(CustomerVO vo);
	//한옥 검색
	CustomerVO searchHanok(String region, Timestamp checkin, Timestamp checkout, int people);
	//검색 후 한옥 수
	int count(CustomerVO vo);
}