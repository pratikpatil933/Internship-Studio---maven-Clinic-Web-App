package com.abcclinic.clinicbooking.controller;

import com.abcclinic.clinicbooking.model.Appointment;
import com.abcclinic.clinicbooking.repository.AppointmentRepository;
import com.abcclinic.clinicbooking.repository.DoctorRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AppointmentController {

    private final DoctorRepository doctorRepository;
    private final AppointmentRepository appointmentRepository;

    public AppointmentController(DoctorRepository doctorRepository,
                                 AppointmentRepository appointmentRepository) {
        this.doctorRepository = doctorRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        // Ensure doctors are fetched so the dropdown isn't empty
        model.addAttribute("doctors", doctorRepository.findAll());
        model.addAttribute("appointment", new Appointment());
        return "index"; 
    }

    @PostMapping("/book")
    public String bookAppointment(@ModelAttribute("appointment") Appointment appointment) {
        appointmentRepository.save(appointment);
        return "redirect:/";
    }
}
