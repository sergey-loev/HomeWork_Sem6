package homework.actions;

import homework.employee.Employee;

public interface Reportable <T extends Employee> {
    void report(T employee);
}
