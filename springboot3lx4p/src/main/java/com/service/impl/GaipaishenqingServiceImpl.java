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


import com.dao.GaipaishenqingDao;
import com.entity.GaipaishenqingEntity;
import com.service.GaipaishenqingService;
import com.entity.vo.GaipaishenqingVO;
import com.entity.view.GaipaishenqingView;

@Service("gaipaishenqingService")
public class GaipaishenqingServiceImpl extends ServiceImpl<GaipaishenqingDao, GaipaishenqingEntity> implements GaipaishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GaipaishenqingEntity> page = this.selectPage(
                new Query<GaipaishenqingEntity>(params).getPage(),
                new EntityWrapper<GaipaishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GaipaishenqingEntity> wrapper) {
		  Page<GaipaishenqingView> page =new Query<GaipaishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GaipaishenqingVO> selectListVO(Wrapper<GaipaishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GaipaishenqingVO selectVO(Wrapper<GaipaishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GaipaishenqingView> selectListView(Wrapper<GaipaishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GaipaishenqingView selectView(Wrapper<GaipaishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
