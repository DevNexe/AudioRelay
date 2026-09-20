package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dn4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ float A;
    public final /* synthetic */ ci2 B;
    public final /* synthetic */ pg2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ float x;
    public final /* synthetic */ List<Float> y;
    public final /* synthetic */ sm4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn4(boolean z, float f, List<Float> list, sm4 sm4Var, float f2, ci2 ci2Var, pg2 pg2Var, int i) {
        super(2);
        this.w = z;
        this.x = f;
        this.y = list;
        this.z = sm4Var;
        this.A = f2;
        this.B = ci2Var;
        this.C = pg2Var;
        this.D = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        cn4.e(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1);
        return sd5.a;
    }
}
