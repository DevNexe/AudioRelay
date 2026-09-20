package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class X extends AbstractC1528b2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC1530c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC1530c abstractC1530c, InterfaceC1558h2 interfaceC1558h2, int i) {
        super(interfaceC1558h2);
        this.b = i;
        this.c = abstractC1530c;
    }

    @Override // j$.util.stream.InterfaceC1548f2, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        int i2 = this.b;
        AbstractC1530c abstractC1530c = this.c;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        switch (i2) {
            case 0:
                interfaceC1558h2.accept(i);
                return;
            case 1:
                ((j$.util.function.L) ((C1619x) abstractC1530c).t).accept(i);
                interfaceC1558h2.accept(i);
                return;
            case 2:
                interfaceC1558h2.accept(i);
                return;
            case 3:
                interfaceC1558h2.accept(((j$.util.function.X) ((j$.util.function.Z) ((C1619x) abstractC1530c).t)).b(i));
                return;
            case 4:
                interfaceC1558h2.p(((IntFunction) ((C1615w) abstractC1530c).t).apply(i));
                return;
            case 5:
                interfaceC1558h2.accept(((j$.util.function.W) ((C1623y) abstractC1530c).t).applyAsLong(i));
                return;
            case 6:
                interfaceC1558h2.accept(((j$.util.function.Q) ((j$.util.function.T) ((C1611v) abstractC1530c).t)).a(i));
                return;
            case 7:
                IntStream intStream = (IntStream) ((IntFunction) ((C1619x) abstractC1530c).t).apply(i);
                if (intStream != null) {
                    try {
                        intStream.sequential().a0(new W(1, this));
                    } catch (Throwable th) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((j$.util.function.N) ((j$.util.function.P) ((C1619x) abstractC1530c).t)).e(i)) {
                    interfaceC1558h2.accept(i);
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        int i = this.b;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        switch (i) {
            case 7:
                interfaceC1558h2.f(-1L);
                break;
            case 8:
                interfaceC1558h2.f(-1L);
                break;
            default:
                interfaceC1558h2.f(j);
                break;
        }
    }
}
