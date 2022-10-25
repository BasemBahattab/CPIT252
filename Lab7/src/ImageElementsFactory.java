import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

    private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

    public ImageElement getFlyweight(String n) {
        ImageElement Image = (ImageElement) flyweights.get(n);

        if(Image == null){
            Image = new ImageElement(n);
            flyweights.put(n, Image);
            System.out.println("Creating image of element : " + n);
        }

        return Image;
    }

    public int numberOfFlyweights() {
        return flyweights.size();
    }
    
}
