package com.dzu.sourcecode.service.impl;

import com.dzu.sourcecode.domain.WSubstation;
import com.dzu.sourcecode.mapper.WSubstationMapper;
import com.dzu.sourcecode.service.IWSubstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author zhaodong
 * @date 2021-03-03
 */
@Service
public class WSubstationServiceImpl implements IWSubstationService
{
    @Autowired
    private WSubstationMapper wSubstationMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public WSubstation selectWSubstationById(String id)
    {
        return wSubstationMapper.selectWSubstationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param wSubstation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<WSubstation> selectWSubstationList(WSubstation wSubstation)
    {
        return wSubstationMapper.selectWSubstationList(wSubstation);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param wSubstation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertWSubstation(WSubstation wSubstation)
    {
        return wSubstationMapper.insertWSubstation(wSubstation);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param wSubstation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateWSubstation(WSubstation wSubstation)
    {
        return wSubstationMapper.updateWSubstation(wSubstation);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteWSubstationByIds(String[] ids)
    {
        return wSubstationMapper.deleteWSubstationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteWSubstationById(String id)
    {
        return wSubstationMapper.deleteWSubstationById(id);
    }
}
