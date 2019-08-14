package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPODetail;

public interface CompanyDao extends JpaRepository<Company, Integer> {
	
	
	
	/*public void insertCompany(Company company);
	public List<Company> getCompanyList() throws SQLException;
	public boolean updateCompamy(int companyCode,String ceo) throws SQLException;
	public boolean removeCompanyDetails(int companycode) throws SQLException;*/

}
