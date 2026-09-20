package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zg extends cx1 implements j81<ug, ug> {
    public final /* synthetic */ sg w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(sg sgVar) {
        super(1);
        this.w = sgVar;
    }

    @Override // defpackage.j81
    public final ug invoke(ug ugVar) {
        dh.QnHx qnHx = ((sg.YKK) this.w).a;
        mg mgVar = qnHx.a;
        boolean z = qnHx.b;
        return new ug(mgVar, qnHx.c, Boolean.valueOf(z), qnHx.d);
    }
}
