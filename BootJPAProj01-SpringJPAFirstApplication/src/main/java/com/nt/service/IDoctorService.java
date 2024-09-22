package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDoctorService {

	public String registerAllDoctors(List<Doctor> list);
	public long fetchDoctorsCount();
	public boolean checkDoctorAvailability(Integer id);
	public Iterable<Doctor> showAllDoctors();
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids);
}
