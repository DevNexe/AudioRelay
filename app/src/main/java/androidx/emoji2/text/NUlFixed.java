package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class NUlFixed extends LPt8Fixed.T23 {
    public final /* synthetic */ LPt8Fixed.T23 a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public NUlFixed(LPt8Fixed.T23 t23, ThreadPoolExecutor threadPoolExecutor) {
        this.a = t23;
        this.b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.LPt8Fixed.T23
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.LPt8Fixed.T23
    public final void b(T23 t23) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(t23);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
