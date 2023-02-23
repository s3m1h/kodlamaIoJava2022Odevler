package nLayeredHomeworkProject.dataAccess.abstracts;

import java.util.List;

import nLayeredHomeworkProject.entities.Educator;

public interface EducatorDao {
	List<Educator> getAll();
	void add(Educator educator);
}
