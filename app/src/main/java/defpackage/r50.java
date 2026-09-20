package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r50<T> extends vq2<T> {
    public abstract void G(m70<? super vl0> m70Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final js2 H() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        k95 k95Var = j54.d;
        mq2.c(1, "subscriberCount");
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (k95Var != null) {
            return new js2(this instanceof is2 ? new hs2(((is2) this).e()) : this, timeUnit, k95Var);
        }
        throw new NullPointerException("scheduler is null");
    }
}
