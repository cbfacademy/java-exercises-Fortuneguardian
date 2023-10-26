package com.cbfacademy;

public class Year {
    private final Integer year;

    public Year(Integer year) {
        this.year = year;
    }

    public Boolean isYear() {
        if (this.year % 400 == 0)
            return true;
        if (this.year % 100 == 0)
            return false;
        return (this.year % 4 == 0);
    }
}
