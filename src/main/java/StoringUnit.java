import java.util.Date;

/**
 * Class for unit of goods in storage
 *
 * @author salvatorio
 */
public class StoringUnit {

    private final int CAPACITY = 100;

    private String nameOfProduct;
    private int quantity;
    private int priceByUnit;
    private Date dateOfManufacture;
    private Date expirationDate;
    private Date dateOfDeliver;
    private String provider;
    private String producer;
    private String phoneNumberOfProvider;
    private String phoneNumberOfProducer;


    /**
     * constructors
     */

    public StoringUnit() {
    }

    public StoringUnit(String nameOfProduct, int quantity, int priceByUnit) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.priceByUnit = priceByUnit;
    }

    public StoringUnit(String nameOfProduct, int quantity, int priceByUnit, Date dateOfManufacture, Date expirationDate) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.priceByUnit = priceByUnit;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.dateOfDeliver = new Date(System.currentTimeMillis());
    }

    public StoringUnit(String nameOfProduct, int quantity, int priceByUnit, Date dateOfManufacture, Date expirationDate
            , String provider, String producer, String phoneNumberOfProvider, String phoneNumberOfProducer) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.priceByUnit = priceByUnit;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.provider = provider;
        this.producer = producer;
        this.phoneNumberOfProvider = phoneNumberOfProvider;
        this.phoneNumberOfProducer = phoneNumberOfProducer;
        this.dateOfDeliver = new Date(System.currentTimeMillis());
    }

    /**
     * utility methods
     */

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceByUnit() {
        return priceByUnit;
    }

    public void setPriceByUnit(int priceByUnit) {
        this.priceByUnit = priceByUnit;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getPhoneNumberOfProvider() {
        return phoneNumberOfProvider;
    }

    public void setPhoneNumberOfProvider(String phoneNumberOfProvider) {
        this.phoneNumberOfProvider = phoneNumberOfProvider;
    }

    public String getPhoneNumberOfProducer() {
        return phoneNumberOfProducer;
    }

    public void setPhoneNumberOfProducer(String phoneNumberOfProducer) {
        this.phoneNumberOfProducer = phoneNumberOfProducer;
    }

    public Date getDateOfDeliver() {
        return dateOfDeliver;
    }

    public void setDateOfDeliver(Date dateOfDeliver) {
        this.dateOfDeliver = dateOfDeliver;
    }



    public int totalPrice(){
        return quantity * priceByUnit;
    }

    public int availablePlace(){
        return CAPACITY - quantity;
    }

   




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoringUnit)) return false;

        StoringUnit that = (StoringUnit) o;

        if (quantity != that.quantity) return false;
        if (priceByUnit != that.priceByUnit) return false;
        if (nameOfProduct != null ? !nameOfProduct.equals(that.nameOfProduct) : that.nameOfProduct != null)
            return false;
        if (dateOfManufacture != null ? !dateOfManufacture.equals(that.dateOfManufacture) : that.dateOfManufacture != null)
            return false;
        if (expirationDate != null ? !expirationDate.equals(that.expirationDate) : that.expirationDate != null)
            return false;
        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
        if (producer != null ? !producer.equals(that.producer) : that.producer != null) return false;
        if (phoneNumberOfProvider != null ? !phoneNumberOfProvider.equals(that.phoneNumberOfProvider) : that.phoneNumberOfProvider != null)
            return false;
        return !(phoneNumberOfProducer != null ? !phoneNumberOfProducer.equals(that.phoneNumberOfProducer) : that.phoneNumberOfProducer != null);

    }

    @Override
    public int hashCode() {
        int result = nameOfProduct != null ? nameOfProduct.hashCode() : 0;
        result = 31 * result + quantity;
        result = 31 * result + priceByUnit;
        result = 31 * result + (dateOfManufacture != null ? dateOfManufacture.hashCode() : 0);
        result = 31 * result + (expirationDate != null ? expirationDate.hashCode() : 0);
        result = 31 * result + (provider != null ? provider.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (phoneNumberOfProvider != null ? phoneNumberOfProvider.hashCode() : 0);
        result = 31 * result + (phoneNumberOfProducer != null ? phoneNumberOfProducer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StoringUnit{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", quantity=" + quantity +
                ", priceByUnit=" + priceByUnit +
                ", dateOfManufacture=" + dateOfManufacture +
                ", expirationDate=" + expirationDate +
                ", provider='" + provider + '\'' +
                ", producer='" + producer + '\'' +
                ", phoneNumberOfProvider='" + phoneNumberOfProvider + '\'' +
                ", phoneNumberOfProducer='" + phoneNumberOfProducer + '\'' +
                '}';
    }
}