package com.mindex.challenge.dao;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CompensationRepository extends MongoRepository<Compensation, String>{
    @Query(value = "{'employee.employeeId': ?0}")
    Compensation findCompensationByEmployee(Employee employee);
}