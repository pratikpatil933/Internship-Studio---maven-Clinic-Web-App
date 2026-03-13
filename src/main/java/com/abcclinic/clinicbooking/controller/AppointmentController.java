package com.abcclinic.clinicbooking.controller;

import com.abcclinic.clinicbooking.model.Appointment;
import com.abcclinic.clinicbooking.repository.AppointmentRepository;
import com.abcclinic.clinicbooking.repository.DoctorRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String home(Model model) {
        model.addAttribute("doctors", doctorRepository.findAll());
        return "index";
    }

    @PostMapping("/book")
    public String bookAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
        return "redirect:/";
    }
}