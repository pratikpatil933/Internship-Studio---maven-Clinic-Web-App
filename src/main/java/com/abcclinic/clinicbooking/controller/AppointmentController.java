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

    // Constructor injection is the best practice here
    public AppointmentController(DoctorRepository doctorRepository,
                                 AppointmentRepository appointmentRepository) {
        this.doctorRepository = doctorRepository;
        this.appointmentRepository = appointmentRepository;
    }

    /**
     * This method handles the root URL.
     * When you visit /clinic-web-app/, this method runs.
     */
    @GetMapping("/")
    public String home(Model model) {
        // Fetch doctors from DB and send to the index.html template
        model.addAttribute("doctors", doctorRepository.findAll());
        // Create an empty appointment object for the form binding
        model.addAttribute("appointment", new Appointment()); 
        return "index"; // Looks for src/main/resources/templates/index.html
    }

    /**
     * This method handles the form submission.
     */
    @PostMapping("/book")
    public String bookAppointment(@ModelAttribute("appointment") Appointment appointment) {
        appointmentRepository.save(appointment);
        // Redirects back to the home page after saving
        return "redirect:/";
    }
}
