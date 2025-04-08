package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshichengjiView;


/**
 * 考试成绩
 *
 * @author 
 * @email 
 * @date 2022-04-28 12:09:06
 */
public interface KaoshichengjiService extends IService<KaoshichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshichengjiVO> selectListVO(Wrapper<KaoshichengjiEntity> wrapper);
   	
   	KaoshichengjiVO selectVO(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);
   	
   	List<KaoshichengjiView> selectListView(Wrapper<KaoshichengjiEntity> wrapper);
   	
   	KaoshichengjiView selectView(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshichengjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KaoshichengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KaoshichengjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KaoshichengjiEntity> wrapper);
}

