// Generated with g9.

package test1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="cart")
public class Cart implements Serializable {

    /** Primary key. */
    protected static final String PK = "cartId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cart_id", unique=true, nullable=false, precision=10)
    private int cartId;
    @Column(precision=22)
    private double total;
    private LocalDate date;
    @OneToMany(mappedBy="cart")
    private Set<CartItem> cartItem;

    /** Default constructor. */
    public Cart() {
        super();
    }

    /**
     * Access method for cartId.
     *
     * @return the current value of cartId
     */
    public int getCartId() {
        return cartId;
    }

    /**
     * Setter method for cartId.
     *
     * @param aCartId the new value for cartId
     */
    public void setCartId(int aCartId) {
        cartId = aCartId;
    }

    /**
     * Access method for total.
     *
     * @return the current value of total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Setter method for total.
     *
     * @param aTotal the new value for total
     */
    public void setTotal(double aTotal) {
        total = aTotal;
    }

    /**
     * Access method for date.
     *
     * @return the current value of date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Setter method for date.
     *
     * @param aDate the new value for date
     */
    public void setDate(LocalDate aDate) {
        date = aDate;
    }

    /**
     * Access method for cartItem.
     *
     * @return the current value of cartItem
     */
    public Set<CartItem> getCartItem() {
        return cartItem;
    }

    /**
     * Setter method for cartItem.
     *
     * @param aCartItem the new value for cartItem
     */
    public void setCartItem(Set<CartItem> aCartItem) {
        cartItem = aCartItem;
    }

    /**
     * Compares the key for this instance with another Cart.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cart and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cart)) {
            return false;
        }
        Cart that = (Cart) other;
        if (this.getCartId() != that.getCartId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cart.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cart)) return false;
        return this.equalKeys(other) && ((Cart)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getCartId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Cart |");
        sb.append(" cartId=").append(getCartId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("cartId", Integer.valueOf(getCartId()));
        return ret;
    }

}
