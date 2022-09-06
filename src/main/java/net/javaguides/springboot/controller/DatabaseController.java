package net.javaguides.springboot.controller;


import net.javaguides.springboot.model.Peers;
import net.javaguides.springboot.repository.PeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class DatabaseController {

    @Autowired
    private PeerRepository employeeRepository;

    @GetMapping
    public List<Peers> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @PostMapping
    public Peers createEmployee(@RequestBody Peers employee){
        return employeeRepository.save(employee);
    }
}
