package nLayeredHomeworkProject.dataAccess.abstracts;

import java.util.List;

import nLayeredHomeworkProject.entities.Category;

public interface CategoryDao {
	List<Category> getAll();
	void add(Category category);
	
}
