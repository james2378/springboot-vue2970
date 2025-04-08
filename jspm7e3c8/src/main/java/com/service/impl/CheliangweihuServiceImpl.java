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


import com.dao.CheliangweihuDao;
import com.entity.CheliangweihuEntity;
import com.service.CheliangweihuService;
import com.entity.vo.CheliangweihuVO;
import com.entity.view.CheliangweihuView;

@Service("cheliangweihuService")
public class CheliangweihuServiceImpl extends ServiceImpl<CheliangweihuDao, CheliangweihuEntity> implements CheliangweihuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangweihuEntity> page = this.selectPage(
                new Query<CheliangweihuEntity>(params).getPage(),
                new EntityWrapper<CheliangweihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangweihuEntity> wrapper) {
		  Page<CheliangweihuView> page =new Query<CheliangweihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangweihuVO> selectListVO(Wrapper<CheliangweihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangweihuVO selectVO(Wrapper<CheliangweihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangweihuView> selectListView(Wrapper<CheliangweihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangweihuView selectView(Wrapper<CheliangweihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CheliangweihuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CheliangweihuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CheliangweihuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
