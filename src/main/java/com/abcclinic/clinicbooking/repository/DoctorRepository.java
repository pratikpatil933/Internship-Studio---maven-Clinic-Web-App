package com.abcclinic.clinicbooking.repository;

import com.abcclinic.clinicbooking.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}