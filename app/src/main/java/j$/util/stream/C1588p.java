package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1588p extends AbstractC1538d2 {
    boolean b;
    Object c;

    C1588p(InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        if (obj != null) {
            Object obj2 = this.c;
            if (obj2 != null && obj.equals(obj2)) {
                return;
            }
        } else {
            if (this.b) {
                return;
            }
            this.b = true;
            obj = null;
        }
        this.c = obj;
        interfaceC1558h2.p(obj);
    }

    @Override // j$.util.stream.AbstractC1538d2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        this.b = false;
        this.c = null;
        this.a.end();
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        this.b = false;
        this.c = null;
        this.a.f(-1L);
    }
}
