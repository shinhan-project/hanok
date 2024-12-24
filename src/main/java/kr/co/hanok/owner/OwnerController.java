package kr.co.hanok.owner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OwnerController {
	@Autowired
	private OwnerService service;	
	
}