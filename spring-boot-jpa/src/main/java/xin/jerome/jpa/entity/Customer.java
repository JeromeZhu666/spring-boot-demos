package xin.jerome.jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * 顾客
 *
 * @author Jerome Zhu
 * @since 2018.08.29 17:42
 */
@Entity
@Access(value = AccessType.FIELD)
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 40)
    private String name;

    @OneToOne(cascade = CascadeType.REMOVE)
    private CreditCard creditCard;

    @OneToMany
    private List<Store> stores;

    @ManyToMany
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
