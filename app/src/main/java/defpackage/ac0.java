package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ac0 implements yb0 {
    public static final QnHx c = new QnHx();
    public final mi0<yb0> a;
    public final AtomicReference<yb0> b = new AtomicReference<>(null);

    public static final class QnHx implements fk2 {
        @Override // defpackage.fk2
        public final File a() {
            return null;
        }

        @Override // defpackage.fk2
        public final File b() {
            return null;
        }

        @Override // defpackage.fk2
        public final File c() {
            return null;
        }

        @Override // defpackage.fk2
        public final File d() {
            return null;
        }

        @Override // defpackage.fk2
        public final File e() {
            return null;
        }

        @Override // defpackage.fk2
        public final File f() {
            return null;
        }
    }

    public ac0(mi0<yb0> mi0Var) {
        this.a = mi0Var;
        ((sv2) mi0Var).a(new im3(this, 10));
    }

    @Override // defpackage.yb0
    public final fk2 a(String str) {
        yb0 yb0Var = this.b.get();
        return yb0Var == null ? c : yb0Var.a(str);
    }

    @Override // defpackage.yb0
    public final boolean b() {
        yb0 yb0Var = this.b.get();
        return yb0Var != null && yb0Var.b();
    }

    @Override // defpackage.yb0
    public final boolean c(String str) {
        yb0 yb0Var = this.b.get();
        return yb0Var != null && yb0Var.c(str);
    }

    @Override // defpackage.yb0
    public final void d(final String str, final String str2, final long j, final kt4 kt4Var) {
        String strA = b70.a("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strA, null);
        }
        ((sv2) this.a).a(new mi0.QnHx() { // from class: zb0
            @Override // mi0.QnHx
            public final void f(pg3 pg3Var) {
                ((yb0) pg3Var.get()).d(str, str2, j, kt4Var);
            }
        });
    }
}
