package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.InterfaceC1478f;
import j$.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1617w1 extends AbstractC1616w0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1617w1(W2 w2, Object obj, Object obj2, Object obj3, int i) {
        super(w2);
        this.h = i;
        this.i = obj;
        this.k = obj2;
        this.j = obj3;
    }

    @Override // j$.util.stream.AbstractC1616w0
    public final P1 u1() {
        int i = this.h;
        Object obj = this.i;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                return new C1621x1((Supplier) obj3, (j$.util.function.F0) obj2, (InterfaceC1478f) obj);
            case 1:
                return new C1((Supplier) obj3, (j$.util.function.z0) obj2, (InterfaceC1478f) obj);
            case 2:
                return new D1(obj3, (BiFunction) obj2, (InterfaceC1478f) obj);
            case 3:
                return new H1((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new L1((Supplier) obj3, (j$.util.function.C0) obj2, (InterfaceC1478f) obj);
        }
    }
}
