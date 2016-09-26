package com.wabao.templates;

import java.util.List;

import org.apache.velocity.VelocityContext;

import com.wabao.util.JavaBeansUtil;
import com.wabao.util.PropertiesHelp;
import com.wabao.util.TableColum;


public class DaoTemplate extends Template {
	
	@Override
	public void setContent(String tableName, List<TableColum> colums, VelocityContext context) {
		context.put("className", JavaBeansUtil.getCamelCaseString(tableName, true));
		context.put("beanPackage", PropertiesHelp.getProperty("package"));
	}
	
	@Override
	public String getFileName(String tableName) {
		return JavaBeansUtil.getCamelCaseString(tableName, true) + "Dao.java";
	}
	
	@Override
	public String getSavePackage() {
		return PropertiesHelp.getProperty("dao");
	}

	
}
