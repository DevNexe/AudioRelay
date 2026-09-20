package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bn4 extends cx1 implements j81<Float, sd5> {
    public final /* synthetic */ ua0 A;
    public final /* synthetic */ tm4 B;
    public final /* synthetic */ h81<sd5> C;
    public final /* synthetic */ ri2<Float> w;
    public final /* synthetic */ List<Float> x;
    public final /* synthetic */ gl3 y;
    public final /* synthetic */ gl3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn4(ri2<Float> ri2Var, List<Float> list, gl3 gl3Var, gl3 gl3Var2, ua0 ua0Var, tm4 tm4Var, h81<sd5> h81Var) {
        super(1);
        this.w = ri2Var;
        this.x = list;
        this.y = gl3Var;
        this.z = gl3Var2;
        this.A = ua0Var;
        this.B = tm4Var;
        this.C = h81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final sd5 invoke(Float f) {
        Object next;
        h81<sd5> h81Var;
        float fFloatValue = f.floatValue();
        float fFloatValue2 = this.w.getValue().floatValue();
        float f2 = this.y.w;
        float f3 = this.z.w;
        float f4 = cn4.a;
        Iterator<T> it = this.x.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(C0239D.y(f2, f3, ((Number) next).floatValue()) - fFloatValue2);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(C0239D.y(f2, f3, ((Number) next2).floatValue()) - fFloatValue2);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Float f5 = (Float) next;
        float fY = f5 != null ? C0239D.y(f2, f3, f5.floatValue()) : fFloatValue2;
        if (!(fFloatValue2 == fY)) {
            fp1.k0(this.A, null, 0, new an4(this.B, fFloatValue2, fY, fFloatValue, this.C, null), 3);
        } else if (!((Boolean) this.B.b.getValue()).booleanValue() && (h81Var = this.C) != null) {
            h81Var.invoke();
        }
        return sd5.a;
    }
}
