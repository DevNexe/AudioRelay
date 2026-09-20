package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ee extends zo1 implements lz2 {
    public final One x;
    public final boolean y;

    public ee(da daVar, boolean z) {
        super(wo1.a);
        this.x = daVar;
        this.y = z;
    }

    @Override // defpackage.lz2
    public final Object A0(Object obj) {
        return this;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ee eeVar = obj instanceof ee ? (ee) obj : null;
        return eeVar != null && ur1.a(this.x, eeVar.x) && this.y == eeVar.y;
    }

    public final int hashCode() {
        return (this.x.hashCode() * 31) + (this.y ? 1231 : 1237);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxChildData(alignment=");
        sb.append(this.x);
        sb.append(", matchParentSize=");
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
