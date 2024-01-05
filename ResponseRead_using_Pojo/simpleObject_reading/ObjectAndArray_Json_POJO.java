package simpleObject_reading;

import java.util.ArrayList;

public class ObjectAndArray_Json_POJO 
{
	private String name;
	private  int age;
	private ArrayList score_in_subjects;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList getScore_in_subjects() {
		return score_in_subjects;
	}
	public void setScore_in_subjects(ArrayList score_in_subjects) {
		this.score_in_subjects = score_in_subjects;
	}

}
