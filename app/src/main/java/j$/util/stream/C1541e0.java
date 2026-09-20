package j$.util.stream;

import j$.util.function.C1475d0;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1541e0 implements InterfaceC1481g0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC1558h2 b;

    public /* synthetic */ C1541e0(int i, InterfaceC1558h2 interfaceC1558h2) {
        this.a = i;
        this.b = interfaceC1558h2;
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        int i = this.a;
        InterfaceC1558h2 interfaceC1558h2 = this.b;
        switch (i) {
            case 0:
                interfaceC1558h2.accept(j);
                break;
            default:
                ((C1551g0) interfaceC1558h2).a.accept(j);
                break;
        }
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        switch (this.a) {
            case 0:
                interfaceC1481g0.getClass();
                break;
            default:
                interfaceC1481g0.getClass();
                break;
        }
        return new C1475d0(this, interfaceC1481g0);
    }
}
