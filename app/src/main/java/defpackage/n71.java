package defpackage;

import j$.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n71 implements pa3 {
    public final /* synthetic */ int w;

    public /* synthetic */ n71(int i) {
        this.w = i;
    }

    @Override // defpackage.pa3
    public final boolean test(Object obj) {
        switch (this.w) {
            case 0:
                return ((y73.NUlFixed) obj).b instanceof zt4.T23;
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                return ((Optional) obj).isPresent();
            case 3:
                gq0.QnHx qnHx = gq0.x;
                return gq0.d(((gq0) obj).w, ps0.o0(15, kq0.SECONDS)) > 0;
            default:
                jc.CQf cQf = (jc.CQf) obj;
                return !cQf.b || cQf.c;
        }
    }
}
