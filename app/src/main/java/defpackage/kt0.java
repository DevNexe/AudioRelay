package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kt0 {
    static {
        new lt0(new v95(null, null, null, null, 15));
    }

    public abstract v95 a();

    public final lt0 b(lt0 lt0Var) {
        v95 v95Var = ((lt0) this).a;
        mw0 mw0Var = v95Var.a;
        v95 v95Var2 = lt0Var.a;
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
        return new lt0(new v95(mw0Var, pm4Var, ioVar, u34Var));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kt0) && ur1.a(((kt0) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
