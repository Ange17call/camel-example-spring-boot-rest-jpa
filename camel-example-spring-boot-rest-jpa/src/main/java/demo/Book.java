package demo;

import javax.persistence.*;


/**
 * The persistent class for the books database table.
 * 
 */
@Entity
@Table(name="books")
public class Book {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idbooks;
	
	private String item;

	private String description;

	public Integer getIdbooks() {
		return this.idbooks;
	}

	public void setIdbooks(Integer idbooks) {
		this.idbooks = idbooks;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}