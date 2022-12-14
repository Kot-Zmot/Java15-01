package ru.netology;

public class Ticket implements Comparable<Ticket> {

    private int id;
    private int price;
    private String from; // Аэропорт отправления
    private String to; // Аэропорт назначения
    private int time;

    public Ticket(int id, int price, String from, String to, int time) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public int compareTo(Ticket rightTicket) {
        if (price == rightTicket.price) {
            return 0;
        }
        if (price < rightTicket.price) {
            return -1;
        }
        return 1;
    }
}
