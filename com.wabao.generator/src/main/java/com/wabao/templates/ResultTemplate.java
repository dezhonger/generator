package com.wabao.templates;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.velocity.VelocityContext;

import com.wabao.util.JavaBeansUtil;
import com.wabao.util.PropertiesHelp;
import com.wabao.util.TableColum;

public class ResultTemplate extends Template {
	
	@Override
	public void setContent(String tableName, List<TableColum> colums, VelocityContext context) {
		context.put("className", JavaBeansUtil.getCamelCaseString(tableName, true) + "Result");
		
		List<Map<String, String>> fileds = new ArrayList<Map<String, String>>();
		for (TableColum colum : colums) {
			fileds.add(convertJavaBean(colum));
		}
		context.put("fields", fileds);
		
	}
	
	@Override
	public String getSavePackage() {
		return PropertiesHelp.getProperty("result");
	}
	
	@Override
	public String getFileName(String tableName) {
		return JavaBeansUtil.getCamelCaseString(tableName, true) + "Result.java";
		
	}
	
}
