package j$.util.stream;

import j$.util.AbstractC1514m;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class D2 extends AbstractC1614v2 {
    private ArrayList d;

    D2(InterfaceC1558h2 interfaceC1558h2, Comparator comparator) {
        super(interfaceC1558h2, comparator);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.AbstractC1538d2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        AbstractC1514m.r(this.d, this.b);
        long size = this.d.size();
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        interfaceC1558h2.f(size);
        if (this.c) {
            for (Object obj : this.d) {
                if (interfaceC1558h2.h()) {
                    break;
                } else {
                    interfaceC1558h2.p(obj);
                }
            }
        } else {
            ArrayList arrayList = this.d;
            interfaceC1558h2.getClass();
            AbstractC1514m.q(arrayList, new C1520a(3, interfaceC1558h2));
        }
        interfaceC1558h2.end();
        this.d = null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
