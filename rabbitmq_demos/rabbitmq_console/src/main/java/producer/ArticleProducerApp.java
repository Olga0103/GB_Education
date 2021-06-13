package producer;

import java.util.Scanner;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ArticleProducerApp {
    private static final String EXCHANGE_NAME = "articles";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
            Scanner in = new Scanner(System.in);
            while (true) {
                String message = in.nextLine();
                String[] arr = message.split(" ");
                String topic = arr[0];
                String article = message.substring(topic.length() + 1);
                System.out.println(" [x] Sent '" + article + "'");
                channel.basicPublish(EXCHANGE_NAME, topic, null, article.getBytes("UTF-8"));
            }
        }
    }
}
