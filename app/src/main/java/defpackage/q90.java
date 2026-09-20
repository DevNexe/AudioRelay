package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q90 implements rb2 {
    public final /* synthetic */ u45 a;
    public final /* synthetic */ j81<o55, sd5> b;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(b43.QnHx qnHx) {
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q90(u45 u45Var, j81<? super o55, sd5> j81Var) {
        this.a = u45Var;
        this.b = j81Var;
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        u45 u45Var = this.a;
        cp4 cp4VarF = ip4.f((cp4) ip4.b.h(), null, false);
        try {
            cp4 cp4VarI = cp4VarF.i();
            try {
                p55 p55VarC = u45Var.c();
                o55 o55Var = p55VarC != null ? p55VarC.a : null;
                cp4.o(cp4VarI);
                cp4VarF.c();
                o55 o55VarA = u45Var.a.a(j, vb2Var.getLayoutDirection(), o55Var);
                long j2 = o55VarA.c;
                Integer numValueOf = Integer.valueOf((int) (j2 >> 32));
                Integer numValueOf2 = Integer.valueOf(sp1.b(j2));
                int iIntValue = numValueOf.intValue();
                int iIntValue2 = numValueOf2.intValue();
                if (!ur1.a(o55Var, o55VarA)) {
                    u45Var.g.setValue(new p55(o55VarA));
                    this.b.invoke(o55VarA);
                }
                return vb2Var.K(iIntValue, iIntValue2, t92.Q(new uy2(hnK.a, Integer.valueOf(sy4.c(o55VarA.d))), new uy2(hnK.b, Integer.valueOf(sy4.c(o55VarA.e)))), QnHx.w);
            } catch (Throwable th) {
                cp4.o(cp4VarI);
                throw th;
            }
        } catch (Throwable th2) {
            cp4VarF.c();
            throw th2;
        }
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int b(yy1.byN byn, List list, int i) {
        return qb2.c(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int c(yy1.byN byn, List list, int i) {
        return qb2.d(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final int d(yy1.byN byn, List list, int i) {
        u45 u45Var = this.a;
        u45Var.a.b(yy1.this.N);
        lh2 lh2Var = u45Var.a.i;
        if (lh2Var != null) {
            return (int) Math.ceil(lh2Var.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int e(yy1.byN byn, List list, int i) {
        return qb2.a(this, byn, list, i);
    }
}
