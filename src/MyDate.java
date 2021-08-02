class MyDate {

    private int day;
    private int month;
    private int year;

    // Write the missing constructor here


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object obj) {
        boolean result = false;

        if (this.getClass() == obj.getClass()) {
            if(this.day == ((MyDate)obj).day & this.month == ((MyDate)obj).month & this.year == ((MyDate)obj).year) {
                result = true;
            }
        }

        return result;
    }
}