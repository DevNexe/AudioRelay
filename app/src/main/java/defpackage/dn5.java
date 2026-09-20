package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dn5 extends B8C {
    public static final String F = s52.e("WorkContinuationImpl");
    public final ArrayList A;
    public final ArrayList B;
    public final List<dn5> C;
    public boolean D;
    public qv2 E;
    public final nn5 w;
    public final String x;
    public final int y;
    public final List<? extends wn5> z;

    public dn5() {
        throw null;
    }

    public dn5(nn5 nn5Var, List<? extends wn5> list) {
        this.w = nn5Var;
        this.x = null;
        this.y = 2;
        this.z = list;
        this.C = null;
        this.A = new ArrayList(list.size());
        this.B = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).a.toString();
            this.A.add(string);
            this.B.add(string);
        }
    }

    public static boolean V0(dn5 dn5Var, HashSet hashSet) {
        hashSet.addAll(dn5Var.A);
        HashSet hashSetW0 = W0(dn5Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetW0.contains((String) it.next())) {
                return true;
            }
        }
        List<dn5> list = dn5Var.C;
        if (list != null && !list.isEmpty()) {
            Iterator<dn5> it2 = list.iterator();
            while (it2.hasNext()) {
                if (V0(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(dn5Var.A);
        return false;
    }

    public static HashSet W0(dn5 dn5Var) {
        HashSet hashSet = new HashSet();
        List<dn5> list = dn5Var.C;
        if (list != null && !list.isEmpty()) {
            Iterator<dn5> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().A);
            }
        }
        return hashSet;
    }
}
