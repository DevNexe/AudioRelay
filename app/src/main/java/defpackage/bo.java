package defpackage;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class bo implements fd2 {
    public final pk5 a;
    public long b;
    public final c2 c;

    public bo(pk5 pk5Var) {
        this.a = pk5Var;
        gq0.QnHx qnHx = gq0.x;
        this.c = new c2(ps0.o0(30, kq0.SECONDS));
    }

    @Override // defpackage.fd2
    public final Object a(ad2 ad2Var, md2.QnHx qnHx) {
        Object qnHx2;
        if (!ad2Var.k0()) {
            return sd5.a;
        }
        try {
            pk5 pk5Var = this.a;
            ((AudioManager) pk5Var.b.getValue()).setStreamVolume(3, ad2Var.T().z, 0);
            qnHx2 = sd5.a;
        } catch (Throwable th) {
            qnHx2 = new fq3.QnHx(th);
        }
        Throwable thA = fq3.a(qnHx2);
        if (thA != null) {
            this.c.a(new ao(thA));
        }
        int i = ad2Var.T().z;
        long jC = zs.QnHx.a.c();
        gq0.QnHx qnHx3 = gq0.x;
        if (gq0.d(ps0.p0(jC - this.b, kq0.MILLISECONDS), Cdo.a) > 0) {
            a62.a.i(i, "changed_volume");
            this.b = jC;
        }
        return sd5.a;
    }
}
