package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c50 extends GPUw {
    public final ConcurrentHashMap<Dt<?>, Object> a = new ConcurrentHashMap<>();

    @Override // defpackage.Bpm
    public final <T> T f(Dt<T> dt, h81<? extends T> h81Var) {
        ConcurrentHashMap<Dt<?>, Object> concurrentHashMap = this.a;
        T t = (T) concurrentHashMap.get(dt);
        if (t != null) {
            return t;
        }
        T tInvoke = h81Var.invoke();
        T t2 = (T) concurrentHashMap.putIfAbsent((Dt<?>) dt, tInvoke);
        return t2 == null ? tInvoke : t2;
    }

    @Override // defpackage.GPUw
    public final Map g() {
        return this.a;
    }
}
