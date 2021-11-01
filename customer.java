package resources;

public class customer {
	private String name;
	private String id;
	private String phoneNumber;
	private String[] paymentInfo;
	public final String getName(){
		return name;
	}
	public final void setName(String name) throws IllegalArgumentException{
		if(name==null || name.length() == 0)
			throw new IllegalArgumentException("Name can not be NULL or length equals 0");
		this.name = name;
	}
	public final String getId(){
		return id;
	}
	public final void setId(String id) throws IllegalArgumentException{
		if(id==null || id.length() == 0)
			throw new IllegalArgumentException("id can not be NULL or length equals 0");
		this.id = id;
	}
	public final String getPhoneNumber(){
		return phoneNumber;
	}
	public final void setPhoneNumber(String phoneNumber) throws IllegalArgumentException{
		if(phoneNumber==null || phoneNumber.length() == 0)
			throw new IllegalArgumentException("phoneNumber can not be NULL or length equals 0");
		this.phoneNumber = phoneNumber;
	}
	public final String[] getPaymentInfo(){
		return paymentInfo;
	}
	public final void setPaymentInfo(String[] paymentInfo) throws IllegalArgumentException{
		if(paymentInfo==null || paymentInfo.length == 0)
			throw new IllegalArgumentException("phoneNumber can not be NULL or length equals 0");
		this.paymentInfo = paymentInfo;
	}
	public customer() {
		
	}
	public customer(String name, String id, String phoneNumber, String[] paymentInfo) {
		setName(name);
		setId(id);
		setPhoneNumber(phoneNumber);
		setPaymentInfo(paymentInfo);
	}
	public void main() {
		
		paymentInfo = new String[]{"BoA","12345","checking"};
		customer customer1 = new customer("Haowei","123","10800", paymentInfo);
		System.out.println(customer1.getName());
		System.out.println(customer1.getId());
		System.out.println(customer1.getPhoneNumber());
		System.out.println(customer1.getPaymentInfo());
	}
}
