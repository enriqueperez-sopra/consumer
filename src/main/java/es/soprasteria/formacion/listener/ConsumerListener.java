package es.soprasteria.formacion.listener;

import es.soprasteria.formacion.dto.SampleMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumerListener {

  @RabbitListener(queues = { "my-queue" })
  public void receiveMessage(SampleMessage message) {
    log.info("Message received from Queue 1: " + message);
  }

  @RabbitListener(queues = { "my-queue-2" })
  public void receiveMessage2(SampleMessage message) {
    log.info("Message received from Queue 2: " + message);
  }
}
