package xin.jerome.websocket.server;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 聊天室 {@link  ServerEndpoint}
 *
 * @author Jerome Zhu
 * @since 2018.08.31 10:21
 */
@ServerEndpoint("/chat-room/{username}")
public class ChatRoomServerEndpoint {

    private static Map<String, Session> liveSession = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(@PathParam("username") String username, Session session) {
        liveSession.put(session.getId(), session);
        sendAll("欢迎，" + username + "来到聊天室 ！");
    }

    @OnMessage
    public void onMessage(@PathParam("username") String username, Session session, String message) {
        sendAll("用户 " +username+ ":" +message);
    }

    @OnClose
    public void onClose(@PathParam("username") String username, Session session) {
        liveSession.remove(session.getId());
        sendAll(username + "已经离开聊天室！");
    }


    private void sendAll(String message) {
        liveSession.forEach((sessionId, session) -> {sendText(session,message);});
    }

    private void sendText (Session session, String message) {
        RemoteEndpoint.Basic basicRemote = session.getBasicRemote();
        try {
            basicRemote.sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
