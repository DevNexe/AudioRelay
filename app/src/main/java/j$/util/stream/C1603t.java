package j$.util.stream;

import j$.util.function.C1488k;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1603t implements InterfaceC1494n {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC1558h2 b;

    public /* synthetic */ C1603t(int i, InterfaceC1558h2 interfaceC1558h2) {
        this.a = i;
        this.b = interfaceC1558h2;
    }

    @Override // j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        int i = this.a;
        InterfaceC1558h2 interfaceC1558h2 = this.b;
        switch (i) {
            case 0:
                interfaceC1558h2.accept(d);
                break;
            default:
                ((C1607u) interfaceC1558h2).a.accept(d);
                break;
        }
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        switch (this.a) {
            case 0:
                interfaceC1494n.getClass();
                break;
            default:
                interfaceC1494n.getClass();
                break;
        }
        return new C1488k(this, interfaceC1494n);
    }
}
