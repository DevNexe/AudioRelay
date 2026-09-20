package j$.util.stream;

import j$.util.function.Function;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1494n;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1592q extends AbstractC1538d2 {
    public final /* synthetic */ int b = 0;
    Object c;
    final /* synthetic */ AbstractC1530c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592q(r rVar, InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
        this.d = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592q(C1611v c1611v, InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
        this.d = c1611v;
        this.c = new C1603t(0, interfaceC1558h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592q(C1619x c1619x, InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
        this.d = c1619x;
        this.c = new W(0, interfaceC1558h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592q(C1623y c1623y, InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
        this.d = c1623y;
        this.c = new C1541e0(0, interfaceC1558h2);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        int i = this.b;
        AbstractC1530c abstractC1530c = this.d;
        switch (i) {
            case 0:
                if (((Set) this.c).contains(obj)) {
                    return;
                }
                ((Set) this.c).add(obj);
                this.a.p(obj);
                return;
            case 1:
                InterfaceC1581n0 interfaceC1581n0 = (InterfaceC1581n0) ((Function) ((C1623y) abstractC1530c).t).apply(obj);
                if (interfaceC1581n0 != null) {
                    try {
                        interfaceC1581n0.sequential().G((InterfaceC1481g0) this.c);
                    } catch (Throwable th) {
                        try {
                            interfaceC1581n0.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC1581n0 != null) {
                    interfaceC1581n0.close();
                    return;
                }
                return;
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C1619x) abstractC1530c).t).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().a0((j$.util.function.L) this.c);
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                G g = (G) ((Function) ((C1611v) abstractC1530c).t).apply(obj);
                if (g != null) {
                    try {
                        g.sequential().J((InterfaceC1494n) this.c);
                    } catch (Throwable th5) {
                        try {
                            g.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (g != null) {
                    g.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1538d2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        int i = this.b;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        switch (i) {
            case 0:
                this.c = new HashSet();
                interfaceC1558h2.f(-1L);
                break;
            case 1:
                interfaceC1558h2.f(-1L);
                break;
            case 2:
                interfaceC1558h2.f(-1L);
                break;
            default:
                interfaceC1558h2.f(-1L);
                break;
        }
    }
}
