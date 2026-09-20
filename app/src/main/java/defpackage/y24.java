package defpackage;

import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y24 implements auxFixed {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ y24(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                z24 z24Var = (z24) obj;
                if (cQf == YKK.CQf.ON_START) {
                    z24Var.f = true;
                } else if (cQf == YKK.CQf.ON_STOP) {
                    z24Var.f = false;
                }
                break;
            default:
                is4 is4Var = (is4) obj;
                if (cQf == YKK.CQf.ON_RESUME) {
                    ((h81) is4Var.getValue()).invoke();
                }
                break;
        }
    }
}
