package kr.co.hanok.customer;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper mapper;

	@Override
	public List<CustomerVO> getHanokWithPagenation(String searchKeyword, LocalDate checkInDate, LocalDate checkOutDate,
			int people) {
		System.out.println("log : getHanokWithPagenation");
		
		return null;
	}
	
}
