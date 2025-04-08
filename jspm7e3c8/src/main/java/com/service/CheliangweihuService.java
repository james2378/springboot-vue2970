package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangweihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangweihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangweihuView;


/**
 * 车辆维护
 *
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public interface CheliangweihuService extends IService<CheliangweihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangweihuVO> selectListVO(Wrapper<CheliangweihuEntity> wrapper);
   	
   	CheliangweihuVO selectVO(@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
   	
   	List<CheliangweihuView> selectListView(Wrapper<CheliangweihuEntity> wrapper);
   	
   	CheliangweihuView selectView(@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangweihuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CheliangweihuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CheliangweihuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CheliangweihuEntity> wrapper);
}

