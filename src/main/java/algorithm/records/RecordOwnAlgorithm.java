package algorithm.records;

import algorithm.alternativeness.AlternativeElector;
import algorithm.alternativeness.FromMapAlternativeElector;
import algorithm.alternativeness.RandomAlternativeElector;
import algorithm.model.order.Order;
import algorithm.model.production.Production;
import algorithm.operationchooser.FirstElementChooser;
import algorithm.operationchooser.OperationChooser;
import parse.input.order.InputOrder;
import parse.input.production.InputProduction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class RecordOwnAlgorithm extends RecordsAbstractAlgorithm {

    protected HashMap<Long, Integer> variant;
    public RecordOwnAlgorithm(Production production, ArrayList<Order> orders, LocalDateTime startTime, HashMap<Long, Integer> variant) {
        super(production, orders, startTime, null, new FromMapAlternativeElector(variant));
        this.variant = variant;
    }

    public RecordOwnAlgorithm(InputProduction inputProduction, ArrayList<InputOrder> inputOrders, LocalDateTime startTime, HashMap<Long, Integer> variant) {
        super(inputProduction, inputOrders, startTime, null, new FromMapAlternativeElector(variant));
        this.variant = variant;
    }

    @Override
    protected HashMap<Long, Integer> getAlternativenessMap() {
        return this.variant;
    }
}
