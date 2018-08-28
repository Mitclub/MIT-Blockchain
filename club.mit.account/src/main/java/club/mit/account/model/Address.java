package club.mit.account.model;

public class Address {
	private String addressType;
	private String address;

	@Override
	public String toString() {
		return "Address [addressType=" + addressType + ", address=" + address + "]";
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
