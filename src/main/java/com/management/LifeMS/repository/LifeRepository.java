package com.management.LifeMS.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.LifeMS.entity.Life;

@Repository
public interface LifeRepository extends JpaRepository<Life,String> {

	List<Life> findByPhonenumber(String phonenumber);
	



}