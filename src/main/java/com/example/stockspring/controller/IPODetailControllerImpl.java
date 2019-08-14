package com.example.stockspring.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.stockspring.model.IPODetail;
import com.example.stockspring.service.IPODetailService;

@Controller
public class IPODetailControllerImpl implements IPODetailController {
	
	
	@Autowired
	private IPODetailService ipoService;

	@Override
	public void insertIPODetail(IPODetail ipo) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	/*@RequestMapping(path="/ipo")
	public void insertIPODetail(IPODetail ipo) throws SQLException {
		IPODetail ipodetail=new IPODetail();
		model.addAttribute("ipodetail", ipodetail);
		ipoService.insertIPODetail(ipo);
		
	}*/
	
	
	
}
