package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l12 {
    public static final float a = 2500;
    public static final float b = 1500;

    public static final k02 a(q12 q12Var, int i) {
        k02 k02Var;
        List<k02> listE = q12Var.g().e();
        int size = listE.size();
        for (int i2 = 0; i2 < size; i2++) {
            k02Var = listE.get(i2);
            if (k02Var.getIndex() == i) {
                return k02Var;
            }
        }
        k02Var = null;
        return k02Var;
    }
}
