package homework.actions;

import homework.employee.User;

public class UserReporter implements Reportable<User> {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
