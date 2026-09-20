package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends cx1 implements j81<QsF6, QsF6> {
    public final /* synthetic */ wXc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(wXc wxc) {
        super(1);
        this.w = wxc;
    }

    @Override // defpackage.j81
    public final QsF6 invoke(QsF6 qsF6) {
        // Подменяем ((wXc.LPt8Fixed) this.w).a на Boolean.TRUE
        return QsF6.a(qsF6, null, null, false, Boolean.TRUE, 7);
    }
}
