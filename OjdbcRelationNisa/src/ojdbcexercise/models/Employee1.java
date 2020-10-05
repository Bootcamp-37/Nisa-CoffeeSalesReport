/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "EMPLOYEE1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee1.findAll", query = "SELECT e FROM Employee1 e")
    , @NamedQuery(name = "Employee1.findById", query = "SELECT e FROM Employee1 e WHERE e.id = :id")
    , @NamedQuery(name = "Employee1.findByName", query = "SELECT e FROM Employee1 e WHERE e.name = :name")
    , @NamedQuery(name = "Employee1.findByPassword", query = "SELECT e FROM Employee1 e WHERE e.password = :password")
    , @NamedQuery(name = "Employee1.findByRole", query = "SELECT e FROM Employee1 e WHERE e.role = :role")})
public class Employee1 implements Serializable {

    
    @Column(name = "CODE")
    private String code;
    @Column(name = "EMAIL")
    private String email;

    public Employee1(String name, String password, Integer role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "role")
    private Integer role;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Transaction1> transaction1List;

    public Employee1() {
    }

    public Employee1(Integer id) {
        this.id = id;
    }

    public Employee1(Integer id, String name, String password, Integer role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Employee1( String name, String password, String email,Integer role) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    @XmlTransient
    public List<Transaction1> getTransaction1List() {
        return transaction1List;
    }

    public void setTransaction1List(List<Transaction1> transaction1List) {
        this.transaction1List = transaction1List;
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
        if (!(object instanceof Employee1)) {
            return false;
        }
        Employee1 other = (Employee1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ojdbcexercise.models.Employee1[ id=" + id + " ]";
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
