package ru.netology;

import java.util.Arrays;

public class TicketManager {

    private Repo repo;

    public TicketManager(Repo repo) {
        this.repo = repo;
    }

    public void save(Ticket ticket) {
        repo.save(ticket);
    }

    // Поиск по аэропортам
    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.findAll()) {
            if (matches(ticket, from, to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    // Признак соответствия поисковому запросу
    public boolean matches(Ticket ticket, String from, String to) {
        if (!ticket.getFrom().equals(from)) {
            return false;
        }
        if (!ticket.getTo().equals(to)) {
            return false;
        }
        return true;
    }
}
