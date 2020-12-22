
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        this.advance(1);
    }
    
    public void advance(int howManyDays) {
        int dayTotal = this.day + howManyDays;
        this.day += howManyDays % 30;
                    
        if (this.day > 30) {
            this.day -= 30;
        }
        if (dayTotal > 30) {
            this.month += dayTotal / 30;
            if (dayTotal % 30 == 0) {
                this.month--;
            }
        }
        if (this.month > 12) {
            this.year = this.year + this.month / 12;
            if (this.month % 12 == 0) {
                this.year--;
            }
            this.month -= 12;
        }
        
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        int newDay = this.day;
        int newMonth = this.month;
        int newYear = this.year;
        SimpleDate afterDate = new SimpleDate(newDay, newMonth, newYear);
        afterDate.advance(days);
        return afterDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
