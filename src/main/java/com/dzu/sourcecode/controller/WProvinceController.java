package com.dzu.sourcecode.controller;

import com.dzu.sourcecode.domain.WProvince;
import com.dzu.sourcecode.service.IWProvinceService;
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
@RequestMapping("/vice")
public class WProvinceController
{
    @Autowired
    private IWProvinceService wProvinceService;

    /**
     * 查询
     */
    @GetMapping("/list")
    public AjaxResult list(WProvince wProvince)
    {
        List<WProvince> wProvinces = wProvinceService.selectWProvinceList(wProvince);
        return AjaxResult.success(wProvinces);
    }



    /**
     * 获取
     */
    @GetMapping(value = "/{proid}")
    public AjaxResult getInfo(@PathVariable("proid") String proid)
    {
        return AjaxResult.success(wProvinceService.selectWProvinceById(proid));
    }

    /**
     * 新增
     */
    @PostMapping
    public AjaxResult add(@RequestBody WProvince wProvince)
    {
        int subID = 0;
        List<WProvince> wProvinces = wProvinceService.selectWProvinceList(new WProvince());
        for (WProvince sub: wProvinces
        ) {
            if ( Integer.parseInt(sub.getProid()) > subID){
                subID = Integer.parseInt(sub.getProid());
            }
        }
        wProvince.setProid(String.valueOf(subID+1));
        wProvince.setParproid("国家电网");
        int i = wProvinceService.insertWProvince(wProvince);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }

    /**
     * 修改
     */
    @PutMapping
    public AjaxResult edit(@RequestBody WProvince wProvince)
    {
        int i = wProvinceService.updateWProvince(wProvince);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }

    }

    /**
     * 删除
     */
	@DeleteMapping("/{proids}")
    public AjaxResult remove(@PathVariable String[] proids)
    {
        int i = wProvinceService.deleteWProvinceByIds(proids);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }
}
