import java.util.ArrayList;
import java.util.List;

public class LiquorService {

    public static List<String> getAvailableBrands(LiquorType type){
        List<String> brands = new ArrayList<String>();        
        if(type.equals(LiquorType.HARYANA)){
            brands.add("Faridabad");
        } else if(type.equals(LiquorType.ODISHA)){
            brands.add("Bhubaneswar");     
        } else if(type.equals(LiquorType.TAMILNADU)){
        	brands.add("Chennai");  
        	brands.add("Mahabalipuram");         
        } else if(type.equals(LiquorType.MAHARASHTRA)){
            brands.add("Mumbai");
        }else {
            brands.add("No Information Available");
        }
        return brands;
    }
}
