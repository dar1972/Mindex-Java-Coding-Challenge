package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService{

    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureServiceImpl.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ReportingStructure read(String employeeId) {
        LOG.debug("Reading reportingStructure with employeeId: [{}]", employeeId);

        Employee employee = employeeService.read(employeeId);
        int totalReports = employeeService.getNumberOfReports(employeeId);

        LOG.info("Total Number of reports: " + totalReports);
        return new ReportingStructure(employee, totalReports);
    }
}