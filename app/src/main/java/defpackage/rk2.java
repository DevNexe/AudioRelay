package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class rk2 {
    public int A;
    public final ArrayList B;
    public final nj4 C;
    public final Context a;
    public final Activity b;
    public fl2 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final syh<kk2> g;
    public final kotlinx.coroutines.flow.QnHx h;
    public final ii3 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public d32 n;
    public OnBackPressedDispatcher o;
    public xk2 p;
    public final CopyOnWriteArrayList<CQf> q;
    public androidx.lifecycle.YKK.F1 r;
    public final qk2 s;
    public final YKK t;
    public boolean u;
    public final cm2 v;
    public final LinkedHashMap w;
    public j81<? super kk2, sd5> x;
    public j81<? super kk2, sd5> y;
    public final LinkedHashMap z;

    public interface CQf {
        void a(dl2 dl2Var);
    }

    public static final class EQ extends cx1 implements j81<dl2, dl2> {
        public static final EQ w = new EQ();

        public EQ() {
            super(1);
        }

        @Override // defpackage.j81
        public final dl2 invoke(dl2 dl2Var) {
            dl2 dl2Var2 = dl2Var;
            fl2 fl2Var = dl2Var2.x;
            if (fl2Var != null && fl2Var.G == dl2Var2.C) {
                return fl2Var;
            }
            return null;
        }
    }

    public static final class F1 extends cx1 implements j81<Context, Context> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final Context invoke(Context context) {
            Context context2 = context;
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    public static final class FJCM extends cx1 implements j81<dl2, Boolean> {
        public FJCM() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(dl2 dl2Var) {
            return Boolean.valueOf(!rk2.this.l.containsKey(Integer.valueOf(dl2Var.C)));
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<rl2> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final rl2 invoke() {
            rk2.this.getClass();
            return new rl2();
        }
    }

    public static final class NUlFixed extends cx1 implements j81<kk2, sd5> {
        public final /* synthetic */ fl3 w;
        public final /* synthetic */ rk2 x;
        public final /* synthetic */ dl2 y;
        public final /* synthetic */ Bundle z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(fl3 fl3Var, rk2 rk2Var, dl2 dl2Var, Bundle bundle) {
            super(1);
            this.w = fl3Var;
            this.x = rk2Var;
            this.y = dl2Var;
            this.z = bundle;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kk2 kk2Var) {
            this.w.w = true;
            cs0 cs0Var = cs0.w;
            dl2 dl2Var = this.y;
            Bundle bundle = this.z;
            this.x.a(dl2Var, bundle, kk2Var, cs0Var);
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements j81<String, Boolean> {
        public final /* synthetic */ String w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PRnFixed(String str) {
            super(1);
            this.w = str;
        }

        @Override // defpackage.j81
        public final Boolean invoke(String str) {
            return Boolean.valueOf(ur1.a(str, this.w));
        }
    }

    public final class QnHx extends dm2 {
        public final zl2<? extends dl2> g;

        /* JADX INFO: renamed from: rk2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0187QnHx extends cx1 implements h81<sd5> {
            public final /* synthetic */ kk2 x;
            public final /* synthetic */ boolean y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0187QnHx(kk2 kk2Var, boolean z) {
                super(0);
                this.x = kk2Var;
                this.y = z;
            }

            @Override // defpackage.h81
            public final sd5 invoke() {
                QnHx.super.c(this.x, this.y);
                return sd5.a;
            }
        }

        public QnHx(zl2<? extends dl2> zl2Var) {
            this.g = zl2Var;
        }

        @Override // defpackage.dm2
        public final kk2 a(dl2 dl2Var, Bundle bundle) {
            rk2 rk2Var = rk2.this;
            return kk2.QnHx.a(rk2Var.a, dl2Var, bundle, rk2Var.f(), rk2Var.p);
        }

        @Override // defpackage.dm2
        public final void b(kk2 kk2Var) {
            boolean z;
            xk2 xk2Var;
            lj5 lj5Var;
            rk2 rk2Var = rk2.this;
            boolean zA = ur1.a(rk2Var.z.get(kk2Var), Boolean.TRUE);
            super.b(kk2Var);
            rk2Var.z.remove(kk2Var);
            syh<kk2> syhVar = rk2Var.g;
            boolean zContains = syhVar.contains(kk2Var);
            kotlinx.coroutines.flow.QnHx qnHx = rk2Var.h;
            if (zContains) {
                if (this.d) {
                    return;
                }
                rk2Var.r();
                qnHx.setValue(rk2Var.o());
                return;
            }
            rk2Var.q(kk2Var);
            if (kk2Var.D.c.a(androidx.lifecycle.YKK.F1.CREATED)) {
                kk2Var.d(androidx.lifecycle.YKK.F1.DESTROYED);
            }
            boolean z2 = syhVar instanceof Collection;
            String str = kk2Var.B;
            if (!z2 || !syhVar.isEmpty()) {
                Iterator<kk2> it = syhVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (ur1.a(it.next().B, str)) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z && !zA && (xk2Var = rk2Var.p) != null && (lj5Var = (lj5) xk2Var.d.remove(str)) != null) {
                lj5Var.a();
            }
            rk2Var.r();
            qnHx.setValue(rk2Var.o());
        }

        @Override // defpackage.dm2
        public final void c(kk2 kk2Var, boolean z) {
            rk2 rk2Var = rk2.this;
            zl2 zl2VarB = rk2Var.v.b(kk2Var.x.w);
            if (!ur1.a(zl2VarB, this.g)) {
                ((QnHx) rk2Var.w.get(zl2VarB)).c(kk2Var, z);
                return;
            }
            j81<? super kk2, sd5> j81Var = rk2Var.y;
            if (j81Var != null) {
                j81Var.invoke(kk2Var);
                super.c(kk2Var, z);
                return;
            }
            C0187QnHx c0187QnHx = new C0187QnHx(kk2Var, z);
            syh<kk2> syhVar = rk2Var.g;
            int iIndexOf = syhVar.indexOf(kk2Var);
            if (iIndexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + kk2Var + " as it was not found on the current back stack");
                return;
            }
            int i = iIndexOf + 1;
            if (i != syhVar.y) {
                rk2Var.l(syhVar.get(i).x.C, true, false);
            }
            rk2.n(rk2Var, kk2Var);
            c0187QnHx.invoke();
            rk2Var.s();
            rk2Var.b();
        }

        @Override // defpackage.dm2
        public final void d(kk2 kk2Var, boolean z) {
            super.d(kk2Var, z);
            rk2.this.z.put(kk2Var, Boolean.valueOf(z));
        }

        @Override // defpackage.dm2
        public final void e(kk2 kk2Var) {
            rk2 rk2Var = rk2.this;
            zl2 zl2VarB = rk2Var.v.b(kk2Var.x.w);
            if (!ur1.a(zl2VarB, this.g)) {
                Object obj = rk2Var.w.get(zl2VarB);
                if (obj == null) {
                    throw new IllegalStateException(i5.b(new StringBuilder("NavigatorBackStack for "), kk2Var.x.w, " should already be created").toString());
                }
                ((QnHx) obj).e(kk2Var);
                return;
            }
            j81<? super kk2, sd5> j81Var = rk2Var.x;
            if (j81Var != null) {
                j81Var.invoke(kk2Var);
                super.e(kk2Var);
            } else {
                Log.i("NavController", "Ignoring add of destination " + kk2Var.x + " outside of the call to navigate(). ");
            }
        }

        public final void g(kk2 kk2Var) {
            super.e(kk2Var);
        }
    }

    public static final class T23 extends cx1 implements j81<dl2, dl2> {
        public static final T23 w = new T23();

        public T23() {
            super(1);
        }

        @Override // defpackage.j81
        public final dl2 invoke(dl2 dl2Var) {
            dl2 dl2Var2 = dl2Var;
            fl2 fl2Var = dl2Var2.x;
            if (fl2Var != null && fl2Var.G == dl2Var2.C) {
                return fl2Var;
            }
            return null;
        }
    }

    public static final class YKK extends hu2 {
        public YKK() {
            super(false);
        }

        @Override // defpackage.hu2
        public final void a() {
            rk2.this.j();
        }
    }

    public static final class auxFixed extends cx1 implements j81<kk2, sd5> {
        public final /* synthetic */ syh<pk2> A;
        public final /* synthetic */ fl3 w;
        public final /* synthetic */ fl3 x;
        public final /* synthetic */ rk2 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(fl3 fl3Var, fl3 fl3Var2, rk2 rk2Var, boolean z, syh<pk2> syhVar) {
            super(1);
            this.w = fl3Var;
            this.x = fl3Var2;
            this.y = rk2Var;
            this.z = z;
            this.A = syhVar;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kk2 kk2Var) {
            this.w.w = true;
            this.x.w = true;
            boolean z = this.z;
            syh<pk2> syhVar = this.A;
            this.y.m(kk2Var, z, syhVar);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements j81<dl2, Boolean> {
        public byN() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(dl2 dl2Var) {
            return Boolean.valueOf(!rk2.this.l.containsKey(Integer.valueOf(dl2Var.C)));
        }
    }

    public static final class y extends cx1 implements j81<kk2, sd5> {
        public final /* synthetic */ Bundle A;
        public final /* synthetic */ fl3 w;
        public final /* synthetic */ List<kk2> x;
        public final /* synthetic */ hl3 y;
        public final /* synthetic */ rk2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(fl3 fl3Var, ArrayList arrayList, hl3 hl3Var, rk2 rk2Var, Bundle bundle) {
            super(1);
            this.w = fl3Var;
            this.x = arrayList;
            this.y = hl3Var;
            this.z = rk2Var;
            this.A = bundle;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kk2 kk2Var) {
            List<kk2> listSubList;
            kk2 kk2Var2 = kk2Var;
            this.w.w = true;
            List<kk2> list = this.x;
            int iIndexOf = list.indexOf(kk2Var2);
            if (iIndexOf != -1) {
                hl3 hl3Var = this.y;
                int i = iIndexOf + 1;
                listSubList = list.subList(hl3Var.w, i);
                hl3Var.w = i;
            } else {
                listSubList = cs0.w;
            }
            this.z.a(kk2Var2.x, this.A, kk2Var2, listSubList);
            return sd5.a;
        }
    }

    public rk2(Context context) {
        this.a = context;
        for (Object obj : ba4.G0(context, F1.w)) {
            if (((Context) obj) instanceof Activity) {
                this.b = (Activity) obj;
                this.g = new syh<>();
                kotlinx.coroutines.flow.QnHx qnHxO = FWT.o(cs0.w);
                this.h = qnHxO;
                this.i = new ii3(qnHxO, null);
                this.j = new LinkedHashMap();
                this.k = new LinkedHashMap();
                this.l = new LinkedHashMap();
                this.m = new LinkedHashMap();
                this.q = new CopyOnWriteArrayList<>();
                this.r = androidx.lifecycle.YKK.F1.INITIALIZED;
                this.s = new qk2(this, 0);
                this.t = new YKK();
                this.u = true;
                cm2 cm2Var = new cm2();
                this.v = cm2Var;
                this.w = new LinkedHashMap();
                this.z = new LinkedHashMap();
                cm2Var.a(new hl2(cm2Var));
                cm2Var.a(new cOm4Fixed(this.a));
                this.B = new ArrayList();
                new ry4(new LPt8Fixed());
                nj4 nj4VarC = OW8.c(1, 0, lg.DROP_OLDEST, 2);
                this.C = nj4VarC;
                new gi3(nj4VarC);
            }
        }
        obj = null;
        this.b = (Activity) obj;
        this.g = new syh<>();
        kotlinx.coroutines.flow.QnHx qnHxO2 = FWT.o(cs0.w);
        this.h = qnHxO2;
        this.i = new ii3(qnHxO2, null);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.q = new CopyOnWriteArrayList<>();
        this.r = androidx.lifecycle.YKK.F1.INITIALIZED;
        this.s = new qk2(this, 0);
        this.t = new YKK();
        this.u = true;
        cm2 cm2Var2 = new cm2();
        this.v = cm2Var2;
        this.w = new LinkedHashMap();
        this.z = new LinkedHashMap();
        cm2Var2.a(new hl2(cm2Var2));
        cm2Var2.a(new cOm4Fixed(this.a));
        this.B = new ArrayList();
        new ry4(new LPt8Fixed());
        nj4 nj4VarC2 = OW8.c(1, 0, lg.DROP_OLDEST, 2);
        this.C = nj4VarC2;
        new gi3(nj4VarC2);
    }

    public static void k(il2 il2Var) {
        il2Var.getClass();
        int i = dl2.E;
        if (il2Var.l(dl2.QnHx.a("idle").hashCode(), false, false)) {
            il2Var.b();
        }
    }

    public static /* synthetic */ void n(rk2 rk2Var, kk2 kk2Var) {
        rk2Var.m(kk2Var, false, new syh<>());
    }

    public final void a(dl2 dl2Var, Bundle bundle, kk2 kk2Var, List<kk2> list) {
        kk2 kk2VarPrevious;
        kk2 kk2VarPrevious2;
        dl2 dl2Var2 = kk2Var.x;
        boolean z = dl2Var2 instanceof lz0;
        syh<kk2> syhVar = this.g;
        if (!z) {
            while (!syhVar.isEmpty() && (syhVar.last().x instanceof lz0) && l(syhVar.last().x.C, true, false)) {
            }
        }
        syh<kk2> syhVar2 = new syh();
        boolean z2 = dl2Var instanceof fl2;
        Context context = this.a;
        kk2 kk2Var2 = null;
        if (z2) {
            dl2 dl2Var3 = dl2Var2;
            do {
                dl2Var3 = dl2Var3.x;
                if (dl2Var3 != null) {
                    ListIterator<kk2> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            kk2VarPrevious2 = null;
                            break;
                        }
                        kk2VarPrevious2 = listIterator.previous();
                    } while (!ur1.a(kk2VarPrevious2.x, dl2Var3));
                    kk2 kk2VarA = kk2VarPrevious2;
                    if (kk2VarA == null) {
                        kk2VarA = kk2.QnHx.a(context, dl2Var3, bundle, f(), this.p);
                    }
                    syhVar2.addFirst(kk2VarA);
                    if ((!syhVar.isEmpty()) && syhVar.last().x == dl2Var3) {
                        n(this, syhVar.last());
                    }
                }
                if (dl2Var3 == null) {
                    break;
                }
            } while (dl2Var3 != dl2Var);
        }
        dl2 dl2Var4 = syhVar2.isEmpty() ? dl2Var2 : ((kk2) syhVar2.first()).x;
        while (dl2Var4 != null && c(dl2Var4.C) == null) {
            dl2Var4 = dl2Var4.x;
            if (dl2Var4 != null) {
                ListIterator<kk2> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        kk2VarPrevious = null;
                        break;
                    }
                    kk2VarPrevious = listIterator2.previous();
                } while (!ur1.a(kk2VarPrevious.x, dl2Var4));
                kk2 kk2VarA2 = kk2VarPrevious;
                if (kk2VarA2 == null) {
                    kk2VarA2 = kk2.QnHx.a(context, dl2Var4, dl2Var4.b(bundle), f(), this.p);
                }
                syhVar2.addFirst(kk2VarA2);
            }
        }
        if (!syhVar2.isEmpty()) {
            dl2Var2 = ((kk2) syhVar2.first()).x;
        }
        while (!syhVar.isEmpty() && (syhVar.last().x instanceof fl2) && ((fl2) syhVar.last().x).g(dl2Var2.C, false) == null) {
            n(this, syhVar.last());
        }
        kk2 kk2Var3 = (kk2) (syhVar.isEmpty() ? null : syhVar.x[syhVar.w]);
        if (kk2Var3 == null) {
            kk2Var3 = (kk2) (syhVar2.isEmpty() ? null : syhVar2.x[syhVar2.w]);
        }
        if (!ur1.a(kk2Var3 != null ? kk2Var3.x : null, this.c)) {
            ListIterator<kk2> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                kk2 kk2VarPrevious3 = listIterator3.previous();
                if (ur1.a(kk2VarPrevious3.x, this.c)) {
                    kk2Var2 = kk2VarPrevious3;
                    break;
                }
            }
            kk2 kk2VarA3 = kk2Var2;
            if (kk2VarA3 == null) {
                fl2 fl2Var = this.c;
                kk2VarA3 = kk2.QnHx.a(context, fl2Var, fl2Var.b(bundle), f(), this.p);
            }
            syhVar2.addFirst(kk2VarA3);
        }
        for (kk2 kk2Var4 : syhVar2) {
            Object obj = this.w.get(this.v.b(kk2Var4.x.w));
            if (obj == null) {
                throw new IllegalStateException(i5.b(new StringBuilder("NavigatorBackStack for "), dl2Var.w, " should already be created").toString());
            }
            ((QnHx) obj).g(kk2Var4);
        }
        syhVar.addAll(syhVar2);
        syhVar.addLast(kk2Var);
        for (kk2 kk2Var5 : wu.V0(kk2Var, syhVar2)) {
            fl2 fl2Var2 = kk2Var5.x.x;
            if (fl2Var2 != null) {
                g(kk2Var5, d(fl2Var2.C));
            }
        }
    }

    public final boolean b() {
        syh<kk2> syhVar;
        while (true) {
            syhVar = this.g;
            if (syhVar.isEmpty() || !(syhVar.last().x instanceof fl2)) {
                break;
            }
            n(this, syhVar.last());
        }
        kk2 kk2VarF = syhVar.f();
        ArrayList arrayList = this.B;
        if (kk2VarF != null) {
            arrayList.add(kk2VarF);
        }
        this.A++;
        r();
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            ArrayList<kk2> arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            for (kk2 kk2Var : arrayList2) {
                Iterator<CQf> it = this.q.iterator();
                while (it.hasNext()) {
                    it.next().a(kk2Var.x);
                }
                this.C.e(kk2Var);
            }
            this.h.setValue(o());
        }
        return kk2VarF != null;
    }

    public final dl2 c(int i) {
        dl2 dl2Var;
        fl2 fl2Var = this.c;
        if (fl2Var == null) {
            return null;
        }
        if (fl2Var.C == i) {
            return fl2Var;
        }
        kk2 kk2VarF = this.g.f();
        if (kk2VarF == null || (dl2Var = kk2VarF.x) == null) {
            dl2Var = this.c;
        }
        if (dl2Var.C == i) {
            return dl2Var;
        }
        return (dl2Var instanceof fl2 ? (fl2) dl2Var : dl2Var.x).g(i, true);
    }

    public final kk2 d(int i) {
        kk2 kk2VarPrevious;
        syh<kk2> syhVar = this.g;
        ListIterator<kk2> listIterator = syhVar.listIterator(syhVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                kk2VarPrevious = null;
                break;
            }
            kk2VarPrevious = listIterator.previous();
        } while (!(kk2VarPrevious.x.C == i));
        kk2 kk2Var = kk2VarPrevious;
        if (kk2Var != null) {
            return kk2Var;
        }
        StringBuilder sbC = iZUl.c("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbC.append(e());
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    public final dl2 e() {
        kk2 kk2VarF = this.g.f();
        if (kk2VarF != null) {
            return kk2VarF.x;
        }
        return null;
    }

    public final androidx.lifecycle.YKK.F1 f() {
        return this.n == null ? androidx.lifecycle.YKK.F1.CREATED : this.r;
    }

    public final void g(kk2 kk2Var, kk2 kk2Var2) {
        this.j.put(kk2Var, kk2Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(kk2Var2) == null) {
            linkedHashMap.put(kk2Var2, new AtomicInteger(0));
        }
        ((AtomicInteger) linkedHashMap.get(kk2Var2)).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0140 A[LOOP:1: B:52:0x013a->B:54:0x0140, LOOP_END] */
    public final void h(dl2 dl2Var, Bundle bundle, sl2 sl2Var, zl2.QnHx qnHx) {
        boolean z;
        dl2 dl2Var2;
        Iterator it;
        int i;
        LinkedHashMap linkedHashMap = this.w;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((QnHx) it2.next()).d = true;
        }
        fl3 fl3Var = new fl3();
        boolean zL = (sl2Var == null || (i = sl2Var.c) == -1) ? false : l(i, sl2Var.d, sl2Var.e);
        Bundle bundleB = dl2Var.b(bundle);
        if ((sl2Var != null && sl2Var.b) && this.l.containsKey(Integer.valueOf(dl2Var.C))) {
            fl3Var.w = p(dl2Var.C, bundleB, sl2Var, qnHx);
        } else {
            syh<kk2> syhVar = this.g;
            kk2 kk2VarF = syhVar.f();
            zl2 zl2VarB = this.v.b(dl2Var.w);
            if (sl2Var != null && sl2Var.a) {
                if ((kk2VarF == null || (dl2Var2 = kk2VarF.x) == null || dl2Var.C != dl2Var2.C) ? false : true) {
                    q(syhVar.removeLast());
                    zL = zL;
                    kk2 kk2Var = new kk2(kk2VarF.w, kk2VarF.x, bundleB, kk2VarF.z, kk2VarF.A, kk2VarF.B, kk2VarF.C);
                    kk2Var.z = kk2VarF.z;
                    kk2Var.d(kk2VarF.H);
                    syhVar.addLast(kk2Var);
                    fl2 fl2Var = kk2Var.x.x;
                    if (fl2Var != null) {
                        g(kk2Var, d(fl2Var.C));
                    }
                    dl2 dl2Var3 = kk2Var.x;
                    if (!(dl2Var3 instanceof dl2)) {
                        dl2Var3 = null;
                    }
                    if (dl2Var3 != null) {
                        C0239D.B(am2.w);
                        zl2VarB.c(dl2Var3);
                        kotlinx.coroutines.flow.QnHx qnHx2 = zl2VarB.b().b;
                        qnHx2.setValue(wu.V0(kk2Var, wu.S0((Iterable) qnHx2.getValue(), wu.N0((List) qnHx2.getValue()))));
                    }
                    z = true;
                }
                s();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((QnHx) it.next()).d = false;
                }
                if (!zL || fl3Var.w || z) {
                    b();
                } else {
                    r();
                    return;
                }
            }
            List<kk2> listSingletonList = Collections.singletonList(kk2.QnHx.a(this.a, dl2Var, bundleB, f(), this.p));
            this.x = new NUlFixed(fl3Var, this, dl2Var, bundleB);
            zl2VarB.d(listSingletonList, sl2Var, qnHx);
            this.x = null;
        }
        z = false;
        s();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((QnHx) it.next()).d = false;
        }
        if (zL) {
        }
        b();
    }

    public final void i(String str, j81<? super ul2, sd5> j81Var) {
        sl2 sl2VarB = C0239D.B(j81Var);
        int i = dl2.E;
        Uri uri = Uri.parse(dl2.QnHx.a(str));
        al2 al2Var = new al2(uri, null, null);
        dl2.CQf cQfE = this.c.e(al2Var);
        if (cQfE == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + al2Var + " cannot be found in the navigation graph " + this.c);
        }
        dl2 dl2Var = cQfE.w;
        Bundle bundleB = dl2Var.b(cQfE.x);
        if (bundleB == null) {
            bundleB = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleB.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        h(dl2Var, bundleB, sl2VarB, null);
    }

    public final boolean j() {
        return !this.g.isEmpty() && l(e().C, true, false) && b();
    }

    public final boolean l(int i, boolean z, boolean z2) {
        dl2 dl2Var;
        String str;
        String str2;
        syh<kk2> syhVar = this.g;
        if (syhVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = wu.W0(syhVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                dl2Var = null;
                break;
            }
            dl2 dl2Var2 = ((kk2) it.next()).x;
            zl2 zl2VarB = this.v.b(dl2Var2.w);
            if (z || dl2Var2.C != i) {
                arrayList.add(zl2VarB);
            }
            if (dl2Var2.C == i) {
                dl2Var = dl2Var2;
                break;
            }
        }
        if (dl2Var == null) {
            int i2 = dl2.E;
            Log.i("NavController", "Ignoring popBackStack to destination " + dl2.QnHx.b(this.a, i) + " as it was not found on the current back stack");
            return false;
        }
        fl3 fl3Var = new fl3();
        syh syhVar2 = new syh();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            zl2 zl2Var = (zl2) it2.next();
            fl3 fl3Var2 = new fl3();
            kk2 kk2VarLast = syhVar.last();
            syh<kk2> syhVar3 = syhVar;
            this.y = new auxFixed(fl3Var2, fl3Var, this, z2, syhVar2);
            zl2Var.e(kk2VarLast, z2);
            str = null;
            this.y = null;
            if (!fl3Var2.w) {
                break;
            }
            syhVar = syhVar3;
        }
        if (z2) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                o05.QnHx qnHx = new o05.QnHx(new o05(ba4.G0(dl2Var, T23.w), new byN()));
                while (qnHx.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((dl2) qnHx.next()).C);
                    pk2 pk2Var = (pk2) (syhVar2.isEmpty() ? str : syhVar2.x[syhVar2.w]);
                    linkedHashMap.put(numValueOf, pk2Var != null ? pk2Var.w : str);
                }
            }
            if (!syhVar2.isEmpty()) {
                pk2 pk2Var2 = (pk2) syhVar2.first();
                o05.QnHx qnHx2 = new o05.QnHx(new o05(ba4.G0(c(pk2Var2.x), EQ.w), new FJCM()));
                while (true) {
                    boolean zHasNext = qnHx2.hasNext();
                    str2 = pk2Var2.w;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((dl2) qnHx2.next()).C), str2);
                }
                this.m.put(str2, syhVar2);
            }
        }
        s();
        return fl3Var.w;
    }

    public final void m(kk2 kk2Var, boolean z, syh<pk2> syhVar) {
        xk2 xk2Var;
        lj5 lj5Var;
        ii3 ii3Var;
        Set set;
        syh<kk2> syhVar2 = this.g;
        kk2 kk2VarLast = syhVar2.last();
        if (!ur1.a(kk2VarLast, kk2Var)) {
            throw new IllegalStateException(("Attempted to pop " + kk2Var.x + ", which is not the top of the back stack (" + kk2VarLast.x + ')').toString());
        }
        syhVar2.removeLast();
        QnHx qnHx = (QnHx) this.w.get(this.v.b(kk2VarLast.x.w));
        boolean z2 = (qnHx != null && (ii3Var = qnHx.f) != null && (set = (Set) ii3Var.getValue()) != null && set.contains(kk2VarLast)) || this.k.containsKey(kk2VarLast);
        androidx.lifecycle.YKK.F1 f1 = kk2VarLast.D.c;
        androidx.lifecycle.YKK.F1 f2 = androidx.lifecycle.YKK.F1.CREATED;
        if (f1.a(f2)) {
            if (z) {
                kk2VarLast.d(f2);
                syhVar.addFirst(new pk2(kk2VarLast));
            }
            if (z2) {
                kk2VarLast.d(f2);
            } else {
                kk2VarLast.d(androidx.lifecycle.YKK.F1.DESTROYED);
                q(kk2VarLast);
            }
        }
        if (z || z2 || (xk2Var = this.p) == null || (lj5Var = (lj5) xk2Var.d.remove(kk2VarLast.B)) == null) {
            return;
        }
        lj5Var.a();
    }

    public final ArrayList o() {
        androidx.lifecycle.YKK.F1 f1;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            f1 = androidx.lifecycle.YKK.F1.STARTED;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((QnHx) it.next()).f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                kk2 kk2Var = (kk2) obj;
                if ((arrayList.contains(kk2Var) || kk2Var.H.a(f1)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            su.x0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (kk2 kk2Var2 : this.g) {
            kk2 kk2Var3 = kk2Var2;
            if (!arrayList.contains(kk2Var3) && kk2Var3.H.a(f1)) {
                arrayList3.add(kk2Var2);
            }
        }
        su.x0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((kk2) obj2).x instanceof fl2)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean p(int i, Bundle bundle, sl2 sl2Var, zl2.QnHx qnHx) {
        dl2 dl2Var;
        kk2 kk2Var;
        dl2 dl2Var2;
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        su.y0(linkedHashMap.values(), new PRnFixed(str));
        LinkedHashMap linkedHashMap2 = this.m;
        sb5.c(linkedHashMap2);
        syh<pk2> syhVar = (syh) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        kk2 kk2VarF = this.g.f();
        if ((kk2VarF == null || (dl2Var = kk2VarF.x) == null) && (dl2Var = this.c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        if (syhVar != null) {
            for (pk2 pk2Var : syhVar) {
                int i2 = pk2Var.x;
                dl2 dl2VarG = dl2Var.C == i2 ? dl2Var : (dl2Var instanceof fl2 ? (fl2) dl2Var : dl2Var.x).g(i2, true);
                Context context = this.a;
                if (dl2VarG == null) {
                    int i3 = dl2.E;
                    throw new IllegalStateException(("Restore State failed: destination " + dl2.QnHx.b(context, pk2Var.x) + " cannot be found from the current destination " + dl2Var).toString());
                }
                arrayList.add(pk2Var.a(context, dl2VarG, f(), this.p));
                dl2Var = dl2VarG;
            }
        }
        ArrayList<List<kk2>> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((kk2) obj).x instanceof fl2)) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            kk2 kk2Var2 = (kk2) it.next();
            List list = (List) wu.O0(arrayList2);
            if (list != null && (kk2Var = (kk2) wu.N0(list)) != null && (dl2Var2 = kk2Var.x) != null) {
                str2 = dl2Var2.w;
            }
            if (ur1.a(str2, kk2Var2.x.w)) {
                list.add(kk2Var2);
            } else {
                arrayList2.add(ps0.P(kk2Var2));
            }
        }
        fl3 fl3Var = new fl3();
        for (List<kk2> list2 : arrayList2) {
            zl2 zl2VarB = this.v.b(((kk2) wu.H0(list2)).x.w);
            this.x = new y(fl3Var, arrayList, new hl3(), this, bundle);
            zl2VarB.d(list2, sl2Var, qnHx);
            this.x = null;
        }
        return fl3Var.w;
    }

    public final void q(kk2 kk2Var) {
        kk2 kk2Var2 = (kk2) this.j.remove(kk2Var);
        if (kk2Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(kk2Var2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            QnHx qnHx = (QnHx) this.w.get(this.v.b(kk2Var2.x.w));
            if (qnHx != null) {
                qnHx.b(kk2Var2);
            }
            linkedHashMap.remove(kk2Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    public final void r() {
        dl2 dl2Var;
        ii3 ii3Var;
        Set set;
        ArrayList<kk2> arrayList = new ArrayList(this.g);
        if (arrayList.isEmpty()) {
            return;
        }
        dl2 dl2Var2 = ((kk2) wu.N0(arrayList)).x;
        if (!(dl2Var2 instanceof lz0)) {
            dl2Var = null;
            break;
        }
        Iterator it = wu.W0(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                dl2Var = null;
                break;
            }
            dl2Var = ((kk2) it.next()).x;
            if (!(dl2Var instanceof fl2) && !(dl2Var instanceof lz0)) {
                break;
            }
        }
        HashMap map = new HashMap();
        for (kk2 kk2Var : wu.W0(arrayList)) {
            androidx.lifecycle.YKK.F1 f1 = kk2Var.H;
            dl2 dl2Var3 = kk2Var.x;
            androidx.lifecycle.YKK.F1 f2 = androidx.lifecycle.YKK.F1.RESUMED;
            androidx.lifecycle.YKK.F1 f3 = androidx.lifecycle.YKK.F1.STARTED;
            if (dl2Var2 != null && dl2Var3.C == dl2Var2.C) {
                if (f1 != f2) {
                    QnHx qnHx = (QnHx) this.w.get(this.v.b(dl2Var3.w));
                    if (ur1.a((qnHx == null || (ii3Var = qnHx.f) == null || (set = (Set) ii3Var.getValue()) == null) ? null : Boolean.valueOf(set.contains(kk2Var)), Boolean.TRUE)) {
                        map.put(kk2Var, f3);
                    } else {
                        AtomicInteger atomicInteger = (AtomicInteger) this.k.get(kk2Var);
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            map.put(kk2Var, f3);
                        } else {
                            map.put(kk2Var, f2);
                        }
                    }
                }
                dl2Var2 = dl2Var2.x;
            } else if (dl2Var == null || dl2Var3.C != dl2Var.C) {
                kk2Var.d(androidx.lifecycle.YKK.F1.CREATED);
            } else {
                if (f1 == f2) {
                    kk2Var.d(f3);
                } else if (f1 != f3) {
                    map.put(kk2Var, f3);
                }
                dl2Var = dl2Var.x;
            }
        }
        for (kk2 kk2Var2 : arrayList) {
            androidx.lifecycle.YKK.F1 f4 = (androidx.lifecycle.YKK.F1) map.get(kk2Var2);
            if (f4 != null) {
                kk2Var2.d(f4);
            } else {
                kk2Var2.f();
            }
        }
    }

    public final void s() {
        int i;
        boolean z = false;
        if (this.u) {
            syh<kk2> syhVar = this.g;
            if ((syhVar instanceof Collection) && syhVar.isEmpty()) {
                i = 0;
            } else {
                Iterator<kk2> it = syhVar.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!(it.next().x instanceof fl2)) && (i = i + 1) < 0) {
                        ps0.i0();
                        throw null;
                    }
                }
            }
            if (i > 1) {
                z = true;
            }
        }
        this.t.a = z;
    }
}
