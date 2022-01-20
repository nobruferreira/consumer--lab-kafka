package com.lab.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TopicListener {

	/*@KafkaListener(topics = "topic.test", groupId = "api--lab-kafka")
	public void consume(ConsumerRecord<String, com.lab.avro.Person> payload){
		log.info("Tópico: {}", "topic.test");
		log.info("key: {}", payload.key());
		log.info("Headers: {}", payload.headers());
		log.info("Partion: {}", payload.partition());
		log.info("Order: {}", payload.value());
	}*/

	@KafkaListener(topics = "topic.test", groupId = "api--lab-kafka")
	public void consume(ConsumerRecord<String, String> payload){
		log.info("Tópico: {}", "topic.test");
		log.info("key: {}", payload.key());
		log.info("Headers: {}", payload.headers());
		log.info("Partion: {}", payload.partition());
		log.info("Order: {}", payload.value());
	}
}
