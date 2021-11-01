
public class rentalSystem {
	private customer[] customerList;
	private car[] carList;
	
	/**
	 * Constructor, takes no input and creats a carList abd a customerList
	 */
	rentalSystem(){
		customerList = new customer[10];
		carList = new car[10];
	}
	/**
	 * 
	 * @return customerList
	 */
	public customer[] getCustomerList() {
		return customerList;
	}
	/**
	 * 
	 * @return carList
	 */
	public car[] getCarList() {
		return carList;
	}
	/**
	 * add customer into current system
	 * @param customer
	 */
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
	/**
	 * add a new car into car list
	 * @param car
	 */
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
	/**
	 * check if the list is full
	 * @param any(a car list)
	 * @return boolean
	 */
	public boolean isFull(car[] any) {
		for(car s:any) {
			if(s==null) {
				return false;
			}
		}
		return true;
	}
	/**
	 * check if the list is full
	 * @param any(a customer list)
	 * @return boolean
	 */
	public boolean isFull(customer[] any) {
		for(customer s:any) {
			if(s==null) {
				return false;
			}
		}
		return true;
	}
	/**
	 * check if the content is in the list(any lists)
	 * @param content
	 * @return boolean
	 */
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
	/**
	 * delete the car from car list by name or id
	 * @param content
	 * @return boolean
	 */
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
	/**
	 * delete the customer from customer list
	 * @param content
	 * @return boolean
	 */
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
