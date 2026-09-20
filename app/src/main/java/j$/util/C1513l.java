package j$.util;

import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1513l implements InterfaceC1494n {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C1513l(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        this.a.accept(Double.valueOf(d));
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }
}
