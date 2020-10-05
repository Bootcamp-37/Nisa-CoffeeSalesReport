/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.models;

import java.io.Serializable;
import java.sql.Date;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Laila
 */
@Entity
@Table(name = "TRANSACTION1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaction1.findAll", query = "SELECT t FROM Transaction1 t")
    , @NamedQuery(name = "Transaction1.findById", query = "SELECT t FROM Transaction1 t WHERE t.id = :id")
    , @NamedQuery(name = "Transaction1.findByOrderdate", query = "SELECT t FROM Transaction1 t WHERE t.orderdate = :orderdate")})
public class Transaction1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "ORDERDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderdate;

    public Transaction1(Date orderdate, Employee1 employee) {
        this.orderdate = orderdate;
        this.employee = employee;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transaction1", fetch = FetchType.LAZY)
    private List<Transactionbeverage> transactionbeverageList;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee1 employee;

    public Transaction1() {
    }

    public Transaction1(String id, Employee1 employee) {
        this.id = id;
        this.employee = employee;
    }

    public Transaction1(String id, Date orderdate, Employee1 employee) {
        this.id = id;
        this.orderdate = orderdate;
        this.employee = employee;
    }

    public Transaction1(String id) {
        this.id = id;
    }

    public Transaction1(String id, Date orderdate) {
        this.id = id;
        this.orderdate = orderdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    @XmlTransient
    public List<Transactionbeverage> getTransactionbeverageList() {
        return transactionbeverageList;
    }

    public void setTransactionbeverageList(List<Transactionbeverage> transactionbeverageList) {
        this.transactionbeverageList = transactionbeverageList;
    }

    public Employee1 getEmployee() {
        return employee;
    }

    public void setEmployee(Employee1 employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction1)) {
            return false;
        }
        Transaction1 other = (Transaction1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ojdbcexercise.models.Transaction1[ id=" + id + " ]";
    }
    
}
