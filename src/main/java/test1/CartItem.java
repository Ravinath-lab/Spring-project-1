// Generated with g9.

package test1;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="cart_item")
public class CartItem implements Serializable {

    /** Primary key. */
    protected static final String PK = "cartItemId";

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
    @Column(name="cart_item_id", unique=true, nullable=false, precision=10)
    private int cartItemId;
    @Column(precision=22)
    private double qty;
    @ManyToOne(optional=false)
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;

    /** Default constructor. */
    public CartItem() {
        super();
    }

    /**
     * Access method for cartItemId.
     *
     * @return the current value of cartItemId
     */
    public int getCartItemId() {
        return cartItemId;
    }

    /**
     * Setter method for cartItemId.
     *
     * @param aCartItemId the new value for cartItemId
     */
    public void setCartItemId(int aCartItemId) {
        cartItemId = aCartItemId;
    }

    /**
     * Access method for qty.
     *
     * @return the current value of qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * Setter method for qty.
     *
     * @param aQty the new value for qty
     */
    public void setQty(double aQty) {
        qty = aQty;
    }

    /**
     * Access method for cart.
     *
     * @return the current value of cart
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Setter method for cart.
     *
     * @param aCart the new value for cart
     */
    public void setCart(Cart aCart) {
        cart = aCart;
    }

    /**
     * Compares the key for this instance with another CartItem.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CartItem and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CartItem)) {
            return false;
        }
        CartItem that = (CartItem) other;
        if (this.getCartItemId() != that.getCartItemId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CartItem.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CartItem)) return false;
        return this.equalKeys(other) && ((CartItem)other).equalKeys(this);
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
        i = getCartItemId();
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
        StringBuffer sb = new StringBuffer("[CartItem |");
        sb.append(" cartItemId=").append(getCartItemId());
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
        ret.put("cartItemId", Integer.valueOf(getCartItemId()));
        return ret;
    }

}
