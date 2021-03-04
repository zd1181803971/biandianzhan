package com.dzu.sourcecode.service;

import com.dzu.sourcecode.domain.WSubstation;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author zhaodong
 * @date 2021-03-03
 */
public interface IWSubstationService
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
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteWSubstationByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteWSubstationById(String id);
}
