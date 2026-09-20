package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th5 extends zo1 implements lz2 {
    public final One.F1 x;

    public th5(da.CQf cQf) {
        super(wo1.a);
        this.x = cQf;
    }

    @Override // defpackage.lz2
    public final Object A0(Object obj) {
        tu3 tu3Var = obj instanceof tu3 ? (tu3) obj : null;
        if (tu3Var == null) {
            tu3Var = new tu3(0);
        }
        int i = oc0.a;
        tu3Var.c = new oc0.NUlFixed(this.x);
        return tu3Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        th5 th5Var = obj instanceof th5 ? (th5) obj : null;
        if (th5Var == null) {
            return false;
        }
        return ur1.a(this.x, th5Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    public final String toString() {
        return "VerticalAlignModifier(vertical=" + this.x + ')';
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
