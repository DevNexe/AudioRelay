package j$.util.function;

import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.function.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1472c implements InterfaceC1478f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ C1472c(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    @Override // j$.util.function.BiFunction
    public final BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                function.getClass();
                break;
            default:
                function.getClass();
                break;
        }
        return new j$.util.concurrent.u(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        Comparator comparator = this.b;
        switch (i) {
            case 0:
                return comparator.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
