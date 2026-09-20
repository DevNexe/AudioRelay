package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class fi0 implements ze5 {
    public final String a;
    public final ea1 b;

    public fi0(Set<o22> set, ea1 ea1Var) {
        this.a = b(set);
        this.b = ea1Var;
    }

    public static String b(Set<o22> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<o22> it = set.iterator();
        while (it.hasNext()) {
            o22 next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.ze5
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        ea1 ea1Var = this.b;
        synchronized (ea1Var.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(ea1Var.a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (ea1Var.a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(ea1Var.a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
