package xin.jerome.mail.service;

import javax.mail.MessagingException;

/**
 * 邮件的业务处理
 *
 * @author Jerome Zhu
 * @since 2018.09.06 16:02
 */
public interface MailService {

    void sendTextMail(String toUser, String subject, String content);

    void sendHtmlMail(String toUser, String subject, String content) throws MessagingException;

    void sendAttachmentMail(String toUser, String subject, String content, String filePath) throws MessagingException;

    void sendImgMail(String toUser, String subject, String content, String imgId, String imgPath) throws MessagingException;

    void sendTemplateMail(String toUser, String subject, String content) throws MessagingException;
}
