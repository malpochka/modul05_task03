package by.epam.calendar.view;

import by.epam.calendar.entity.*;

public class CalendarView {

	public void print(Calendar c) {

		System.out.println("Календарь выходных дней в 2021 году: ");

		for (int i = 0; i < c.getWeekends().size(); i++) {
			System.out.println(c.getWeekends().get(i));
		}

		System.out.println();
		System.out.println("Календарь праздничных дней в 2021 году: ");

		for (int i = 0; i < c.getHolidays().size(); i++) {
			System.out.println(c.getHolidays().get(i));
		}
	}

}
