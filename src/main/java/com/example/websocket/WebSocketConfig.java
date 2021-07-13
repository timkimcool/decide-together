package main.java.com.example.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.com.config.annotation.EnableWebSocketMessageBroker;

@Configuration@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
  
  @Override
  public void registerStompEndpoints(final StompEndPointRegistry registry) {
    registry.addEndpoint("/chat-example").withSocketJS();
  }

  @Override
  public void configureMessageBroker(final MessageBrokerRegistry registry) {
    registry.setApplicationDestinationPrefixes("app");
    registry.enableSimpleBroker("/topic");
  }

}
