package com.example.adjustmenttestlibrary;

public class MatchBoundary {
    private Person p1;
    private Person p2;

    public MatchBoundary(Person p1, Person p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Person getP1() {
        return p1;
    }

    public MatchBoundary setP1(Person p1) {
        this.p1 = p1;
        return this;
    }

    public Person getP2() {
        return p2;
    }

    public MatchBoundary setP2(Person p2) {
        this.p2 = p2;
        return this;
    }
}
