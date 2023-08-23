package SistemaTicket;

import java.util.ArrayList;


public class AdminLista {
    private ArrayList<AdminTicket> ticket;

    public AdminLista(ArrayList<AdminTicket> ticket) {
        this.ticket = ticket;
    }

    
    public ArrayList<AdminTicket> getTicket() {
        return ticket;
    }

    public void setTicket(ArrayList<AdminTicket> ticket) {
        this.ticket = ticket;
    }  
    
    public void addTicket(AdminTicket ticket){
        this.ticket.add(ticket);
    }
    
    public void deleteTicket(AdminTicket ticket){
        this.ticket.remove(ticket);
    }
    
    public void searchTicket(AdminTicket ticket){
       
    }
}
