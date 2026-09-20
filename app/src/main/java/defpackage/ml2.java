package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LPt6Fixed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ml2 {

    public static final class CQf extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ il2 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(il2 il2Var) {
            super(1);
            this.w = il2Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            il2 il2Var = this.w;
            il2Var.u = true;
            il2Var.s();
            return new nl2(il2Var);
        }
    }

    public static final class F1 extends cx1 implements y81<String, g30, Integer, sd5> {
        public final /* synthetic */ ri2<Boolean> w;
        public final /* synthetic */ is4<List<kk2>> x;
        public final /* synthetic */ z20 y;
        public final /* synthetic */ i24 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(ri2 ri2Var, ri2 ri2Var2, z20 z20Var, j24 j24Var) {
            super(3);
            this.w = ri2Var;
            this.x = ri2Var2;
            this.y = z20Var;
            this.z = j24Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(String str, g30 g30Var, Integer num) {
            String str2 = str;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(str2) ? 4 : 2;
            }
            if ((iIntValue & 91) != 18 || !g30Var2.t()) {
                is4<List<kk2>> is4Var = this.x;
                List<kk2> value = is4Var.getValue();
                ListIterator<kk2> listIterator = value.listIterator(value.size());
                while (listIterator.hasPrevious()) {
                    kk2 kk2VarPrevious = listIterator.previous();
                    if (ur1.a(str2, kk2VarPrevious.B)) {
                        sd5 sd5Var = sd5.a;
                        g30Var2.e(-3686095);
                        ri2<Boolean> ri2Var = this.w;
                        boolean zI = g30Var2.I(ri2Var) | g30Var2.I(is4Var);
                        z20 z20Var = this.y;
                        boolean zI2 = zI | g30Var2.I(z20Var);
                        Object objF = g30Var2.f();
                        if (zI2 || objF == g30.QnHx.a) {
                            objF = new pl2(ri2Var, is4Var, z20Var);
                            g30Var2.B(objF);
                        }
                        g30Var2.G();
                        wq0.a(sd5Var, (j81) objF, g30Var2);
                        lk2.a(kk2VarPrevious, this.z, X.m(g30Var2, 879893279, new ql2(kk2VarPrevious)), g30Var2, 456);
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            }
            g30Var2.x();
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ il2 w;
        public final /* synthetic */ fl2 x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(il2 il2Var, fl2 fl2Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = il2Var;
            this.x = fl2Var;
            this.y = pg2Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ml2.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ il2 w;
        public final /* synthetic */ fl2 x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(il2 il2Var, fl2 fl2Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = il2Var;
            this.x = fl2Var;
            this.y = pg2Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ml2.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ j81<gl2, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ il2 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(il2 il2Var, String str, pg2 pg2Var, String str2, j81<? super gl2, sd5> j81Var, int i, int i2) {
            super(2);
            this.w = il2Var;
            this.x = str;
            this.y = pg2Var;
            this.z = str2;
            this.A = j81Var;
            this.B = i;
            this.C = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ml2.b(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1, this.C);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ il2 w;
        public final /* synthetic */ fl2 x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(il2 il2Var, fl2 fl2Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = il2Var;
            this.x = fl2Var;
            this.y = pg2Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ml2.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class auxFixed implements mz0<List<? extends kk2>> {
        public final /* synthetic */ mz0 w;

        public static final class QnHx<T> implements nz0 {
            public final /* synthetic */ nz0 w;

            /* JADX INFO: renamed from: ml2$aux$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2", f = "NavHost.kt", l = {224}, m = "emit")
            public static final class C0169QnHx extends b90 {
                public int A;
                public /* synthetic */ Object z;

                public C0169QnHx(z80 z80Var) {
                    super(z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.A |= Integer.MIN_VALUE;
                    return QnHx.this.f(null, this);
                }
            }

            public QnHx(nz0 nz0Var) {
                this.w = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) throws Throwable {
                C0169QnHx c0169QnHx;
                if (z80Var instanceof C0169QnHx) {
                    c0169QnHx = (C0169QnHx) z80Var;
                    int i = c0169QnHx.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0169QnHx.A = i - Integer.MIN_VALUE;
                    } else {
                        c0169QnHx = new C0169QnHx(z80Var);
                    }
                } else {
                    c0169QnHx = new C0169QnHx(z80Var);
                }
                Object obj2 = c0169QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0169QnHx.A;
                if (i2 == 0) {
                    C0239D.H(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (T t : (List) obj) {
                        if (ur1.a(((kk2) t).x.w, "composable")) {
                            arrayList.add(t);
                        }
                    }
                    c0169QnHx.A = 1;
                    if (this.w.f(arrayList, c0169QnHx) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
        }

        public auxFixed(ii3 ii3Var) {
            this.w = ii3Var;
        }

        @Override // defpackage.mz0
        public final Object a(nz0<? super List<? extends kk2>> nz0Var, z80 z80Var) {
            Object objA = this.w.a(new QnHx(nz0Var), z80Var);
            return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0277  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x02da A[LOOP:14: B:138:0x02d4->B:140:0x02da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:146:0x0302  */
    /* JADX WARN: Code duplicated, block: B:234:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:238:0x04be  */
    /* JADX WARN: Code duplicated, block: B:340:0x02bf A[ADDED_TO_REGION, EDGE_INSN: B:340:0x02bf->B:137:0x02bf BREAK  A[LOOP:13: B:126:0x029f->B:145:0x02fc], REMOVE, SYNTHETIC] */
    public static final void a(il2 il2Var, fl2 fl2Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        cm2 cm2Var;
        Object obj;
        boolean z;
        Activity activity;
        dl2.CQf cQfE;
        syh syhVar;
        dl2 dl2Var;
        fl2 fl2Var2;
        ArrayList arrayList;
        Iterator it;
        Bundle bundleB;
        ArrayList arrayList2;
        int[] iArr;
        String strB;
        boolean z2;
        dl2 dl2VarG;
        boolean z3;
        Bundle bundle;
        int i3;
        boolean z4;
        dl2 dl2VarG2;
        Object obj2;
        ArrayList<String> stringArrayList;
        androidx.lifecycle.YKK ykkC;
        j30 j30VarQ = g30Var.q(-957014592);
        pg2 pg2Var2 = (i2 & 4) != 0 ? pg2.QnHx.w : pg2Var;
        d32 d32Var = (d32) j30VarQ.E(Ll.d);
        mj5 mj5VarA = x42.a(j30VarQ);
        if (mj5VarA == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
        }
        iu2 iu2VarA = v42.a(j30VarQ);
        OnBackPressedDispatcher onBackPressedDispatcherE = iu2VarA != null ? iu2VarA.e() : null;
        boolean zA = ur1.a(d32Var, il2Var.n);
        qk2 qk2Var = il2Var.s;
        if (!zA) {
            d32 d32Var2 = il2Var.n;
            if (d32Var2 != null && (ykkC = d32Var2.c()) != null) {
                ykkC.c(qk2Var);
            }
            il2Var.n = d32Var;
            d32Var.c().a(qk2Var);
        }
        lj5 lj5VarM = mj5VarA.M();
        xk2 xk2Var = il2Var.p;
        xk2.QnHx qnHx = xk2.e;
        boolean zA2 = ur1.a(xk2Var, (xk2) new LPt6Fixed(lj5VarM, qnHx, 0).a(xk2.class));
        syh<kk2> syhVar2 = il2Var.g;
        if (!zA2) {
            if (!syhVar2.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
            il2Var.p = (xk2) new LPt6Fixed(lj5VarM, qnHx, 0).a(xk2.class);
        }
        if (onBackPressedDispatcherE != null && !ur1.a(onBackPressedDispatcherE, il2Var.o)) {
            d32 d32Var3 = il2Var.n;
            if (d32Var3 == null) {
                throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
            }
            rk2.YKK ykk = il2Var.t;
            ykk.b();
            il2Var.o = onBackPressedDispatcherE;
            onBackPressedDispatcherE.a(d32Var3, ykk);
            androidx.lifecycle.YKK ykkC2 = d32Var3.c();
            ykkC2.c(qk2Var);
            ykkC2.a(qk2Var);
        }
        wq0.a(il2Var, new CQf(il2Var), j30VarQ);
        boolean zA3 = ur1.a(il2Var.c, fl2Var);
        cm2 cm2Var2 = il2Var.v;
        if (zA3) {
            pg2Var2 = pg2Var2;
            cm2Var = cm2Var2;
            wq4<dl2> wq4Var = fl2Var.F;
            int iK = wq4Var.k();
            for (int i4 = 0; i4 < iK; i4++) {
                dl2 dl2VarL = wq4Var.l(i4);
                wq4<dl2> wq4Var2 = il2Var.c.F;
                if (wq4Var2.w) {
                    wq4Var2.h();
                }
                int iC = o70.c(wq4Var2.z, i4, wq4Var2.x);
                if (iC >= 0) {
                    Object[] objArr = wq4Var2.y;
                    Object obj3 = objArr[iC];
                    objArr[iC] = dl2VarL;
                }
                ArrayList arrayList3 = new ArrayList();
                for (kk2 kk2Var : syhVar2) {
                    if (dl2VarL != null && kk2Var.x.C == dl2VarL.C) {
                        arrayList3.add(kk2Var);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((kk2) it2.next()).x = dl2VarL;
                }
            }
        } else {
            fl2 fl2Var3 = il2Var.c;
            LinkedHashMap linkedHashMap = il2Var.w;
            if (fl2Var3 != null) {
                Iterator it3 = new ArrayList(il2Var.l.keySet()).iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Integer) it3.next()).intValue();
                    Iterator it4 = linkedHashMap.values().iterator();
                    while (it4.hasNext()) {
                        ((rk2.QnHx) it4.next()).d = true;
                    }
                    boolean zP = il2Var.p(iIntValue, null, null, null);
                    Iterator it5 = linkedHashMap.values().iterator();
                    while (it5.hasNext()) {
                        ((rk2.QnHx) it5.next()).d = false;
                    }
                    if (zP) {
                        il2Var.l(iIntValue, true, false);
                    }
                }
                il2Var.l(fl2Var3.C, true, false);
            }
            il2Var.c = fl2Var;
            Bundle bundle2 = il2Var.d;
            if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                for (String str : stringArrayList) {
                    cm2Var2.b(str);
                    bundle2.getBundle(str);
                }
            }
            Parcelable[] parcelableArr = il2Var.e;
            Context context = il2Var.a;
            if (parcelableArr != null) {
                for (Parcelable parcelable : parcelableArr) {
                    pk2 pk2Var = (pk2) parcelable;
                    dl2 dl2VarC = il2Var.c(pk2Var.x);
                    if (dl2VarC == null) {
                        int i5 = dl2.E;
                        StringBuilder sbA = N.a("Restoring the Navigation back stack failed: destination ", dl2.QnHx.b(context, pk2Var.x), " cannot be found from the current destination ");
                        sbA.append(il2Var.e());
                        throw new IllegalStateException(sbA.toString());
                    }
                    kk2 kk2VarA = pk2Var.a(context, dl2VarC, il2Var.f(), il2Var.p);
                    zl2 zl2VarB = cm2Var2.b(dl2VarC.w);
                    Object obj4 = linkedHashMap.get(zl2VarB);
                    if (obj4 == null) {
                        obj2 = obj4;
                        rk2.QnHx qnHx2 = new rk2.QnHx(zl2VarB);
                        linkedHashMap.put(zl2VarB, qnHx2);
                        obj2 = qnHx2;
                    }
                    obj2 = obj4;
                    syhVar2.addLast(kk2VarA);
                    ((rk2.QnHx) obj2).g(kk2VarA);
                    fl2 fl2Var4 = kk2VarA.x.x;
                    if (fl2Var4 != null) {
                        il2Var.g(kk2VarA, il2Var.d(fl2Var4.C));
                    }
                }
                il2Var.s();
                il2Var.e = null;
            }
            Collection collectionValues = t92.W(cm2Var2.a).values();
            ArrayList<zl2> arrayList4 = new ArrayList();
            for (Object obj5 : collectionValues) {
                if (!((zl2) obj5).b) {
                    arrayList4.add(obj5);
                }
            }
            for (zl2 zl2Var : arrayList4) {
                Object qnHx3 = linkedHashMap.get(zl2Var);
                if (qnHx3 == null) {
                    qnHx3 = new rk2.QnHx(zl2Var);
                    linkedHashMap.put(zl2Var, qnHx3);
                }
                zl2Var.a = (rk2.QnHx) qnHx3;
                zl2Var.b = true;
            }
            if (il2Var.c == null || !syhVar2.isEmpty()) {
                pg2Var2 = pg2Var2;
                cm2Var = cm2Var2;
                il2Var.b();
            } else {
                if (il2Var.f || (activity = il2Var.b) == null) {
                    pg2Var2 = pg2Var2;
                    cm2Var = cm2Var2;
                } else {
                    Intent intent = activity.getIntent();
                    if (intent == null) {
                        pg2Var2 = pg2Var2;
                        cm2Var = cm2Var2;
                    } else {
                        Bundle extras = intent.getExtras();
                        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
                        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                        Bundle bundle3 = new Bundle();
                        Bundle bundle4 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                        if (bundle4 != null) {
                            bundle3.putAll(bundle4);
                        }
                        if (intArray == null) {
                            cQfE = il2Var.c.e(new al2(intent.getData(), intent.getAction(), intent.getType()));
                            if (cQfE != null) {
                                dl2 dl2Var2 = cQfE.w;
                                dl2Var2.getClass();
                                syhVar = new syh();
                                dl2Var = dl2Var2;
                                while (true) {
                                    fl2Var2 = dl2Var.x;
                                    if (fl2Var2 != null) {
                                        pg2Var2 = pg2Var2;
                                        cm2Var = cm2Var2;
                                        if (fl2Var2.G != dl2Var.C) {
                                        }
                                        if (!ur1.a(fl2Var2, null) || fl2Var2 == null) {
                                            break;
                                        }
                                        dl2Var = fl2Var2;
                                        pg2Var2 = pg2Var2;
                                        cm2Var2 = cm2Var;
                                    } else {
                                        pg2Var2 = pg2Var2;
                                        cm2Var = cm2Var2;
                                    }
                                    syhVar.addFirst(dl2Var);
                                    if (!ur1.a(fl2Var2, null)) {
                                        break;
                                    }
                                    dl2Var = fl2Var2;
                                    pg2Var2 = pg2Var2;
                                    cm2Var2 = cm2Var;
                                }
                                List listE1 = wu.e1(syhVar);
                                arrayList = new ArrayList(mu.w0(listE1, 10));
                                it = listE1.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Integer.valueOf(((dl2) it.next()).C));
                                }
                                int[] iArrD1 = wu.d1(arrayList);
                                bundleB = dl2Var2.b(cQfE.x);
                                if (bundleB != null) {
                                    bundle3.putAll(bundleB);
                                }
                                arrayList2 = null;
                                iArr = iArrD1;
                            } else {
                                cm2Var = cm2Var2;
                                iArr = intArray;
                                arrayList2 = parcelableArrayList;
                            }
                        } else {
                            if (intArray.length == 0) {
                                cQfE = il2Var.c.e(new al2(intent.getData(), intent.getAction(), intent.getType()));
                                if (cQfE != null) {
                                    dl2 dl2Var3 = cQfE.w;
                                    dl2Var3.getClass();
                                    syhVar = new syh();
                                    dl2Var = dl2Var3;
                                    while (true) {
                                        fl2Var2 = dl2Var.x;
                                        if (fl2Var2 != null) {
                                            pg2Var2 = pg2Var2;
                                            cm2Var = cm2Var2;
                                            if (fl2Var2.G != dl2Var.C) {
                                            }
                                            if (!ur1.a(fl2Var2, null)) {
                                                break;
                                                break;
                                            } else {
                                                dl2Var = fl2Var2;
                                                pg2Var2 = pg2Var2;
                                                cm2Var2 = cm2Var;
                                            }
                                        } else {
                                            pg2Var2 = pg2Var2;
                                            cm2Var = cm2Var2;
                                        }
                                        syhVar.addFirst(dl2Var);
                                        if (!ur1.a(fl2Var2, null)) {
                                            break;
                                            break;
                                        } else {
                                            dl2Var = fl2Var2;
                                            pg2Var2 = pg2Var2;
                                            cm2Var2 = cm2Var;
                                        }
                                    }
                                    List listE2 = wu.e1(syhVar);
                                    arrayList = new ArrayList(mu.w0(listE2, 10));
                                    it = listE2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(((dl2) it.next()).C));
                                    }
                                    int[] iArrD2 = wu.d1(arrayList);
                                    bundleB = dl2Var3.b(cQfE.x);
                                    if (bundleB != null) {
                                        bundle3.putAll(bundleB);
                                    }
                                    arrayList2 = null;
                                    iArr = iArrD2;
                                }
                            }
                            cm2Var = cm2Var2;
                            iArr = intArray;
                            arrayList2 = parcelableArrayList;
                        }
                        if (iArr != null) {
                            if (!(iArr.length == 0)) {
                                fl2 fl2Var5 = il2Var.c;
                                int length = iArr.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        strB = null;
                                        break;
                                    }
                                    int i7 = iArr[i6];
                                    if (i6 == 0) {
                                        dl2VarG2 = il2Var.c;
                                        i3 = length;
                                        if (dl2VarG2.C == i7) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                            dl2VarG2 = null;
                                        }
                                    } else {
                                        i3 = length;
                                        z4 = true;
                                        dl2VarG2 = fl2Var5.g(i7, true);
                                    }
                                    if (dl2VarG2 == null) {
                                        int i8 = dl2.E;
                                        strB = dl2.QnHx.b(context, i7);
                                        break;
                                    }
                                    if (i6 != iArr.length - (z4 ? 1 : 0) && (dl2VarG2 instanceof fl2)) {
                                        fl2 fl2Var6 = (fl2) dl2VarG2;
                                        while (fl2Var6.g(fl2Var6.G, z4) instanceof fl2) {
                                            fl2Var6 = (fl2) fl2Var6.g(fl2Var6.G, z4);
                                            z4 = true;
                                        }
                                        fl2Var5 = fl2Var6;
                                    }
                                    i6++;
                                    length = i3;
                                }
                                if (strB != null) {
                                    Log.i("NavController", "Could not find destination " + strB + " in the navigation graph, ignoring the deep link from " + intent);
                                } else {
                                    bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                    int length2 = iArr.length;
                                    Bundle[] bundleArr = new Bundle[length2];
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putAll(bundle3);
                                        if (arrayList2 != null && (bundle = (Bundle) arrayList2.get(i9)) != null) {
                                            bundle5.putAll(bundle);
                                        }
                                        bundleArr[i9] = bundle5;
                                    }
                                    int flags = intent.getFlags();
                                    int i10 = 268435456 & flags;
                                    if (i10 != 0 && (flags & 32768) == 0) {
                                        intent.addFlags(32768);
                                        j15 j15Var = new j15(context);
                                        ComponentName component = intent.getComponent();
                                        if (component == null) {
                                            component = intent.resolveActivity(j15Var.x.getPackageManager());
                                        }
                                        if (component != null) {
                                            j15Var.a(component);
                                        }
                                        j15Var.w.add(intent);
                                        j15Var.b();
                                        activity.finish();
                                        activity.overridePendingTransition(0, 0);
                                    } else if (i10 != 0) {
                                        if (!syhVar2.isEmpty()) {
                                            il2Var.l(il2Var.c.C, true, false);
                                        }
                                        int i11 = 0;
                                        while (i11 < iArr.length) {
                                            int i12 = iArr[i11];
                                            int i13 = i11 + 1;
                                            Bundle bundle6 = bundleArr[i11];
                                            dl2 dl2VarC2 = il2Var.c(i12);
                                            if (dl2VarC2 == null) {
                                                int i14 = dl2.E;
                                                StringBuilder sbA2 = N.a("Deep Linking failed: destination ", dl2.QnHx.b(context, i12), " cannot be found from the current destination ");
                                                sbA2.append(il2Var.e());
                                                throw new IllegalStateException(sbA2.toString());
                                            }
                                            il2Var.h(dl2VarC2, bundle6, C0239D.B(new uk2(dl2VarC2, il2Var)), null);
                                            i11 = i13;
                                        }
                                    } else {
                                        fl2 fl2Var7 = il2Var.c;
                                        int length3 = iArr.length;
                                        for (int i15 = 0; i15 < length3; i15++) {
                                            int i16 = iArr[i15];
                                            Bundle bundle7 = bundleArr[i15];
                                            if (i15 == 0) {
                                                dl2VarG = il2Var.c;
                                                z2 = true;
                                            } else {
                                                z2 = true;
                                                dl2VarG = fl2Var7.g(i16, true);
                                            }
                                            if (dl2VarG == null) {
                                                int i17 = dl2.E;
                                                throw new IllegalStateException("Deep Linking failed: destination " + dl2.QnHx.b(context, i16) + " cannot be found in graph " + fl2Var7);
                                            }
                                            if (i15 == iArr.length - (z2 ? 1 : 0)) {
                                                il2Var.h(dl2VarG, bundle7, new sl2(false, false, il2Var.c.C, true, false, 0, 0, -1, -1), null);
                                            } else if (dl2VarG instanceof fl2) {
                                                fl2 fl2Var8 = (fl2) dl2VarG;
                                                while (fl2Var8.g(fl2Var8.G, z2) instanceof fl2) {
                                                    fl2Var8 = (fl2) fl2Var8.g(fl2Var8.G, z2);
                                                    z2 = true;
                                                }
                                                fl2Var7 = fl2Var8;
                                            }
                                        }
                                        il2Var.f = true;
                                    }
                                    z3 = true;
                                }
                            }
                        }
                        z = z3;
                        if (!z) {
                            il2Var.h(il2Var.c, null, null, null);
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                    if (!z) {
                        il2Var.h(il2Var.c, null, null, null);
                    }
                }
                if (!z) {
                    il2Var.h(il2Var.c, null, null, null);
                }
            }
        }
        j24 j24VarK = S12N.k(j30VarQ);
        cm2 cm2Var3 = cm2Var;
        zl2 zl2VarB2 = cm2Var3.b("composable");
        z20 z20Var = zl2VarB2 instanceof z20 ? (z20) zl2VarB2 : null;
        if (z20Var == null) {
            tk3 tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new NUlFixed(il2Var, fl2Var, pg2Var2, i, i2);
            return;
        }
        j30VarQ.e(-3686930);
        ii3 ii3Var = il2Var.i;
        boolean zI = j30VarQ.I(ii3Var);
        Object objB0 = j30VarQ.b0();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (zI || objB0 == c0132QnHx) {
            obj = objB0;
            auxFixed auxVar = new auxFixed(ii3Var);
            j30VarQ.F0(auxVar);
            obj = auxVar;
        }
        j30VarQ.R(false);
        ri2 ri2VarS = ps0.s((mz0) obj, cs0.w, null, j30VarQ, 2);
        kk2 kk2Var2 = (kk2) wu.O0((List) ri2VarS.getValue());
        j30VarQ.e(-3687241);
        Object objB1 = j30VarQ.b0();
        Object obj6 = objB1;
        if (objB1 == c0132QnHx) {
            kz2 kz2VarR = ps0.R(Boolean.TRUE);
            j30VarQ.F0(kz2VarR);
            obj6 = kz2VarR;
        }
        j30VarQ.R(false);
        ri2 ri2Var = (ri2) obj6;
        j30VarQ.e(1822173528);
        if (kk2Var2 != null) {
            pc0.b(kk2Var2.B, pg2Var2, null, X.m(j30VarQ, 1319254703, new F1(ri2Var, ri2VarS, z20Var, j24VarK)), j30VarQ, ((i >> 3) & 112) | 3072, 4);
        }
        j30VarQ.R(false);
        zl2 zl2VarB3 = cm2Var3.b("dialog");
        vk0 vk0Var = zl2VarB3 instanceof vk0 ? (vk0) zl2VarB3 : null;
        if (vk0Var == null) {
            tk3 tk3VarU2 = j30VarQ.U();
            if (tk3VarU2 == null) {
                return;
            }
            tk3VarU2.d = new YKK(il2Var, fl2Var, pg2Var2, i, i2);
            return;
        }
        ok0.a(vk0Var, j30VarQ, 0);
        tk3 tk3VarU3 = j30VarQ.U();
        if (tk3VarU3 == null) {
            return;
        }
        tk3VarU3.d = new LPt8Fixed(il2Var, fl2Var, pg2Var2, i, i2);
    }

    public static final void b(il2 il2Var, String str, pg2 pg2Var, String str2, j81<? super gl2, sd5> j81Var, g30 g30Var, int i, int i2) {
        Object obj;
        j30 j30VarQ = g30Var.q(141827520);
        pg2 pg2Var2 = (i2 & 4) != 0 ? pg2.QnHx.w : pg2Var;
        String str3 = (i2 & 8) != 0 ? null : str2;
        j30VarQ.e(-3686095);
        boolean zI = j30VarQ.I(str3) | j30VarQ.I(str) | j30VarQ.I(j81Var);
        Object objB0 = j30VarQ.b0();
        if (zI || objB0 == g30.QnHx.a) {
            gl2 gl2Var = new gl2(il2Var.v, str, str3);
            j81Var.invoke(gl2Var);
            fl2 fl2Var = (fl2) gl2Var.a();
            Iterator it = gl2Var.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    String str4 = gl2Var.h;
                    if (str4 == null) {
                        if (gl2Var.c == null) {
                            throw new IllegalStateException("You must set a start destination id");
                        }
                        throw new IllegalStateException("You must set a start destination route");
                    }
                    if (!(!ur1.a(str4, fl2Var.D))) {
                        throw new IllegalArgumentException(("Start destination " + str4 + " cannot use the same route as the graph " + fl2Var).toString());
                    }
                    if (!(!iv4.s(str4))) {
                        throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
                    }
                    fl2Var.G = "android-app://androidx.navigation/".concat(str4).hashCode();
                    fl2Var.I = str4;
                    j30VarQ.F0(fl2Var);
                    obj = fl2Var;
                    break;
                }
                dl2 dl2Var = (dl2) it.next();
                if (dl2Var != null) {
                    int i3 = dl2Var.C;
                    String str5 = dl2Var.D;
                    if (!((i3 == 0 && str5 == null) ? false : true)) {
                        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
                    }
                    String str6 = fl2Var.D;
                    if (str6 != null && !(!ur1.a(str5, str6))) {
                        throw new IllegalArgumentException(("Destination " + dl2Var + " cannot have the same route as graph " + fl2Var).toString());
                    }
                    if (!(i3 != fl2Var.C)) {
                        throw new IllegalArgumentException(("Destination " + dl2Var + " cannot have the same id as graph " + fl2Var).toString());
                    }
                    wq4<dl2> wq4Var = fl2Var.F;
                    dl2 dl2Var2 = (dl2) wq4Var.i(i3, null);
                    if (dl2Var2 != dl2Var) {
                        if (!(dl2Var.x == null)) {
                            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                        }
                        if (dl2Var2 != null) {
                            dl2Var2.x = null;
                        }
                        dl2Var.x = fl2Var;
                        wq4Var.j(dl2Var.C, dl2Var);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            obj = objB0;
        }
        j30VarQ.R(false);
        a(il2Var, (fl2) obj, pg2Var2, j30VarQ, (i & 896) | 72, 0);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(il2Var, str, pg2Var2, str3, j81Var, i, i2);
    }
}
