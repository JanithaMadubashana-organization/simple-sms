package lk.ijse.dep10.simplesms.api;

import lk.ijse.dep10.simplesms.dto.StudentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/students")
public class StudentHttpController {
    @GetMapping
    public String getAllStudents(){
        return "<h1>Get All Students</h1>";
    }
    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveStudent(@RequestBody StudentDTO studentDTO){
        return "<h1>Save student</h1>";
    }
    @DeleteMapping("/{studentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteStudent(@PathVariable("studentId") Integer studentId ){
        System.out.println("delete");
        return "<h1>Delete student</h1>";
    }

}
