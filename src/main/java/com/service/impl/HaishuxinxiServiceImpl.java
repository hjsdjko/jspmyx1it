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


import com.dao.HaishuxinxiDao;
import com.entity.HaishuxinxiEntity;
import com.service.HaishuxinxiService;
import com.entity.vo.HaishuxinxiVO;
import com.entity.view.HaishuxinxiView;

@Service("haishuxinxiService")
public class HaishuxinxiServiceImpl extends ServiceImpl<HaishuxinxiDao, HaishuxinxiEntity> implements HaishuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaishuxinxiEntity> page = this.selectPage(
                new Query<HaishuxinxiEntity>(params).getPage(),
                new EntityWrapper<HaishuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaishuxinxiEntity> wrapper) {
		  Page<HaishuxinxiView> page =new Query<HaishuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaishuxinxiVO> selectListVO(Wrapper<HaishuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaishuxinxiVO selectVO(Wrapper<HaishuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaishuxinxiView> selectListView(Wrapper<HaishuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaishuxinxiView selectView(Wrapper<HaishuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
