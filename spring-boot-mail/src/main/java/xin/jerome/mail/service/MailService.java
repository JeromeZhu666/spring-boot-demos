package xin.jerome.mail.service;

import javax.mail.MessagingException;

/**
 * 邮件的业务处理
 *
 * @author Jerome Zhu
 * @since 2018.09.06 16:02
 */
public interface MailService {

    /**
     * 发送普通的文本邮件
     * @param toUser 收件人
     * @param subject 邮件主题
     * @param content 邮件的内容
     */
    void sendTextMail(String toUser, String subject, String content);

    /**
     * 发送Html邮件
     * @param toUser 收件人
     * @param subject 邮件主题
     * @param content 邮件内容（html内容）
     * @throws MessagingException 消息异常
     */
    void sendHtmlMail(String toUser, String subject, String content) throws MessagingException;

    /**
     * 发送附件邮件
     * @param toUser 收件人
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param filePath 附件路径
     * @throws MessagingException 消息异常
     */
    void sendAttachmentMail(String toUser, String subject, String content, String filePath) throws MessagingException;

    /**
     * 发送图片邮件
     * @param toUser 收件人
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param imgId 图片Id,用于做替换
     * @param imgPath 图片文件路径
     * @throws MessagingException 消息异常
     */
    void sendImgMail(String toUser, String subject, String content, String imgId, String imgPath) throws MessagingException;

    /**
     * 发送模板邮件
     * @param toUser 收件人
     * @param subject 邮件主题
     * @param content 邮件内容
     * @throws MessagingException 消息异常
     */
    void sendTemplateMail(String toUser, String subject, String content) throws MessagingException;
}
