package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class CHH extends cx1 implements h81<PIKr> {
    public static final CHH w = new CHH();

    public CHH() {
        super(0);
    }

    @Override // defpackage.h81
    public final PIKr invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.o.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
