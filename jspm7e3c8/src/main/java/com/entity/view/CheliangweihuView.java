package com.entity.view;

import com.entity.CheliangweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆维护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
@TableName("cheliangweihu")
public class CheliangweihuView  extends CheliangweihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangweihuView(){
	}
 
 	public CheliangweihuView(CheliangweihuEntity cheliangweihuEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangweihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
