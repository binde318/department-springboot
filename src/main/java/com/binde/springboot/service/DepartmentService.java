package com.binde.springboot.service;

import com.binde.springboot.entity.Department;
import org.hibernate.boot.model.internal.DelayedParameterizedTypeBean;

import java.util.List;

public interface DepartmentService {
   public Department createDepartment(Department department);
//   public Department saveDepartment(Department department);
   public List<Department>fetchDepartmentList();

  public Department fetchDepartmentById(Long departmentId);

  public void deleteDepartmentById(Long departmentId);
  public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);

   Department findByDepartmentNameIgnoreCase(String departmentName);
}
