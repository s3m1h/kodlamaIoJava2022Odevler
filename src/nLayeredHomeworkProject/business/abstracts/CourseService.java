package nLayeredHomeworkProject.business.abstracts;

import java.util.List;

import nLayeredHomeworkProject.entities.Course;

public interface CourseService {
	List<Course> getAll();
	void add(Course course) throws Exception;
}
