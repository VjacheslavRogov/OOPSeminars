package ru.geekbrains.oop.oop3.cw.z3;

public class Answer {
    Integer bull;
    Integer cow;
    int numTry;

    public Answer(Integer bull, Integer cow, int numTry) {
        this.bull = bull;
        this.cow = cow;
        this.numTry = numTry;
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    public int getNumTry() {
        return numTry;
    }

    public void setNumTry(int numTry) {
        this.numTry = numTry;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "bull=" + bull +
                ", cow=" + cow +
                ", numTry=" + numTry +
                '}';
    }
}
