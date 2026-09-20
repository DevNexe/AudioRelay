package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ke3 {
    public static final SparseArray<ie3> a = new SparseArray<>();
    public static final HashMap<ie3, Integer> b;

    static {
        HashMap<ie3, Integer> map = new HashMap<>();
        b = map;
        map.put(ie3.DEFAULT, 0);
        map.put(ie3.VERY_LOW, 1);
        map.put(ie3.HIGHEST, 2);
        for (ie3 ie3Var : map.keySet()) {
            a.append(b.get(ie3Var).intValue(), ie3Var);
        }
    }

    public static int a(ie3 ie3Var) {
        Integer num = b.get(ie3Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + ie3Var);
    }

    public static ie3 b(int i) {
        ie3 ie3Var = a.get(i);
        if (ie3Var != null) {
            return ie3Var;
        }
        throw new IllegalArgumentException(GM.a("Unknown Priority for value ", i));
    }
}
