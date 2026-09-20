package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j9 extends cx1 implements x81<g34, Long, Long> {
    public final /* synthetic */ q84 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(q84 q84Var) {
        super(2);
        this.w = q84Var;
    }

    @Override // defpackage.x81
    public final Long invoke(g34 g34Var, Long l) {
        long jLongValue = l.longValue();
        if (u84.a(this.w, jLongValue)) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
