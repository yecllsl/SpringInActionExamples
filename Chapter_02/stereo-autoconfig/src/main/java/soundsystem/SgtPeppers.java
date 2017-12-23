package soundsystem;
import org.springframework.stereotype.Component;

@Component
//说明这个类是组建类，并告知spring为这个类创建bean
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
