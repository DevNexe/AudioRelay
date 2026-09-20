package defpackage;

import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk2 implements auxFixed {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ qk2(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                rk2 rk2Var = (rk2) obj;
                rk2Var.r = cQf.a();
                if (rk2Var.c != null) {
                    for (kk2 kk2Var : rk2Var.g) {
                        kk2Var.getClass();
                        kk2Var.z = cQf.a();
                        kk2Var.f();
                    }
                }
                break;
            default:
                ri2 ri2Var = (ri2) obj;
                int i2 = w22.YKK.a[cQf.ordinal()];
                if (i2 == 1) {
                    ri2Var.setValue(Boolean.TRUE);
                    break;
                } else if (i2 == 2) {
                    ri2Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
