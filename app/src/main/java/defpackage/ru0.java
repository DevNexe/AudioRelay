package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ru0 implements iw0<nu0> {

    public static final class QnHx {
        public static final ru0 a = new ru0();
    }

    @Override // defpackage.og3
    public final Object get() {
        p3 p3Var = nu0.a;
        if (p3Var != null) {
            return p3Var;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
