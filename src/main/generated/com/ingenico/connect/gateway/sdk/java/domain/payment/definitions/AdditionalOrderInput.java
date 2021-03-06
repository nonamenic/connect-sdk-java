/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AirlineData;

public class AdditionalOrderInput {

	private AirlineData airlineData = null;

	@SuppressWarnings("deprecation")
	private Level3SummaryData level3SummaryData = null;

	private Long numberOfInstallments = null;

	private String orderDate = null;

	private OrderTypeInformation typeInformation = null;

	/**
	 * Object that holds airline specific data
	 */
	public AirlineData getAirlineData() {
		return airlineData;
	}

	/**
	 * Object that holds airline specific data
	 */
	public void setAirlineData(AirlineData value) {
		this.airlineData = value;
	}

	/**
	 * Object that holds Level3 summary data
	 *
	 * @deprecated Use Order.shoppingCart instead
	 */
	@Deprecated
	public Level3SummaryData getLevel3SummaryData() {
		return level3SummaryData;
	}

	/**
	 * Object that holds Level3 summary data
	 *
	 * @deprecated Use Order.shoppingCart instead
	 */
	@Deprecated
	public void setLevel3SummaryData(Level3SummaryData value) {
		this.level3SummaryData = value;
	}

	/**
	 * The number of installments
	 */
	public Long getNumberOfInstallments() {
		return numberOfInstallments;
	}

	/**
	 * The number of installments
	 */
	public void setNumberOfInstallments(Long value) {
		this.numberOfInstallments = value;
	}

	/**
	 * Date and time of order<br>
	 * Format: YYYYMMDDHH24MISS
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * Date and time of order<br>
	 * Format: YYYYMMDDHH24MISS
	 */
	public void setOrderDate(String value) {
		this.orderDate = value;
	}

	/**
	 * Object that holds the purchase and usage type indicators
	 */
	public OrderTypeInformation getTypeInformation() {
		return typeInformation;
	}

	/**
	 * Object that holds the purchase and usage type indicators
	 */
	public void setTypeInformation(OrderTypeInformation value) {
		this.typeInformation = value;
	}
}
