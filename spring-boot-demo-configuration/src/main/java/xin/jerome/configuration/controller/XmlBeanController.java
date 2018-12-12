package xin.jerome.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.jerome.configuration.entity.XmlBean;

/**
 * 验证加载xml配置是否成功的{@link RestController}
 *
 * @author Jerome Zhu
 * @since 2018.12.12 09:21
 */
@RestController
public class XmlBeanController {

    @Autowired
    private XmlBean xmlBean;

    @GetMapping("/xmlbean")
    public XmlBean getXmlBean() {
        return xmlBean;
    }

}
