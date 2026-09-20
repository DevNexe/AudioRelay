package defpackage;

import j$.util.function.Function;
import j$.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg4 implements UnaryOperator {
    public final /* synthetic */ j81 a;

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return (af4) this.a.invoke((af4) obj);
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
