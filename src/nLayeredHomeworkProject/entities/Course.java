package nLayeredHomeworkProject.entities;

public class Course {
	private int Id;
	private String name;
	private String CategoryName;
	private String EducatorName;
	private String Description;
	private String CreateDate;
	private int price;
	public Course() {

	}
	public Course(
			int id,
			String name,
			String categoryName,
			String educatorName,
			String description,
			String createDate,
			int price) {
		super();
		this.Id = id;
		this.name = name;
		this.CategoryName = categoryName;
		this.Description = description;
		this.CreateDate = createDate;
		this.EducatorName = educatorName;
		this.price = price;
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getEducatorName() {
		return EducatorName;
	}
	public void setEducatorName(String educatorName) {
		EducatorName = educatorName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		price = price;
	}
	
}
