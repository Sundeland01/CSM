package csm.springgradle.service;

import csm.springgradle.entity.Ticket;
import csm.springgradle.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository repository;

    // post method
    public Ticket saveTicket(Ticket ticket){
        return repository.save(ticket);
    }

    // get methods
    public Ticket getTicketByID(int id) {
        return repository.findById(id).orElse(null);
    }

    // delete method
    public String deleteTicket(int id) {
        repository.deleteById(id);
        return "Ticket deleted" + id;
    }

    // update method
    public Ticket updateTicket(Ticket ticket) {
        Ticket existingTicket=repository.findById(ticket.getTicketById()).orElse(null);
        existingTicket.setTicketDate(ticket.getTicketDate());
        existingTicket.setCategory(ticket.getCategory());
        existingTicket.setDateOfHappening(ticket.getDateOfHappening());
        existingTicket.setLocation(ticket.getLocation());
        existingTicket.setMessage(ticket.getMessage());
        existingTicket.setNeighborhood(ticket.getNeighborhood());
        existingTicket.setNeighborhoodRepresentative(ticket.getNeighborhoodRepresentative());
        return repository.save(existingTicket);
    }

    // all
    public List<Ticket> saveTicket(List<Ticket> tickets) { return repository.saveAll(tickets);}
}
