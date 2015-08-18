package com.manju.example.httpinvoker;



import java.util.Map;

/**
 * Implementation of functionality to be run after being called by client via
 * HTTP.
 */
public class StateCapitalService implements StateCapitalServiceIF
{
   Map<String, String> statesAndCapitals = null;

   public StateCapitalService()
   {
   }

   /**
    * Set my states to state capitals mapping.
    * 
    * @param statesAndCapitals States to state capitals mapping.
    */
   public void setStatesAndCapitals(final Map<String,String> statesAndCapitals)
   {
      this.statesAndCapitals = statesAndCapitals;
   }

   /**
    * Provide capital of state whose name is provided.
    * 
    * @param stateName Name of state whose capital is desired.
    * @return Capital of the specified state; null if not found.
    */
   public String getCapital(final String stateName)
   {
      return this.statesAndCapitals.get(stateName);
   }
}
