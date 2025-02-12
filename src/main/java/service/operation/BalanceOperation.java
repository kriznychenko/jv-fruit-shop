package service.operation;

import db.Storage;
import model.FruitTransaction;

public class BalanceOperation implements OperationHandler {
    @Override
    public void getOperation(FruitTransaction fruitTransaction) {
        Storage.add(fruitTransaction.getFruit(), fruitTransaction.getQuantity());
    }
}
