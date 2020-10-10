package csm.springgradle.controller;

import csm.springgradle.entity.Ticket;
import csm.springgradle.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketService service;

    // post
    @PostMapping("/addTicket")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return service.saveTicket(ticket);
    }

    // all
    public List<Ticket> addTicket(List<Ticket> tickets){
        return service.saveTicket(tickets);
    }

    // get
    @GetMapping("/ticketById/{id}")
    public Ticket findTicketById(@PathVariable int id){
        return service.getTicketByID(id);
    }

    // put
    @GetMapping("/ticketById")
    public Ticket updateTicket(@RequestBody Ticket ticket){
        return service.updateTicket(ticket);
    }

    // delete
    @DeleteMapping()
    public String deleteTicket(@PathVariable int id){
        return service.deleteTicket(id);
    }


}
