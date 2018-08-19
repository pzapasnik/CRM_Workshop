package pl.coderslab.crm_workshop.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.URL;
import pl.coderslab.crm_workshop.Abstract.User;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private Data created;

    private String name;

    private String description;

    @URL
    private String url;

    private String identifier;

    private List<Worker> Projectworkers;

    private Menager projectMenager;

    boolean activity;

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getCreated() {
        return created;
    }

    public void setCreated(Data created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<Worker> getProjectworkers() {
        return Projectworkers;
    }

    public void setProjectworkers(List<Worker> projectworkers) {
        Projectworkers = projectworkers;
    }

    public Menager getProjectMenager() {
        return projectMenager;
    }

    public void setProjectMenager(Menager projectMenager) {
        this.projectMenager = projectMenager;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }
}
