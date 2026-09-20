package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C1474d;
import j$.util.function.Function;
import j$.util.function.InterfaceC1478f;
import j$.util.function.Supplier;
import java.util.Set;
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1568k implements InterfaceC1576m {
    public final /* synthetic */ Collector a;

    private /* synthetic */ C1568k(Collector collector) {
        this.a = collector;
    }

    public static /* synthetic */ InterfaceC1576m d(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C1572l ? ((C1572l) collector).a : new C1568k(collector);
    }

    public final /* synthetic */ BiConsumer a() {
        return BiConsumer.VivifiedWrapper.convert(this.a.accumulator());
    }

    public final /* synthetic */ Set b() {
        return this.a.characteristics();
    }

    public final /* synthetic */ InterfaceC1478f c() {
        return C1474d.a(this.a.combiner());
    }

    public final /* synthetic */ Function e() {
        return Function.VivifiedWrapper.convert(this.a.finisher());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1568k) {
            obj = ((C1568k) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ Supplier f() {
        return j$.util.function.J0.a(this.a.supplier());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
