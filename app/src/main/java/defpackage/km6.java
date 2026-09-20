package defpackage;

import com.google.android.gms.internal.measurement.LPt9Fixed;
import com.google.android.gms.internal.measurement.Xn1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class km6 extends p17 implements r37 {
    public km6() {
        super(Xn1.zza);
    }

    public final LPt9Fixed A(int i) {
        return ((Xn1) this.x).x(i);
    }

    public final String B() {
        return ((Xn1) this.x).y();
    }

    public final List C() {
        return Collections.unmodifiableList(((Xn1) this.x).z());
    }

    public final long q() {
        return ((Xn1) this.x).t();
    }

    public final long r() {
        return ((Xn1) this.x).u();
    }

    public final void t(so6 so6Var) {
        if (this.y) {
            p();
            this.y = false;
        }
        Xn1.B((Xn1) this.x, (LPt9Fixed) so6Var.n());
    }

    public final void u(int i) {
        if (this.y) {
            p();
            this.y = false;
        }
        Xn1.E((Xn1) this.x, i);
    }

    public final void w(String str) {
        if (this.y) {
            p();
            this.y = false;
        }
        Xn1.F((Xn1) this.x, str);
    }

    public final void x(int i, LPt9Fixed lPt9) {
        if (this.y) {
            p();
            this.y = false;
        }
        Xn1.A((Xn1) this.x, i, lPt9);
    }

    public /* synthetic */ km6(int i) {
        super(Xn1.zza);
    }
}
