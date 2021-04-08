package by.epam.calendar.entity;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private List<Month> months;
	private List<Holiday> holidays;
	private List<Weekend> weekends;

	{
		months = new ArrayList<Month>();
		holidays = new ArrayList<Holiday>();
		weekends = new ArrayList<Weekend>();
	}

	public Calendar() {

	}

	public void addMonth(Month month) {
		months.add(month);
	}

	public void addHolliday(Holiday holiday) {
		holidays.add(holiday);
	}

	public void addWeekend(Weekend weekend) {
		weekends.add(weekend);
	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	public List<Weekend> getWeekends() {
		return weekends;
	}

	public void setWeekends(List<Weekend> weekends) {
		this.weekends = weekends;
	}

	public static class Holiday {
		private String month;
		private int day;
		private String dayOfWeek;

		public Holiday(String month, int day, String dayOfWeek) {
			super();
			this.month = month;
			this.day = day;
			this.dayOfWeek = dayOfWeek;
		}

		public Holiday() {

		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public String getDayOfWeek() {
			return dayOfWeek;
		}

		public void setDayOfWeek(String dayOfWeek) {
			this.dayOfWeek = dayOfWeek;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + day;
			result = prime * result + ((month == null) ? 0 : month.hashCode());
			result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Holiday other = (Holiday) obj;
			if (day != other.day)
				return false;
			if (month == null) {
				if (other.month != null)
					return false;
			} else if (!month.equals(other.month))
				return false;
			if (dayOfWeek == null) {
				if (other.dayOfWeek != null)
					return false;
			} else if (!dayOfWeek.equals(other.dayOfWeek))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return " [мес€ц=" + month + ", число=" + day + ", день недели=" + dayOfWeek + "]";
		}
	}

	public static class Weekend {
		private String month;
		private List<Integer> days;

		public Weekend(String month, List<Integer> days) {
			super();
			this.month = month;
			this.days = days;
		}

		public Weekend() {

		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public List<Integer> getDays() {
			return days;
		}

		public void setDays(List<Integer> days) {
			this.days = days;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((days == null) ? 0 : days.hashCode());
			result = prime * result + ((month == null) ? 0 : month.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Weekend other = (Weekend) obj;
			if (days == null) {
				if (other.days != null)
					return false;
			} else if (!days.equals(other.days))
				return false;
			if (month == null) {
				if (other.month != null)
					return false;
			} else if (!month.equals(other.month))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return " [мес€ц=" + month + ", число=" + days + "]";
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((holidays == null) ? 0 : holidays.hashCode());
		result = prime * result + ((months == null) ? 0 : months.hashCode());
		result = prime * result + ((weekends == null) ? 0 : weekends.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (holidays == null) {
			if (other.holidays != null)
				return false;
		} else if (!holidays.equals(other.holidays))
			return false;
		if (months == null) {
			if (other.months != null)
				return false;
		} else if (!months.equals(other.months))
			return false;
		if (weekends == null) {
			if (other.weekends != null)
				return false;
		} else if (!weekends.equals(other.weekends))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [months=" + months + ", holidays=" + holidays + ", weekends=" + weekends + "]";
	}

}
