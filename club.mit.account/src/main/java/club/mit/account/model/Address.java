package club.mit.account.model;

public class Address {
	private Addresstype addressType;
	private String address;

	@Override
	public String toString() {
		return "Address [addressType=" + addressType + ", address=" + address + "]";
	}

	public Addresstype getAddressType() {
		return addressType;
	}

	public void setAddressType(Addresstype addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
