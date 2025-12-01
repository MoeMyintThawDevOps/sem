package com.napier.sem;

public class displaydata {
    public void displaydata(City cit)
    {
        if (cit != null)
        {
            System.out.println(
                    cit.ID + " "
                            + cit.Name + " "
                            + cit.CountryCode + "\n"
                            + cit.District + "\n"
                            + cit.Population + "\n"
                            + "\n");
        }
    }
}
