package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends zo1 implements lz2 {
    public final float x;
    public final boolean y;

    public mz1(float f, boolean z) {
        super(wo1.a);
        this.x = f;
        this.y = z;
    }

    @Override // defpackage.lz2
    public final Object A0(Object obj) {
        tu3 tu3Var = obj instanceof tu3 ? (tu3) obj : null;
        if (tu3Var == null) {
            tu3Var = new tu3(0);
        }
        tu3Var.a = this.x;
        tu3Var.b = this.y;
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
        mz1 mz1Var = obj instanceof mz1 ? (mz1) obj : null;
        if (mz1Var == null) {
            return false;
        }
        return ((this.x > mz1Var.x ? 1 : (this.x == mz1Var.x ? 0 : -1)) == 0) && this.y == mz1Var.y;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.x) * 31) + (this.y ? 1231 : 1237);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutWeightImpl(weight=");
        sb.append(this.x);
        sb.append(", fill=");
        return dj.c(sb, this.y, ')');
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
