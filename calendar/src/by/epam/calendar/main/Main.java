package by.epam.calendar.main;

import java.util.List;

import by.epam.calendar.entity.*;
import by.epam.calendar.entity.Calendar.Holiday;
import by.epam.calendar.entity.Calendar.Weekend;
import by.epam.calendar.logic.*;
import by.epam.calendar.view.*;

/*Создать класс Календарь с внутренним классом с помощью объектов которого можно хранить информацию о праздничных
 * и выходных днях.*/

public class Main {

	public static void main(String[] args) {

		Calendar calendar2021 = new Calendar();
		CalendarLogic logic = new CalendarLogic();
		CalendarView view = new CalendarView();

		calendar2021.addMonth(new Month("Январь", 31));
		calendar2021.addMonth(new Month("Февраль", 28));
		calendar2021.addMonth(new Month("Март", 31));
		calendar2021.addMonth(new Month("Апрель", 30));
		calendar2021.addMonth(new Month("Май", 31));
		calendar2021.addMonth(new Month("Июнь", 30));
		calendar2021.addMonth(new Month("Июль", 31));
		calendar2021.addMonth(new Month("Август", 31));
		calendar2021.addMonth(new Month("Сентябрь", 30));
		calendar2021.addMonth(new Month("Октябрь", 31));
		calendar2021.addMonth(new Month("Ноябрь", 30));
		calendar2021.addMonth(new Month("Декабрь", 31));

		calendar2021.addHolliday(new Holiday("Январь", 1, "Пятница"));
		calendar2021.addHolliday(new Holiday("Январь", 2, "Суббота"));
		calendar2021.addHolliday(new Holiday("Январь", 7, "Четверг"));
		calendar2021.addHolliday(new Holiday("Март", 8, "Понедельник"));
		calendar2021.addHolliday(new Holiday("Май", 1, "Суббота"));
		calendar2021.addHolliday(new Holiday("Май", 2, "Воскресенье"));
		calendar2021.addHolliday(new Holiday("Май", 9, "Воскресенье"));
		calendar2021.addHolliday(new Holiday("Май", 11, "Вторник"));
		calendar2021.addHolliday(new Holiday("Июль", 3, "Суббота"));
		calendar2021.addHolliday(new Holiday("Ноябрь", 7, "Воскресенье"));
		calendar2021.addHolliday(new Holiday("Декабрь", 25, "Суббота"));

		List<Integer> januaryWeekend;
		januaryWeekend = logic.januaryWeekend(calendar2021.getMonths().get(0));
		List<Integer> februaryWeekend;
		februaryWeekend = logic.februaryWeekend(calendar2021.getMonths().get(1));
		List<Integer> marchWeekend;
		marchWeekend = logic.februaryWeekend(calendar2021.getMonths().get(2));
		List<Integer> aprilWeekend;
		aprilWeekend = logic.aprilWeekend(calendar2021.getMonths().get(3));
		List<Integer> mayWeekend;
		mayWeekend = logic.mayWeekend(calendar2021.getMonths().get(4));
		List<Integer> juneWeekend;
		juneWeekend = logic.juneWeekend(calendar2021.getMonths().get(5));
		List<Integer> julyWeekend;
		julyWeekend = logic.aprilWeekend(calendar2021.getMonths().get(6));
		List<Integer> augustWeekend;
		augustWeekend = logic.augustWeekend(calendar2021.getMonths().get(7));
		List<Integer> septemberWeekend;
		septemberWeekend = logic.septemberWeekend(calendar2021.getMonths().get(8));
		List<Integer> octoberWeekend;
		octoberWeekend = logic.januaryWeekend(calendar2021.getMonths().get(9));
		List<Integer> novemberWeekend;
		novemberWeekend = logic.februaryWeekend(calendar2021.getMonths().get(10));
		List<Integer> decemberWeekend;
		decemberWeekend = logic.septemberWeekend(calendar2021.getMonths().get(11));

		calendar2021.addWeekend(new Weekend("Январь", januaryWeekend));
		calendar2021.addWeekend(new Weekend("Февраль", februaryWeekend));
		calendar2021.addWeekend(new Weekend("Март", marchWeekend));
		calendar2021.addWeekend(new Weekend("Апрель", aprilWeekend));
		calendar2021.addWeekend(new Weekend("Май", mayWeekend));
		calendar2021.addWeekend(new Weekend("Июнь", juneWeekend));
		calendar2021.addWeekend(new Weekend("Июль", julyWeekend));
		calendar2021.addWeekend(new Weekend("Август", augustWeekend));
		calendar2021.addWeekend(new Weekend("Сентябрь", septemberWeekend));
		calendar2021.addWeekend(new Weekend("Октябрь", octoberWeekend));
		calendar2021.addWeekend(new Weekend("Ноябрь", novemberWeekend));
		calendar2021.addWeekend(new Weekend("Декабрь", decemberWeekend));

		view.print(calendar2021);

	}

}
