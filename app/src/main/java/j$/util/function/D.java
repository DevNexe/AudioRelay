package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ D(Function function, Function function2, int i) {
        this.a = i;
        this.b = function;
        this.c = function2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Function function = this.c;
        Function function2 = this.b;
        switch (i) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Function.CC.$default$compose(this, function);
    }
}
