package demo;

import javax.persistence.*;

import org.apache.camel.component.jpa.Consumed;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQuery(name = "new-orders", query = "select order from Order order where order.processed = false")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idorders;

	private Integer amount;
	
	@ManyToOne
	private Book book;

	private Boolean processed;
	
	@Consumed
    public void setProcessed() {
        processed = true;
    }

	public Integer getIdorders() {
		return this.idorders;
	}

	public void setIdorders(Integer idorders) {
		this.idorders = idorders;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
