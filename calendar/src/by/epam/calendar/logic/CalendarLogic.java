package by.epam.calendar.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.calendar.entity.*;

public class CalendarLogic {

	public List<Integer> januaryWeekend(Month month) {
		List<Integer> weekend = new ArrayList<Integer>();

		weekend.add(2);
		weekend.add(3);
		for (int i = 4; i < month.getDays(); i++) {
			i = i + 5;
			weekend.add(i);
			i = i + 1;
			weekend.add(i);
		}
		return weekend;
	}

	public List<Integer> februaryWeekend(Month month) {
		List<Integer> weekend = new ArrayList<Integer>();

		for (int i = 1; i < month.getDays(); i++) {
			if (i + 5 > month.getDays()) {
				break;
			}
			i = i + 5;
			weekend.add(i);
			i = i + 1;
			weekend.add(i);
		}
		return weekend;
	}

	public List<Integer> aprilWeekend(Month month) {
		List<Integer> weekend = new ArrayList<Integer>();

		weekend.add(3);
		weekend.add(4);
		for (int i = 5; i < month.getDays(); i++) {
			if (i + 5 > month.getDays()) {
				break;
			}
			i = i + 5;
			weekend.add(i);
			if (i + 1 > month.getDays()) {
				break;
			}
			i = i + 1;
			weekend.add(i);

		}
		return weekend;
	}

	public List<Integer> mayWeekend(Month month) {
		List<Integer> weekend = new ArrayList<Integer>();

		weekend.add(1);
		weekend.add(2);
		for (int i = 3; i < month.getDays(); i++) {
			if (i + 5 > month.getDays()) {
				break;
			}
			i = i + 5;
			weekend.add(i);
			i = i + 1;
			weekend.add(i);
		}
		return weekend;
	}

	public List<Integer> juneWeekend(Month month) {
		List<Integer> weekend = new ArrayList<Integer>();

		for (int i = 0; i < month.getDays(); i++) {
			if (i + 5 > month.getDays()) {
				break;
			}
			i = i + 5;
			weekend.add(i);
			i = i + 1;
			weekend.add(i);
		}
		return weekend;
	}

	public List<Integer> augustWeekend(Month month) {
		List<Integer> weekend = new ArrayList<Integer>();

		weekend.add(1);

		for (int i = 2; i < month.getDays(); i++) {
			if (i + 5 > month.getDays()) {
				break;
			}
			i = i + 5;
			weekend.add(i);
			i = i + 1;
			weekend.add(i);
		}
		return weekend;
	}

	public List<Integer> septemberWeekend(Month month) {
		List<Integer> weekend = new ArrayList<Integer>();

		weekend.add(4);
		weekend.add(5);
		for (int i = 6; i < month.getDays(); i++) {
			if (i + 5 > month.getDays()) {
				break;
			}
			i = i + 5;
			weekend.add(i);
			i = i + 1;
			weekend.add(i);
		}
		return weekend;
	}
}
