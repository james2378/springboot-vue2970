package com.dao;

import com.entity.ZhaoshengxuanchuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaoshengxuanchuanVO;
import com.entity.view.ZhaoshengxuanchuanView;


/**
 * 招生宣传
 * 
 * @author 
 * @email 
 * @date 2022-04-28 12:09:06
 */
public interface ZhaoshengxuanchuanDao extends BaseMapper<ZhaoshengxuanchuanEntity> {
	
	List<ZhaoshengxuanchuanVO> selectListVO(@Param("ew") Wrapper<ZhaoshengxuanchuanEntity> wrapper);
	
	ZhaoshengxuanchuanVO selectVO(@Param("ew") Wrapper<ZhaoshengxuanchuanEntity> wrapper);
	
	List<ZhaoshengxuanchuanView> selectListView(@Param("ew") Wrapper<ZhaoshengxuanchuanEntity> wrapper);

	List<ZhaoshengxuanchuanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaoshengxuanchuanEntity> wrapper);
	
	ZhaoshengxuanchuanView selectView(@Param("ew") Wrapper<ZhaoshengxuanchuanEntity> wrapper);
	

}
