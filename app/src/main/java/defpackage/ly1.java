package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ly1 extends zo1 implements lz2, my1 {
    public final Object x;

    public ly1(String str) {
        super(wo1.a);
        this.x = str;
    }

    @Override // defpackage.lz2
    public final Object A0(Object obj) {
        return this;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.my1
    public final Object a() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ly1 ly1Var = obj instanceof ly1 ? (ly1) obj : null;
        if (ly1Var == null) {
            return false;
        }
        return ur1.a(this.x, ly1Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    public final String toString() {
        return o5.d(new StringBuilder("LayoutId(id="), this.x, ')');
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
