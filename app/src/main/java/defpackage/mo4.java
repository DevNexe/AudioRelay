package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mo4 extends cx1 implements y81<wu3, g30, Integer, sd5> {
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo4(String str) {
        super(3);
        this.w = str;
    }

    @Override // defpackage.y81
    public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 81) == 16 && g30Var2.t()) {
            g30Var2.x();
        } else {
            j55.b(this.w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65534);
        }
        return sd5.a;
    }
}
