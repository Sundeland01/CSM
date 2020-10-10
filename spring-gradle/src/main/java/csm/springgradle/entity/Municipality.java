package csm.springgradle.entity;

import javax.persistence.*;

import javax.persistence.Entity;


@Entity
@Table(name="Municipality")
public class Municipality {

    @Id
    @GeneratedValue
    private int municipalityId;
    private String municipalityName;

    public Municipality(){

    }

    public int getId() {
        return municipalityId;
    }

    public String getName() {
        return municipalityName;
    }

    public void setName(String name) {
        this.municipalityName = name;
    }


}
