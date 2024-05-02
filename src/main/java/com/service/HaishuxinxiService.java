package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaishuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaishuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaishuxinxiView;


/**
 * 还书信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 16:12:18
 */
public interface HaishuxinxiService extends IService<HaishuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaishuxinxiVO> selectListVO(Wrapper<HaishuxinxiEntity> wrapper);
   	
   	HaishuxinxiVO selectVO(@Param("ew") Wrapper<HaishuxinxiEntity> wrapper);
   	
   	List<HaishuxinxiView> selectListView(Wrapper<HaishuxinxiEntity> wrapper);
   	
   	HaishuxinxiView selectView(@Param("ew") Wrapper<HaishuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaishuxinxiEntity> wrapper);
   	

}

