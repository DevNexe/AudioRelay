package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cq extends ns1 {
    public final xm<?> A;

    public cq(xm<?> xmVar) {
        this.A = xmVar;
    }

    @Override // defpackage.j81
    public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
        s(th);
        return sd5.a;
    }

    @Override // defpackage.ly
    public final void s(Throwable th) {
        ss1 ss1VarT = t();
        xm<?> xmVar = this.A;
        Throwable thO = xmVar.o(ss1VarT);
        if (!xmVar.v() ? false : ((il0) xmVar.z).j(thO)) {
            return;
        }
        xmVar.l(thO);
        if (xmVar.v()) {
            return;
        }
        xmVar.m();
    }
}
