package com.heli.mailcompany;

public class Rule {

	private int ruleId;
	private float startWeight;
	private float endWeight;
	private float pricePerPound;

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public float getStartWeight() {
		return startWeight;
	}

	public void setStartWeight(float startWeight) {
		this.startWeight = startWeight;
	}

	public float getEndWeight() {
		return endWeight;
	}

	public void setEndWeight(float endWeight) {
		this.endWeight = endWeight;
	}

	public float getPricePerPound() {
		return pricePerPound;
	}

	public void setPricePerPound(float pricePerPound) {
		this.pricePerPound = pricePerPound;
	}

}
