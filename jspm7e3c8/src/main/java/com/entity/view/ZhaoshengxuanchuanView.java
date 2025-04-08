package com.entity.view;

import com.entity.ZhaoshengxuanchuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招生宣传
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 12:09:06
 */
@TableName("zhaoshengxuanchuan")
public class ZhaoshengxuanchuanView  extends ZhaoshengxuanchuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaoshengxuanchuanView(){
	}
 
 	public ZhaoshengxuanchuanView(ZhaoshengxuanchuanEntity zhaoshengxuanchuanEntity){
 	try {
			BeanUtils.copyProperties(this, zhaoshengxuanchuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
