package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaoshengxuanchuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaoshengxuanchuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaoshengxuanchuanView;


/**
 * 招生宣传
 *
 * @author 
 * @email 
 * @date 2022-04-28 12:09:06
 */
public interface ZhaoshengxuanchuanService extends IService<ZhaoshengxuanchuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaoshengxuanchuanVO> selectListVO(Wrapper<ZhaoshengxuanchuanEntity> wrapper);
   	
   	ZhaoshengxuanchuanVO selectVO(@Param("ew") Wrapper<ZhaoshengxuanchuanEntity> wrapper);
   	
   	List<ZhaoshengxuanchuanView> selectListView(Wrapper<ZhaoshengxuanchuanEntity> wrapper);
   	
   	ZhaoshengxuanchuanView selectView(@Param("ew") Wrapper<ZhaoshengxuanchuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaoshengxuanchuanEntity> wrapper);
   	

}

