package com.dao;

import com.entity.XuexijinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexijinduVO;
import com.entity.view.XuexijinduView;


/**
 * 学习进度
 * 
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public interface XuexijinduDao extends BaseMapper<XuexijinduEntity> {
	
	List<XuexijinduVO> selectListVO(@Param("ew") Wrapper<XuexijinduEntity> wrapper);
	
	XuexijinduVO selectVO(@Param("ew") Wrapper<XuexijinduEntity> wrapper);
	
	List<XuexijinduView> selectListView(@Param("ew") Wrapper<XuexijinduEntity> wrapper);

	List<XuexijinduView> selectListView(Pagination page,@Param("ew") Wrapper<XuexijinduEntity> wrapper);
	
	XuexijinduView selectView(@Param("ew") Wrapper<XuexijinduEntity> wrapper);
	

}
