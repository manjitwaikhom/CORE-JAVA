package com.immutable;

import java.util.Date;

public class ImmutableWithDateObject {

	public static void main(String[] args) {
		// Attack the internals of a Period instance
		Date start = new Date();
		Date end = new Date();
		Period p = new Period(start, end);
		end.setYear(2001); // Modifies internals of p! if constructor doesn't
							// make copies using new operator.
		p.getEnd().setYear(2001); // Modifies internals of p! if no clone in
									// getEnd/getStart method
		System.out.println(p);

	}

}

final class Period {
	private final Date start;
	private final Date end;

	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());

		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(start + "start after end" + end);
	}

	public Date getStart() {
		return (Date) start.clone();
	}

	public Date getEnd() {
		return (Date) end.clone();
	}

	@Override
	public String toString() {
		return "Period [start=" + start + ", end=" + end + "]";
	}

}
