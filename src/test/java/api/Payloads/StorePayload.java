package api.Payloads;

import java.time.format.DateTimeFormatter;

public class StorePayload 
{
	private int id;
	private int petId;
	private float quantity;
	private String shipDate;
	private String status;
	private boolean complete;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}	
}
