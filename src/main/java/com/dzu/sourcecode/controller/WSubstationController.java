package com.dzu.sourcecode.controller;

import com.dzu.sourcecode.domain.WSubstation;
import com.dzu.sourcecode.service.IWSubstationService;
import com.dzu.sourcecode.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author zhaodong
 * @date 2021-03-03
 */
@RestController
@RequestMapping("/sub")
public class WSubstationController
{
    @Autowired
    private IWSubstationService wSubstationService;


    //根据公司获取其下所有的供电站
    @GetMapping("/proId/{pid}")
    public AjaxResult getSubByProId(@PathVariable("pid") String pid){
        List<WSubstation> subByProId = wSubstationService.getSubByProId(pid);
        return AjaxResult.success(subByProId);
    }

    //获取所有
    @GetMapping("/list")
    public AjaxResult list(WSubstation wSubstation)
    {
        List<WSubstation> wSubstations = wSubstationService.selectWSubstationList(wSubstation);
        return AjaxResult.success(wSubstations);
    }
    /**
     * 获取某个
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(wSubstationService.selectWSubstationById(id));
    }

    /**
     * 新增
     */
    @PostMapping
    public AjaxResult add(@RequestBody WSubstation wSubstation)
    {

        int subID = 0;
        List<WSubstation> wSubstations = wSubstationService.selectWSubstationList(new WSubstation());
        for (WSubstation sub: wSubstations
             ) {
            if ( Integer.parseInt(sub.getId()) > subID){
                subID = Integer.parseInt(sub.getId());
            }
        }
        wSubstation.setId(String.valueOf(subID+1));
        int i = wSubstationService.insertWSubstation(wSubstation);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public AjaxResult edit(@RequestBody WSubstation wSubstation)
    {
        int i = wSubstationService.updateWSubstation(wSubstation);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }

    /**
     * 删除
     */
	@PostMapping("/del/{id}")
    public AjaxResult remove(@PathVariable("id") String id)
    {
        int i = wSubstationService.deleteWSubstationById(id);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }
}
