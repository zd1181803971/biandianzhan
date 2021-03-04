package com.dzu.sourcecode.service.impl;

import com.dzu.sourcecode.domain.WProvince;
import com.dzu.sourcecode.mapper.WProvinceMapper;
import com.dzu.sourcecode.service.IWProvinceService;
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
public class WProvinceServiceImpl implements IWProvinceService
{
    @Autowired
    private WProvinceMapper wProvinceMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param proid 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public WProvince selectWProvinceById(String proid)
    {
        return wProvinceMapper.selectWProvinceById(proid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param wProvince 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<WProvince> selectWProvinceList(WProvince wProvince)
    {
        return wProvinceMapper.selectWProvinceList(wProvince);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param wProvince 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertWProvince(WProvince wProvince)
    {
        return wProvinceMapper.insertWProvince(wProvince);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param wProvince 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateWProvince(WProvince wProvince)
    {
        return wProvinceMapper.updateWProvince(wProvince);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param proids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteWProvinceByIds(String[] proids)
    {
        return wProvinceMapper.deleteWProvinceByIds(proids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param proid 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteWProvinceById(String proid)
    {
        return wProvinceMapper.deleteWProvinceById(proid);
    }
}
