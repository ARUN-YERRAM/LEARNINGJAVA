public class StringsTuts{
   public static void main(String[] args){
       String s = "Meher Archana";
       System.out.println(s.length());
       System.out.println(s.charAt(3));
       System.out.println(s.substring(6));
       System.out.println(s.substring(6,10));
       System.out.println(s.indexOf("Archana"));
       System.out.println(s.indexOf("a",7));
       System.out.println(s.lastIndexOf("a"));
       System.out.println(s.equals("Meher Archana"));
       System.out.println(s.equalsIgnoreCase("meher archana"));
       System.out.println(s.compareTo("Srikar"));
       //System.out.println('M'-'S');
       //System.out.println('e'-'S');
       System.out.println(s.compareToIgnoreCase("meher archkana"));
       System.out.println(s.toLowerCase());
       System.out.println(s.toUpperCase());
       
       s = " Meher Archana ";
       System.out.println(s);
       s = s.trim();
       System.out.println(s);
       
       System.out.println(s.replace('M', 'S'));
       System.out.println(s.contains("Arch"));
       
       
       String s2 = "Meher Archana";
       char[] carray = s2.toCharArray();
       for(int i=0; i<carray.length; i++){
        System.out.println(carray[i]);
      }
      
      System.out.println(s2.startsWith("Meher"));
      
       
   }
}
