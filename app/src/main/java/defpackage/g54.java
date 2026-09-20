package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlinx.coroutines.scheduling.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public class g54 extends gv0 {
    public final QnHx y;

    public g54(int i, int i2, long j) {
        this.y = new QnHx(i, i2, "DefaultDispatcher", j);
    }

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = QnHx.D;
        this.y.c(runnable, l15.f, false);
    }

    @Override // defpackage.oa0
    public final void n(la0 la0Var, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = QnHx.D;
        this.y.c(runnable, l15.f, true);
    }
}
