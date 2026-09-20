package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class g41 extends cx1 implements j81<j81<? super oc5, ? extends sd5>, oc5> {
    public final /* synthetic */ h41 w;
    public final /* synthetic */ lc5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(h41 h41Var, lc5 lc5Var) {
        super(1);
        this.w = h41Var;
        this.x = lc5Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // defpackage.j81
    public final oc5 invoke(j81<? super oc5, ? extends sd5> j81Var) {
        Typeface typefaceF;
        h41 h41Var = this.w;
        h41Var.d.getClass();
        lc5 lc5Var = this.x;
        e41 e41Var = lc5Var.a;
        oc5.QnHx qnHx = null;
        if (e41Var instanceof k41) {
            ((k41) e41Var).getClass();
            throw null;
        }
        ny1 ny1Var = h41Var.e;
        ny1Var.getClass();
        e41 e41Var2 = lc5Var.a;
        boolean z = e41Var2 == null ? true : e41Var2 instanceof xg0;
        int i = lc5Var.c;
        x41 x41Var = lc5Var.b;
        if (!z) {
            if (e41Var2 instanceof ba1) {
                typefaceF = ((u53) ny1Var.w).f((ba1) e41Var2, x41Var, i);
            } else if (e41Var2 instanceof m42) {
                ((m42) e41Var2).getClass();
                throw null;
            }
            if (qnHx != null) {
                return qnHx;
            }
            throw new IllegalStateException("Could not load font");
        }
        typefaceF = ((u53) ny1Var.w).c(x41Var, i);
        qnHx = new oc5.QnHx(typefaceF, true);
        if (qnHx != null) {
            return qnHx;
        }
        throw new IllegalStateException("Could not load font");
    }
}
