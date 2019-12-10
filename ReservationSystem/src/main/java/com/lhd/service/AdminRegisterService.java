package com.lhd.service;

import java.util.List;

import com.lhd.entity.AdminTable;

public interface AdminRegisterService {
	
	int adminRegister (AdminTable adminTable) ;
	
	List<AdminTable> adminLogin (AdminTable adminTable) ;

}
