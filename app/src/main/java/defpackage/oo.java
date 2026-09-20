package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oo<T> implements q91<T> {
    public final la0 w;
    public final int x;
    public final lg y;

    public oo(la0 la0Var, int i, lg lgVar) {
        this.w = la0Var;
        this.x = i;
        this.y = lgVar;
    }

    @Override // defpackage.mz0
    public Object a(nz0<? super T> nz0Var, z80<? super sd5> z80Var) {
        Object objR = fp1.R(new mo(null, nz0Var, this), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    @Override // defpackage.q91
    public final mz0<T> c(la0 la0Var, int i, lg lgVar) {
        la0 la0Var2 = this.w;
        la0 la0VarG0 = la0Var.g0(la0Var2);
        lg lgVar2 = lg.SUSPEND;
        lg lgVar3 = this.y;
        int i2 = this.x;
        if (lgVar == lgVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            lgVar = lgVar3;
        }
        return (ur1.a(la0VarG0, la0Var2) && i == i2 && lgVar == lgVar3) ? this : i(la0VarG0, i, lgVar);
    }

    public String f() {
        return null;
    }

    public abstract Object h(te3<? super T> te3Var, z80<? super sd5> z80Var);

    public abstract oo<T> i(la0 la0Var, int i, lg lgVar);

    public mz0<T> j() {
        return null;
    }

    public nk3<T> k(ua0 ua0Var) {
        int i = this.x;
        if (i == -3) {
            i = -2;
        }
        x81 noVar = new no(this, null);
        se3 se3Var = new se3(ma0.b(ua0Var, this.w), AY.a(i, this.y, 4));
        se3Var.W0(3, se3Var, noVar);
        return se3Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strF = f();
        if (strF != null) {
            arrayList.add(strF);
        }
        xr0 xr0Var = xr0.w;
        la0 la0Var = this.w;
        if (la0Var != xr0Var) {
            arrayList.add("context=" + la0Var);
        }
        int i = this.x;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        lg lgVar = lg.SUSPEND;
        lg lgVar2 = this.y;
        if (lgVar2 != lgVar) {
            arrayList.add("onBufferOverflow=" + lgVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return bl2.c(sb, wu.M0(arrayList, ", ", null, null, null, 62), ']');
    }
}
