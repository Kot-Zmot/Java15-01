package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    @Test
    public void shouldSearchByCityNames() {

        Repo repo = new Repo();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket01 = new Ticket(01, 1500, "MSC", "SPB", 300);
        Ticket ticket02 = new Ticket(02, 1100, "MSC", "SPB", 300);
        Ticket ticket03 = new Ticket(03, 1200, "MSC", "SPB", 400);
        Ticket ticket04 = new Ticket(04, 1300, "MRM", "KZN", 430);
        Ticket ticket05 = new Ticket(05, 1500, "MSC", "SPB", 300);

        manager.save(ticket01);
        manager.save(ticket02);
        manager.save(ticket03);
        manager.save(ticket04);
        manager.save(ticket05);

        Ticket[] actual = manager.findAll("MSC", "SPB");
        Ticket[] expected = {ticket02, ticket03, ticket01, ticket05};

        Assertions.assertArrayEquals(actual, expected);
    }

//    @Test
//    public void shouldDontSearchCityNames() {
//
//        Repo repo = new Repo();
//        TicketManager manager = new TicketManager(repo);
//        Ticket ticket01 = new Ticket(01, 1500, "MSC", "SPB", 300);
//        Ticket ticket02 = new Ticket(02, 1100, "MSC", "SPB", 300);
//        Ticket ticket03 = new Ticket(03, 1200, "MSC", "SPB", 400);
//        Ticket ticket04 = new Ticket(04, 1300, "MRM", "KZN", 430);
//        Ticket ticket05 = new Ticket(05, 1500, "MSC", "SPB", 300);
//
//        manager.save(ticket01);
//        manager.save(ticket02);
//        manager.save(ticket03);
//        manager.save(ticket04);
//        manager.save(ticket05);
//
//        Ticket[] actual = manager.findAll("TVR", "VLG");
//        Ticket[] expected = {null};
//
//        Assertions.assertArrayEquals(actual, expected);
//    }

}
