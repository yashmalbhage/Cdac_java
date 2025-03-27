package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Email implements Comparable<Email> {
	private long mailid;
	private String from;
	private String subject;
	private String body;
	private LocalDateTime rec_time;
	public Email(long mailid, String from, String subject, String body, LocalDateTime rec_time) {
		super();
		this.mailid = mailid;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time=rec_time;
		
	}
	@Override
	public String toString() {
		return "Email [mailid=" + mailid + ", from=" + from + ", subject=" + subject + ", body=" + body + ", rec_time="
				+ rec_time + "]";
	}
	@Override
	public int compareTo(Email o) {
		int diff = o.rec_time.compareTo(this.rec_time);
	
		return diff;
	}
	
	
}
