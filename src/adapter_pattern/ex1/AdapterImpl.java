package adapter_pattern.ex1;

public class AdapterImpl implements Adapter {
    @Override
    public float twiceOf(Float f) {
        return (float) Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public float halfOf(Float f) {
        System.out.println("절반 함수 호출됨");
        return (float) Math.half(f.doubleValue() );
    }

}
