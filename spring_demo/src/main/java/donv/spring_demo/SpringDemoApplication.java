package donv.spring_demo;

import donv.spring_demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@AllArgsConstructor
@SpringBootApplication
public class SpringDemoApplication {
	@Autowired
	private final BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup(){
		System.out.println("Hello");
		this.bookService.addTestBooks();
	}

}
