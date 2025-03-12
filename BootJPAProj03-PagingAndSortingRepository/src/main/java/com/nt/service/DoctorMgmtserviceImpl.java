package com.nt.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;
@Service("doctorService")
public class DoctorMgmtserviceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepo DoctorRepo;
	
	
	@Override
	public Iterable<Doctor> ShowDoctorBySorting(boolean asc, String... props) {
	//prepare sort object
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, props);
		//use repo
		Iterable<Doctor> it=DoctorRepo.findAll(sort);
		return it;
	}
	

	@Override
	public Page<Doctor> showDoctorsInfoByPageNo(int PageNo, int PageSize, boolean ascOrder, String props) {
		// prepare for sort object
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,props);
		//prepare for the page object
		Pageable Pageable=PageRequest.of(PageNo, PageSize,sort);
		//use the Repo
		Page<Doctor> page=DoctorRepo.findAll(Pageable);
		return page;
	}
	
	
 
}
