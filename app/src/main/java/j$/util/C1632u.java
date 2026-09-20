package j$.util;

import j$.util.function.C1475d0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1632u implements InterfaceC1481g0 {
    public final /* synthetic */ Consumer a;

    @Override // j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        this.a.accept(Long.valueOf(j));
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }
}
