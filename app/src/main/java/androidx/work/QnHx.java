package androidx.work;

import defpackage.co5;
import defpackage.do5;
import defpackage.io1;
import defpackage.l50;
import defpackage.pq2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx {
    public final ExecutorService a = a(false);
    public final ExecutorService b = a(true);
    public final co5 c;
    public final io1 d;
    public final pq2 e;
    public final int f;
    public final int g;
    public final int h;

    public interface CQf {
        QnHx a();
    }

    /* JADX INFO: renamed from: androidx.work.QnHx$QnHx, reason: collision with other inner class name */
    public static final class C0032QnHx {
    }

    public QnHx(C0032QnHx c0032QnHx) {
        String str = do5.a;
        this.c = new co5();
        this.d = new io1();
        this.e = new pq2(3);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }

    public static ExecutorService a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new l50(z));
    }
}
