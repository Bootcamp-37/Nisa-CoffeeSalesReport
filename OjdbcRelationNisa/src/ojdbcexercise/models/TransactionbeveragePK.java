/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Laila
 */
@Embeddable
public class TransactionbeveragePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRANSACTION")
    private String transaction;
    @Basic(optional = false)
    @Column(name = "BEVERAGE")
    private String beverage;

    public TransactionbeveragePK() {
    }

    public TransactionbeveragePK(String transaction, String beverage) {
        this.transaction = transaction;
        this.beverage = beverage;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transaction != null ? transaction.hashCode() : 0);
        hash += (beverage != null ? beverage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionbeveragePK)) {
            return false;
        }
        TransactionbeveragePK other = (TransactionbeveragePK) object;
        if ((this.transaction == null && other.transaction != null) || (this.transaction != null && !this.transaction.equals(other.transaction))) {
            return false;
        }
        if ((this.beverage == null && other.beverage != null) || (this.beverage != null && !this.beverage.equals(other.beverage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ojdbcexercise.models.TransactionbeveragePK[ transaction=" + transaction + ", beverage=" + beverage + " ]";
    }
    
}
