
public class car{
	private String id;
	private String carid;
	private String carname;
	private String type;
	private String color;
	private String level;
	private String insurance;
	private String price;
	
	
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getcarid() {
		return carid;
	}
	public void setcarid(String carid) {
		this.carid = carid;
	}
	public String getcarname() {
		return carname;
	}
	public void setcarname(String carname) {
		this.carname = carname;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public String getlevel() {
		return level;
	}
	public void setlevel(String level) {
		this.level = level;
	}
	public String getinsurance() {
		return insurance;
	}
	public void setinsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}

	public car(String id, String carid, String carname, String type, String level, String color, String insurance, String price) {
		setid(id);
		setcarid(carid);
		setcarname(carname);
		settype(type);
		setlevel(level);
		setcolor(color);
		setinsurance(insurance);
		setprice(price);
		}
	
	
	public void main(String[] args) {
        System.out.println("color"); 
    }



