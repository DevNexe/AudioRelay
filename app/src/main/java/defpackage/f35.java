package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f35 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ Float w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f35(int i, long j, Float f, x81 x81Var) {
        super(2);
        this.w = f;
        this.x = x81Var;
        this.y = i;
        this.z = j;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            int i = this.y;
            x81<g30, Integer, sd5> x81Var = this.x;
            Float f = this.w;
            if (f != null) {
                g30Var2.e(-452622131);
                q40.a(new ng3[]{p70.a.b(f)}, x81Var, g30Var2, ((i >> 6) & 112) | 8);
                g30Var2.G();
            } else {
                g30Var2.e(-452621951);
                q40.a(new ng3[]{p70.a.b(Float.valueOf(yu.d(this.z)))}, x81Var, g30Var2, ((i >> 6) & 112) | 8);
                g30Var2.G();
            }
        }
        return sd5.a;
    }
}
