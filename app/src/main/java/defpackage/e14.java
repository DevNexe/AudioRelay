package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e14 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Serializable y;
    public final /* synthetic */ c54 z;

    public /* synthetic */ e14(int i, long j, c54 c54Var, TimeUnit timeUnit) {
        this.w = i;
        this.x = j;
        this.y = timeUnit;
        this.z = c54Var;
    }

    public /* synthetic */ e14(fl3 fl3Var, long j, c54 c54Var) {
        this.w = 2;
        this.y = fl3Var;
        this.x = j;
        this.z = c54Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        c54 c54Var = this.z;
        long j = this.x;
        int i = this.w;
        Serializable serializable = this.y;
        switch (i) {
            case 0:
                return ((a11) obj).c(new e14(1, j, c54Var, (TimeUnit) serializable));
            case 1:
                return new w11(a11.h(j, (TimeUnit) serializable, c54Var));
            default:
                fl3 fl3Var = (fl3) serializable;
                if (((rz4) obj).b instanceof vz4.QnHx) {
                    fl3Var.w = true;
                    return vq2.s(sd5.a);
                }
                if (!fl3Var.w) {
                    return vq2.s(sd5.a);
                }
                et2 et2VarE = vq2.E(j, TimeUnit.MILLISECONDS, c54Var);
                w52 w52Var = new w52(fl3Var, 8);
                m91.byN byn = m91.d;
                return new cs2(new jr2(et2VarE, byn, byn, w52Var), new Acr(24));
        }
    }
}
