package com.dzu.sourcecode.service.impl;

import com.dzu.sourcecode.domain.WEquipment;
import com.dzu.sourcecode.mapper.WEquipmentMapper;
import com.dzu.sourcecode.service.IWEquipmentService;
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
public class WEquipmentServiceImpl implements IWEquipmentService
{

    @Autowired
    private WEquipmentMapper wEquipmentMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param objId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public WEquipment selectWEquipmentById(String objId)
    {
        return wEquipmentMapper.selectWEquipmentById(objId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param wEquipment 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<WEquipment> selectWEquipmentList(WEquipment wEquipment)
    {
        return wEquipmentMapper.selectWEquipmentList(wEquipment);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param wEquipment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertWEquipment(WEquipment wEquipment)
    {
        return wEquipmentMapper.insertWEquipment(wEquipment);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param wEquipment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateWEquipment(WEquipment wEquipment)
    {
        return wEquipmentMapper.updateWEquipment(wEquipment);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param objIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteWEquipmentByIds(String[] objIds)
    {
        return wEquipmentMapper.deleteWEquipmentByIds(objIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param objId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteWEquipmentById(String objId)
    {
        return wEquipmentMapper.deleteWEquipmentById(objId);
    }
}
