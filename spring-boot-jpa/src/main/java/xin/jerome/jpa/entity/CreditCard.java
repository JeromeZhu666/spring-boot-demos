package xin.jerome.jpa.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 信用卡
 *
 * @author Jerome Zhu
 * @since 2018.08.29 17:43
 */
@Entity
@Table(name = "credit_cards")
public class CreditCard {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 120)
    private String number;

    @Column(name = "create_date")
    private Date createDate;

    @OneToOne(mappedBy = "creditCard")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
