package cn.pings.commons.stream.forker;

/**
 *********************************************************
 ** @desc  ：  结果对象                           
 ** @author  Pings                                     
 ** @date    2018年1月4日  
 ** @version v1.0                                                                                  
 * *******************************************************
 */
public interface Results {

	public <R> R get(Object key);
}
