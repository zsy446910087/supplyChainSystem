package org.nix.service.imp;

import org.nix.dao.mapper.CityMapper;
import org.nix.dao.mapper.MaterialMerchantsMapper;
import org.nix.model.city.City;
import org.nix.model.MaterialMerchantsModel;
import org.nix.service.BaseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class MaterialMerchantsService extends BaseService<MaterialMerchantsModel> {

    @Resource(name = "materialMerchantsMapper")
    private MaterialMerchantsMapper materialMerchantsMapper;

    /**
     *
     * 根据条件获取原料商的条数
     *
     */
    public long getCounts(MaterialMerchantsModel materialMerchantsModel){
        return materialMerchantsMapper.counts(materialMerchantsModel.getGoodsName(),
                materialMerchantsModel.getInventory(),
                materialMerchantsModel.getUnitPrice());
    }

}
