package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class nb1 extends ob1 {
    public final boolean A;
    public final nb1 B;
    private volatile nb1 _immediate;
    public final Handler y;
    public final String z;

    public nb1() {
        throw null;
    }

    public nb1(Handler handler, String str, boolean z) {
        this.y = handler;
        this.z = str;
        this.A = z;
        this._immediate = z ? this : null;
        nb1 nb1Var = this._immediate;
        if (nb1Var == null) {
            nb1Var = new nb1(handler, str, true);
            this._immediate = nb1Var;
        }
        this.B = nb1Var;
    }

    @Override // defpackage.j72
    public final j72 I() {
        return this.B;
    }

    public final void T(la0 la0Var, Runnable runnable) {
        AY.j(la0Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        rl0.c.g(la0Var, runnable);
    }

    @Override // defpackage.ob1, defpackage.ti0
    public final am0 b(long j, final Runnable runnable, la0 la0Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.y.postDelayed(runnable, j)) {
            return new am0() { // from class: jb1
                @Override // defpackage.am0
                public final void a() {
                    this.w.y.removeCallbacks(runnable);
                }
            };
        }
        T(la0Var, runnable);
        return cp2.w;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nb1) && ((nb1) obj).y == this.y;
    }

    @Override // defpackage.ti0
    public final void f(long j, xm xmVar) {
        kb1 kb1Var = new kb1(xmVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.y.postDelayed(kb1Var, j)) {
            xmVar.B(new mb1(this, kb1Var));
        } else {
            T(xmVar.A, kb1Var);
        }
    }

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        if (this.y.post(runnable)) {
            return;
        }
        T(la0Var, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.y);
    }

    @Override // defpackage.oa0
    public final boolean o() {
        return (this.A && ur1.a(Looper.myLooper(), this.y.getLooper())) ? false : true;
    }

    @Override // defpackage.j72, defpackage.oa0
    public final String toString() {
        j72 j72VarI;
        String str;
        qh0 qh0Var = rl0.a;
        j72 j72Var = n72.a;
        if (this == j72Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                j72VarI = j72Var.I();
            } catch (UnsupportedOperationException unused) {
                j72VarI = null;
            }
            str = this == j72VarI ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.z;
        if (string == null) {
            string = this.y.toString();
        }
        return this.A ? rz.a(string, ".immediate") : string;
    }

    public nb1(Handler handler) {
        this(handler, null, false);
    }
}
