package es.soprasteria.formacion.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumerListener {

  @RabbitListener(queues = { "my-queue" })
  public void receiveMessage(String message) {
    log.info("Message received: " + message);
  }
}
