package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class xd4 extends cx1 implements j81<pd4, Comparable<?>> {
    public static final xd4 w = new xd4();

    public xd4() {
        super(1);
    }

    @Override // defpackage.j81
    public final Comparable<?> invoke(pd4 pd4Var) {
        String str = pd4Var.b.a;
        if (str != null) {
            return str.toLowerCase(Locale.ROOT);
        }
        return null;
    }
}
