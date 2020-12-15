package com.github.simpleblog.blog.plugn;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * mybatis generator生成注释插件
 **/
public class MyCommentGenerator implements CommentGenerator {
    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;

    public MyCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }


    @Override
    public void addConfigurationProperties(Properties properties) {

    }

    /**
     * 实体类加注释
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean b) {

    }

    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    @Override
    public void addComment(XmlElement xmlElement) {

    }

    @Override
    public void addRootComment(XmlElement xmlElement) {

    }


}
