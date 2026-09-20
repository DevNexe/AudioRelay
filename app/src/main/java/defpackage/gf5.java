package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class gf5 {
    public final zd2 a;
    public final db0 b;
    public final String c;
    public final QnHx d = new QnHx(false);
    public final QnHx e = new QnHx(true);
    public final AtomicMarkableReference<String> f = new AtomicMarkableReference<>(null, false);

    public class QnHx {
        public final AtomicMarkableReference<sw1> a;
        public final AtomicReference<Callable<Void>> b = new AtomicReference<>(null);
        public final boolean c;

        public QnHx(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new sw1(z ? 8192 : 1024), false);
        }
    }

    public gf5(String str, fx0 fx0Var, db0 db0Var) {
        this.c = str;
        this.a = new zd2(fx0Var);
        this.b = db0Var;
    }

    public final void a(String str, String str2) {
        QnHx qnHx = this.d;
        synchronized (qnHx) {
            if (qnHx.a.getReference().b(str, str2)) {
                AtomicMarkableReference<sw1> atomicMarkableReference = qnHx.a;
                boolean z = true;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                r23 r23Var = new r23(qnHx, 6);
                AtomicReference<Callable<Void>> atomicReference = qnHx.b;
                while (!atomicReference.compareAndSet(null, r23Var)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    gf5.this.b.a(r23Var);
                }
            }
        }
    }
}
