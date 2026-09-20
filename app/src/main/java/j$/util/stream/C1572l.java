package j$.util.stream;

import j$.util.function.C1468a;
import j$.util.function.C1476e;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1572l implements Collector {
    public final /* synthetic */ InterfaceC1576m a;

    private /* synthetic */ C1572l(InterfaceC1576m interfaceC1576m) {
        this.a = interfaceC1576m;
    }

    public static /* synthetic */ Collector a(InterfaceC1576m interfaceC1576m) {
        if (interfaceC1576m == null) {
            return null;
        }
        return interfaceC1576m instanceof C1568k ? ((C1568k) interfaceC1576m).a : new C1572l(interfaceC1576m);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return C1468a.a(((C1568k) this.a).a());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return ((C1568k) this.a).b();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return C1476e.a(((C1568k) this.a).c());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1576m interfaceC1576m = this.a;
        if (obj instanceof C1572l) {
            obj = ((C1572l) obj).a;
        }
        return interfaceC1576m.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return j$.util.function.E.a(((C1568k) this.a).e());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return j$.util.function.K0.a(((C1568k) this.a).f());
    }
}
