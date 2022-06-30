public class ApplianceNotFoundException extends Exception {

  public ApplianceNotFoundException(String customerId, String applianceId) {
    super(String.format("Customer with id %s does not contains appliance id %s", customerId,
        applianceId));
  }

  public ApplianceNotFoundException(String applianceId) {
    super(String.format("Appliance %s not found", applianceId));
  }

}
