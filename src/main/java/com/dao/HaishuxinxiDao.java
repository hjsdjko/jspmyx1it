package com.dao;

import com.entity.HaishuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaishuxinxiVO;
import com.entity.view.HaishuxinxiView;


/**
 * 还书信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 16:12:18
 */
public interface HaishuxinxiDao extends BaseMapper<HaishuxinxiEntity> {
	
	List<HaishuxinxiVO> selectListVO(@Param("ew") Wrapper<HaishuxinxiEntity> wrapper);
	
	HaishuxinxiVO selectVO(@Param("ew") Wrapper<HaishuxinxiEntity> wrapper);
	
	List<HaishuxinxiView> selectListView(@Param("ew") Wrapper<HaishuxinxiEntity> wrapper);

	List<HaishuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HaishuxinxiEntity> wrapper);
	
	HaishuxinxiView selectView(@Param("ew") Wrapper<HaishuxinxiEntity> wrapper);
	

}
