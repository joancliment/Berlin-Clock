package main;
import java.util.ArrayList;
import java.util.List;

public class ClockBerlin {
	
    public static String Seconds(String cadena) {

        String SecondsOut = "";
        int SecY = 0; 
        
        SecY = Integer.valueOf(cadena.substring(6, 8));
      
        if (SecY % 2 == 0) {
        	SecondsOut = "Y";
            } else {
            	SecondsOut = "O";
            };
            SecondsOut = SecondsOut + "\n";
            
            return SecondsOut;

      };
      
      public static String HoursFive(String cadena) {

          String HoursOut = "";
          int HourY = 0;
          int Hour_t = 0;
         
          int i = 1;
          
          //List<String> HourOne;
          //HourOne = new ArrayList<String>();
          
          String HourOne = "";
         
          HourY = Integer.valueOf(cadena.substring(0, 2));
          Hour_t = HourY / 5;
          
          while ((i <= Hour_t) && (i <= 4)) {
        	 HourOne = HourOne + "R";
        	 i++;
          };
          
          
          while (i <= 4) {
         	 HourOne = HourOne + "O";
         	 i++;
           };
         HourOne = HourOne + "\n";
          
         HoursOut = HourOne;
                
          return HoursOut;

        };

      
     
      public static String Hours(String cadena) {

          String HoursOut = "";
          int HourY = 0;
          
          int Hour_b = 0;
          int i = 1;
          
          // List<String> HourOne;
          // HourOne = new ArrayList<String>();
          String HourOne = "";
          
         
          HourY = Integer.valueOf(cadena.substring(0, 2));
         
          Hour_b = HourY % 5;
          
          
          while ((i <= Hour_b) && (i <= 4)) {
        	  HourOne = HourOne + "R";
        	 i++;
          };
          
          
          while (i <= 4) {
        	  HourOne = HourOne + "O";
         	 i++;
           };
         HourOne = HourOne + "\n"; 
           
         HoursOut = HourOne;
         
         
         return HoursOut;

        };
        
        public static String MinutsFive(String cadena) {

            String MinutsOut = "";
            int MinutY = 0;
            int Minut_t = 0;
           
            int i = 1;
            int i3 = 1;
            
            // List<String> MinutOne;
            // MinutOne = new ArrayList<String>();
            String MinutOne = "";
            
           
            MinutY = Integer.valueOf(cadena.substring(3, 5));
            Minut_t = MinutY / 5;
            
            
            while ((i <= Minut_t) && (i <= 11)) {
            	
             if (i3 >= 3) { 
            	 MinutOne = MinutOne + "R";
            	 i3 = 1;
             } 
             else {
            	 MinutOne = MinutOne + "Y";
             };
             
          	 i++;
          	 i3++;
            };
            
            
            while (i <= 11) {
            	 MinutOne = MinutOne + "O";
           	 i++;
             };
           MinutOne = MinutOne + "\n";
             
           MinutsOut = MinutOne;
           
                
            return MinutsOut;

          };

        
       
        public static String Minuts(String cadena) {

            String MinutsOut = "";
            int MinutY = 0;
            
            int Minut_b = 0;
            int i = 1;
            
            // List<String> MinutOne;
            // MinutOne = new ArrayList<String>();
            
            String MinutOne = "";
            
                  
            MinutY = Integer.valueOf(cadena.substring(3, 5));
           
            Minut_b = MinutY % 5;
            
            while ((i <= Minut_b) && (i <= 4)) {
            	 MinutOne = MinutOne + "Y";
            	i++;
            };
            
            
            while (i <= 4) {
            	MinutOne = MinutOne + "O";
           	 	i++;
             };
             MinutOne = MinutOne + "\n";
            
             MinutsOut = MinutOne;
            
                
            return MinutsOut;

          };


          public String ConvertTime(String cadena) {
			
        	 String  cadenaOut = "";
        	         	 
        	 cadenaOut = Seconds(cadena) + HoursFive(cadena) + Hours(cadena) + MinutsFive(cadena) + Minuts(cadena);
        	        	 
        	 return cadenaOut;
        	      	  
          };
   


};
