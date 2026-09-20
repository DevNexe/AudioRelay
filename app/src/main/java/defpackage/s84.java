package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class s84 implements q84 {
    public boolean a;
    public j81<? super Long, sd5> e;
    public y81<? super iy1, ? super kt2, ? super o74, sd5> f;
    public j81<? super Long, sd5> g;
    public c91<? super iy1, ? super kt2, ? super kt2, ? super Boolean, ? super o74, Boolean> h;
    public h81<sd5> i;
    public j81<? super Long, sd5> j;
    public j81<? super Long, sd5> k;
    public final ArrayList b = new ArrayList();
    public final LinkedHashMap c = new LinkedHashMap();
    public final AtomicLong d = new AtomicLong(1);
    public final kz2 l = ps0.R(ds0.w);

    @Override // defpackage.q84
    public final void a(k74 k74Var) {
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(Long.valueOf(k74Var.d()))) {
            this.b.remove(k74Var);
            linkedHashMap.remove(Long.valueOf(k74Var.d()));
            j81<? super Long, sd5> j81Var = this.k;
            if (j81Var != null) {
                j81Var.invoke(Long.valueOf(k74Var.d()));
            }
        }
    }

    @Override // defpackage.q84
    public final boolean b(iy1 iy1Var, long j, long j2) {
        o74.QnHx.CQf cQf = o74.QnHx.c;
        c91<? super iy1, ? super kt2, ? super kt2, ? super Boolean, ? super o74, Boolean> c91Var = this.h;
        if (c91Var != null) {
            return c91Var.j0(iy1Var, new kt2(j), new kt2(j2), Boolean.FALSE, cQf).booleanValue();
        }
        return true;
    }

    @Override // defpackage.q84
    public final void c(long j) {
        j81<? super Long, sd5> j81Var = this.j;
        if (j81Var != null) {
            j81Var.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.q84
    public final long d() {
        AtomicLong atomicLong = this.d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // defpackage.q84
    public final k74 e(wh2 wh2Var) {
        long j = wh2Var.a;
        if (!(j != 0)) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + j).toString());
        }
        LinkedHashMap linkedHashMap = this.c;
        if (!linkedHashMap.containsKey(Long.valueOf(j))) {
            linkedHashMap.put(Long.valueOf(j), wh2Var);
            this.b.add(wh2Var);
            this.a = false;
            return wh2Var;
        }
        throw new IllegalArgumentException(("Another selectable with the id: " + wh2Var + ".selectableId has already subscribed.").toString());
    }

    @Override // defpackage.q84
    public final void f(iy1 iy1Var, long j) {
        o74.QnHx.NUlFixed nUl = o74.QnHx.b;
        y81<? super iy1, ? super kt2, ? super o74, sd5> y81Var = this.f;
        if (y81Var != null) {
            y81Var.invoke(iy1Var, new kt2(j), nUl);
        }
    }

    @Override // defpackage.q84
    public final void g(long j) {
        j81<? super Long, sd5> j81Var = this.g;
        if (j81Var != null) {
            j81Var.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.q84
    public final void h() {
        h81<sd5> h81Var = this.i;
        if (h81Var != null) {
            h81Var.invoke();
        }
    }

    @Override // defpackage.q84
    public final Map<Long, n74> i() {
        return (Map) this.l.getValue();
    }

    @Override // defpackage.q84
    public final void j(long j) {
        this.a = false;
        j81<? super Long, sd5> j81Var = this.e;
        if (j81Var != null) {
            j81Var.invoke(Long.valueOf(j));
        }
    }

    public final ArrayList k(final iy1 iy1Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            Comparator comparator = new Comparator() { // from class: r84
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    iy1 iy1VarF = ((k74) obj).f();
                    iy1 iy1VarF2 = ((k74) obj2).f();
                    iy1 iy1Var2 = iy1Var;
                    long jL = iy1VarF != null ? iy1Var2.L(iy1VarF, kt2.b) : kt2.b;
                    long jL2 = iy1VarF2 != null ? iy1Var2.L(iy1VarF2, kt2.b) : kt2.b;
                    return (kt2.d(jL) > kt2.d(jL2) ? 1 : (kt2.d(jL) == kt2.d(jL2) ? 0 : -1)) == 0 ? OW8.m(Float.valueOf(kt2.c(jL)), Float.valueOf(kt2.c(jL2))) : OW8.m(Float.valueOf(kt2.d(jL)), Float.valueOf(kt2.d(jL2)));
                }
            };
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, comparator);
            }
            this.a = true;
        }
        return arrayList;
    }
}
