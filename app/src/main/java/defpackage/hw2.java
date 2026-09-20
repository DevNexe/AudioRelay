package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hw2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ dj4 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ ci2 y;
    public final /* synthetic */ k25 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw2(boolean z, boolean z2, ci2 ci2Var, k25 k25Var, dj4 dj4Var, int i, int i2) {
        super(2);
        this.w = z;
        this.x = z2;
        this.y = ci2Var;
        this.z = k25Var;
        this.A = dj4Var;
        this.B = i;
        this.C = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            r25 r25Var = r25.a;
            boolean z = this.w;
            boolean z2 = this.x;
            ci2 ci2Var = this.y;
            k25 k25Var = this.z;
            dj4 dj4Var = this.A;
            int i = ((this.B >> 9) & 14) | 12582912;
            int i2 = this.C;
            r25Var.a(z, z2, ci2Var, k25Var, dj4Var, 0.0f, 0.0f, g30Var2, i | ((i2 << 3) & 112) | ((i2 >> 12) & 896) | ((i2 >> 15) & 7168) | ((i2 >> 9) & 57344), 96);
        }
        return sd5.a;
    }
}
