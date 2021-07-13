package main.java.com.example.controller;

@Component
public class WebSocketEventListener {

  private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketEventListener.class);

  @EventListener
  public void handleWebSocketConnectListener(final SessionConnected event) {
    LOGGER.info("CONNECTED");
  }
}
