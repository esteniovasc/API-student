package com.crud_test.api_student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/students") // This means URL's start with /students (after Application path)

public class MainController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data

    private StudentRepository studentRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests

    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String turma) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Student n = new Student();
        n.setName(name);
        n.setTurma(turma);
        studentRepository.save(n);
        return "200 OK Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllUsers() {
        // This returns a JSON or XML with the users
        return studentRepository.findAll();
    }


}