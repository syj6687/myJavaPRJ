public class Test{
  
  public static void main(String args[]){
    
      for(int i = 1; i <= 2 * number -1; i++) {
        String stars = "";
             
        int spaceWidth = 0;
        int starWidth = 0;
                
        if (i < number) {
            spaceWidth = number -i;
            starWidth = 2*i -1; 
        } 
        else { 
            int lowerI = 2*number-i;
            spaceWidth = number -lowerI;
            starWidth = 2*lowerI -1;
        }
    
        for(int j = 1; j <= spaceWidth; j++) {
            stars += " ";
        }
                
        for(int j = 1; j <= starWidth; j++) {
            stars += "*";
        }
                
       System.out.println(stars);
    }
  }
}
