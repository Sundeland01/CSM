package csm.springgradle.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

enum typeOfCategory {
    Theft,
    Robbery,
    Burglary,
    Suspicious_Activity,
    Vandalism,
    Drugs,
    Abuse,
    Fighting
}

@Entity
@Table(name="Ticket")
public class Ticket {

    @Id
    @GeneratedValue
    private int ticketId;
    private Date ticketDate;
    private typeOfCategory category;
    private Date dateOfHappening;
    private String location;
    private String message;

    @Embedded
    private Neighborhood neighborhood;
    @Embedded
    private User neighborhoodRepresentative;

    public Ticket(){

    }

    public int getTicketById() {
        return ticketId;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public typeOfCategory getCategory() {
        return category;
    }

    public Date getDateOfHappening() {
        return dateOfHappening;
    }

    public String getLocation() {
        return location;
    }

    public String getMessage() {
        return message;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public void setCategory(typeOfCategory category) {
        this.category = category;
    }

    public void setDateOfHappening(Date dateOfHappening) {
        this.dateOfHappening = dateOfHappening;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public User getNeighborhoodRepresentative() {
        return neighborhoodRepresentative;
    }

    public void setNeighborhoodRepresentative(User user) {
        this.neighborhoodRepresentative = user;
    }
}
