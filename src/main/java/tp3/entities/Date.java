package tp3.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Date {
private Long day;

private Long month;

private Long year;

public Long getDay() {
	return day;
}

public void setDay(Long day) {
	this.day = day;
}

public Long getMonth() {
	return month;
}

public void setMonth(Long month) {
	this.month = month;
}

public Long getYear() {
	return year;
}

public void setYear(Long year) {
	this.year = year;
}

public Date(Long day, Long month, Long year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

@Override
public String toString() {
	return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
}


}
