package com.vehiclemanagement.prototype;

public interface INonCommercial extends IVehicle{   
   public String getOwnerName();
   public void setOwnerName(String ownerName);
   public String getOwnerAddress();
   public void setOwnerAddress(String ownerAddress);
   public String getOwnerID();
   public void setOwnerID(String ownerID);
   public String getDriverID();
   public void setDriverID(String driverID);
}
