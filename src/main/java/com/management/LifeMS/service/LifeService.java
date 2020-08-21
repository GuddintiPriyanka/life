package com.management.LifeMS.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.LifeMS.dto.LifeDTO;
import com.management.LifeMS.entity.Life;
import com.management.LifeMS.repository.LifeRepository;


@Service
public class LifeService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	LifeRepository lifeRepo;

	// Fetches all motor details based on phonenumber
	public List<LifeDTO> getAlllifedetails(String phonenumber) {
		List<Life> lifes = lifeRepo.findByPhonenumber(phonenumber);
		List<LifeDTO> lifedtos = new ArrayList<>();
	
		for (Life life : lifes) {
			LifeDTO lifedto = LifeDTO.valueOf(life);
			LocalDate today=LocalDate.now();
			
			LocalDate duration=lifedto.getDuration();
			
			if((duration.getYear()>today.getYear() && duration.getMonthValue()>today.getMonthValue()) || lifedto.getDueamount()>2000  ){
				
				logger.info("The policy is on due..Please check the due amount");
				
			
		    }
				
			lifedtos.add(lifedto);
		}

		logger.info("Plan details : {}", lifedtos);
		return lifedtos;
	}
	
	// To get a motor based on policy number
	public LifeDTO getSpecificlife(String policynumber) {
        return LifeDTO.valueOf(lifeRepo.getOne(policynumber));
    }
	
	

}
