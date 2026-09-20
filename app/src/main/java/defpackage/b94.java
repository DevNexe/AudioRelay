package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class b94 implements a94 {
    public static final AtomicInteger y = new AtomicInteger(0);
    public final int w;
    public final x84 x;

    public b94(int i, boolean z, j81 j81Var) {
        this.w = i;
        x84 x84Var = new x84();
        x84Var.x = z;
        x84Var.y = false;
        j81Var.invoke(x84Var);
        this.x = x84Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b94)) {
            return false;
        }
        b94 b94Var = (b94) obj;
        if (this.w != b94Var.w) {
            return false;
        }
        return ur1.a(this.x, b94Var.x);
    }

    @Override // defpackage.a94
    public final int getId() {
        return this.w;
    }

    public final int hashCode() {
        return (this.x.hashCode() * 31) + this.w;
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

    @Override // defpackage.a94
    public final x84 z0() {
        return this.x;
    }
}
