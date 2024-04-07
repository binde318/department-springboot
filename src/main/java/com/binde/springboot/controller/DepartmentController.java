package com.binde.springboot.controller;

import com.binde.springboot.entity.Department;
import com.binde.springboot.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.boot.model.relational.Sequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/departments")
//@AllArgsConstructor
public class DepartmentController {
    //how to add logger to the project
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    private final static String MESSAGE ="department with Id is deleted successfully!!";
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department createDepartment(@Valid
            @RequestBody Department department){
        LOGGER.info("Inside of create Department of Department Controller");
        return departmentService.createDepartment(department);

    }
    @GetMapping("/department-list")
public List<Department>fetchDepartmentList(){
        LOGGER.info("Inside of fetchDepartmentList of Department Controller");
        return departmentService.fetchDepartmentList();
}
@GetMapping("/departments/{id}")
public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
    LOGGER.info("Inside of fetchDepartmentById of Department Controller");
        return departmentService.fetchDepartmentById(departmentId);
}
@DeleteMapping("/departments/{id}")
public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
    LOGGER.info("Inside of deleteDepartmentById of Department Controller");
        return MESSAGE;


}
@PutMapping("/departments/{id}")
public Department updateDepartmentById(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
    LOGGER.info("Inside of updateDepartmentById of Department Controller");
       return departmentService.updateDepartment(departmentId,department);

}
@GetMapping("/departments/name/{name}")
public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
    LOGGER.info("Inside of fetchDepartmentByName of Department Controller");
        return departmentService.fetchDepartmentByName(departmentName);

}
    @GetMapping("/departments/name/{name}")
    public Department findByDepartmentNameIgnoreCase(@PathVariable("name") String departmentName) {
        LOGGER.info("Inside of findByDepartmentNameIgnoreCase of Department Controller");
        return departmentService.findByDepartmentNameIgnoreCase(departmentName);
    }
//    private DepartmentService departmentService;
//    @PostMapping("/departments")
//    public Department saveDepartment(@RequestBody Department department){
//        return departmentService.saveDepartment(department);
//
//    }
}
