
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Customer {

  private final String id;
  private final String taxCode;
  private final Set<Appliance> appliances;

  public Customer(String id, String taxCode) {
    this.id = id;
    this.taxCode = taxCode;
    this.appliances = new HashSet<>();
  }

  public String getId() {
    return id;
  }

  public Set<Appliance> getAppliances() {
    return appliances;
  }

  public String getTaxCode() {
    return taxCode;
  }

  public Optional<Appliance> getAppliance(String applianceId) {
    for (Appliance appliance : appliances) {
      if (appliance.getId().equals(applianceId)) {
        return Optional.of(appliance);
      }
    }
    return Optional.empty();
  }

  public Appliance setAppliance(Appliance appliance) {

    Optional<Appliance> foundAppliance = getAppliance(appliance.getId());

    if (foundAppliance.isPresent()) {
      foundAppliance.get().setStatus(appliance.isStatus());
      return foundAppliance.get();
    } else {
      appliances.add(appliance);
      return appliance;
    }
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else {
      return (obj instanceof Customer) &&
          ((Customer) obj).getId().equalsIgnoreCase(this.id) &&
          ((Customer) obj).getTaxCode().equalsIgnoreCase(this.taxCode);
    }
  }
}
