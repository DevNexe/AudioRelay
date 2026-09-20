package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fx extends qw {
    public final InterfaceC1443fH w;

    public fx(InterfaceC1443fH interfaceC1443fH) {
        this.w = interfaceC1443fH;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        av3 av3Var = new av3(m91.b);
        nxVar.c(av3Var);
        try {
            this.w.run();
            if (av3Var.e()) {
                return;
            }
            nxVar.b();
        } catch (Throwable th) {
            XTd3.w(th);
            if (av3Var.e()) {
                m14.b(th);
            } else {
                nxVar.onError(th);
            }
        }
    }
}
