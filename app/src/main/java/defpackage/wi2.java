package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class wi2 {
    public final AtomicReference<QnHx> a = new AtomicReference<>(null);
    public final kotlinx.coroutines.sync.QnHx b = new kotlinx.coroutines.sync.QnHx(false);

    public static final class QnHx {
        public final int a;
        public final ms1 b;

        public QnHx(int i, ms1 ms1Var) {
            this.a = i;
            this.b = ms1Var;
        }
    }
}
