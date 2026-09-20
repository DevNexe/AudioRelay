package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.Bt7j;
import defpackage.O;
import defpackage.a83;
import defpackage.aj5;
import defpackage.bi5;
import defpackage.bn;
import defpackage.cv2;
import defpackage.g61;
import defpackage.g92;
import defpackage.j61;
import defpackage.wh0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class FJCM extends ck32 {

    public static class CQf {
        public final ck32.CQf a;
        public final bn b;

        public CQf(ck32.CQf cQf, bn bnVar) {
            this.a = cQf;
            this.b = bnVar;
        }

        public final void a() {
            ck32.CQf cQf = this.a;
            HashSet<bn> hashSet = cQf.e;
            if (hashSet.remove(this.b) && hashSet.isEmpty()) {
                cQf.b();
            }
        }

        public final boolean b() {
            ck32.CQf cQf = this.a;
            int iC = a83.c(cQf.c.a0);
            int i = cQf.a;
            return iC == i || !(iC == 2 || i == 2);
        }
    }

    public static class F1 extends CQf {
        public final Object c;
        public final boolean d;
        public final Object e;

        public F1(ck32.CQf cQf, bn bnVar, boolean z, boolean z2) {
            Object objN;
            Object objM;
            super(cQf, bnVar);
            int i = cQf.a;
            Fragment fragment = cQf.c;
            if (i == 2) {
                if (z) {
                    objM = fragment.m();
                } else {
                    fragment.getClass();
                    objM = null;
                }
                this.c = objM;
                if (z) {
                    fragment.getClass();
                } else {
                    fragment.getClass();
                }
                this.d = true;
            } else {
                if (z) {
                    objN = fragment.n();
                } else {
                    fragment.getClass();
                    objN = null;
                }
                this.c = objN;
                this.d = true;
            }
            if (!z2) {
                this.e = null;
            } else if (z) {
                this.e = fragment.o();
            } else {
                fragment.getClass();
                this.e = null;
            }
        }

        public final j61 c(Object obj) {
            if (obj == null) {
                return null;
            }
            g61 g61Var = ta.a;
            if (g61Var != null && (obj instanceof Transition)) {
                return g61Var;
            }
            j61 j61Var = ta.b;
            if (j61Var != null && j61Var.e(obj)) {
                return j61Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static class QnHx extends CQf {
        public final boolean c;
        public boolean d;
        public PRnFixed.QnHx e;

        public QnHx(ck32.CQf cQf, bn bnVar, boolean z) {
            super(cQf, bnVar);
            this.d = false;
            this.c = z;
        }

        public final PRnFixed.QnHx c(Context context) {
            if (this.d) {
                return this.e;
            }
            ck32.CQf cQf = this.a;
            PRnFixed.QnHx qnHxA = PRnFixed.a(context, cQf.c, cQf.a == 2, this.c);
            this.e = qnHxA;
            this.d = true;
            return qnHxA;
        }
    }

    public FJCM(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (aj5.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                i(arrayList, childAt);
            }
        }
    }

    public static void j(View view, Bt7j bt7j) {
        Field field = bi5.a;
        String strK = bi5.byN.k(view);
        if (strK != null) {
            bt7j.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    j(childAt, bt7j);
                }
            }
        }
    }

    public static void k(Bt7j bt7j, Collection collection) {
        Iterator it = ((g92.CQf) bt7j.entrySet()).iterator();
        while (true) {
            g92.LPt8Fixed lPt8 = (g92.LPt8Fixed) it;
            if (!lPt8.hasNext()) {
                return;
            }
            lPt8.next();
            View view = (View) lPt8.getValue();
            Field field = bi5.a;
            if (!collection.contains(bi5.byN.k(view))) {
                lPt8.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x0509  */
    /* JADX WARN: Code duplicated, block: B:208:0x0543  */
    /* JADX WARN: Code duplicated, block: B:212:0x0562  */
    /* JADX WARN: Code duplicated, block: B:213:0x0564  */
    /* JADX WARN: Code duplicated, block: B:215:0x0567  */
    /* JADX WARN: Code duplicated, block: B:216:0x056d  */
    /* JADX WARN: Code duplicated, block: B:221:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:225:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:234:0x060e  */
    /* JADX WARN: Code duplicated, block: B:235:0x0615  */
    /* JADX WARN: Code duplicated, block: B:240:0x063e A[LOOP:6: B:238:0x0638->B:240:0x063e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x051a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0516 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0520 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x052c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x05d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x05db A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:208:0x0543, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x05c1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:230:0x05e2, please report this as an issue */
    @Override // androidx.fragment.app.ck32
    public final void b(boolean z, ArrayList arrayList) {
        ArrayList<QnHx> arrayList2;
        ArrayList arrayList3;
        HashMap map;
        String str;
        String str2;
        ck32.CQf cQf;
        Object obj;
        View view;
        HashMap map2;
        View view2;
        ArrayList arrayList4;
        Rect rect;
        HashMap map3;
        j61 j61Var;
        ArrayList<String> arrayList5;
        ArrayList<String> arrayList6;
        ArrayList<String> arrayList7;
        Object obj2;
        ArrayList<String> arrayList8;
        Object obj3;
        int i;
        boolean z2;
        View view3;
        View view4;
        boolean zContainsValue;
        Context context;
        ArrayList<QnHx> arrayList9;
        boolean z3;
        ck32.CQf cQf2;
        Fragment fragment;
        View view5;
        Animation animation;
        PRnFixed.QnHx qnHxC;
        Animator animator;
        ck32.CQf cQf3;
        Fragment fragment2;
        boolean z4;
        ArrayList arrayList10;
        Iterator it;
        Iterator it2 = arrayList.iterator();
        ck32.CQf cQf4 = null;
        ck32.CQf cQf5 = null;
        while (it2.hasNext()) {
            ck32.CQf cQf6 = (ck32.CQf) it2.next();
            int iC = a83.c(cQf6.c.a0);
            int iH = O.h(cQf6.a);
            if (iH != 0) {
                if (iH != 1) {
                    if (iH == 2 || iH == 3) {
                    }
                } else if (iC != 2) {
                    cQf5 = cQf6;
                }
            }
            if (iC == 2 && cQf4 == null) {
                cQf4 = cQf6;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList<F1> arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(arrayList);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ck32.CQf cQf7 = (ck32.CQf) it3.next();
            bn bnVar = new bn();
            cQf7.d();
            cQf7.e.add(bnVar);
            arrayList11.add(new QnHx(cQf7, bnVar, z));
            bn bnVar2 = new bn();
            cQf7.d();
            cQf7.e.add(bnVar2);
            arrayList12.add(new F1(cQf7, bnVar2, z, !z ? cQf7 != cQf5 : cQf7 != cQf4));
            cQf7.d.add(new androidx.fragment.app.F1(this, arrayList13, cQf7));
        }
        HashMap map4 = new HashMap();
        Iterator it4 = arrayList12.iterator();
        j61 j61Var2 = null;
        while (it4.hasNext()) {
            F1 f1 = (F1) it4.next();
            if (f1.b()) {
                it = it4;
            } else {
                Object obj4 = f1.c;
                j61 j61VarC = f1.c(obj4);
                Object obj5 = f1.e;
                j61 j61VarC2 = f1.c(obj5);
                it = it4;
                ck32.CQf cQf8 = f1.a;
                if (j61VarC != null && j61VarC2 != null && j61VarC != j61VarC2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cQf8.c + " returned Transition " + obj4 + " which uses a different Transition  type than its shared element transition " + obj5);
                }
                if (j61VarC == null) {
                    j61VarC = j61VarC2;
                }
                if (j61Var2 == null) {
                    j61Var2 = j61VarC;
                } else if (j61VarC != null && j61Var2 != j61VarC) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cQf8.c + " returned Transition " + obj4 + " which uses a different Transition  type than other Fragments.");
                }
            }
            it4 = it;
        }
        ViewGroup viewGroup = this.a;
        if (j61Var2 != null) {
            View view6 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList14 = new ArrayList<>();
            ArrayList<View> arrayList15 = new ArrayList<>();
            Bt7j bt7j = new Bt7j();
            Iterator it5 = arrayList12.iterator();
            arrayList2 = arrayList11;
            ck32.CQf cQf9 = cQf5;
            String str3 = "FragmentManager";
            Object obj6 = null;
            View view7 = null;
            boolean z5 = false;
            ck32.CQf cQf10 = cQf4;
            while (it5.hasNext()) {
                ArrayList arrayList16 = arrayList13;
                Object obj7 = ((F1) it5.next()).e;
                if (!(obj7 != null) || cQf10 == null || cQf9 == null) {
                    arrayList4 = arrayList12;
                    rect = rect2;
                    j61 j61Var3 = j61Var2;
                    map3 = map4;
                    j61Var = j61Var3;
                } else {
                    Object objT = j61Var2.t(j61Var2.f(obj7));
                    Fragment fragment3 = cQf9.c;
                    Fragment.CQf cQf11 = fragment3.d0;
                    if (cQf11 == null || (arrayList5 = cQf11.g) == null) {
                        arrayList5 = new ArrayList<>();
                    }
                    Fragment fragment4 = cQf10.c;
                    arrayList4 = arrayList12;
                    Fragment.CQf cQf12 = fragment4.d0;
                    if (cQf12 == null || (arrayList6 = cQf12.g) == null) {
                        arrayList6 = new ArrayList<>();
                    }
                    HashMap map5 = map4;
                    Fragment.CQf cQf13 = fragment4.d0;
                    if (cQf13 == null || (arrayList7 = cQf13.h) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    view6 = view6;
                    Rect rect3 = rect2;
                    int i2 = 0;
                    while (true) {
                        obj2 = objT;
                        if (i2 >= arrayList7.size()) {
                            break;
                        }
                        int iIndexOf = arrayList5.indexOf(arrayList7.get(i2));
                        if (iIndexOf != -1) {
                            arrayList5.set(iIndexOf, arrayList6.get(i2));
                        }
                        i2++;
                        objT = obj2;
                    }
                    Fragment.CQf cQf14 = fragment3.d0;
                    if (cQf14 == null || (arrayList8 = cQf14.h) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    int size = arrayList5.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        bt7j.put(arrayList5.get(i3), arrayList8.get(i3));
                    }
                    Bt7j bt7j2 = new Bt7j();
                    j(fragment4.a0, bt7j2);
                    g92.k(bt7j2, arrayList5);
                    g92.k(bt7j, bt7j2.keySet());
                    Bt7j bt7j3 = new Bt7j();
                    j(fragment3.a0, bt7j3);
                    g92.k(bt7j3, arrayList8);
                    g92.k(bt7j3, bt7j.values());
                    g61 g61Var = ta.a;
                    int i4 = bt7j.y;
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        } else if (!bt7j3.containsKey((String) bt7j.k(i4))) {
                            bt7j.j(i4);
                        }
                    }
                    k(bt7j2, bt7j.keySet());
                    k(bt7j3, bt7j.values());
                    if (bt7j.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        cQf10 = cQf4;
                        cQf9 = cQf5;
                        j61Var = j61Var2;
                        map3 = map5;
                        view6 = view6;
                        rect = rect3;
                        obj6 = null;
                    } else {
                        ta.a(fragment3, fragment4, z);
                        cv2.a(viewGroup, new auxFixed(cQf5, cQf4, z, bt7j3));
                        arrayList14.addAll(bt7j2.values());
                        if (arrayList5.isEmpty()) {
                            obj3 = obj2;
                            i = 0;
                            z2 = false;
                            view3 = view7;
                        } else {
                            i = 0;
                            String str4 = arrayList5.get(0);
                            z2 = false;
                            view3 = (View) bt7j2.getOrDefault(str4, null);
                            obj3 = obj2;
                            j61Var2.n(view3, obj3);
                        }
                        arrayList15.addAll(bt7j3.values());
                        if (arrayList8.isEmpty() || (view4 = (View) bt7j3.getOrDefault(arrayList8.get(i), z2)) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            cv2.a(viewGroup, new T23(j61Var2, view4, rect));
                            z5 = true;
                        }
                        j61Var2.r(obj3, view6, arrayList14);
                        j61Var = j61Var2;
                        j61Var2.m(obj3, null, null, null, null, obj3, arrayList15);
                        Boolean bool = Boolean.TRUE;
                        map3 = map5;
                        map3.put(cQf4, bool);
                        map3.put(cQf5, bool);
                        view7 = view3;
                        cQf10 = cQf4;
                        cQf9 = cQf5;
                        obj6 = obj3;
                    }
                }
                rect2 = rect;
                bt7j = bt7j;
                arrayList13 = arrayList16;
                arrayList12 = arrayList4;
                HashMap map6 = map3;
                j61Var2 = j61Var;
                map4 = map6;
            }
            ArrayList<F1> arrayList17 = arrayList12;
            Rect rect4 = rect2;
            arrayList3 = arrayList13;
            Bt7j bt7j4 = bt7j;
            j61 j61Var4 = j61Var2;
            HashMap map7 = map4;
            ArrayList arrayList18 = new ArrayList();
            Iterator it6 = arrayList17.iterator();
            Object objJ = null;
            Object objJ2 = null;
            while (it6.hasNext()) {
                Iterator it7 = it6;
                F1 f2 = (F1) it6.next();
                boolean zB = f2.b();
                Bt7j bt7j5 = bt7j4;
                ck32.CQf cQf15 = f2.a;
                if (zB) {
                    map7.put(cQf15, Boolean.FALSE);
                    f2.a();
                    view = view6;
                    cQf = cQf5;
                    map2 = map7;
                    objJ2 = objJ2;
                    view2 = view7;
                    arrayList14 = arrayList14;
                } else {
                    Object obj8 = objJ2;
                    Object objF = j61Var4.f(f2.c);
                    boolean z6 = obj6 != null && (cQf15 == cQf10 || cQf15 == cQf9);
                    if (objF == null) {
                        if (!z6) {
                            map7.put(cQf15, Boolean.FALSE);
                            f2.a();
                        }
                        view = view6;
                        cQf = cQf5;
                        map2 = map7;
                        objJ2 = obj8;
                        view2 = view7;
                        arrayList14 = arrayList14;
                    } else {
                        cQf = cQf5;
                        ArrayList<View> arrayList19 = new ArrayList<>();
                        HashMap map8 = map7;
                        i(arrayList19, cQf15.c.a0);
                        if (z6) {
                            if (cQf15 == cQf10) {
                                arrayList19.removeAll(arrayList14);
                            } else {
                                arrayList19.removeAll(arrayList15);
                            }
                        }
                        if (arrayList19.isEmpty()) {
                            j61Var4.a(view6, objF);
                            view = view6;
                            obj = obj8;
                            map2 = map8;
                        } else {
                            j61Var4.b(objF, arrayList19);
                            obj = obj8;
                            view = view6;
                            map2 = map8;
                            j61Var4.m(objF, objF, arrayList19, null, null, null, null);
                            if (cQf15.a == 3) {
                                arrayList3.remove(cQf15);
                                ArrayList<View> arrayList20 = new ArrayList<>(arrayList19);
                                Fragment fragment5 = cQf15.c;
                                arrayList20.remove(fragment5.a0);
                                View view8 = fragment5.a0;
                                objF = objF;
                                j61Var4.l(objF, view8, arrayList20);
                                cv2.a(viewGroup, new byN(arrayList19));
                            } else {
                                objF = objF;
                            }
                        }
                        if (cQf15.a == 2) {
                            arrayList18.addAll(arrayList19);
                            if (z5) {
                                j61Var4.o(objF, rect4);
                            }
                            view2 = view7;
                        } else {
                            view2 = view7;
                            j61Var4.n(view2, objF);
                        }
                        map2.put(cQf15, Boolean.TRUE);
                        if (f2.d) {
                            objJ2 = j61Var4.j(obj, objF, null);
                        } else {
                            objJ = j61Var4.j(objJ, objF, null);
                            objJ2 = obj;
                        }
                    }
                    cQf9 = cQf;
                }
                it6 = it7;
                map7 = map2;
                view7 = view2;
                arrayList14 = arrayList14;
                bt7j4 = bt7j5;
                cQf5 = cQf;
                view6 = view;
            }
            ck32.CQf cQf16 = cQf5;
            ArrayList<View> arrayList21 = arrayList14;
            Bt7j bt7j6 = bt7j4;
            map = map7;
            Object objI = j61Var4.i(objJ2, objJ, obj6);
            for (F1 f3 : arrayList17) {
                if (!f3.b()) {
                    ck32.CQf cQf17 = f3.a;
                    ck32.CQf cQf18 = cQf16;
                    boolean z7 = obj6 != null && (cQf17 == cQf10 || cQf17 == cQf18);
                    if (f3.c != null || z7) {
                        Field field = bi5.a;
                        if (bi5.auxFixed.c(viewGroup)) {
                            str2 = str3;
                            Fragment fragment6 = cQf17.c;
                            j61Var4.p(objI, f3.b, new EQ(f3));
                        } else {
                            if (RBi.H(2)) {
                                str2 = str3;
                                Log.v(str2, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + cQf17);
                            } else {
                                str2 = str3;
                            }
                            f3.a();
                        }
                    } else {
                        str2 = str3;
                    }
                    cQf16 = cQf18;
                    str3 = str2;
                }
            }
            str = str3;
            Field field2 = bi5.a;
            if (bi5.auxFixed.c(viewGroup)) {
                ta.b(arrayList18, 4);
                ArrayList arrayListK = j61.k(arrayList15);
                j61Var4.c(viewGroup, objI);
                j61.q(viewGroup, arrayList21, arrayList15, arrayListK, bt7j6);
                ta.b(arrayList18, 0);
                j61Var4.s(obj6, arrayList21, arrayList15);
            }
            zContainsValue = map.containsValue(Boolean.TRUE);
            context = viewGroup.getContext();
            arrayList9 = new ArrayList();
            z3 = false;
            for (QnHx qnHx : arrayList2) {
                if (qnHx.b()) {
                    qnHx.a();
                } else {
                    qnHxC = qnHx.c(context);
                    if (qnHxC == null) {
                        qnHx.a();
                    } else {
                        animator = qnHxC.b;
                        if (animator == null) {
                            arrayList9.add(qnHx);
                        } else {
                            cQf3 = qnHx.a;
                            fragment2 = cQf3.c;
                            if (Boolean.TRUE.equals(map.get(cQf3))) {
                                if (RBi.H(2)) {
                                    Log.v(str, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                                }
                                qnHx.a();
                            } else {
                                if (cQf3.a == 3) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    arrayList10 = arrayList3;
                                    arrayList10.remove(cQf3);
                                } else {
                                    arrayList10 = arrayList3;
                                }
                                View view9 = fragment2.a0;
                                viewGroup.startViewTransition(view9);
                                animator.addListener(new LPt8Fixed(viewGroup, view9, z4, cQf3, qnHx));
                                animator.setTarget(view9);
                                animator.start();
                                qnHx.b.b(new wh0(animator));
                                map = map;
                                arrayList3 = arrayList10;
                                z3 = true;
                            }
                        }
                    }
                }
            }
            ArrayList<ck32.CQf> arrayList22 = arrayList3;
            for (QnHx qnHx2 : arrayList9) {
                cQf2 = qnHx2.a;
                fragment = cQf2.c;
                if (zContainsValue) {
                    if (RBi.H(2)) {
                        Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                    }
                    qnHx2.a();
                } else if (z3) {
                    if (RBi.H(2)) {
                        Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                    }
                    qnHx2.a();
                } else {
                    view5 = fragment.a0;
                    PRnFixed.QnHx qnHxC2 = qnHx2.c(context);
                    qnHxC2.getClass();
                    animation = qnHxC2.a;
                    animation.getClass();
                    if (cQf2.a != 1) {
                        view5.startAnimation(animation);
                        qnHx2.a();
                    } else {
                        viewGroup.startViewTransition(view5);
                        PRnFixed.CQf cQf19 = new PRnFixed.CQf(animation, viewGroup, view5);
                        cQf19.setAnimationListener(new NUlFixed(view5, viewGroup, qnHx2));
                        view5.startAnimation(cQf19);
                    }
                    qnHx2.b.b(new YKK(view5, viewGroup, qnHx2));
                }
            }
            for (ck32.CQf cQf20 : arrayList22) {
                a83.a(cQf20.a, cQf20.c.a0);
            }
            arrayList22.clear();
        }
        for (F1 f4 : arrayList12) {
            map4.put(f4.a, Boolean.FALSE);
            f4.a();
        }
        arrayList2 = arrayList11;
        arrayList3 = arrayList13;
        map = map4;
        str = "FragmentManager";
        zContainsValue = map.containsValue(Boolean.TRUE);
        context = viewGroup.getContext();
        arrayList9 = new ArrayList();
        z3 = false;
        while (r11.hasNext()) {
            if (qnHx.b()) {
                qnHx.a();
            } else {
                qnHxC = qnHx.c(context);
                if (qnHxC == null) {
                    qnHx.a();
                } else {
                    animator = qnHxC.b;
                    if (animator == null) {
                        arrayList9.add(qnHx);
                    } else {
                        cQf3 = qnHx.a;
                        fragment2 = cQf3.c;
                        if (Boolean.TRUE.equals(map.get(cQf3))) {
                            if (RBi.H(2)) {
                                Log.v(str, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                            }
                            qnHx.a();
                        } else {
                            if (cQf3.a == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                arrayList10 = arrayList3;
                                arrayList10.remove(cQf3);
                            } else {
                                arrayList10 = arrayList3;
                            }
                            View view10 = fragment2.a0;
                            viewGroup.startViewTransition(view10);
                            animator.addListener(new LPt8Fixed(viewGroup, view10, z4, cQf3, qnHx));
                            animator.setTarget(view10);
                            animator.start();
                            qnHx.b.b(new wh0(animator));
                            map = map;
                            arrayList3 = arrayList10;
                            z3 = true;
                        }
                    }
                }
            }
        }
        ArrayList<ck32.CQf> arrayList23 = arrayList3;
        while (r2.hasNext()) {
            cQf2 = qnHx2.a;
            fragment = cQf2.c;
            if (zContainsValue) {
                if (RBi.H(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                }
                qnHx2.a();
            } else if (z3) {
                if (RBi.H(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                }
                qnHx2.a();
            } else {
                view5 = fragment.a0;
                PRnFixed.QnHx qnHxC3 = qnHx2.c(context);
                qnHxC3.getClass();
                animation = qnHxC3.a;
                animation.getClass();
                if (cQf2.a != 1) {
                    view5.startAnimation(animation);
                    qnHx2.a();
                } else {
                    viewGroup.startViewTransition(view5);
                    PRnFixed.CQf cQf110 = new PRnFixed.CQf(animation, viewGroup, view5);
                    cQf110.setAnimationListener(new NUlFixed(view5, viewGroup, qnHx2));
                    view5.startAnimation(cQf110);
                }
                qnHx2.b.b(new YKK(view5, viewGroup, qnHx2));
            }
        }
        while (r0.hasNext()) {
            a83.a(cQf20.a, cQf20.c.a0);
        }
        arrayList23.clear();
    }
}
