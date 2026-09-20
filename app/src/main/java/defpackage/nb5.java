package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class nb5<T> implements hq0<T> {
    public final int a;
    public final int b;
    public final mq0 c;

    public nb5() {
        this(0, (mq0) null, 7);
    }

    public nb5(int i, int i2, mq0 mq0Var) {
        this.a = i;
        this.b = i2;
        this.c = mq0Var;
    }

    @Override // defpackage.Ah
    public final bh5 a(pb5 pb5Var) {
        return new lh5(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nb5)) {
            return false;
        }
        nb5 nb5Var = (nb5) obj;
        return nb5Var.a == this.a && nb5Var.b == this.b && ur1.a(nb5Var.c, this.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.hq0, defpackage.Ah
    public final fh5 a(pb5 pb5Var) {
        return new lh5(this.a, this.b, this.c);
    }

    public /* synthetic */ nb5(int i, mq0 mq0Var, int i2) {
        this((i2 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i, 0, (i2 & 4) != 0 ? nq0.a : mq0Var);
    }
}
