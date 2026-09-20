package defpackage;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class le0 {

    public static class CQf {
        public final Class<?> a;
        public final boolean b;

        public CQf() {
            throw null;
        }

        public CQf(Class cls, boolean z) {
            this.a = cls;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return cQf.a.equals(this.a) && cQf.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    public static class QnHx {
        public final ry<?> a;
        public final HashSet b = new HashSet();
        public final HashSet c = new HashSet();

        public QnHx(ry<?> ryVar) {
            this.a = ryVar;
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (QnHx qnHx : (Set) it2.next()) {
                        for (kj0 kj0Var : qnHx.a.c) {
                            if (kj0Var.c == 0) {
                                Set<QnHx> set = (Set) map.get(new CQf(kj0Var.a, kj0Var.b == 2));
                                if (set != null) {
                                    for (QnHx qnHx2 : set) {
                                        qnHx.b.add(qnHx2);
                                        qnHx2.c.add(qnHx);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<QnHx> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (QnHx qnHx3 : hashSet) {
                    if (qnHx3.c.isEmpty()) {
                        hashSet2.add(qnHx3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    QnHx qnHx4 = (QnHx) hashSet2.iterator().next();
                    hashSet2.remove(qnHx4);
                    i++;
                    for (QnHx qnHx5 : qnHx4.b) {
                        qnHx5.c.remove(qnHx4);
                        if (qnHx5.c.isEmpty()) {
                            hashSet2.add(qnHx5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (QnHx qnHx6 : hashSet) {
                    if (!qnHx6.c.isEmpty() && !qnHx6.b.isEmpty()) {
                        arrayList2.add(qnHx6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            ry ryVar = (ry) it.next();
            QnHx qnHx7 = new QnHx(ryVar);
            Iterator it4 = ryVar.b.iterator();
            while (it4.hasNext()) {
                Class cls = (Class) it4.next();
                boolean z = !(ryVar.e == 0);
                CQf cQf = new CQf(cls, z);
                if (!map.containsKey(cQf)) {
                    map.put(cQf, new HashSet());
                }
                Set set2 = (Set) map.get(cQf);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(qnHx7);
            }
        }
    }
}
