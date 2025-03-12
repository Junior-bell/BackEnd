package com.nt.service;





import java.util.List;


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
	
	
	public Iterable<Doctor> ShowDoctorBySorting(boolean asc, String... props) {
	//prepare sort object
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, props);
		//use repo
		Iterable<Doctor> it=DoctorRepo.findAll(sort);
		return it;
	}
	

	public Page<Doctor> showDoctorsInfoByPageNo(int PageNo, int PageSize, boolean ascOrder, String props) {
		// prepare for sort object
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,props);
		//prepare for the page object
		Pageable Pageable=PageRequest.of(PageNo, PageSize,sort);
		//use the Repo
		Page<Doctor> page=DoctorRepo.findAll(Pageable);
		return page;
	}


	public void showDataThroughPagination(int pageSize) {
		// decide the no. of pages
		long count=DoctorRepo.count();
		long pagesCount=count/pageSize;
	//pageCount=count%pageSize==0?pagesCount:pagesCount++;
		if(count%pagesCount!=0)
		{
			pagesCount++;
			
		}
		for(int i=0;i<pagesCount;++i)
		{
			//create Pageable object
			Pageable pageable=PageRequest.of(i, pageSize);
			//get each page records
			Page<Doctor> page=DoctorRepo.findAll(pageable);
			System.out.println("page ::"+(page.getNumber()+1)+" records of "+page.getTotalPages());
			page.getContent().forEach(System.out::println);
			System.out.println("------------------");
		}
		
		
		
	}


	@Override
	public String deleteDoctorInBatch(List<Integer> ids) {
		//load all entities
		List<Doctor> list=DoctorRepo.findAllById(ids);
		DoctorRepo.deleteAllByIdInBatch(ids);
		
		return list.size()+" records are deleted";
	}
	
}
