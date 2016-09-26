package com.wabao.generator;

import java.util.List;

import com.wabao.templates.BeanTemplate;
import com.wabao.templates.ConvertTemplate;
import com.wabao.templates.DaoTemplate;
import com.wabao.templates.ResultTemplate;
import com.wabao.templates.SqlMapperTemplate;
import com.wabao.templates.Template;
import com.wabao.util.DBConn;
import com.wabao.util.TableColum;


public class Generate {
	
	private static Template[]	templates	= new Template[] { new ResultTemplate(),
			new BeanTemplate(), new DaoTemplate(), new SqlMapperTemplate(), new ConvertTemplate() };
	
	public static void main(String[] args) {
		List<String> names = DBConn.getTableNamesByDBName();
		for (String tableName : names) {
			List<TableColum> colum = DBConn.getColumnsNamesByTableName(tableName);
			System.out.println("处理【" + tableName + "】");
			for (Template tmp : templates) {//生成文件
				tmp.gen(tableName, colum);
			}
		}
		
//		List<TableColum> colum = DBConn.getColumnsNamesByTableName("mapi_dictionary_item");
//		System.out.println("处理【" + "mapi_dictionary_item" + "】");
//		for (Template tmp : templates) {//生成文件
//			tmp.gen("mapi_dictionary_item", colum);
//		}
		
				
		
	}
	
}
