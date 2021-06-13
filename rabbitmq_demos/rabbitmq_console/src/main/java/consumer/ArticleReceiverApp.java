package consumer;

import java.util.Scanner;
import com.rabbitmq.client.*;

public class ArticleReceiverApp {

    private static final String EXCHANGE_NAME = "articles";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        String queueName = channel.queueDeclare().getQueue();
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        String topic = "";
        String[] arr = command.split(" ");
        if (arr[0].equals("set_topic")) {
            topic = arr[1];
        }
        channel.queueBind(queueName, EXCHANGE_NAME, topic);
        Thread.sleep(10000);
        channel.queueUnbind(queueName, EXCHANGE_NAME, "sjjshj");
        Thread.sleep(3000);
        channel.queueBind(queueName, EXCHANGE_NAME, "topic");


        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String article = new String(delivery.getBody(), "UTF-8");
            System.out.println(" [x] Received '" + article + "'");
        };

        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> { });
    }
}