package csm.springgradle.entity;

import javax.persistence.*;
import java.util.List;

@Embeddable
@Entity
public class Neighborhood{

    @Id
    @GeneratedValue
    private int neighborhoodId;
    private String neighborhoodName;

    @Embedded
    private User neighborhoodRepresentative;


    public Neighborhood(){

    }

    public int getId() {
        return neighborhoodId;
    }

    public String getName() {
        return neighborhoodName;
    }

    public void setName(String name) {
        this.neighborhoodName = name;
    }








}
