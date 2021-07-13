package main.java.com.example.controller;

@Controller
public class pollController {

  @MessageMapping("/chat.send")
  @SendTo("/topic/public")
  public ChatMessage sendMessage(@Payload final ChatMessage chatMessage) {
    return chatMessage;
  }

  @MessageMapping("/chat.newUser")
  @SendTo("/topic/public")
  public ChatMessage newUser(@Payload final ChatMessage chatMessage, SimpleMessageHeaderAccessor headerAccessor) {
    headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
    return chatMessage;

  }
}
