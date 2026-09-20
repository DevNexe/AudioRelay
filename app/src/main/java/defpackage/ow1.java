package defpackage;

import android.view.KeyEvent;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class ow1 extends cx1 implements j81<xv1, Boolean> {
    public final /* synthetic */ m64 w;
    public final /* synthetic */ ua0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow1(m64 m64Var, ua0 ua0Var) {
        super(1);
        this.w = m64Var;
        this.x = ua0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final Boolean invoke(xv1 xv1Var) {
        int iD;
        KeyEvent keyEvent = xv1Var.a;
        if (!(zv1.c(keyEvent) == 2)) {
            return Boolean.FALSE;
        }
        long jB = zv1.b(keyEvent);
        boolean zA = wv1.a(jB, wv1.m);
        m64 m64Var = this.w;
        if (zA) {
            iD = 0;
        } else if (wv1.a(jB, wv1.n)) {
            iD = ((Number) m64Var.c.getValue()).intValue();
        } else if (wv1.a(jB, wv1.b)) {
            iD = m64Var.d() - 75;
        } else if (wv1.a(jB, wv1.c)) {
            iD = m64Var.d() + 75;
        } else if (wv1.a(jB, wv1.o)) {
            iD = m64Var.d() - 200;
        } else {
            if (!wv1.a(jB, wv1.p)) {
                return Boolean.FALSE;
            }
            iD = m64Var.d() + RCHTTPStatusCodes.SUCCESS;
        }
        fp1.k0(this.x, null, 0, new nw1(m64Var, iD, null), 3);
        return Boolean.TRUE;
    }
}
