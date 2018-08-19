package pl.coderslab.crm_workshop.Entity;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class TaskStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean activity;

    private Integer sort;

    public TaskStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
