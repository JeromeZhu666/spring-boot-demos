package xin.jerome.mybatis.plus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import org.junit.Test;
import xin.jerome.mybatis.plus.common.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * MybatisPlus 代码生成器
 *
 * @author JeromeSoar
 * @since 2020年 06月 22日 18:33
 */
public class MybatisPlusGeneratorTest {

    /**
     * 项目根目录的真实路径
     */
    private final static String projectRelativePath = "E:\\CoreWorkSpace\\GitHub\\JeromeZhu666\\spring-boot-demos\\spring-boot-mybatis-plus";
    /**
     * 生成表的表名
     */
    private final static String[] includeTableNames = {"tb_user"};
    /**
     * 排除生成表的表名
     */
    private final static String[] excludeTableNames = {"tb_user"};

    @Test
    public void generateCode() {

        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 代码生成目录
        gc.setOutputDir(projectRelativePath + "/src/main/java");
        // 作者
        gc.setAuthor("JeromeSoar");
        // 是否覆盖
        gc.setFileOverride(true);
        // 时间字段的类型
        gc.setDateType(DateType.ONLY_DATE);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sMapper");
        // gc.setServiceName("%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://192.168.111.131:3306/mybatis_plus?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useSSL=false");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("xin.jerome.mybatis.plus");
        pc.setEntity("domain.entity");
        mpg.setPackageInfo(pc);

        // 自定义输出配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectRelativePath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        // 不生成默认的 *Mapper.xml
        tc.setXml(null);
        // 不生成默认的 Controller
        tc.setController(null);
        // 不生成默认的 Service
        tc.setService(null);
        // 不生成默认的 ServiceImpl
        tc.setServiceImpl(null);
        mpg.setTemplate(tc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 自定义实体父类
        strategy.setSuperEntityClass(BaseEntity.class);
        // 逻辑删除字段
        strategy.setLogicDeleteFieldName("delFlag");
        // 使用 lombok
        strategy.setEntityLombokModel(true);
        strategy.setCapitalMode(true);
        // 表名前缀
        strategy.setTablePrefix("tb_");
        // 需要生成的表
        strategy.setInclude(includeTableNames);
        // 排除生成的表(include 和 exclude 只能配置一个)
        // strategy.setExclude(excludeTableNames);
        // 自定义实体，公共字段
        strategy.setSuperEntityColumns("id", "create_time", "create_user", "update_time", "update_user", "del_flag");
        // Controller url 驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);

        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new VelocityTemplateEngine());
        // 执行生成
        mpg.execute();
    }
}
