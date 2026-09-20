package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class EFt extends cx1 implements j81<tg, tg> {
    public final /* synthetic */ VV4.PRnFixed w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EFt(VV4.PRnFixed pRn) {
        super(1);
        this.w = pRn;
    }

    @Override // defpackage.j81
    public final tg invoke(tg tgVar) {
        tg tgVar2 = tgVar;
        VV4.PRnFixed pRn = this.w;
        boolean z = pRn.a;
        ffo ffoVar = tgVar2.c;
        return tg.a(tgVar2, null, null, new ffo(z, pRn.b, (ffoVar != null && ffoVar.c) || pRn.c), null, 27);
    }
}
