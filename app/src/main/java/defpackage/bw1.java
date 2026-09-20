package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class bw1 implements rg2, tg2<bw1>, qu2 {
    public yy1 A;
    public final j81<xv1, Boolean> w;
    public final j81<xv1, Boolean> x;
    public r21 y;
    public bw1 z;

    /* JADX WARN: Multi-variable type inference failed */
    public bw1(j81<? super xv1, Boolean> j81Var, j81<? super xv1, Boolean> j81Var2) {
        this.w = j81Var;
        this.x = j81Var2;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean a(KeyEvent keyEvent) {
        j81<xv1, Boolean> j81Var = this.w;
        Boolean boolInvoke = j81Var != null ? j81Var.invoke(new xv1(keyEvent)) : null;
        if (ur1.a(boolInvoke, Boolean.TRUE)) {
            return boolInvoke.booleanValue();
        }
        bw1 bw1Var = this.z;
        if (bw1Var != null) {
            return bw1Var.a(keyEvent);
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent) {
        bw1 bw1Var = this.z;
        Boolean boolValueOf = bw1Var != null ? Boolean.valueOf(bw1Var.b(keyEvent)) : null;
        if (ur1.a(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        j81<xv1, Boolean> j81Var = this.x;
        if (j81Var != null) {
            return j81Var.invoke(new xv1(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        ui2<bw1> ui2Var;
        ui2<bw1> ui2Var2;
        r21 r21Var = this.y;
        if (r21Var != null && (ui2Var2 = r21Var.K) != null) {
            ui2Var2.l(this);
        }
        r21 r21Var2 = (r21) vg2Var.a(s21.a);
        this.y = r21Var2;
        if (r21Var2 != null && (ui2Var = r21Var2.K) != null) {
            ui2Var.b(this);
        }
        this.z = (bw1) vg2Var.a(cw1.a);
    }

    @Override // defpackage.tg2
    public final mg3<bw1> getKey() {
        return cw1.a;
    }

    @Override // defpackage.tg2
    public final bw1 getValue() {
        return this;
    }

    @Override // defpackage.qu2
    public final void l(iy1 iy1Var) {
        this.A = ((kz1) iy1Var).A;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
