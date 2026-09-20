package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo0 implements ho0 {
    public final uk w;
    public final j81<uk, po0> x;

    /* JADX WARN: Multi-variable type inference failed */
    public jo0(uk ukVar, j81<? super uk, po0> j81Var) {
        this.w = ukVar;
        this.x = j81Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo0)) {
            return false;
        }
        jo0 jo0Var = (jo0) obj;
        return ur1.a(this.w, jo0Var.w) && ur1.a(this.x, jo0Var.x);
    }

    @Override // defpackage.ho0
    public final void g0(lo0.CQf cQf) {
        uk ukVar = this.w;
        ukVar.w = cQf;
        ukVar.x = null;
        this.x.invoke(ukVar);
        if (ukVar.x == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public final int hashCode() {
        return this.x.hashCode() + (this.w.hashCode() * 31);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.mo0
    public final void o0(ez1 ez1Var) {
        this.w.x.a.invoke(ez1Var);
    }

    public final String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.w + ", onBuildDrawCache=" + this.x + ')';
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
