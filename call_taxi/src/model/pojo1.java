package model;

public class pojo1
{
	private static int idGenerator=0;
	private int id;
	private  int ride_id;
	private String pickup;
	private String drop;
	private String status;

public pojo1(int id, int ride_id, String pickup, String drop, String status) {

		this.id = id;
		this.ride_id = ride_id;
		this.pickup = pickup;
		this.drop = drop;
		this.status = status;
	}

public pojo1(int id, String pickup, String drop) {
    this.id = id;
    this.pickup = pickup;
    this.drop = drop;
}



	public pojo1(String pickup, String drop) {

		this.pickup = pickup;
		this.drop = drop;
	}

	public pojo1(int id, int ride_id) {
		super();
		this.id = id;
		this.ride_id = ride_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRide_id() {
		return ride_id;
	}

	public void setRide_id(int ride_id) {
		this.ride_id = ride_id;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDrop() {
		return drop;
	}

	public void setDrop(String drop) {
		this.drop = drop;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString()
	{
		return "[id :"+id+"ride-id :"+ride_id+"Pickup-Location :"+pickup+"Drop-Location :"+drop+"Status :"+status+"]";
	}
}