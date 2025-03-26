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


import com.dao.EmailregistercodeDao;
import com.entity.EmailregistercodeEntity;
import com.service.EmailregistercodeService;
import com.entity.vo.EmailregistercodeVO;
import com.entity.view.EmailregistercodeView;

@Service("emailregistercodeService")
public class EmailregistercodeServiceImpl extends ServiceImpl<EmailregistercodeDao, EmailregistercodeEntity> implements EmailregistercodeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<EmailregistercodeEntity> page = this.selectPage(
                new Query<EmailregistercodeEntity>(params).getPage(),
                new EntityWrapper<EmailregistercodeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<EmailregistercodeEntity> wrapper) {
		  Page<EmailregistercodeView> page =new Query<EmailregistercodeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<EmailregistercodeVO> selectListVO(Wrapper<EmailregistercodeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public EmailregistercodeVO selectVO(Wrapper<EmailregistercodeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<EmailregistercodeView> selectListView(Wrapper<EmailregistercodeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public EmailregistercodeView selectView(Wrapper<EmailregistercodeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
