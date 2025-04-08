package com.dao;

import com.entity.CaiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwuVO;
import com.entity.view.CaiwuView;


/**
 * 财务
 * 
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public interface CaiwuDao extends BaseMapper<CaiwuEntity> {
	
	List<CaiwuVO> selectListVO(@Param("ew") Wrapper<CaiwuEntity> wrapper);
	
	CaiwuVO selectVO(@Param("ew") Wrapper<CaiwuEntity> wrapper);
	
	List<CaiwuView> selectListView(@Param("ew") Wrapper<CaiwuEntity> wrapper);

	List<CaiwuView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwuEntity> wrapper);
	
	CaiwuView selectView(@Param("ew") Wrapper<CaiwuEntity> wrapper);
	

}
