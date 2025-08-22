package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.database;
import model.pojo;
import model.pojo1;

public class daotasks
{
	public void add_details(pojo details)
	{
		String sql="INSERT INTO user(user_name,phone_no,password) VALUES(?,?,?)";
		try(Connection con=database.getConnection();
		PreparedStatement st=con.prepareStatement(sql)){
			
			System.out.println("Connection object: " + con);

			st.setString(1,details.getName());
			st.setString(2,details.getPhn_no());
			st.setString(3,details.getPassword());

			st.executeUpdate();
			System.out.println("Succesfully Registered");

		}
		catch(SQLException e){
			e.printStackTrace();

		}
	}

	public int loginCheck(pojo details)
	{
		int id=-1;
		String sql="SELECT user_id FROM user WHERE phone_no=? AND password=?";

		try(Connection con=database.getConnection();
				PreparedStatement st=con.prepareStatement(sql))
				{
			st.setString(1,details.getPhn_no());
			st.setString(2,details.getPassword());
			ResultSet rs=st.executeQuery();

			if(rs.next())
			{
				id=rs.getInt("user_id");

			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return id;
	}

	public void booking(pojo1 detail)
	{
		String sql="INSERT INTO booking(user_id,pickup,drop_location) VALUES(?,?,?)";

		try(Connection con=database.getConnection();
				PreparedStatement st=con.prepareStatement(sql)){
			st.setInt(1, detail.getId());
			st.setString(2, detail.getPickup());
			st.setString(3,detail.getDrop());

			st.executeUpdate();
			System.out.println("Call taxi Booked");



		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}


	public void cancel(pojo1 detail)
	{
		String sql="SELECT * from booking WHERE id=? AND ride_id=? AND status='booking'";
		try(Connection con=database.getConnection();
				PreparedStatement st=con.prepareStatement(sql))
		{
			st.setInt(1,detail.getId());
			st.setInt(2,detail.getRide_id());

			ResultSet rs=st.executeQuery();

			if(rs.next())
			{
				String cancelsql="UPDATE booking SET='cancelled' WHERE ride_id=?";
				PreparedStatement canst=con.prepareStatement(cancelsql);
				canst.setInt(1, detail.getRide_id());
				canst.executeUpdate();
				System.out.println("Ride Id "+detail.getRide_id()+" is cancelled");

			}
			else
			{
				System.out.println("ride could not be cancel");
			}

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

	public List<pojo1> getAllBookings(int id)
	{
	  List<pojo1> bookings=new ArrayList<>();
	  String sql="SELECT * FROM booking WHERE user_id=?";
	  try(Connection con=database.getConnection();
			  PreparedStatement st=con.prepareStatement(sql))
			  {
		  st.setInt(1, id);
		  ResultSet rs=st.executeQuery();
		  while(rs.next())
		  {
			  pojo1 booking=new pojo1(
					  rs.getInt("user_id"),
					  rs.getInt("ride_id"),
					  rs.getString("pickup"),
					  rs.getString("drop_location"),
					  rs.getString("status")
					  );
			  bookings.add(booking);

		}

	  }
	  catch(SQLException e)
	  {
		  e.printStackTrace();
	  }

	  return bookings;
	}

}
