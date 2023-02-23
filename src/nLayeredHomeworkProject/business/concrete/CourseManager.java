package nLayeredHomeworkProject.business.concrete;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomeworkProject.business.abstracts.CourseService;
import nLayeredHomeworkProject.core.logging.Logger;
import nLayeredHomeworkProject.dataAccess.abstracts.CourseDao;
import nLayeredHomeworkProject.entities.Course;

public class CourseManager implements CourseService{
	private CourseDao courseDao;
	private Logger[] loggers;
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	@Override
	public List<Course> getAll() {
		return courseDao.getAll();
	}

	@Override
	public void add(Course course) throws Exception {
		List courseNames = new ArrayList<>();
		for (var item : courseDao.getAll()) {
			courseNames.add(item.getName());
		}
		kursIsmiTekrarKontrolEt(course, courseNames);
		kursFiyatıSıfırdanKucukOlamaz(course);
		courseDao.add(course);
		
		for (var logger : loggers) {
			logger.log(course.getName());
		}
		
		
	}
	void kursIsmiTekrarKontrolEt(Course course, List courseNames) throws Exception {
		if(courseNames.contains(course.getName())) {
			throw new Exception("Kurs ismi tekrar edemez");
		}
	}
	void kursFiyatıSıfırdanKucukOlamaz(Course course) throws Exception {
		if(course.getPrice() < 0) {
			throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
		}
	}
	
	
}
