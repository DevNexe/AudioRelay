package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ru2 implements Comparator<yy1> {
    public static final ru2 w = new ru2();

    @Override // java.util.Comparator
    public final int compare(yy1 yy1Var, yy1 yy1Var2) {
        yy1 yy1Var3 = yy1Var;
        yy1 yy1Var4 = yy1Var2;
        int iB = ur1.b(yy1Var4.D, yy1Var3.D);
        return iB != 0 ? iB : ur1.b(yy1Var3.hashCode(), yy1Var4.hashCode());
    }
}
