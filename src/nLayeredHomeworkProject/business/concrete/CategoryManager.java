package nLayeredHomeworkProject.business.concrete;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomeworkProject.business.abstracts.CategoryService;
import nLayeredHomeworkProject.core.logging.Logger;
import nLayeredHomeworkProject.dataAccess.abstracts.CategoryDao;
import nLayeredHomeworkProject.entities.Category;

public class CategoryManager implements CategoryService{
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryDao.getAll();
	}

	@Override
	public void add(Category category) throws Exception {
			List categoryNames = new ArrayList<>();
			for (var item : categoryDao.getAll()) {
				categoryNames.add(item.getName());
			}
			kategoriIsimTekrarKontrolEt(category,categoryNames);
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
		}
		
	void kategoriIsimTekrarKontrolEt(Category category, List<Category> items) throws Exception {
		if(items.contains(category.getName())) {
			throw new Exception("Kategori ismi tekrar edemez");
		}
	}
	
}
