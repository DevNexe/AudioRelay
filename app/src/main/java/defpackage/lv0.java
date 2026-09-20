package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lv0 {
    public static final mv0 a = new mv0(new v95(null, null, null, null, 15));

    public abstract v95 a();

    public final mv0 b(mv0 mv0Var) {
        v95 v95Var = ((mv0) this).b;
        mw0 mw0Var = v95Var.a;
        v95 v95Var2 = mv0Var.b;
        if (mw0Var == null) {
            mw0Var = v95Var2.a;
        }
        pm4 pm4Var = v95Var.b;
        if (pm4Var == null) {
            pm4Var = v95Var2.b;
        }
        io ioVar = v95Var.c;
        if (ioVar == null) {
            ioVar = v95Var2.c;
        }
        u34 u34Var = v95Var.d;
        if (u34Var == null) {
            u34Var = v95Var2.d;
        }
        return new mv0(new v95(mw0Var, pm4Var, ioVar, u34Var));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lv0) && ur1.a(((lv0) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
