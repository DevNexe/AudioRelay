package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hy4 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ ci2 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ lp3 C;
    public final /* synthetic */ x81<Object, Object, m75> D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Map<Float, Object> w;
    public final /* synthetic */ iy4<Object> x;
    public final /* synthetic */ aw2 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy4(float f, ci2 ci2Var, lp3 lp3Var, iy4 iy4Var, Map map, x81 x81Var, boolean z, boolean z2) {
        super(3);
        aw2 aw2Var = aw2.Horizontal;
        this.w = map;
        this.x = iy4Var;
        this.y = aw2Var;
        this.z = z;
        this.A = ci2Var;
        this.B = z2;
        this.C = lp3Var;
        this.D = x81Var;
        this.E = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(43594985);
        Map<Float, Object> map = this.w;
        if (!(!map.isEmpty())) {
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (!(wu.e1(wu.g1(map.values())).size() == map.size())) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        ij0 ij0Var = (ij0) g30Var2.E(r40.e);
        iy4<Object> iy4Var = this.x;
        if (((Map) iy4Var.i.getValue()).isEmpty()) {
            Float fC = fXUx.c(iy4Var.b(), map);
            if (fC == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            iy4Var.e.setValue(fC);
            iy4Var.g.setValue(fC);
        }
        Map<Float, Object> map2 = this.w;
        iy4<Object> iy4Var2 = this.x;
        wq0.e(map2, iy4Var2, new fy4(iy4Var2, map2, this.C, ij0Var, this.D, this.E, null), g30Var2);
        pg2 pg2VarD = do0.d(iy4Var.p, this.y, this.z, this.A, ((Boolean) iy4Var.d.getValue()).booleanValue(), new gy4(iy4Var, null), this.B);
        g30Var2.G();
        return pg2VarD;
    }
}
