package xin.jerome.mail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import xin.jerome.mail.SpringBootDemoMailApplication;

import javax.mail.MessagingException;


/**
 * {@link MailService} 的测试类
 *
 * @author Jerome Zhu
 * @since 2018.09.06 16:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootDemoMailApplication.class})
public class MailServiceTests {

    private Logger logger = LoggerFactory.getLogger(MailServiceTests.class);
    private String toUser = "591578399@qq.com";

    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testSendTextMail() {
        String subject = "Jerome的文本邮件";
        String content = "Jerome的文本邮件的正文部分";
        logger.info("发送文本邮件开始。。。。");
        mailService.sendTextMail(toUser, subject, content);
        logger.info("发送文本邮件结束。。。。");
    }

    @Test
    public void testSendHtmlMail() {
        String subject = "Jerome的Html邮件";
        String content = "<html><body><h3>Jerome的Html邮件的正文部分</h3></body></html>";
        logger.info("发送Html邮件开始。。。。");
        try {
            mailService.sendHtmlMail(toUser, subject, content);
        } catch (MessagingException e) {
            logger.error("发送Html邮件失败。。。。");
            logger.error("Cause By:" + e.getMessage());
        }
        logger.info("发送Html邮件结束。。。。");
    }

    @Test
    public void testSendAttachmentMail() {
        String subject = "Jerome的附件邮件";
        String content = "Jerome的附件邮件";
        String filePath = "C:\\Users\\user\\Pictures\\Saved Pictures\\th2.jpg";
        logger.info("发送附件邮件开始。。。。");
        try {
            mailService.sendAttachmentMail(toUser, subject, content, filePath);
        } catch (MessagingException e) {
            logger.error("发送附件邮件失败。。。。");
            logger.error("Cause By:" + e.getMessage());
        }
        logger.info("发送附件邮件结束。。。。");
    }

    @Test
    public void testSendImgMail() {
        String subject = "Jerome的Img邮件";
        String imgId = "img001";
        String content = "<html><body><img src=\'cid:"+imgId+"\'/></body></html>";
        String filePath = "C:\\Users\\user\\Pictures\\Saved Pictures\\th2.jpg";
        logger.info("发送Img邮件开始。。。。");
        try {
            mailService.sendImgMail(toUser, subject, content, imgId, filePath);
        } catch (MessagingException e) {
            logger.error("发送Img邮件失败。。。。");
            logger.error("Cause By:" + e.getMessage());
        }
        logger.info("发送Img邮件结束。。。。");
    }
    @Test
    public void testSendTemplateMail() {
        Context context = new Context();
        context.setVariable("text", "Jerome的模板邮件的正文");
        String content = templateEngine.process("mail_template", context);
        String subject = "Jerome的模板邮件";
        logger.info("发送模板邮件开始。。。。");
        try {
            mailService.sendTemplateMail(toUser, subject, content);
        } catch (MessagingException e) {
            logger.error("发送模板邮件失败。。。。");
            logger.error("Cause By:" + e.getMessage());
        }
        logger.info("发送模板邮件结束。。。。");
    }


}