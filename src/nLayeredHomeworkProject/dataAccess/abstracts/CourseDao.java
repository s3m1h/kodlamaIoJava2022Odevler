package nLayeredHomeworkProject.dataAccess.abstracts;

import java.util.List;

import nLayeredHomeworkProject.entities.Course;

public interface CourseDao {
	List<Course> getAll();
	void add(Course course);
}
