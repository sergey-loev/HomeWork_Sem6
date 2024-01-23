package homework.actions;

import homework.employee.Employee;

public interface Saveable <T extends Employee> {
    void save(T employee);
}
