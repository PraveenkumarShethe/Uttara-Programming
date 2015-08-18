package com.manju.example.httpinvoker;

import java.io.Serializable;

/**
 * The State Capital Service interface that the client will use to access
 * server-side functionality via HTTP.
 */
public interface StateCapitalServiceIF extends Serializable {
	/**
	 * Provide capital of state whose name is provided.
	 * 
	 * @param stateName
	 *            Name of state whose capital is desired.
	 * @return Capital of the specified state; null if not found.
	 */
	public String getCapital(final String stateName);
}
