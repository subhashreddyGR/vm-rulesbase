package vendingmanagement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LocationTiers implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String locationTier;
   private java.lang.String locationType;
   private java.lang.Double avgMoMRevenue;

   public LocationTiers()
   {
   }

   public java.lang.String getLocationTier()
   {
      return this.locationTier;
   }

   public void setLocationTier(java.lang.String locationTier)
   {
      this.locationTier = locationTier;
   }

   public java.lang.String getLocationType()
   {
      return this.locationType;
   }

   public void setLocationType(java.lang.String locationType)
   {
      this.locationType = locationType;
   }

   public java.lang.Double getAvgMoMRevenue()
   {
      return this.avgMoMRevenue;
   }

   public void setAvgMoMRevenue(java.lang.Double avgMoMRevenue)
   {
      this.avgMoMRevenue = avgMoMRevenue;
   }

   public LocationTiers(java.lang.String locationTier,
         java.lang.String locationType, java.lang.Double avgMoMRevenue)
   {
      this.locationTier = locationTier;
      this.locationType = locationType;
      this.avgMoMRevenue = avgMoMRevenue;
   }

}