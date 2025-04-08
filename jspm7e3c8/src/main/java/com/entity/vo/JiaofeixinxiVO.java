package com.entity.vo;

import com.entity.JiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 缴费信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-28 12:09:06
 */
public class JiaofeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 费用类型
	 */
	
	private String feiyongleixing;
		
	/**
	 * 费用金额
	 */
	
	private Float feiyongjine;
		
	/**
	 * 费用描述
	 */
	
	private String feiyongmiaoshu;
		
	/**
	 * 发送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fasongshijian;
		
	/**
	 * 学员账号
	 */
	
	private String xueyuanzhanghao;
		
	/**
	 * 学员姓名
	 */
	
	private String xueyuanxingming;
		
	/**
	 * 财务账号
	 */
	
	private String caiwuzhanghao;
		
	/**
	 * 财务姓名
	 */
	
	private String caiwuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：费用类型
	 */
	 
	public void setFeiyongleixing(String feiyongleixing) {
		this.feiyongleixing = feiyongleixing;
	}
	
	/**
	 * 获取：费用类型
	 */
	public String getFeiyongleixing() {
		return feiyongleixing;
	}
				
	
	/**
	 * 设置：费用金额
	 */
	 
	public void setFeiyongjine(Float feiyongjine) {
		this.feiyongjine = feiyongjine;
	}
	
	/**
	 * 获取：费用金额
	 */
	public Float getFeiyongjine() {
		return feiyongjine;
	}
				
	
	/**
	 * 设置：费用描述
	 */
	 
	public void setFeiyongmiaoshu(String feiyongmiaoshu) {
		this.feiyongmiaoshu = feiyongmiaoshu;
	}
	
	/**
	 * 获取：费用描述
	 */
	public String getFeiyongmiaoshu() {
		return feiyongmiaoshu;
	}
				
	
	/**
	 * 设置：发送时间
	 */
	 
	public void setFasongshijian(Date fasongshijian) {
		this.fasongshijian = fasongshijian;
	}
	
	/**
	 * 获取：发送时间
	 */
	public Date getFasongshijian() {
		return fasongshijian;
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
	 * 设置：财务账号
	 */
	 
	public void setCaiwuzhanghao(String caiwuzhanghao) {
		this.caiwuzhanghao = caiwuzhanghao;
	}
	
	/**
	 * 获取：财务账号
	 */
	public String getCaiwuzhanghao() {
		return caiwuzhanghao;
	}
				
	
	/**
	 * 设置：财务姓名
	 */
	 
	public void setCaiwuxingming(String caiwuxingming) {
		this.caiwuxingming = caiwuxingming;
	}
	
	/**
	 * 获取：财务姓名
	 */
	public String getCaiwuxingming() {
		return caiwuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
