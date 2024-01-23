package homework.employee;

public class User extends Employee {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
