package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//Java�����࣬�����Զ�ɨ��
public class CDPlayerConfig {
  
  @Bean //�����������һ�����󣬸ö���ע��ΪspringӦ���������е�bean�� 
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean //���Բ����˺ͱ�Ҫ��java����������beanʵ��
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
