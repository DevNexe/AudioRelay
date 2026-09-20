package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GPUw implements Bpm {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Bpm
    public final <T> void a(Dt<T> dt, T t) {
        g().put(dt, t);
    }

    @Override // defpackage.Bpm
    public final List<Dt<?>> b() {
        return wu.e1(g().keySet());
    }

    @Override // defpackage.Bpm
    public final boolean c(Dt<?> dt) {
        return g().containsKey(dt);
    }

    @Override // defpackage.Bpm
    public final <T> T d(Dt<T> dt) {
        return (T) g().get(dt);
    }

    @Override // defpackage.Bpm
    public final <T> T e(Dt<T> dt) {
        T t = (T) d(dt);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("No instance for key " + dt);
    }

    public abstract Map<Dt<?>, Object> g();
}
