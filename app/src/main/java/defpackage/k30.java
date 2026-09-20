package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k30 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
    public final /* synthetic */ Object w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(int i, int i2, Object obj) {
        super(3);
        this.w = obj;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.y81
    public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
        mn4 mn4Var2 = mn4Var;
        xl3 xl3Var2 = xl3Var;
        int i = this.x;
        int i2 = this.y;
        Object objH = mn4Var2.H(i, i2);
        Object obj = this.w;
        if (!ur1.a(obj, objH)) {
            e40.c("Slot table is out of sync".toString());
            throw null;
        }
        xl3Var2.a((yl3) obj);
        mn4Var2.E(i2, g30.QnHx.a);
        return sd5.a;
    }
}
