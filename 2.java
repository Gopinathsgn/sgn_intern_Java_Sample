interface RainfallCalculator {
  /**
  * Captures rain occured in the given region
  * @param measure amount of rainfall in centi meters
  * @param rainDate date on which rainfall measure is recorded
  * @param pincode identifies the location of rainfall where this was recorded
  */
  void captureRain(Float measure, Date rainDate, String pincode);
  
  /**
  * Region which has gt maximum rainfall in the given . If more than 1 region got the same maximum, 
  then return whichever has got the rain recently.  If both have got the rain on the same date,
  return whichever was captured first
  */
  RainfallRegion getRegionWithMaxRainfall(Date fromDate, Date toDate);
  
  /**
  * Similar to above, but which region has got minimum rainfall
  */
  RainfallRegion getRegionWithMinRainfall(Date fromDate, Date toDate);
  
  /**
  * Compute the average rainfall in the given date range and return the average
  */
  Float getAverageRainfall(Date fromDate, Date fromDate);
}

class RainfallRegion implements RainfallCalculator{
	HashMap<String,Date> dateofRain=new HashMap<>();
  HashMap<String,Float> measureofRain=new HashMap<>();
  //For Pincode and rain date (Converted as String if needed)
  HashMap<Date,String> date=new HashMap<>();
   //For Pincode and measure 
  
   void captureRain(Float measure,Date rainDate, String pincode){
     dateofRain.put(pincode,rainDate);
     measureofRain.put(pincode,measure);
    
   }
  
  
}
