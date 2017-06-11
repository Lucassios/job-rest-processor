package io.datapath.processor;


import org.springframework.batch.item.ItemProcessor;

/**
 * Created by lucascmarques on 11/06/17.
 */
public class CalculatePiProcessor implements ItemProcessor<Integer, Double> {

    @Override
    public Double process(Integer count) throws Exception {
        double pi = 0;
        for (int i = 1; i < count; i++) {
            pi += Math.pow(-1,i+1) / (2*i - 1);
        }
        return 4 * pi;
    }
}
