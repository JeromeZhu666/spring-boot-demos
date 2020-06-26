package xin.jerome.mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import xin.jerome.mail.service.MailService;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * {@link MailService} 的实现
 *
 * @author Jerome Zhu
 * @since 2018.09.06 16:22
 */
@Service
public class MailServiceImpl implements MailService {

    @Value("${spring.mail.username}")
    private String FROM_USER;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendTextMail(String toUser, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(FROM_USER);
        message.setTo(toUser);
        message.setSubject(subject);
        message.setText(content);
        javaMailSender.send(message);
    }

    @Override
    public void sendHtmlMail(String toUser, String subject, String content) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom(FROM_USER);
        mimeMessageHelper.setTo(toUser);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);

        javaMailSender.send(mimeMessage);
    }

    @Override
    public void sendAttachmentMail(String toUser, String subject, String content, String filePath) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom(FROM_USER);
        mimeMessageHelper.setTo(toUser);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);

        FileSystemResource file = new FileSystemResource(new File(filePath));
        String fileName = file.getFilename();
        mimeMessageHelper.addAttachment(fileName, file);

        javaMailSender.send(mimeMessage);
    }

    @Override
    public void sendImgMail(String toUser, String subject, String content, String imgId, String imgPath) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom(FROM_USER);
        mimeMessageHelper.setTo(toUser);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);

        FileSystemResource img = new FileSystemResource(new File(imgPath));
        mimeMessageHelper.addInline(imgId, img);

        javaMailSender.send(mimeMessage);
    }

    @Override
    public void sendTemplateMail(String toUser, String subject, String content) throws MessagingException {
        this.sendHtmlMail(toUser, subject, content);
    }
}
