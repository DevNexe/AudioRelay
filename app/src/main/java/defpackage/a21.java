package defpackage;

import defpackage.z11;

/* JADX INFO: loaded from: classes.dex */
public final class a21<T extends z11> implements rg2, tg2<a21<T>> {
    public final j81<z11, Boolean> w;
    public final j81<z11, Boolean> x;
    public final mg3<a21<T>> y;
    public a21<T> z;

    public a21(iu3 iu3Var) {
        mg3<a21<ju3>> mg3Var = hu3.a;
        this.w = iu3Var;
        this.x = null;
        this.y = mg3Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean a(ju3 ju3Var) {
        j81<z11, Boolean> j81Var = this.w;
        if (j81Var != null && j81Var.invoke(ju3Var).booleanValue()) {
            return true;
        }
        a21<T> a21Var = this.z;
        if (a21Var != null) {
            return a21Var.a(ju3Var);
        }
        return false;
    }

    public final boolean b(ju3 ju3Var) {
        a21<T> a21Var = this.z;
        if (a21Var != null && a21Var.b(ju3Var)) {
            return true;
        }
        j81<z11, Boolean> j81Var = this.x;
        if (j81Var != null) {
            return j81Var.invoke(ju3Var).booleanValue();
        }
        return false;
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        this.z = (a21) vg2Var.a(this.y);
    }

    @Override // defpackage.tg2
    public final mg3<a21<T>> getKey() {
        return this.y;
    }

    @Override // defpackage.tg2
    public final Object getValue() {
        return this;
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
