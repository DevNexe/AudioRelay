package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1487j0;
import j$.util.function.Supplier;
import java.util.List;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1520a implements Supplier, InterfaceC1487j0, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1520a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                ((InterfaceC1558h2) obj2).p(obj);
                break;
            default:
                ((List) obj2).add(obj);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 3:
                break;
            default:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1487j0
    public final Object apply(long j) {
        IntFunction intFunction = (IntFunction) this.b;
        int i = L0.k;
        return AbstractC1616w0.P0(j, intFunction);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (Spliterator) obj;
            default:
                return ((AbstractC1530c) obj).G1();
        }
    }
}
