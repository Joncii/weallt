package com.weallt.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.food.domain.nutrient.Protein;
import com.weallt.service.food.domain.portion.ProteinPortion;
import com.weallt.web.food.domain.ProteinPortionView;

@Component
public class ProteinPortionViewTransformer {

    @Autowired
    private WeightPortionViewTransformer portionViewTransformer;

    public ProteinPortion transform(ProteinPortionView view) {
        ProteinPortion proteinPortion = new ProteinPortion();
        proteinPortion.setProtein(new Protein());
        proteinPortion.setWeightPortion(portionViewTransformer.transform(view.getWeightPortion()));
        return proteinPortion;
    }
    
    public ProteinPortionView transform(ProteinPortion proteinPortion){
        ProteinPortionView proteinPortionView = new ProteinPortionView();
        proteinPortionView.setWeightPortion(portionViewTransformer.transform(proteinPortion.getWeightPortion()));
        return proteinPortionView;
    }

}
