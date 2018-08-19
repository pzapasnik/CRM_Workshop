package pl.coderslab.crm_workshop.Entity;

import org.hibernate.validator.constraints.Email;
import pl.coderslab.crm_workshop.Enum.UserType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String firstName;

    private String lastName;

    private String passworld;

    @Email
    private String email;

    private UserType userType;

    @OneToMany(mappedBy = "menager")
    private List<Project> menagedProjects;

    @ManyToMany(mappedBy = "projectWorkers")
    private List<Project> workedOnProjects;

    @OneToMany(mappedBy = "worker")
    private List<Task> tasks;


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Project> getMenagedProjects() {
        return menagedProjects;
    }

    public void setMenagedProjects(List<Project> menagedProjects) {
        this.menagedProjects = menagedProjects;
    }

    public List<Project> getWorkedOnProjects() {
        return workedOnProjects;
    }

    public void setWorkedOnProjects(List<Project> workedOnProjects) {
        this.workedOnProjects = workedOnProjects;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
