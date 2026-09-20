package defpackage;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class cd extends cx1 implements j81<uk, po0> {
    public final /* synthetic */ float w;
    public final /* synthetic */ dj4 x;
    public final /* synthetic */ kl3<bd> y;
    public final /* synthetic */ cg z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(float f, dj4 dj4Var, kl3<bd> kl3Var, cg cgVar) {
        super(1);
        this.w = f;
        this.x = dj4Var;
        this.y = kl3Var;
        this.z = cgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v24, types: [T, bd] */
    @Override // defpackage.j81
    public final po0 invoke(uk ukVar) {
        bd bdVar;
        uk ukVar2 = ukVar;
        float f = this.w;
        if (!(ukVar2.b0(f) >= 0.0f && cm4.d(ukVar2.d()) > 0.0f)) {
            return ukVar2.c(ed.w);
        }
        float f2 = 2;
        float fMin = Math.min(wm0.a(f, 0.0f) ? 1.0f : (float) Math.ceil(ukVar2.b0(f)), (float) Math.ceil(cm4.d(ukVar2.d()) / f2));
        float f3 = fMin / f2;
        long jA = X.a(f3, f3);
        long jE = ps0.e(cm4.e(ukVar2.d()) - fMin, cm4.c(ukVar2.d()) - fMin);
        boolean z = f2 * fMin > cm4.d(ukVar2.d());
        ew2 ew2VarA = this.x.a(ukVar2.d(), ukVar2.w.getLayoutDirection(), ukVar2);
        if (ew2VarA instanceof ew2.QnHx) {
            ew2.QnHx qnHx = (ew2.QnHx) ew2VarA;
            cg cgVar = this.z;
            if (z) {
                return ukVar2.c(new fd(qnHx, cgVar));
            }
            if (cgVar instanceof jq4) {
                long j = ((jq4) cgVar).a;
                if (Build.VERSION.SDK_INT >= 29) {
                    bb.a.a(j, 5);
                } else {
                    new PorterDuffColorFilter(hH.A(j), fp1.z0(5));
                }
            }
            qnHx.getClass();
            throw null;
        }
        if (!(ew2VarA instanceof ew2.F1)) {
            if (!(ew2VarA instanceof ew2.CQf)) {
                throw new NoWhenBranchMatchedException();
            }
            cg cgVar2 = this.z;
            if (z) {
                jA = kt2.b;
            }
            if (z) {
                jE = ukVar2.d();
            }
            return ukVar2.c(new hd(cgVar2, jA, jE, z ? gx0.w : new qv4(fMin, 0.0f, 0, 0, 30)));
        }
        cg cgVar3 = this.z;
        ew2.F1 f1 = (ew2.F1) ew2VarA;
        boolean zI0 = fp1.i0(f1.a);
        ku3 ku3Var = f1.a;
        if (zI0) {
            return ukVar2.c(new jd(z, cgVar3, ku3Var.e, f3, fMin, jA, jE, new qv4(fMin, 0.0f, 0, 0, 30)));
        }
        kl3<bd> kl3Var = this.y;
        bd bdVar2 = kl3Var.a;
        if (bdVar2 == null) {
            bdVar = bdVar2;
            ?? bdVar3 = new bd(0);
            kl3Var.a = bdVar3;
            bdVar = bdVar3;
        }
        bdVar = bdVar2;
        qz2 qz2VarG = bdVar.d;
        if (qz2VarG == null) {
            qz2VarG = hH.g();
            bdVar.d = qz2VarG;
        }
        qz2VarG.reset();
        qz2VarG.i(ku3Var);
        if (!z) {
            TQ2_ tq2_G = hH.g();
            tq2_G.i(new ku3(fMin, fMin, (ku3Var.c - ku3Var.a) - fMin, (ku3Var.d - ku3Var.b) - fMin, ko6.c(ku3Var.e, fMin), ko6.c(ku3Var.f, fMin), ko6.c(ku3Var.g, fMin), ko6.c(ku3Var.h, fMin)));
            qz2VarG.f(qz2VarG, tq2_G, 0);
        }
        return ukVar2.c(new md(qz2VarG, cgVar3));
    }
}
