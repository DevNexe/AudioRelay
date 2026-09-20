package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kj3 {
    public final bj3 a;
    public final List<xp1> b;
    public final int c;
    public final av0 d;
    public final cp3 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    /* JADX WARN: Multi-variable type inference failed */
    public kj3(bj3 bj3Var, List<? extends xp1> list, int i, av0 av0Var, cp3 cp3Var, int i2, int i3, int i4) {
        this.a = bj3Var;
        this.b = list;
        this.c = i;
        this.d = av0Var;
        this.e = cp3Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static kj3 a(kj3 kj3Var, int i, av0 av0Var, cp3 cp3Var, int i2) {
        if ((i2 & 1) != 0) {
            i = kj3Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            av0Var = kj3Var.d;
        }
        av0 av0Var2 = av0Var;
        if ((i2 & 4) != 0) {
            cp3Var = kj3Var.e;
        }
        return new kj3(kj3Var.a, kj3Var.b, i3, av0Var2, cp3Var, (i2 & 8) != 0 ? kj3Var.f : 0, (i2 & 16) != 0 ? kj3Var.g : 0, (i2 & 32) != 0 ? kj3Var.h : 0);
    }

    public final xp3 b(cp3 cp3Var) {
        List<xp1> list = this.b;
        int size = list.size();
        int i = this.c;
        if (!(i < size)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.i++;
        av0 av0Var = this.d;
        if (av0Var != null) {
            ch1 ch1Var = cp3Var.a;
            ch1 ch1Var2 = av0Var.c.b.i;
            if (!(ch1Var.e == ch1Var2.e && ur1.a(ch1Var.d, ch1Var2.d))) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
            }
            if (!(this.i == 1)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        kj3 kj3VarA = a(this, i2, null, cp3Var, 58);
        xp1 xp1Var = list.get(i);
        xp3 xp3VarA = xp1Var.a(kj3VarA);
        if (xp3VarA == null) {
            throw new NullPointerException("interceptor " + xp1Var + " returned null");
        }
        if (av0Var != null) {
            if (!(i2 >= list.size() || kj3VarA.i == 1)) {
                throw new IllegalStateException(("network interceptor " + xp1Var + " must call proceed() exactly once").toString());
            }
        }
        if (xp3VarA.C != null) {
            return xp3VarA;
        }
        throw new IllegalStateException(("interceptor " + xp1Var + " returned a response with no body").toString());
    }
}
