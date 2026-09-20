package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class av3 extends AtomicReference implements vl0 {
    public final /* synthetic */ int w = 2;

    public av3(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.vl0
    public final void a() {
        Object andSet;
        um umVar;
        switch (this.w) {
            case 0:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            case 1:
                if (get() != null && (umVar = (um) getAndSet(null)) != null) {
                    try {
                        umVar.cancel();
                    } catch (Exception e) {
                        XTd3.w(e);
                        m14.b(e);
                    }
                    break;
                }
                break;
            default:
                bm0.c(this);
                break;
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        switch (this.w) {
            case 0:
                return get() == null;
            case 1:
                return get() == null;
            default:
                return bm0.d((vl0) get());
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        switch (this.w) {
            case 0:
                return "RunnableDisposable(disposed=" + e() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    public av3(um umVar) {
        super(umVar);
    }

    public av3() {
    }

    public av3(av3 av3Var) {
        lazySet(av3Var);
    }
}
