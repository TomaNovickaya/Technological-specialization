public interface OperationFactory {
    ComplexOperation createAddOperation();
    ComplexOperation createSubtractOperation();
    ComplexOperation createMultiplyOperation();
    ComplexOperation createDivideOperation();
}
