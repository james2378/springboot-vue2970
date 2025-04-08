package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwuView;


/**
 * 财务
 *
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public interface CaiwuService extends IService<CaiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwuVO> selectListVO(Wrapper<CaiwuEntity> wrapper);
   	
   	CaiwuVO selectVO(@Param("ew") Wrapper<CaiwuEntity> wrapper);
   	
   	List<CaiwuView> selectListView(Wrapper<CaiwuEntity> wrapper);
   	
   	CaiwuView selectView(@Param("ew") Wrapper<CaiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwuEntity> wrapper);
   	

}

