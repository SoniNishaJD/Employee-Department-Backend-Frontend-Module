package com.nishasoni.emsbackend.mapper;

import com.nishasoni.emsbackend.dto.DepartmentDto;
import com.nishasoni.emsbackend.entity.Department;
import com.nishasoni.emsbackend.entity.Employee;

public class DepartmentMapper {

    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
