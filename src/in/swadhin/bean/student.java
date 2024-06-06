package in.swadhin.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {
	@Value("swdhin")
	private String name;
	@Value("101")
	private String rollno;
	@Value("97")
	private String mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public void display()
	{
		System.out.println("name is :"+name);
		System.out.println("roll no is :"+rollno);
		System.out.println("mark is :"+mark);
	}
}
