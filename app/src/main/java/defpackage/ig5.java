package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ig5 extends LPt8Fixed<cg5> {
    public ig5(xa1 xa1Var) {
        super(xa1Var);
    }

    public static xa1 k(cg5 cg5Var) {
        if (cg5Var instanceof xa1) {
            return (xa1) cg5Var;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // defpackage.jE
    public final /* bridge */ /* synthetic */ void b(int i, Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jE
    public final void e(int i, int i2, int i3) {
        xa1 xa1VarK = k((cg5) this.c);
        ArrayList arrayList = xa1VarK.c;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                cg5 cg5Var = (cg5) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2, cg5Var);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                cg5 cg5Var2 = (cg5) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2 - 1, cg5Var2);
                i4++;
            }
        }
        xa1VarK.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jE
    public final void f(int i, int i2) {
        k((cg5) this.c).e(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jE
    public final void h(int i, Object obj) {
        cg5 cg5Var = (cg5) obj;
        xa1 xa1VarK = k((cg5) this.c);
        int size = xa1VarK.c.size();
        ArrayList arrayList = xa1VarK.c;
        if (i < size) {
            arrayList.set(i, cg5Var);
        } else {
            arrayList.add(cg5Var);
        }
        cg5Var.d(xa1VarK.h);
        xa1VarK.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.LPt8Fixed
    public final void j() {
        xa1 xa1VarK = k((cg5) this.a);
        xa1VarK.e(0, xa1VarK.c.size());
    }
}
