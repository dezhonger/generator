package com.wabao.service.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.wabao.service.bean.Personbook;

/**
 *
 * This tools just a simple useful tools, gen table to javabean
 *
 * "I hope this tools can save your time"
 *
 * Generated by <tt>Generate</tt> 
 *
 * @author com.ypn.mapi.generate
 * @version v1.0
 */
public interface PersonbookDao {

	public Personbook findPersonbookById(Integer id);
	
	public Integer insert(Personbook param);
	
	public Integer getPersonbookCount(Personbook param);
	
	public List<Personbook> findPersonbooksByPage(@Param("param")Personbook param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	//if not use,pls delete it
	public Integer deletePersonbookById(Integer id);
}