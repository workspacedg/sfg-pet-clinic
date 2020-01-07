package alexdiaz.springframework.sfgpetclinic.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public Speciality setDescription(String description) {
        this.description = description;
        return this;
    }
}
