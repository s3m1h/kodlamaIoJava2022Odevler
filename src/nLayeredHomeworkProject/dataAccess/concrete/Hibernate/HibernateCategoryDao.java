package nLayeredHomeworkProject.dataAccess.concrete.Hibernate;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomeworkProject.dataAccess.abstracts.CategoryDao;
import nLayeredHomeworkProject.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	List<Category> categories;
	
	public HibernateCategoryDao() {
		categories = new ArrayList<>();
		categories.add(new Category(0,"mobil"));
		categories.add(new Category(1,"masaüstü"));
		categories.add(new Category(2,"web"));
		categories.add(new Category(3,"network"));
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println(category.getName() + " kategorisi eklendi..");
		
	}

}
