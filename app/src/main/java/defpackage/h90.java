package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class h90<K, V> {
    private volatile /* synthetic */ Object current = ds0.w;

    static {
        AtomicReferenceFieldUpdater.newUpdater(h90.class, Object.class, "current");
    }

    public final Object a(sy4 sy4Var) {
        return ((Map) this.current).get(sy4Var);
    }
}
