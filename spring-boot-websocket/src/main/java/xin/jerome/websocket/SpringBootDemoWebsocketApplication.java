package xin.jerome.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import xin.jerome.websocket.server.ChatRoomServerEndpoint;

/**
 * 启动类
 *
 * @author Jerome Zhu
 * @since 2018.08.31 10:18
 */
@SpringBootApplication
@EnableWebSocket
public class SpringBootDemoWebsocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoWebsocketApplication.class);
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean
    public ChatRoomServerEndpoint chatRoomServerEndpoint() {
        return new ChatRoomServerEndpoint();
    }
}
