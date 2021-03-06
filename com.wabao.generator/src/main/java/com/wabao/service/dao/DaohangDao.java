package com.wabao.service.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.wabao.service.bean.Daohang;

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
public interface DaohangDao {

	public Daohang findDaohangById(Integer id);
	
	public Integer insert(Daohang param);
	
	public Integer getDaohangCount(Daohang param);
	
	public List<Daohang> findDaohangsByPage(@Param("param")Daohang param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	//if not use,pls delete it
	public Integer deleteDaohangById(Integer id);
}