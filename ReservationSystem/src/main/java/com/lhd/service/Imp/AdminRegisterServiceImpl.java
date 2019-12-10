package com.lhd.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.dao.AdminTableMapper;
import com.lhd.entity.AdminTable;
import com.lhd.entity.AdminTableExample;
import com.lhd.service.AdminRegisterService;

@Service("AdminRegisterService")
public class AdminRegisterServiceImpl implements AdminRegisterService{
	
	@Autowired
	private AdminTableMapper adminTableMapper ;
	
	public int adminRegister (AdminTable adminTable) {
		int i = adminTableMapper.insert(adminTable) ;
		return i ;
	}
	
	public List<AdminTable> adminLogin (AdminTable adminTable) {
		
		AdminTableExample example = new AdminTableExample() ;
		example.createCriteria().andUsernameEqualTo(adminTable.getUsername()).
		andPasswordEqualTo(adminTable.getPassword()) ;
		List<AdminTable> list = adminTableMapper.selectByExample(example) ;
		return list ;
	}

}
