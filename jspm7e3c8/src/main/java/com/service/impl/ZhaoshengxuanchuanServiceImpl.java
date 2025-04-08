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


import com.dao.ZhaoshengxuanchuanDao;
import com.entity.ZhaoshengxuanchuanEntity;
import com.service.ZhaoshengxuanchuanService;
import com.entity.vo.ZhaoshengxuanchuanVO;
import com.entity.view.ZhaoshengxuanchuanView;

@Service("zhaoshengxuanchuanService")
public class ZhaoshengxuanchuanServiceImpl extends ServiceImpl<ZhaoshengxuanchuanDao, ZhaoshengxuanchuanEntity> implements ZhaoshengxuanchuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaoshengxuanchuanEntity> page = this.selectPage(
                new Query<ZhaoshengxuanchuanEntity>(params).getPage(),
                new EntityWrapper<ZhaoshengxuanchuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaoshengxuanchuanEntity> wrapper) {
		  Page<ZhaoshengxuanchuanView> page =new Query<ZhaoshengxuanchuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaoshengxuanchuanVO> selectListVO(Wrapper<ZhaoshengxuanchuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaoshengxuanchuanVO selectVO(Wrapper<ZhaoshengxuanchuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaoshengxuanchuanView> selectListView(Wrapper<ZhaoshengxuanchuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaoshengxuanchuanView selectView(Wrapper<ZhaoshengxuanchuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
