package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e93 {
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class QnHx {
        public final long a;
        public final long b;
        public final boolean c;

        public QnHx(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }
    }

    public final zp1 a(g93 g93Var, ja3 ja3Var) {
        boolean z;
        long j;
        long j2;
        List<h93> list = g93Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h93 h93Var = list.get(i);
            LinkedHashMap linkedHashMap2 = this.a;
            QnHx qnHx = (QnHx) linkedHashMap2.get(new c93(h93Var.a));
            if (qnHx == null) {
                j2 = h93Var.b;
                j = h93Var.d;
                z = false;
            } else {
                long jO = ja3Var.o(qnHx.b);
                long j3 = qnHx.a;
                z = qnHx.c;
                j = jO;
                j2 = j3;
            }
            long j4 = h93Var.a;
            linkedHashMap.put(new c93(j4), new d93(j4, h93Var.b, h93Var.d, h93Var.e, j2, j, z, h93Var.f, h93Var.h, h93Var.i));
            boolean z2 = h93Var.e;
            long j5 = h93Var.a;
            if (z2) {
                linkedHashMap2.put(new c93(j5), new QnHx(h93Var.b, h93Var.c, z2));
            } else {
                linkedHashMap2.remove(new c93(j5));
            }
        }
        return new zp1(linkedHashMap, g93Var);
    }
}
