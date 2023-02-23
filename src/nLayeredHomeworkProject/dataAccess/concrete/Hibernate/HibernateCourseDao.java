package nLayeredHomeworkProject.dataAccess.concrete.Hibernate;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomeworkProject.dataAccess.abstracts.CourseDao;
import nLayeredHomeworkProject.entities.Course;

public class HibernateCourseDao implements CourseDao{

	List<Course> courses;
	
	public HibernateCourseDao() {
		courses = new ArrayList<>();
		courses.add(new Course(0,"kotlin programlama","mobil","semih","kotlin programlama eğitimi", "2-23-2023",25));
		courses.add(new Course(1,"c# programlama","masaüstü","ahmet","csharp programlama eğitimi", "2-23-2023",25));
		courses.add(new Course(2,"php programlama","web","engin","php programlama eğitimi", "2-23-2023",25));
		courses.add(new Course(3,"java programlama","mobil","ayşe","mobil programlama eğitimi", "2-23-2023",25));
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return this.courses;
	}

	@Override
	public void add(Course course) {
		this.courses.add(course);
		System.out.println(course.getDescription() + " eklendi..");
		
	}

}
