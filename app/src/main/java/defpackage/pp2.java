package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pp2 implements op2, mf4 {
    public final by1 a;
    public final qp2 b;
    public final dw4<sd5> c = w9.H(sd5.a).G();
    public Map<String, mp2> d = ds0.w;

    public static final class QnHx<T1, T2, R> implements ba<T1, T2, R> {
        public QnHx() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [R, java.util.ArrayList] */
        @Override // defpackage.ba
        public final R apply(T1 t1, T2 t2) {
            List list = (List) t1;
            ?? r4 = (R) new ArrayList(mu.w0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r4.add(pp2.this.b.a((mp2) it.next()));
            }
            return r4;
        }
    }

    public pp2(by1 by1Var, qp2 qp2Var) {
        this.a = by1Var;
        this.b = qp2Var;
    }

    @Override // defpackage.op2
    public final boolean a(mp2 mp2Var) {
        Map<String, mp2> mapSingletonMap;
        synchronized (this) {
            if (this.d.containsKey(mp2Var.a)) {
                sd5 sd5Var = sd5.a;
                return false;
            }
            Map<String, mp2> map = this.d;
            String str = mp2Var.a;
            if (map.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(str, mp2Var);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(str, mp2Var);
                mapSingletonMap = linkedHashMap;
            }
            this.d = mapSingletonMap;
            this.c.g(sd5.a);
            return true;
        }
    }

    @Override // defpackage.op2
    public final boolean b(String str) {
        synchronized (this) {
            if (!this.d.containsKey(str)) {
                sd5 sd5Var = sd5.a;
                return false;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.d);
            linkedHashMap.remove(str);
            this.d = t92.R(linkedHashMap);
            this.c.g(sd5.a);
            return true;
        }
    }

    @Override // defpackage.op2
    public final vq2<List<mp2>> c(c54 c54Var) {
        return vq2.k(new cs2(this.c.u(c54Var), new NFo7(this, 11)), iE.d(this.a.a()), new QnHx());
    }

    @Override // defpackage.mf4
    public final void d(zt4 zt4Var) {
    }

    @Override // defpackage.mf4
    public final void e() {
        synchronized (this) {
            this.d = ds0.w;
            this.c.g(sd5.a);
        }
    }
}
