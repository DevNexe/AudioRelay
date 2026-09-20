package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ dc(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m70
    public final void accept(Object obj) {
        switch (this.w) {
            case 0:
                ((hc) this.x).b.a((jc) obj);
                break;
            case 1:
                ((n60) this.x).h = false;
                break;
            case 2:
                uy2 uy2Var = (uy2) obj;
                String str = (String) uy2Var.w;
                long j = ((gq0) uy2Var.x).w;
                a62 a62Var = a62.a;
                ac.b.b.h((int) gq0.p(j, kq0.MINUTES), "stopped_session", str);
                break;
            case 3:
                h1 h1Var = (h1) this.x;
                a62.a.c("New audio config...");
                h1Var.g.a((VQko) obj);
                h1Var.d.a = null;
                h1Var.e.a = null;
                break;
            case 4:
                a62 a62Var2 = a62.a;
                a62.a.d((Throwable) obj, true);
                break;
            case 5:
                a62 a62Var3 = a62.a;
                break;
            case 6:
                ((baz) this.x).a.a((Sb1) obj);
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                sAn san = (sAn) this.x;
                san.b = rz4.a(san.b, vz4.CQf.a);
                rz4 rz4Var = san.b;
                uz4 uz4Var = san.a;
                uz4Var.getClass();
                uz4Var.a(rz4Var.a, rz4Var.b);
                break;
        }
    }
}
