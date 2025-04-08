package com.dao;

import com.entity.CheliangweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangweihuVO;
import com.entity.view.CheliangweihuView;


/**
 * 车辆维护
 * 
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public interface CheliangweihuDao extends BaseMapper<CheliangweihuEntity> {
	
	List<CheliangweihuVO> selectListVO(@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
	
	CheliangweihuVO selectVO(@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
	
	List<CheliangweihuView> selectListView(@Param("ew") Wrapper<CheliangweihuEntity> wrapper);

	List<CheliangweihuView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
	
	CheliangweihuView selectView(@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangweihuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangweihuEntity> wrapper);
}
