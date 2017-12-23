package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//Java配置类，不用自动扫描
public class CDPlayerConfig {
  
  @Bean //这个方法返回一个对象，该对象注册为spring应用上下文中的bean。 
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean //可以采用人和必要的java功能来产生bean实例
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
