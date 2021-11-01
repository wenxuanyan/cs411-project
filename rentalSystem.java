
public class rentalSystem {
	private customer[] customerList;
	private car[] carList;
	
	rentalSystem(){
		customerList = new customer[10];
		carList = new car[10];
	}
	public customer[] getCustomerList() {
		return customerList;
	}
	public car[] getCarList() {
		return carList;
	}
	public void addCustomer(customer customer) {
		if(!isFull(customerList)) {
			customer[] tempList = new customer[customerList.length+10];
			for(int i=0; i<customerList.length;i++) {
				tempList[i] = customerList[i];
			}
			customerList = tempList;
		}
		for(customer c:customerList) {
			if(c==null) {
				c = customer;
			}
		}
	}
	public void addCar(car car) {
		if(!isFull(carList)) {
			car[] tempList = new car[carList.length+10];
			for(int i=0; i<carList.length;i++) {
				tempList[i] = carList[i];
			}
			carList = tempList;
		}
		for(car c:carList) {
			if(c==null) {
				c = car;
			}
		}
	}
	public boolean isFull(car[] any) {
		for(car s:any) {
			if(s==null) {
				return false;
			}
		}
		return true;
	}
	public boolean isFull(customer[] any) {
		for(customer s:any) {
			if(s==null) {
				return false;
			}
		}
		return true;
	}
	public boolean isInTheList(String content) {
		for(customer c:customerList) {
			if(c!=null) {
				if(c.getName()==content) return true;
				if(c.getId()==content) return true;
				if(c.getPhoneNumber()==content) return true;
			}
		}
		for(car c:carList) {
			if(c!=null) {
				if(c.getCarId()==content) return true;
				if(c.getCarName()==content) return true;
			}
		}
		
		return false;
	}
	public boolean delCar(String content) {
		for(car c:carList) {
			if(c!=null) {
				if(c.getCarId()==content) {
					c = null;
					return true;
				}
				if(c.getCarName()==content) {
					c = null;
					return true;
				}
			}
		}
		return false;
	}
	public boolean delCustomer(String content) {
		for(customer c:customerList) {
			if(c!=null) {
				if(c.getName()==content) {
					c = null;
					return true;
				}
				if(c.getId()==content) {
					c = null;
					return true;
				}
				if(c.getPhoneNumber()==content) {
					c = null;
					return true;
				}
			}
		}
		return false;
	}
}
