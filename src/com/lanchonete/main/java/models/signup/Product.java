package models.signup;

/*
 * Classe Product - Lanchonete
 * Bruna Lacerda
 * Criado dia 06/1/13
 * 
 */

public class Product {

	private int id;
	private String name;
	private Category category;
	private Unity unity;
	private double price;
	private String description;
	
	
	/*
	 * Construtores da classe Product
	 */
	
	public Product (int id, String name ){
		
	}
	
	public Product (int id, String name, Category category, double price, String descrition){
		
	}
	
	public Product (int id, String name, Category category, double price){
		
	}
	
	public Product (int id, String name, Category category){
		
	}
	
	/*
	 * Fim construtores
	 */
	
	/*
	 * Métodos Getters e Setters
	 */
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Unity getUnity() {
		return unity;
	}
	
	public void setUnity(Unity unity) {
		this.unity = unity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	/*
	 * Fim Métodos Getters e Setters
	 */
	
	
}
