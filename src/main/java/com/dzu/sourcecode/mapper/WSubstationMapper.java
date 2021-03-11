package com.dzu.sourcecode.mapper;

import com.dzu.sourcecode.domain.WSubstation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhaodong
 * @date 2021-03-03
 */
@Mapper
public interface WSubstationMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public WSubstation selectWSubstationById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param wSubstation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<WSubstation> selectWSubstationList(WSubstation wSubstation);

    /**
     * 新增【请填写功能名称】
     *
     * @param wSubstation 【请填写功能名称】
     * @return 结果
     */
    public int insertWSubstation(WSubstation wSubstation);

    /**
     * 修改【请填写功能名称】
     *
     * @param wSubstation 【请填写功能名称】
     * @return 结果
     */
    public int updateWSubstation(WSubstation wSubstation);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteWSubstationById(String id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWSubstationByIds(String[] ids);

    List<WSubstation> getSubByProId(String pid);
}
