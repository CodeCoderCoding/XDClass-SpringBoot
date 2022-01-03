package base_project.base;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

//@RunWith(SpringRunner.class)  //底层用junit  SpringJUnit4ClassRunner
//@SpringBootTest(classes={XdclassApplication.class})//启动整个springboot工程
public class WebClientTest {

	
	
	@Test
	  public void testBase(){
	    Mono<String> resp = WebClient.create()
	        .get()
	        //多个参数也可以直接放到map中,参数名与placeholder对应上即可
	        .uri("http://localhost:8080/api/v1/user/find?id=1") //使用占位符
	        .accept(MediaType.APPLICATION_JSON)
	        .retrieve()
	        .bodyToMono(String.class);
	    System.out.println(resp.block());
	 
	  }
	
	@Test
	  public void testPlaceHolder(){
	    Mono<String> resp = WebClient.create()
	        .get()	       
	        .uri("http://localhost:8080/api/v1/user/find?id={id}",1) //使用占位符
	        .accept(MediaType.APPLICATION_JSON)
	        .retrieve()
	        .bodyToMono(String.class);
	    System.out.println(resp.block());
	 
	  }
	
	
	
	
	
	
	
}
