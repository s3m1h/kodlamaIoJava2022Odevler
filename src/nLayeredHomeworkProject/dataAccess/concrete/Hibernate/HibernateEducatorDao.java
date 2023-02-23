package nLayeredHomeworkProject.dataAccess.concrete.Hibernate;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomeworkProject.dataAccess.abstracts.EducatorDao;
import nLayeredHomeworkProject.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{
	List<Educator> educators;
	public HibernateEducatorDao() {
		educators = new ArrayList<>();
		educators.add(new Educator(0,"semih", "acar"));
		educators.add(new Educator(1,"engin", "demiroğ"));
		educators.add(new Educator(2,"ayşe", "acer"));
		educators.add(new Educator(3,"ahmet", "acer"));
	}
	@Override
	public List<Educator> getAll() {
		// TODO Auto-generated method stub
		return educators;
	}

	@Override
	public void add(Educator educator) {
		educators.add(educator);
		System.out.println(
				educator.getFirstName() + " " +
				educator.getLastName() + " " +
				"eğitmeni eklendi..."
				);
		
	}

}
