package defpackage;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class uk3 extends l40 {
    public static final kotlinx.coroutines.flow.QnHx q;
    public final wf a;
    public final os1 b;
    public final la0 c;
    public final Object d;
    public ms1 e;
    public Throwable f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public wm<? super sd5> n;
    public final kotlinx.coroutines.flow.QnHx o;
    public final CQf p;

    public final class CQf {
    }

    public enum F1 {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public static final class LPt8Fixed extends cx1 implements h81<sd5> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            wm<sd5> wmVarU;
            uk3 uk3Var = uk3.this;
            synchronized (uk3Var.d) {
                wmVarU = uk3Var.u();
                if (((F1) uk3Var.o.getValue()).compareTo(F1.ShuttingDown) <= 0) {
                    throw ps0.b("Recomposer shutdown; frame clock awaiter will never resume", uk3Var.f);
                }
            }
            if (wmVarU != null) {
                wmVarU.x(sd5.a);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements j81<Throwable, sd5> {
        public NUlFixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            Throwable th2 = th;
            CancellationException cancellationExceptionB = ps0.b("Recomposer effect job completed", th2);
            uk3 uk3Var = uk3.this;
            synchronized (uk3Var.d) {
                ms1 ms1Var = uk3Var.e;
                if (ms1Var != null) {
                    uk3Var.o.setValue(F1.ShuttingDown);
                    ms1Var.m(cancellationExceptionB);
                    uk3Var.n = null;
                    ms1Var.r0(new vk3(uk3Var, th2));
                } else {
                    uk3Var.f = cancellationExceptionB;
                    uk3Var.o.setValue(F1.ShutDown);
                    sd5 sd5Var = sd5.a;
                }
            }
            return sd5.a;
        }
    }

    public static final class QnHx {
    }

    static {
        new QnHx();
        q = FWT.o(q13.z);
    }

    public uk3(la0 la0Var) {
        wf wfVar = new wf(new LPt8Fixed());
        this.a = wfVar;
        os1 os1Var = new os1((ms1) la0Var.j(ms1.CQf.w));
        os1Var.r0(new NUlFixed());
        this.b = os1Var;
        this.c = la0Var.g0(wfVar).g0(os1Var);
        this.d = new Object();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.o = FWT.o(F1.Inactive);
        this.p = new CQf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(uk3 uk3Var) {
        int i;
        List list;
        synchronized (uk3Var.d) {
            if (!uk3Var.l.isEmpty()) {
                Collection collectionValues = uk3Var.l.values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    su.x0((Iterable) it.next(), arrayList);
                }
                uk3Var.l.clear();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ih2 ih2Var = (ih2) arrayList.get(i2);
                    arrayList2.add(new uy2(ih2Var, uk3Var.m.get(ih2Var)));
                }
                uk3Var.m.clear();
                list = arrayList2;
            } else {
                list = cs0.w;
            }
        }
        int size2 = list.size();
        for (i = 0; i < size2; i++) {
            uy2 uy2Var = (uy2) list.get(i);
            ih2 ih2Var2 = (ih2) uy2Var.w;
            hh2 hh2Var = (hh2) uy2Var.x;
            if (hh2Var != null) {
                ih2Var2.c.n(hh2Var);
            }
        }
    }

    public static final d90 q(uk3 uk3Var, d90 d90Var, wh1 wh1Var) {
        qi2 qi2VarY;
        if (d90Var.l() || d90Var.e()) {
            return null;
        }
        yk3 yk3Var = new yk3(d90Var);
        bl3 bl3Var = new bl3(d90Var, wh1Var);
        cp4 cp4VarH = ip4.h();
        qi2 qi2Var = cp4VarH instanceof qi2 ? (qi2) cp4VarH : null;
        if (qi2Var == null || (qi2VarY = qi2Var.y(yk3Var, bl3Var)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            cp4 cp4VarI = qi2VarY.i();
            try {
                boolean z = true;
                if (!(wh1Var.w > 0)) {
                    z = false;
                }
                if (z) {
                    d90Var.j(new xk3(d90Var, wh1Var));
                }
                boolean zR = d90Var.r();
                cp4.o(cp4VarI);
                s(qi2VarY);
                if (!zR) {
                    d90Var = null;
                }
                return d90Var;
            } catch (Throwable th) {
                cp4.o(cp4VarI);
                throw th;
            }
        } catch (Throwable th2) {
            s(qi2VarY);
            throw th2;
        }
    }

    public static final void r(uk3 uk3Var) {
        ArrayList arrayList = uk3Var.h;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Set<? extends Object> set = (Set) arrayList.get(i);
                ArrayList arrayList2 = uk3Var.g;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((d90) arrayList2.get(i2)).i(set);
                }
            }
            arrayList.clear();
            if (uk3Var.u() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    public static void s(qi2 qi2Var) {
        try {
            if (qi2Var.t() instanceof ep4.QnHx) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            qi2Var.c();
        } catch (Throwable th) {
            qi2Var.c();
            throw th;
        }
    }

    public static final void w(ArrayList arrayList, uk3 uk3Var, d90 d90Var) {
        arrayList.clear();
        synchronized (uk3Var.d) {
            Iterator it = uk3Var.k.iterator();
            while (it.hasNext()) {
                ih2 ih2Var = (ih2) it.next();
                if (ur1.a(ih2Var.c, d90Var)) {
                    arrayList.add(ih2Var);
                    it.remove();
                }
            }
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.l40
    public final void a(d90 d90Var, sz szVar) {
        qi2 qi2VarY;
        boolean zL = d90Var.l();
        yk3 yk3Var = new yk3(d90Var);
        bl3 bl3Var = new bl3(d90Var, null);
        cp4 cp4VarH = ip4.h();
        qi2 qi2Var = cp4VarH instanceof qi2 ? (qi2) cp4VarH : null;
        if (qi2Var == null || (qi2VarY = qi2Var.y(yk3Var, bl3Var)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            cp4 cp4VarI = qi2VarY.i();
            try {
                d90Var.s(szVar);
                sd5 sd5Var = sd5.a;
                cp4.o(cp4VarI);
                s(qi2VarY);
                if (!zL) {
                    ip4.h().l();
                }
                synchronized (this.d) {
                    if (((F1) this.o.getValue()).compareTo(F1.ShuttingDown) > 0 && !this.g.contains(d90Var)) {
                        this.g.add(d90Var);
                    }
                }
                synchronized (this.d) {
                    ArrayList arrayList = this.k;
                    int size = arrayList.size();
                    boolean z = false;
                    for (int i = 0; i < size; i++) {
                        if (ur1.a(((ih2) arrayList.get(i)).c, d90Var)) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        sd5 sd5Var2 = sd5.a;
                        ArrayList arrayList2 = new ArrayList();
                        w(arrayList2, this, d90Var);
                        while (!arrayList2.isEmpty()) {
                            x(arrayList2, null);
                            w(arrayList2, this, d90Var);
                        }
                    }
                }
                d90Var.k();
                d90Var.d();
                if (zL) {
                    return;
                }
                ip4.h().l();
            } catch (Throwable th) {
                cp4.o(cp4VarI);
                throw th;
            }
        } catch (Throwable th2) {
            s(qi2VarY);
            throw th2;
        }
    }

    @Override // defpackage.l40
    public final void b(ih2 ih2Var) {
        synchronized (this.d) {
            LinkedHashMap linkedHashMap = this.l;
            gh2<Object> gh2Var = ih2Var.a;
            Object arrayList = linkedHashMap.get(gh2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(gh2Var, arrayList);
            }
            ((List) arrayList).add(ih2Var);
        }
    }

    @Override // defpackage.l40
    public final boolean d() {
        return false;
    }

    @Override // defpackage.l40
    public final int f() {
        return AdError.NETWORK_ERROR_CODE;
    }

    @Override // defpackage.l40
    public final la0 g() {
        return this.c;
    }

    @Override // defpackage.l40
    public final void h(d90 d90Var) {
        wm<sd5> wmVarU;
        synchronized (this.d) {
            if (this.i.contains(d90Var)) {
                wmVarU = null;
            } else {
                this.i.add(d90Var);
                wmVarU = u();
            }
        }
        if (wmVarU != null) {
            wmVarU.x(sd5.a);
        }
    }

    @Override // defpackage.l40
    public final void i(ih2 ih2Var, hh2 hh2Var) {
        synchronized (this.d) {
            this.m.put(ih2Var, hh2Var);
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.l40
    public final hh2 j(ih2 ih2Var) {
        hh2 hh2Var;
        synchronized (this.d) {
            hh2Var = (hh2) this.m.remove(ih2Var);
        }
        return hh2Var;
    }

    @Override // defpackage.l40
    public final void k(Set<Object> set) {
    }

    @Override // defpackage.l40
    public final void o(d90 d90Var) {
        synchronized (this.d) {
            this.g.remove(d90Var);
            this.i.remove(d90Var);
            this.j.remove(d90Var);
            sd5 sd5Var = sd5.a;
        }
    }

    public final void t() {
        synchronized (this.d) {
            if (((F1) this.o.getValue()).compareTo(F1.Idle) >= 0) {
                this.o.setValue(F1.ShuttingDown);
            }
            sd5 sd5Var = sd5.a;
        }
        this.b.m(null);
    }

    public final wm<sd5> u() {
        F1 f1;
        kotlinx.coroutines.flow.QnHx qnHx = this.o;
        int iCompareTo = ((F1) qnHx.getValue()).compareTo(F1.ShuttingDown);
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        ArrayList arrayList3 = this.i;
        ArrayList arrayList4 = this.h;
        if (iCompareTo <= 0) {
            this.g.clear();
            arrayList4.clear();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            wm<? super sd5> wmVar = this.n;
            if (wmVar != null) {
                wmVar.l(null);
            }
            this.n = null;
            return null;
        }
        ms1 ms1Var = this.e;
        F1 f2 = F1.PendingWork;
        wf wfVar = this.a;
        if (ms1Var == null) {
            arrayList4.clear();
            arrayList3.clear();
            f1 = wfVar.a() ? F1.InactivePendingWork : F1.Inactive;
        } else {
            f1 = ((arrayList3.isEmpty() ^ true) || (arrayList4.isEmpty() ^ true) || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || wfVar.a()) ? f2 : F1.Idle;
        }
        qnHx.setValue(f1);
        if (f1 != f2) {
            return null;
        }
        wm wmVar2 = this.n;
        this.n = null;
        return wmVar2;
    }

    public final boolean v() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!(!this.h.isEmpty()) && !(!this.i.isEmpty()) && !this.a.a()) {
                z = false;
            }
        }
        return z;
    }

    public final List<d90> x(List<ih2> list, wh1<Object> wh1Var) {
        qi2 qi2VarY;
        ArrayList arrayList;
        Object obj;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ih2 ih2Var = list.get(i);
            d90 d90Var = ih2Var.c;
            Object arrayList2 = map.get(d90Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(d90Var, arrayList2);
            }
            ((ArrayList) arrayList2).add(ih2Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            d90 d90Var2 = (d90) entry.getKey();
            List list2 = (List) entry.getValue();
            e40.f(!d90Var2.l());
            yk3 yk3Var = new yk3(d90Var2);
            bl3 bl3Var = new bl3(d90Var2, wh1Var);
            cp4 cp4VarH = ip4.h();
            qi2 qi2Var = cp4VarH instanceof qi2 ? (qi2) cp4VarH : null;
            if (qi2Var == null || (qi2VarY = qi2Var.y(yk3Var, bl3Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                cp4 cp4VarI = qi2VarY.i();
                try {
                    synchronized (this.d) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            ih2 ih2Var2 = (ih2) list2.get(i2);
                            LinkedHashMap linkedHashMap = this.l;
                            gh2<Object> gh2Var = ih2Var2.a;
                            List list3 = (List) linkedHashMap.get(gh2Var);
                            if (list3 == null) {
                                obj = null;
                            } else {
                                if (list3.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                Object objRemove = list3.remove(0);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(gh2Var);
                                }
                                obj = objRemove;
                            }
                            arrayList.add(new uy2(ih2Var2, obj));
                            i2++;
                            this = this;
                        }
                    }
                    d90Var2.c(arrayList);
                    sd5 sd5Var = sd5.a;
                    cp4.o(cp4VarI);
                    s(qi2VarY);
                } catch (Throwable th) {
                    cp4.o(cp4VarI);
                    throw th;
                }
            } catch (Throwable th2) {
                s(qi2VarY);
                throw th2;
            }
        }
        return wu.e1(map.keySet());
    }
}
