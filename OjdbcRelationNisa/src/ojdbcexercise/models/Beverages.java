/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.models;

import java.io.Serializable;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Laila
 */
@Entity
@Table(name = "BEVERAGES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beverages.findAll", query = "SELECT b FROM Beverages b")
    , @NamedQuery(name = "Beverages.findById", query = "SELECT b FROM Beverages b WHERE b.id = :id")
    , @NamedQuery(name = "Beverages.findByName", query = "SELECT b FROM Beverages b WHERE b.name = :name")
    , @NamedQuery(name = "Beverages.findByPrice", query = "SELECT b FROM Beverages b WHERE b.price = :price")
    , @NamedQuery(name = "Beverages.findByStock", query = "SELECT b FROM Beverages b WHERE b.stock = :stock")})
public class Beverages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private Integer price;
    @Basic(optional = false)
    @Column(name = "STOCK")
    private Integer stock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "beverages", fetch = FetchType.LAZY)
    private List<Transactionbeverage> transactionbeverageList;

    public Beverages() {
    }

    public Beverages(String id) {
        this.id = id;
    }

    public Beverages(String id, String name, Integer price, Integer stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @XmlTransient
    public List<Transactionbeverage> getTransactionbeverageList() {
        return transactionbeverageList;
    }

    public void setTransactionbeverageList(List<Transactionbeverage> transactionbeverageList) {
        this.transactionbeverageList = transactionbeverageList;
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
        if (!(object instanceof Beverages)) {
            return false;
        }
        Beverages other = (Beverages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ojdbcexercise.models.Beverages[ id=" + id + " ]";
    }
    
}
