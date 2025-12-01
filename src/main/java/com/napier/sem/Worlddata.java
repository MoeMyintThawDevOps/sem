package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Worlddata {
    private Connection con;

    public Worlddata(Connection con) {
        this.con = con;
    }

    public City getCity(int ID) {
        try {
            Statement stmt = con.createStatement();
            String strSelect =
                    "SELECT ID, Name, CountryCode, District, Population "
                            + "FROM city WHERE ID = " + ID;

            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset.next()) {
                City city = new City();
                city.ID = rset.getInt("ID");
                city.Name = rset.getString("Name");
                city.CountryCode = rset.getString("CountryCode");
                city.District = rset.getString("District");
                city.Population = rset.getInt("Population");
                return city;
            } else {
                return null;
            }
        }
        catch (Exception e) {
            System.out.println("Failed to get city details: " + e.getMessage());
            return null;
        }
    }
}
