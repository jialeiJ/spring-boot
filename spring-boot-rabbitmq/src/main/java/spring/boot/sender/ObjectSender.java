package spring.boot.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.boot.pojo.User;

@Component
public class ObjectSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	//发送者
	public void send(User user) {
		System.out.println("Sender object: " + user.toString());
		this.rabbitTemplate.convertAndSend("object", user);
	}

}
