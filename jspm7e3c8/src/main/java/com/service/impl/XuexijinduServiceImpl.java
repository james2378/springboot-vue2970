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


import com.dao.XuexijinduDao;
import com.entity.XuexijinduEntity;
import com.service.XuexijinduService;
import com.entity.vo.XuexijinduVO;
import com.entity.view.XuexijinduView;

@Service("xuexijinduService")
public class XuexijinduServiceImpl extends ServiceImpl<XuexijinduDao, XuexijinduEntity> implements XuexijinduService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexijinduEntity> page = this.selectPage(
                new Query<XuexijinduEntity>(params).getPage(),
                new EntityWrapper<XuexijinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexijinduEntity> wrapper) {
		  Page<XuexijinduView> page =new Query<XuexijinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexijinduVO> selectListVO(Wrapper<XuexijinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexijinduVO selectVO(Wrapper<XuexijinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexijinduView> selectListView(Wrapper<XuexijinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexijinduView selectView(Wrapper<XuexijinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
