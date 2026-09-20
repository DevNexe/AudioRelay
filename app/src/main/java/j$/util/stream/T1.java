package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
final class T1 extends AbstractC1538d2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC1530c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T1(AbstractC1530c abstractC1530c, InterfaceC1558h2 interfaceC1558h2, int i) {
        super(interfaceC1558h2);
        this.b = i;
        this.c = abstractC1530c;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        int i = this.b;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        AbstractC1530c abstractC1530c = this.c;
        switch (i) {
            case 0:
                ((Consumer) ((C1615w) abstractC1530c).t).p(obj);
                interfaceC1558h2.p(obj);
                return;
            case 1:
                if (((Predicate) ((C1615w) abstractC1530c).t).test(obj)) {
                    interfaceC1558h2.p(obj);
                    return;
                }
                return;
            case 2:
                interfaceC1558h2.p(((V1) abstractC1530c).t.apply(obj));
                return;
            case 3:
                interfaceC1558h2.accept(((ToIntFunction) ((C1619x) abstractC1530c).t).applyAsInt(obj));
                return;
            case 4:
                interfaceC1558h2.accept(((ToLongFunction) ((C1623y) abstractC1530c).t).applyAsLong(obj));
                return;
            case 5:
                interfaceC1558h2.accept(((ToDoubleFunction) ((C1611v) abstractC1530c).t).applyAsDouble(obj));
                return;
            default:
                Stream stream = (Stream) ((V1) abstractC1530c).t.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(interfaceC1558h2);
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
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
            case 1:
                interfaceC1558h2.f(-1L);
                break;
            case 6:
                interfaceC1558h2.f(-1L);
                break;
            default:
                interfaceC1558h2.f(j);
                break;
        }
    }
}
