package com.mindex.challenge.data;

import java.util.Objects;

public class ReportingStructure {
    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(Employee employee, int numOfEmployees) {
        this.employee = employee;
        this.numberOfReports = numOfEmployees;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNumOfReports() {
        return this.numberOfReports;
    }

    public void setNumOfReports(int numberOfEmployees) {
        this.numberOfReports = numberOfEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this || (!(o instanceof ReportingStructure))) return false;
        ReportingStructure reportStructure = (ReportingStructure) o;
        return getEmployee().equals(reportStructure.getEmployee()) && getNumOfReports() == reportStructure.getNumOfReports();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee(), getNumOfReports());
    }

    @Override
    public String toString() {
        return "ReportingStructure {" +
                "employee=" + getEmployee() +
                ", numberOfEmployees=" + getNumOfReports() +
                '}';
    }
}