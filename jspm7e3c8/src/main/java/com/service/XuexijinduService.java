package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexijinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexijinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexijinduView;


/**
 * 学习进度
 *
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public interface XuexijinduService extends IService<XuexijinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexijinduVO> selectListVO(Wrapper<XuexijinduEntity> wrapper);
   	
   	XuexijinduVO selectVO(@Param("ew") Wrapper<XuexijinduEntity> wrapper);
   	
   	List<XuexijinduView> selectListView(Wrapper<XuexijinduEntity> wrapper);
   	
   	XuexijinduView selectView(@Param("ew") Wrapper<XuexijinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexijinduEntity> wrapper);
   	

}

