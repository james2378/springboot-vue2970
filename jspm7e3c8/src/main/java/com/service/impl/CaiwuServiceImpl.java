package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaiwuDao;
import com.entity.CaiwuEntity;
import com.service.CaiwuService;
import com.entity.vo.CaiwuVO;
import com.entity.view.CaiwuView;

@Service("caiwuService")
public class CaiwuServiceImpl extends ServiceImpl<CaiwuDao, CaiwuEntity> implements CaiwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwuEntity> page = this.selectPage(
                new Query<CaiwuEntity>(params).getPage(),
                new EntityWrapper<CaiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwuEntity> wrapper) {
		  Page<CaiwuView> page =new Query<CaiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwuVO> selectListVO(Wrapper<CaiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwuVO selectVO(Wrapper<CaiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwuView> selectListView(Wrapper<CaiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwuView selectView(Wrapper<CaiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
