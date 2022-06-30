public class Appliance {

  private final String id;
  private final String customerId;
  private boolean status;

  public Appliance(String id, String customerId, boolean status) {
    this.id = id;
    this.customerId = customerId;
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public String getCustomerId() {
    return customerId;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else {
      return (obj instanceof Appliance) &&
          ((Appliance) obj).getId().equalsIgnoreCase(this.id) &&
          ((Appliance) obj).getCustomerId().equalsIgnoreCase(this.customerId) &&
          ((Appliance) obj).isStatus() == this.status;
    }
  }
}
