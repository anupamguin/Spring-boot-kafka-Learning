package spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.kafka.KafkaProducer;

@RestController
@RequestMapping("/kafka/string")
public class MessageController {

	@Autowired
	private KafkaProducer kafkaProducer;

	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam(name = "message") String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message Sent to the Topic");
	}

}
