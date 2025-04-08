package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学习计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
@TableName("xuexijihua")
public class XuexijihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexijihuaEntity() {
		
	}
	
	public XuexijihuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学员账号
	 */
					
	private String xueyuanzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学员账号
	 */
	public void setXueyuanzhanghao(String xueyuanzhanghao) {
		this.xueyuanzhanghao = xueyuanzhanghao;
	}
	/**
	 * 获取：学员账号
	 */
	public String getXueyuanzhanghao() {
		return xueyuanzhanghao;
	}
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
