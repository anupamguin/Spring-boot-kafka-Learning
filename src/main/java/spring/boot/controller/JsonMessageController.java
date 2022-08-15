package spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.kafka.JsonKafkaProducer;
import spring.boot.pojo.User;

@RestController
@RequestMapping("/kafka/json")
public class JsonMessageController {

	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;

	@PostMapping("/publish")
	public ResponseEntity<?> publish(@RequestBody User user){
		jsonKafkaProducer.sendMessage(user);

		return ResponseEntity.ok("Json Message send to the Kafka Topic");
	}

}
