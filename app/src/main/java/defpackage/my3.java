package defpackage;

import j$.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my3 implements Function {
    public final /* synthetic */ int a;

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
        switch (this.a) {
            case 0:
                return ((yb4) obj).y0();
            default:
                return ((yb4) obj).z;
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
