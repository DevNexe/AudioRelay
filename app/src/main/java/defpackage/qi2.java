package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class qi2 extends cp4 {
    public final j81<Object, sd5> e;
    public final j81<Object, sd5> f;
    public Set<ws4> g;
    public gp4 h;
    public int[] i;
    public int j;
    public boolean k;

    public qi2(int i, gp4 gp4Var, j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2) {
        super(i, gp4Var);
        this.e = j81Var;
        this.f = j81Var2;
        this.h = gp4.A;
        this.i = new int[0];
        this.j = 1;
    }

    @Override // defpackage.cp4
    public final void b() {
        ip4.d = ip4.d.b(d()).a(this.h);
    }

    @Override // defpackage.cp4
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        k();
    }

    @Override // defpackage.cp4
    public final j81<Object, sd5> f() {
        return this.e;
    }

    @Override // defpackage.cp4
    public boolean g() {
        return false;
    }

    @Override // defpackage.cp4
    public final j81<Object, sd5> h() {
        return this.f;
    }

    @Override // defpackage.cp4
    public void j() {
        this.j++;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    @Override // defpackage.cp4
    public void k() {
        int iIndexOf;
        boolean zContains;
        int i = this.j;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i - 1;
        this.j = i2;
        if (i2 != 0 || this.k) {
            return;
        }
        Set<ws4> setU = u();
        if (setU != null) {
            if (!(!this.k)) {
                throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
            }
            x(null);
            int iD = d();
            Iterator<ws4> it = setU.iterator();
            while (it.hasNext()) {
                for (xs4 xs4VarA = it.next().a(); xs4VarA != null; xs4VarA = xs4VarA.b) {
                    int i3 = xs4VarA.a;
                    if (i3 != iD) {
                        Iterable iterable = this.h;
                        Integer numValueOf = Integer.valueOf(i3);
                        if (iterable instanceof Collection) {
                            zContains = ((Collection) iterable).contains(numValueOf);
                        } else {
                            if (!(iterable instanceof List)) {
                                Iterator<Integer> it2 = iterable.iterator();
                                int i4 = 0;
                                while (true) {
                                    y94 y94Var = (y94) it2;
                                    if (!y94Var.hasNext()) {
                                        iIndexOf = -1;
                                        break;
                                    }
                                    Object next = y94Var.next();
                                    if (i4 < 0) {
                                        ps0.j0();
                                        throw null;
                                    }
                                    if (ur1.a(numValueOf, next)) {
                                        iIndexOf = i4;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                iIndexOf = ((List) iterable).indexOf(numValueOf);
                            }
                            zContains = iIndexOf >= 0;
                        }
                        if (zContains) {
                            xs4VarA.a = 0;
                        }
                    } else {
                        xs4VarA.a = 0;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.cp4
    public void l() {
        if (this.k || this.c) {
            return;
        }
        s();
    }

    @Override // defpackage.cp4
    public void m(ws4 ws4Var) {
        Set<ws4> setU = u();
        HashSet hashSet = setU;
        if (setU == null) {
            HashSet hashSet2 = new HashSet();
            x(hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(ws4Var);
    }

    @Override // defpackage.cp4
    public final void n() {
        int length = this.i.length;
        for (int i = 0; i < length; i++) {
            ip4.o(this.i[i]);
        }
        int i2 = this.d;
        if (i2 >= 0) {
            ip4.o(i2);
            this.d = -1;
        }
    }

    @Override // defpackage.cp4
    public cp4 r(j81<Object, sd5> j81Var) {
        km2 km2Var;
        if (!(!this.c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        z();
        int iD = d();
        w(d());
        Object obj = ip4.c;
        synchronized (obj) {
            int i = ip4.e;
            ip4.e = i + 1;
            ip4.d = ip4.d.f(i);
            gp4 gp4VarE = e();
            while (true) {
                iD++;
                if (iD >= i) {
                    break;
                }
                gp4VarE = gp4VarE.f(iD);
            }
            km2Var = new km2(i, gp4VarE, j81Var, this);
        }
        if (!this.k && !this.c) {
            int iD2 = d();
            synchronized (obj) {
                int i2 = ip4.e;
                ip4.e = i2 + 1;
                p(i2);
                ip4.d = ip4.d.f(d());
                sd5 sd5Var = sd5.a;
            }
            gp4 gp4VarE2 = e();
            int iD3 = d();
            for (int i3 = iD2 + 1; i3 < iD3; i3++) {
                gp4VarE2 = gp4VarE2.f(i3);
            }
            q(gp4VarE2);
        }
        return km2Var;
    }

    public final void s() {
        w(d());
        sd5 sd5Var = sd5.a;
        if (this.k || this.c) {
            return;
        }
        int iD = d();
        synchronized (ip4.c) {
            int i = ip4.e;
            ip4.e = i + 1;
            p(i);
            ip4.d = ip4.d.f(d());
        }
        gp4 gp4VarE = e();
        int iD2 = d();
        for (int i2 = iD + 1; i2 < iD2; i2++) {
            gp4VarE = gp4VarE.f(i2);
        }
        q(gp4VarE);
    }

    public ep4 t() {
        HashMap mapC;
        uy2 uy2Var;
        Set<ws4> setU = u();
        if (setU != null) {
            AtomicReference<ia1> atomicReference = ip4.i;
            mapC = ip4.c(atomicReference.get(), this, ip4.d.b(atomicReference.get().b));
        } else {
            mapC = null;
        }
        synchronized (ip4.c) {
            ip4.d(this);
            if (setU == null || setU.size() == 0) {
                b();
                ia1 ia1Var = ip4.i.get();
                ip4.p(ia1Var, ip4.a);
                Set<ws4> set = ia1Var.g;
                uy2Var = (set == null || !(set.isEmpty() ^ true)) ? new uy2(cs0.w, null) : new uy2(new ArrayList(ip4.g), set);
            } else {
                ia1 ia1Var2 = ip4.i.get();
                ep4 ep4VarV = v(ip4.e, mapC, ip4.d.b(ia1Var2.b));
                if (!ur1.a(ep4VarV, ep4.CQf.a)) {
                    return ep4VarV;
                }
                b();
                ip4.p(ia1Var2, ip4.a);
                Set<ws4> set2 = ia1Var2.g;
                x(null);
                ia1Var2.g = null;
                uy2Var = new uy2(new ArrayList(ip4.g), set2);
            }
            List list = (List) uy2Var.w;
            Set set3 = (Set) uy2Var.x;
            this.k = true;
            if (set3 != null && (!set3.isEmpty())) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((x81) list.get(i)).invoke(set3, this);
                }
            }
            if (setU != null && (!setU.isEmpty())) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((x81) list.get(i2)).invoke(setU, this);
                }
            }
            synchronized (ip4.c) {
                n();
                sd5 sd5Var = sd5.a;
            }
            return ep4.CQf.a;
        }
    }

    public Set<ws4> u() {
        return this.g;
    }

    public final ep4 v(int i, HashMap map, gp4 gp4Var) {
        xs4 xs4VarM;
        xs4 xs4VarB;
        gp4 gp4VarE = e().f(d()).e(this.h);
        Set<ws4> setU = u();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (ws4 ws4Var : setU) {
            xs4 xs4VarA = ws4Var.a();
            xs4 xs4VarM2 = ip4.m(xs4VarA, i, gp4Var);
            if (xs4VarM2 != null && (xs4VarM = ip4.m(xs4VarA, d(), gp4VarE)) != null && !ur1.a(xs4VarM2, xs4VarM)) {
                xs4 xs4VarM3 = ip4.m(xs4VarA, d(), e());
                if (xs4VarM3 == null) {
                    ip4.l();
                    throw null;
                }
                if (map == null || (xs4VarB = (xs4) map.get(xs4VarM2)) == null) {
                    xs4VarB = ws4Var.b(xs4VarM, xs4VarM2, xs4VarM3);
                }
                if (xs4VarB == null) {
                    return new ep4.QnHx();
                }
                if (!ur1.a(xs4VarB, xs4VarM3)) {
                    if (ur1.a(xs4VarB, xs4VarM2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new uy2(ws4Var, xs4VarM2.b()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(ws4Var);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!ur1.a(xs4VarB, xs4VarM) ? new uy2(ws4Var, xs4VarB) : new uy2(ws4Var, xs4VarM.b()));
                    }
                }
            }
        }
        if (arrayList != null) {
            s();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                uy2 uy2Var = (uy2) arrayList.get(i2);
                ws4 ws4Var2 = (ws4) uy2Var.w;
                xs4 xs4Var = (xs4) uy2Var.x;
                xs4Var.a = d();
                synchronized (ip4.c) {
                    xs4Var.b = ws4Var2.a();
                    ws4Var2.f(xs4Var);
                    sd5 sd5Var = sd5.a;
                }
            }
        }
        if (arrayList2 != null) {
            setU.removeAll(arrayList2);
        }
        return ep4.CQf.a;
    }

    public final void w(int i) {
        synchronized (ip4.c) {
            this.h = this.h.f(i);
            sd5 sd5Var = sd5.a;
        }
    }

    public void x(HashSet hashSet) {
        this.g = hashSet;
    }

    public qi2 y(j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2) {
        em2 em2Var;
        if (!(!this.c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        z();
        w(d());
        Object obj = ip4.c;
        synchronized (obj) {
            int i = ip4.e;
            ip4.e = i + 1;
            ip4.d = ip4.d.f(i);
            gp4 gp4VarE = e();
            q(gp4VarE.f(i));
            gp4 gp4VarF = gp4VarE;
            for (int iD = d() + 1; iD < i; iD++) {
                gp4VarF = gp4VarF.f(iD);
            }
            em2Var = new em2(i, gp4VarF, ip4.i(j81Var, this.e, true), ip4.b(j81Var2, this.f), this);
        }
        if (!this.k && !this.c) {
            int iD2 = d();
            synchronized (obj) {
                int i2 = ip4.e;
                ip4.e = i2 + 1;
                p(i2);
                ip4.d = ip4.d.f(d());
                sd5 sd5Var = sd5.a;
            }
            gp4 gp4VarE2 = e();
            int iD3 = d();
            for (int i3 = iD2 + 1; i3 < iD3; i3++) {
                gp4VarE2 = gp4VarE2.f(i3);
            }
            q(gp4VarE2);
        }
        return em2Var;
    }

    public final void z() {
        boolean z = true;
        if (this.k) {
            if (!(this.d >= 0)) {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }
}
