package com.dzu.sourcecode.mapper;

import com.dzu.sourcecode.domain.WEquipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhaodong
 * @date 2021-03-03
 */
@Mapper
public interface WEquipmentMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param objId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public WEquipment selectWEquipmentById(String objId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param wEquipment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<WEquipment> selectWEquipmentList(WEquipment wEquipment);

    /**
     * 新增【请填写功能名称】
     *
     * @param wEquipment 【请填写功能名称】
     * @return 结果
     */
    public int insertWEquipment(WEquipment wEquipment);

    /**
     * 修改【请填写功能名称】
     *
     * @param wEquipment 【请填写功能名称】
     * @return 结果
     */
    public int updateWEquipment(WEquipment wEquipment);

    /**
     * 删除【请填写功能名称】
     *
     * @param objId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteWEquipmentById(String objId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param objIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWEquipmentByIds(String[] objIds);

    List<WEquipment> getEquBySSBM(String sid);
}
