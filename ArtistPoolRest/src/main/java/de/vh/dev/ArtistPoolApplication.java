package de.vh.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Setup: https://www.youtube.com/watch?v=YywLS8XdxLQ
// DB: localhost:8080/h2-console

// Rest API: https://www.youtube.com/watch?v=XmAISyK2FsU

@SpringBootApplication
public class ArtistPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtistPoolApplication.class, args);

	}
}
