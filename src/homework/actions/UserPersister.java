package homework.actions;

import homework.employee.User;

public class UserPersister implements Saveable<User> {

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
