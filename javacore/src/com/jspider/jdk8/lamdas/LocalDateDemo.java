package com.jspider.jdk8.lamdas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

    public static void main(String[] args) {
        
      //Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date="+today.plusDays(10));
        
      //Creating LocalDate by providing input arguments
        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("Specific Date="+firstDay_2014);
        
      //Try creating date by providing invalid inputs
        //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        //System.out.println("Specific Date="+feb29_2014);
        
      //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST="+todayKolkata);
        
      //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(364);
        System.out.println("365th day from base date= "+dateFromBase);
        
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("100th day of 2014="+hundredDay2014);
        
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);
        
        LocalDateTime today1 = LocalDateTime.now();
        System.out.println("Current DateTime="+today1);
        
      //Current timestamp, it stores date time in unix timestamp
        Instant timestamp = Instant.now();
        System.out.println("Current Timestamp = "+timestamp);
        
      //Format examples
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

      //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = "+dt);
    }

}
