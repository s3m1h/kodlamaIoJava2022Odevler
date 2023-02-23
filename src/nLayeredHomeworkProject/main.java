package nLayeredHomeworkProject;

import nLayeredHomeworkProject.business.concrete.CategoryManager;
import nLayeredHomeworkProject.business.concrete.CourseManager;
import nLayeredHomeworkProject.core.logging.DatabaseLogger;
import nLayeredHomeworkProject.core.logging.EmailLogger;
import nLayeredHomeworkProject.core.logging.Logger;
import nLayeredHomeworkProject.dataAccess.concrete.Hibernate.HibernateCategoryDao;
import nLayeredHomeworkProject.dataAccess.concrete.Hibernate.HibernateCourseDao;
import nLayeredHomeworkProject.entities.Category;
import nLayeredHomeworkProject.entities.Course;

public class main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers =  {new DatabaseLogger(), new EmailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		
		Category category1 = new Category(2,"web11");
		categoryManager.add(category1);
		
		Category category2 = new Category(2,"mobil");
		categoryManager.add(category2);
		
		var categories = categoryManager.getAll();
		
		for (Category category : categories) {
			System.out.println(category.getId() + category.getName());
		}
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(new Course(5,"C programlama","masaüstü","semih","c programlama eğitimi","2-23-2023",25));
	}

}
