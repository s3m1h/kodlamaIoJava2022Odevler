package nLayeredHomeworkProject.business.abstracts;

import java.util.List;

import nLayeredHomeworkProject.entities.Category;

public interface CategoryService {
	List<Category> getAll();
	void add(Category category) throws Exception;
}
