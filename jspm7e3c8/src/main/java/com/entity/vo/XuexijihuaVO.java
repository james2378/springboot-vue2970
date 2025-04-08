package com.entity.vo;

import com.entity.XuexijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学习计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public class XuexijihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学员姓名
	 */
	
	private String xueyuanxingming;
		
	/**
	 * 练习时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lianxishijian;
		
	/**
	 * 练习时长
	 */
	
	private String lianxishizhang;
		
	/**
	 * 练习地点
	 */
	
	private String lianxididian;
		
	/**
	 * 练习内容
	 */
	
	private String lianxineirong;
		
	/**
	 * 教练账号
	 */
	
	private String jiaolianzhanghao;
		
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
				
	
	/**
	 * 设置：学员姓名
	 */
	 
	public void setXueyuanxingming(String xueyuanxingming) {
		this.xueyuanxingming = xueyuanxingming;
	}
	
	/**
	 * 获取：学员姓名
	 */
	public String getXueyuanxingming() {
		return xueyuanxingming;
	}
				
	
	/**
	 * 设置：练习时间
	 */
	 
	public void setLianxishijian(Date lianxishijian) {
		this.lianxishijian = lianxishijian;
	}
	
	/**
	 * 获取：练习时间
	 */
	public Date getLianxishijian() {
		return lianxishijian;
	}
				
	
	/**
	 * 设置：练习时长
	 */
	 
	public void setLianxishizhang(String lianxishizhang) {
		this.lianxishizhang = lianxishizhang;
	}
	
	/**
	 * 获取：练习时长
	 */
	public String getLianxishizhang() {
		return lianxishizhang;
	}
				
	
	/**
	 * 设置：练习地点
	 */
	 
	public void setLianxididian(String lianxididian) {
		this.lianxididian = lianxididian;
	}
	
	/**
	 * 获取：练习地点
	 */
	public String getLianxididian() {
		return lianxididian;
	}
				
	
	/**
	 * 设置：练习内容
	 */
	 
	public void setLianxineirong(String lianxineirong) {
		this.lianxineirong = lianxineirong;
	}
	
	/**
	 * 获取：练习内容
	 */
	public String getLianxineirong() {
		return lianxineirong;
	}
				
	
	/**
	 * 设置：教练账号
	 */
	 
	public void setJiaolianzhanghao(String jiaolianzhanghao) {
		this.jiaolianzhanghao = jiaolianzhanghao;
	}
	
	/**
	 * 获取：教练账号
	 */
	public String getJiaolianzhanghao() {
		return jiaolianzhanghao;
	}
				
	
	/**
	 * 设置：教练姓名
	 */
	 
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
			
}
