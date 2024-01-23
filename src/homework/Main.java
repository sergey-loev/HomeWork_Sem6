package homework;

import homework.actions.UserPersister;
import homework.actions.UserReporter;
import homework.employee.Employee;
import homework.employee.User;

public class Main{
    public static void main(String[] args){
        Employee user = new User("Bob");
        UserReporter ur = new UserReporter();
        ur.report((User) user);
        UserPersister up = new UserPersister();
        up.save((User) user);
    }
}