/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laila
 */
@Entity
@Table(name = "TRANSACTIONBEVERAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transactionbeverage.findAll", query = "SELECT t FROM Transactionbeverage t")
    , @NamedQuery(name = "Transactionbeverage.findByTransaction", query = "SELECT t FROM Transactionbeverage t WHERE t.transactionbeveragePK.transaction = :transaction")
    , @NamedQuery(name = "Transactionbeverage.findByBeverage", query = "SELECT t FROM Transactionbeverage t WHERE t.transactionbeveragePK.beverage = :beverage")
    , @NamedQuery(name = "Transactionbeverage.findByQuantity", query = "SELECT t FROM Transactionbeverage t WHERE t.quantity = :quantity")
    , @NamedQuery(name = "Transactionbeverage.findByDescription", query = "SELECT t FROM Transactionbeverage t WHERE t.description = :description")})
public class Transactionbeverage implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransactionbeveragePK transactionbeveragePK;
    @Basic(optional = false)
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "BEVERAGE", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Beverages beverages;
    @JoinColumn(name = "TRANSACTION", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Transaction1 transaction1;

    public Transactionbeverage() {
    }

    public Transactionbeverage(TransactionbeveragePK transactionbeveragePK) {
        this.transactionbeveragePK = transactionbeveragePK;
    }

    public Transactionbeverage(TransactionbeveragePK transactionbeveragePK, Integer quantity) {
        this.transactionbeveragePK = transactionbeveragePK;
        this.quantity = quantity;
    }

    public Transactionbeverage(String transaction, String beverage) {
        this.transactionbeveragePK = new TransactionbeveragePK(transaction, beverage);
    }

    public TransactionbeveragePK getTransactionbeveragePK() {
        return transactionbeveragePK;
    }

    public void setTransactionbeveragePK(TransactionbeveragePK transactionbeveragePK) {
        this.transactionbeveragePK = transactionbeveragePK;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Transactionbeverage(Integer quantity, String description) {
        this.quantity = quantity;
        this.description = description;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Beverages getBeverages() {
        return beverages;
    }

    public void setBeverages(Beverages beverages) {
        this.beverages = beverages;
    }

    public Transaction1 getTransaction1() {
        return transaction1;
    }

    public void setTransaction1(Transaction1 transaction1) {
        this.transaction1 = transaction1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionbeveragePK != null ? transactionbeveragePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactionbeverage)) {
            return false;
        }
        Transactionbeverage other = (Transactionbeverage) object;
        if ((this.transactionbeveragePK == null && other.transactionbeveragePK != null) || (this.transactionbeveragePK != null && !this.transactionbeveragePK.equals(other.transactionbeveragePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ojdbcexercise.models.Transactionbeverage[ transactionbeveragePK=" + transactionbeveragePK + " ]";
    }
    
}
