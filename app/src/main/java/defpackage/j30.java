package defpackage;

import android.os.Trace;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j30 implements g30 {
    public int A;
    public final kr4 B;
    public boolean C;
    public kn4 D;
    public ln4 E;
    public mn4 F;
    public boolean G;
    public p13<p40<Object>, ? extends is4<? extends Object>> H;
    public Z1 I;
    public final ArrayList J;
    public boolean K;
    public int L;
    public int M;
    public final kr4 N;
    public int O;
    public boolean P;
    public boolean Q;
    public final tp1 R;
    public final kr4 S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final jE<?> a;
    public final l40 b;
    public final ln4 c;
    public final Set<yl3> d;
    public List<y81<jE<?>, mn4, xl3, sd5>> e;
    public final List<y81<jE<?>, mn4, xl3, sd5>> f;
    public final d90 g;
    public f03 i;
    public int j;
    public int l;
    public int[] n;
    public HashMap<Integer, Integer> o;
    public boolean p;
    public boolean q;
    public boolean v;
    public boolean x;
    public int z;
    public final kr4 h = new kr4();
    public final tp1 k = new tp1(0);
    public final tp1 m = new tp1(0);
    public final ArrayList r = new ArrayList();
    public final tp1 s = new tp1(0);
    public p13<p40<Object>, ? extends is4<? extends Object>> t = y03.y;
    public final HashMap<Integer, p13<p40<Object>, is4<Object>>> u = new HashMap<>();
    public final tp1 w = new tp1(0);
    public int y = -1;

    public final class CQf extends l40 {
        public final int a;
        public final boolean b;
        public HashSet c;
        public final LinkedHashSet d = new LinkedHashSet();
        public final kz2 e = ps0.R(y03.y);

        public CQf(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // defpackage.l40
        public final void a(d90 d90Var, sz szVar) {
            j30.this.b.a(d90Var, szVar);
        }

        @Override // defpackage.l40
        public final void b(ih2 ih2Var) {
            j30.this.b.b(ih2Var);
        }

        @Override // defpackage.l40
        public final void c() {
            j30.this.z--;
        }

        @Override // defpackage.l40
        public final boolean d() {
            return this.b;
        }

        @Override // defpackage.l40
        public final p13<p40<Object>, is4<Object>> e() {
            return (p13) this.e.getValue();
        }

        @Override // defpackage.l40
        public final int f() {
            return this.a;
        }

        @Override // defpackage.l40
        public final la0 g() {
            return j30.this.b.g();
        }

        @Override // defpackage.l40
        public final void h(d90 d90Var) {
            j30 j30Var = j30.this;
            j30Var.b.h(j30Var.g);
            j30Var.b.h(d90Var);
        }

        @Override // defpackage.l40
        public final void i(ih2 ih2Var, hh2 hh2Var) {
            j30.this.b.i(ih2Var, hh2Var);
        }

        @Override // defpackage.l40
        public final hh2 j(ih2 ih2Var) {
            return j30.this.b.j(ih2Var);
        }

        @Override // defpackage.l40
        public final void k(Set<Object> set) {
            HashSet hashSet = this.c;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.c = hashSet;
            }
            hashSet.add(set);
        }

        @Override // defpackage.l40
        public final void l(j30 j30Var) {
            this.d.add(j30Var);
        }

        @Override // defpackage.l40
        public final void m() {
            j30.this.z++;
        }

        @Override // defpackage.l40
        public final void n(g30 g30Var) {
            HashSet hashSet = this.c;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((j30) g30Var).c);
                }
            }
            sb5.a(this.d).remove(g30Var);
        }

        @Override // defpackage.l40
        public final void o(d90 d90Var) {
            j30.this.b.o(d90Var);
        }

        public final void p() {
            LinkedHashSet<j30> linkedHashSet = this.d;
            if (!linkedHashSet.isEmpty()) {
                HashSet hashSet = this.c;
                if (hashSet != null) {
                    for (j30 j30Var : linkedHashSet) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(j30Var.c);
                        }
                    }
                }
                linkedHashSet.clear();
            }
        }
    }

    public static final class EQ extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(int i) {
            super(3);
            this.w = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            jE<?> jEVar2 = jEVar;
            for (int i = 0; i < this.w; i++) {
                jEVar2.g();
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ x81<T, V, sd5> w;
        public final /* synthetic */ V x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(Object obj, x81 x81Var) {
            super(3);
            this.w = x81Var;
            this.x = obj;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v4 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // defpackage.y81
        public final defpackage.sd5 invoke(defpackage.jE<?> r1, defpackage.mn4 r2, defpackage.xl3 r3) {
            /*
                r0 = this;
                jE r1 = (defpackage.jE) r1
                mn4 r2 = (defpackage.mn4) r2
                xl3 r3 = (defpackage.xl3) r3
                java.lang.Object r1 = r1.a()
                V r2 = r0.x
                x81<T, V, sd5> r3 = r0.w
                r3.invoke(r1, r2)
                sd5 r1 = defpackage.sd5.a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j30.F1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class FJCM extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ h81<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FJCM(h81<sd5> h81Var) {
            super(3);
            this.w = h81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            xl3Var.b(this.w);
            return sd5.a;
        }
    }

    public static final class LPt6Fixed extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ Object w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt6Fixed(Object obj) {
            super(3);
            this.w = obj;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            xl3Var.c((yl3) this.w);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ h81<T> w;
        public final /* synthetic */ Z1 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(h81<? extends T> h81Var, Z1 z1, int i) {
            super(3);
            this.w = h81Var;
            this.x = z1;
            this.y = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            jE<?> jEVar2 = jEVar;
            mn4 mn4Var2 = mn4Var;
            Object objInvoke = this.w.invoke();
            mn4Var2.N(mn4Var2.c(this.x), objInvoke);
            jEVar2.h(this.y, objInvoke);
            jEVar2.c(objInvoke);
            return sd5.a;
        }
    }

    public static final class MZ extends cx1 implements x81<g30, Integer, p13<p40<Object>, ? extends is4<? extends Object>>> {
        public final /* synthetic */ ng3<?>[] w;
        public final /* synthetic */ p13<p40<Object>, is4<Object>> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MZ(ng3<?>[] ng3VarArr, p13<p40<Object>, ? extends is4<? extends Object>> p13Var) {
            super(2);
            this.w = ng3VarArr;
            this.x = p13Var;
        }

        @Override // defpackage.x81
        public final p13<p40<Object>, ? extends is4<? extends Object>> invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(935231726);
            e40.CQf cQf = e40.a;
            g30Var2.e(721128344);
            a13 a13Var = new a13(y03.y);
            for (ng3<?> ng3Var : this.w) {
                boolean z = ng3Var.c;
                p40<?> p40Var = ng3Var.a;
                if (z || !this.x.containsKey(p40Var)) {
                    a13Var.put(p40Var, p40Var.a(ng3Var.b, g30Var2));
                }
            }
            y03 y03VarA = a13Var.a();
            g30Var2.G();
            g30Var2.G();
            return y03VarA;
        }
    }

    public static final class NUlFixed extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ Z1 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i, Z1 z1) {
            super(3);
            this.w = z1;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            jE<?> jEVar2 = jEVar;
            mn4 mn4Var2 = mn4Var;
            Object objX = mn4Var2.x(mn4Var2.c(this.w));
            jEVar2.g();
            jEVar2.b(this.x, objX);
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ Z1 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PRnFixed(Z1 z1) {
            super(3);
            this.w = z1;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            mn4 mn4Var2 = mn4Var;
            mn4Var2.k(mn4Var2.c(this.w));
            return sd5.a;
        }
    }

    public static final class QnHx implements yl3 {
        public final CQf w;

        public QnHx(CQf cQf) {
            this.w = cQf;
        }

        @Override // defpackage.yl3
        public final void a() {
            this.w.p();
        }

        @Override // defpackage.yl3
        public final void c() {
            this.w.p();
        }

        @Override // defpackage.yl3
        public final void d() {
        }
    }

    public static final class RBi extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RBi(int i) {
            super(3);
            this.w = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            Z1 z1;
            int iC;
            mn4 mn4Var2 = mn4Var;
            if (!(mn4Var2.m == 0)) {
                throw new IllegalArgumentException("Cannot move a group while inserting".toString());
            }
            int i = this.w;
            if (!(i >= 0)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            }
            if (i != 0) {
                int i2 = mn4Var2.r;
                int i3 = mn4Var2.s;
                int i4 = mn4Var2.g;
                int iS = i2;
                while (i > 0) {
                    iS += fp1.s(mn4Var2.b, mn4Var2.n(iS));
                    if (!(iS <= i4)) {
                        throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
                    }
                    i--;
                }
                int iS2 = fp1.s(mn4Var2.b, mn4Var2.n(iS));
                int i5 = mn4Var2.h;
                int iG = mn4Var2.g(mn4Var2.b, mn4Var2.n(iS));
                int i6 = iS + iS2;
                int iG2 = mn4Var2.g(mn4Var2.b, mn4Var2.n(i6));
                int i7 = iG2 - iG;
                mn4Var2.r(i7, Math.max(mn4Var2.r - 1, 0));
                mn4Var2.q(iS2);
                int[] iArr = mn4Var2.b;
                int iN = mn4Var2.n(i6) * 5;
                System.arraycopy(iArr, iN, iArr, mn4Var2.n(i2) * 5, ((iS2 * 5) + iN) - iN);
                if (i7 > 0) {
                    Object[] objArr = mn4Var2.c;
                    int iH = mn4Var2.h(iG + i7);
                    System.arraycopy(objArr, iH, objArr, i5, mn4Var2.h(iG2 + i7) - iH);
                }
                int i8 = iG + i7;
                int i9 = i8 - i5;
                int i10 = mn4Var2.j;
                int i11 = mn4Var2.k;
                int length = mn4Var2.c.length;
                int i12 = mn4Var2.l;
                int i13 = i2 + iS2;
                int i14 = i2;
                while (i14 < i13) {
                    int iN2 = mn4Var2.n(i14);
                    int i15 = i13;
                    int iG3 = mn4Var2.g(iArr, iN2) - i9;
                    int i16 = i9;
                    if (iG3 > (i12 < iN2 ? 0 : i10)) {
                        iG3 = -(((length - i11) - iG3) + 1);
                    }
                    int i17 = mn4Var2.j;
                    int i18 = i10;
                    int i19 = mn4Var2.k;
                    int i20 = i11;
                    int length2 = mn4Var2.c.length;
                    if (iG3 > i17) {
                        iG3 = -(((length2 - i19) - iG3) + 1);
                    }
                    iArr[(iN2 * 5) + 4] = iG3;
                    i14++;
                    i13 = i15;
                    i9 = i16;
                    i10 = i18;
                    i11 = i20;
                }
                int i21 = iS2 + i6;
                int iM = mn4Var2.m();
                int iV = fp1.v(mn4Var2.d, i6, iM);
                ArrayList arrayList = new ArrayList();
                if (iV >= 0) {
                    while (iV < mn4Var2.d.size() && (iC = mn4Var2.c((z1 = mn4Var2.d.get(iV)))) >= i6 && iC < i21) {
                        arrayList.add(z1);
                        mn4Var2.d.remove(iV);
                    }
                }
                int i22 = i2 - i6;
                int size = arrayList.size();
                for (int i23 = 0; i23 < size; i23++) {
                    Z1 z2 = (Z1) arrayList.get(i23);
                    int iC2 = mn4Var2.c(z2) + i22;
                    if (iC2 >= mn4Var2.e) {
                        z2.a = -(iM - iC2);
                    } else {
                        z2.a = iC2;
                    }
                    mn4Var2.d.add(fp1.v(mn4Var2.d, iC2, iM), z2);
                }
                if (!(!mn4Var2.C(i6, iS2))) {
                    e40.c("Unexpectedly removed anchors".toString());
                    throw null;
                }
                mn4Var2.l(i3, mn4Var2.g, i2);
                if (i7 > 0) {
                    mn4Var2.D(i8, i7, i6 - 1);
                }
            }
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(int i, int i2, int i3) {
            super(3);
            this.w = i;
            this.x = i2;
            this.y = i3;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            jEVar.e(this.w, this.x, this.y);
            return sd5.a;
        }
    }

    public static final class Xn1 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ Object w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Xn1(Object obj, int i) {
            super(3);
            this.w = obj;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            tk3 tk3Var;
            n40 n40Var;
            mn4 mn4Var2 = mn4Var;
            xl3 xl3Var2 = xl3Var;
            Object obj = this.w;
            if (obj instanceof yl3) {
                xl3Var2.c((yl3) obj);
            }
            Object objE = mn4Var2.E(this.x, obj);
            if (objE instanceof yl3) {
                xl3Var2.a((yl3) objE);
            } else if ((objE instanceof tk3) && (n40Var = (tk3Var = (tk3) objE).b) != null) {
                tk3Var.b = null;
                tk3Var.f = null;
                tk3Var.g = null;
                n40Var.J = true;
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<Integer, Object, sd5> {
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i) {
            super(2);
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(Integer num, Object obj) {
            int iIntValue = num.intValue();
            boolean z = obj instanceof yl3;
            int i = this.x;
            j30 j30Var = j30.this;
            if (z) {
                j30Var.D.m(i);
                j30Var.m0(false, new k30(i, iIntValue, obj));
            } else if (obj instanceof tk3) {
                tk3 tk3Var = (tk3) obj;
                n40 n40Var = tk3Var.b;
                if (n40Var != null) {
                    n40Var.J = true;
                    tk3Var.b = null;
                    tk3Var.f = null;
                    tk3Var.g = null;
                }
                j30Var.D.m(i);
                j30Var.m0(false, new l30(i, iIntValue, obj));
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(int i, int i2) {
            super(3);
            this.w = i;
            this.x = i2;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            jEVar.f(this.w, this.x);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(int i) {
            super(3);
            this.w = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            mn4Var.a(this.w);
            return sd5.a;
        }
    }

    public static final class y extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public final /* synthetic */ ih2 x;
        public final /* synthetic */ Z1 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ih2 ih2Var, Z1 z1) {
            super(3);
            this.x = ih2Var;
            this.y = z1;
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            mn4 mn4Var2 = mn4Var;
            ln4 ln4Var = new ln4();
            Z1 z1 = this.y;
            mn4 mn4VarC = ln4Var.c();
            try {
                mn4VarC.e();
                mn4Var2.w(z1, mn4VarC);
                mn4VarC.j();
                sd5 sd5Var = sd5.a;
                mn4VarC.f();
                j30.this.b.i(this.x, new hh2(ln4Var));
                return sd5.a;
            } catch (Throwable th) {
                mn4VarC.f();
                throw th;
            }
        }
    }

    public j30(defpackage.LPt8Fixed lPt8, l40 l40Var, ln4 ln4Var, HashSet hashSet, ArrayList arrayList, ArrayList arrayList2, d90 d90Var) {
        this.a = lPt8;
        this.b = l40Var;
        this.c = ln4Var;
        this.d = hashSet;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = d90Var;
        ip4.h();
        this.B = new kr4();
        kn4 kn4VarB = ln4Var.b();
        kn4VarB.c();
        this.D = kn4VarB;
        ln4 ln4Var2 = new ln4();
        this.E = ln4Var2;
        mn4 mn4VarC = ln4Var2.c();
        mn4VarC.f();
        this.F = mn4VarC;
        kn4 kn4VarB2 = this.E.b();
        try {
            Z1 z1A = kn4VarB2.a(0);
            kn4VarB2.c();
            this.I = z1A;
            this.J = new ArrayList();
            this.N = new kr4();
            this.Q = true;
            this.R = new tp1(0);
            this.S = new kr4();
            this.T = -1;
            this.U = -1;
            this.V = -1;
        } catch (Throwable th) {
            kn4VarB2.c();
            throw th;
        }
    }

    public static final void K(j30 j30Var, gh2 gh2Var, p13 p13Var, Object obj) {
        j30Var.r(126665345, gh2Var);
        j30Var.I(obj);
        int i = j30Var.L;
        j30Var.L = 126665345;
        if (j30Var.K) {
            mn4 mn4Var = j30Var.F;
            int i2 = mn4Var.s;
            int iN = mn4Var.n(i2);
            int[] iArr = mn4Var.b;
            int i3 = (iN * 5) + 1;
            int i4 = iArr[i3];
            if (!((i4 & 134217728) != 0)) {
                iArr[i3] = i4 | 134217728;
                if (!fp1.q(iArr, iN)) {
                    mn4Var.M(mn4Var.y(i2));
                }
            }
        }
        boolean z = (j30Var.K || ur1.a(j30Var.D.e(), p13Var)) ? false : true;
        if (z) {
            j30Var.u.put(Integer.valueOf(j30Var.D.f), p13Var);
        }
        j30Var.s0(202, e40.h, false, p13Var);
        boolean z2 = j30Var.K;
        boolean z3 = j30Var.v;
        j30Var.v = z;
        sz szVarN = X.n(1378964644, new z30(gh2Var, obj), true);
        sb5.d(2, szVarN);
        szVarN.invoke(j30Var, 1);
        j30Var.v = z3;
        j30Var.R(false);
        j30Var.L = i;
        j30Var.R(false);
    }

    public static final void a0(mn4 mn4Var, jE<Object> jEVar, int i) {
        while (true) {
            int i2 = mn4Var.s;
            if ((i > i2 && i < mn4Var.g) || (i2 == 0 && i == 0)) {
                return;
            }
            mn4Var.G();
            if (mn4Var.s(mn4Var.s)) {
                jEVar.g();
            }
            mn4Var.i();
        }
    }

    public static final int p0(j30 j30Var, int i, boolean z, int i2) {
        kn4 kn4Var = j30Var.D;
        int[] iArr = kn4Var.b;
        if (!((iArr[(i * 5) + 1] & 134217728) != 0)) {
            if (!fp1.q(iArr, i)) {
                return fp1.x(j30Var.D.b, i);
            }
            int iH = j30Var.D.h(i) + i;
            int iH2 = i + 1;
            int iP0 = 0;
            while (iH2 < iH) {
                boolean zI = j30Var.D.i(iH2);
                if (zI) {
                    j30Var.d0();
                    j30Var.N.c(j30Var.D.j(iH2));
                }
                iP0 += p0(j30Var, iH2, zI || z, zI ? 0 : i2 + iP0);
                if (zI) {
                    j30Var.d0();
                    j30Var.n0();
                }
                iH2 += j30Var.D.h(iH2);
            }
            return iP0;
        }
        Object objK = kn4Var.k(iArr, i);
        if (objK == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        }
        gh2 gh2Var = (gh2) objK;
        Object objG = j30Var.D.g(i, 0);
        Z1 z1A = j30Var.D.a(i);
        int iH3 = j30Var.D.h(i) + i;
        ArrayList arrayList = j30Var.r;
        e40.CQf cQf = e40.a;
        ArrayList arrayList2 = new ArrayList();
        int iD = e40.d(arrayList, i);
        if (iD < 0) {
            iD = -(iD + 1);
        }
        while (iD < arrayList.size()) {
            bs1 bs1Var = (bs1) arrayList.get(iD);
            if (bs1Var.b >= iH3) {
                break;
            }
            arrayList2.add(bs1Var);
            iD++;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            bs1 bs1Var2 = (bs1) arrayList2.get(i3);
            arrayList3.add(new uy2(bs1Var2.a, bs1Var2.c));
        }
        ih2 ih2Var = new ih2(gh2Var, objG, j30Var.g, j30Var.c, z1A, arrayList3, j30Var.N(Integer.valueOf(i)));
        j30Var.b.b(ih2Var);
        j30Var.l0();
        j30Var.i0(j30Var.new y(ih2Var, z1A));
        if (!z) {
            return fp1.x(j30Var.D.b, i);
        }
        j30Var.d0();
        j30Var.f0();
        j30Var.c0();
        int iX = j30Var.D.i(i) ? 1 : fp1.x(j30Var.D.b, i);
        if (iX <= 0) {
            return 0;
        }
        j30Var.k0(i2, iX);
        return 0;
    }

    public static Object q0(lg3 lg3Var, p13 p13Var) {
        e40.CQf cQf = e40.a;
        if (!p13Var.containsKey(lg3Var)) {
            return lg3Var.a.getValue();
        }
        is4 is4Var = (is4) p13Var.get(lg3Var);
        if (is4Var != null) {
            return is4Var.getValue();
        }
        return null;
    }

    @Override // defpackage.g30
    public final void A() {
        if (!this.q) {
            e40.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (!(!this.K)) {
            e40.c("useNode() called while inserting".toString());
            throw null;
        }
        kn4 kn4Var = this.D;
        this.N.c(kn4Var.j(kn4Var.h));
    }

    public final void A0(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.L = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.L, 3);
                return;
            } else {
                this.L = obj.hashCode() ^ Integer.rotateLeft(this.L, 3);
                return;
            }
        }
        if (obj2 == null || i != 207 || ur1.a(obj2, g30.QnHx.a)) {
            this.L = i ^ Integer.rotateLeft(this.L, 3);
        } else {
            this.L = obj2.hashCode() ^ Integer.rotateLeft(this.L, 3);
        }
    }

    @Override // defpackage.g30
    public final void B(Object obj) {
        F0(obj);
    }

    public final void B0(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.L = Integer.rotateRight(((Enum) obj).ordinal() ^ this.L, 3);
                return;
            } else {
                this.L = Integer.rotateRight(obj.hashCode() ^ this.L, 3);
                return;
            }
        }
        if (obj2 == null || i != 207 || ur1.a(obj2, g30.QnHx.a)) {
            this.L = Integer.rotateRight(i ^ this.L, 3);
        } else {
            this.L = Integer.rotateRight(obj2.hashCode() ^ this.L, 3);
        }
    }

    @Override // defpackage.g30
    public final int C() {
        return this.L;
    }

    public final void C0(int i, int i2) {
        if (G0(i) != i2) {
            if (i < 0) {
                HashMap<Integer, Integer> map = this.o;
                if (map == null) {
                    map = new HashMap<>();
                    this.o = map;
                }
                map.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i3 = this.D.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    @Override // defpackage.g30
    public final CQf D() {
        u0(206, e40.k);
        Object objB0 = b0();
        QnHx qnHx = objB0 instanceof QnHx ? (QnHx) objB0 : null;
        if (qnHx == null) {
            qnHx = new QnHx(new CQf(this.L, this.p));
            F0(qnHx);
        }
        qnHx.w.e.setValue(N(null));
        R(false);
        return qnHx.w;
    }

    public final void D0(int i, int i2) {
        int iG0 = G0(i);
        if (iG0 != i2) {
            int i3 = i2 - iG0;
            kr4 kr4Var = this.h;
            int size = kr4Var.a.size() - 1;
            while (i != -1) {
                int iG1 = G0(i) + i3;
                C0(i, iG1);
                for (int i4 = size; -1 < i4; i4--) {
                    f03 f03Var = (f03) kr4Var.a.get(i4);
                    if (f03Var != null && f03Var.b(i, iG1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                if (i < 0) {
                    i = this.D.h;
                } else if (this.D.i(i)) {
                    return;
                } else {
                    i = this.D.l(i);
                }
            }
        }
    }

    @Override // defpackage.g30
    public final Object E(lg3 lg3Var) {
        return q0(lg3Var, N(null));
    }

    public final p13<p40<Object>, is4<Object>> E0(p13<p40<Object>, ? extends is4<? extends Object>> p13Var, p13<p40<Object>, ? extends is4<? extends Object>> p13Var2) {
        a13 a13VarBuilder = p13Var.builder();
        a13VarBuilder.putAll(p13Var2);
        y03 y03VarA = a13VarBuilder.a();
        u0(204, e40.j);
        I(y03VarA);
        I(p13Var2);
        R(false);
        return y03VarA;
    }

    @Override // defpackage.g30
    public final void F() {
        R(false);
    }

    public final void F0(Object obj) {
        boolean z = this.K;
        Set<yl3> set = this.d;
        if (!z) {
            kn4 kn4Var = this.D;
            int iY = (kn4Var.j - fp1.y(kn4Var.b, kn4Var.h)) - 1;
            if (obj instanceof yl3) {
                set.add(obj);
            }
            m0(true, new Xn1(obj, iY));
            return;
        }
        mn4 mn4Var = this.F;
        if (mn4Var.m > 0) {
            mn4Var.r(1, mn4Var.s);
        }
        Object[] objArr = mn4Var.c;
        int i = mn4Var.h;
        mn4Var.h = i + 1;
        Object obj2 = objArr[mn4Var.h(i)];
        int i2 = mn4Var.h;
        if (!(i2 <= mn4Var.i)) {
            e40.c("Writing to an invalid slot".toString());
            throw null;
        }
        mn4Var.c[mn4Var.h(i2 - 1)] = obj;
        if (obj instanceof yl3) {
            i0(new LPt6Fixed(obj));
            set.add(obj);
        }
    }

    @Override // defpackage.g30
    public final void G() {
        R(false);
    }

    public final int G0(int i) {
        int i2;
        Integer num;
        if (i >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i2 = iArr[i]) < 0) ? fp1.x(this.D.b, i) : i2;
        }
        HashMap<Integer, Integer> map = this.o;
        if (map == null || (num = map.get(Integer.valueOf(i))) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.g30
    public final void H() {
        R(true);
    }

    @Override // defpackage.g30
    public final boolean I(Object obj) {
        if (ur1.a(b0(), obj)) {
            return false;
        }
        F0(obj);
        return true;
    }

    public final void J() {
        L();
        this.h.a.clear();
        this.k.a = 0;
        this.m.a = 0;
        this.s.a = 0;
        this.w.a = 0;
        this.u.clear();
        this.D.c();
        this.L = 0;
        this.z = 0;
        this.q = false;
        this.C = false;
    }

    public final void L() {
        this.i = null;
        this.j = 0;
        this.l = 0;
        this.O = 0;
        this.L = 0;
        this.q = false;
        this.P = false;
        this.R.a = 0;
        this.B.a.clear();
        this.n = null;
        this.o = null;
    }

    public final int M(int i, int i2, int i3) {
        Object objB;
        if (i == i2) {
            return i3;
        }
        kn4 kn4Var = this.D;
        int[] iArr = kn4Var.b;
        int i4 = i * 5;
        int iHashCode = 0;
        if ((iArr[i4 + 1] & 536870912) != 0) {
            Object objK = kn4Var.k(iArr, i);
            if (objK != null) {
                if (objK instanceof Enum) {
                    iHashCode = ((Enum) objK).ordinal();
                } else {
                    iHashCode = objK instanceof gh2 ? 126665345 : objK.hashCode();
                }
            }
        } else {
            iHashCode = iArr[i4];
            if (iHashCode == 207 && (objB = kn4Var.b(iArr, i)) != null && !ur1.a(objB, g30.QnHx.a)) {
                iHashCode = objB.hashCode();
            }
        }
        return iHashCode == 126665345 ? iHashCode : Integer.rotateLeft(M(this.D.l(i), i2, i3), 3) ^ iHashCode;
    }

    public final p13<p40<Object>, is4<Object>> N(Integer num) {
        p13 p13Var;
        if (num == null && (p13Var = this.H) != null) {
            return p13Var;
        }
        if (this.K && this.G) {
            int iY = this.F.s;
            while (iY > 0) {
                mn4 mn4Var = this.F;
                if (mn4Var.b[mn4Var.n(iY) * 5] == 202) {
                    mn4 mn4Var2 = this.F;
                    int iN = mn4Var2.n(iY);
                    int[] iArr = mn4Var2.b;
                    int i = iN * 5;
                    int i2 = iArr[i + 1];
                    if (ur1.a((536870912 & i2) != 0 ? mn4Var2.c[fp1.S(i2 >> 30) + iArr[i + 4]] : null, e40.h)) {
                        mn4 mn4Var3 = this.F;
                        int iN2 = mn4Var3.n(iY);
                        Object obj = fp1.t(mn4Var3.b, iN2) ? mn4Var3.c[mn4Var3.d(mn4Var3.b, iN2)] : g30.QnHx.a;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        p13<p40<Object>, is4<Object>> p13Var2 = (p13) obj;
                        this.H = p13Var2;
                        return p13Var2;
                    }
                }
                iY = this.F.y(iY);
            }
        }
        kn4 kn4Var = this.D;
        if (kn4Var.c > 0) {
            int iIntValue = num != null ? num.intValue() : kn4Var.h;
            while (iIntValue > 0) {
                kn4 kn4Var2 = this.D;
                int[] iArr2 = kn4Var2.b;
                if (iArr2[iIntValue * 5] == 202 && ur1.a(kn4Var2.k(iArr2, iIntValue), e40.h)) {
                    p13<p40<Object>, is4<Object>> p13Var3 = this.u.get(Integer.valueOf(iIntValue));
                    if (p13Var3 == null) {
                        kn4 kn4Var3 = this.D;
                        Object objB = kn4Var3.b(kn4Var3.b, iIntValue);
                        if (objB == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        p13Var3 = (p13) objB;
                    }
                    this.H = p13Var3;
                    return p13Var3;
                }
                iIntValue = this.D.l(iIntValue);
            }
        }
        p13 p13Var4 = this.t;
        this.H = p13Var4;
        return p13Var4;
    }

    public final void O() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.b.n(this);
            this.B.a.clear();
            this.r.clear();
            this.e.clear();
            this.u.clear();
            this.a.clear();
            sd5 sd5Var = sd5.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void P(vh1 vh1Var, sz szVar) {
        if (!(!this.C)) {
            e40.c("Reentrant composition is not supported".toString());
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = ip4.h().d();
            this.u.clear();
            int i = vh1Var.a;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.r;
                if (i2 >= i) {
                    if (arrayList.size() > 1) {
                        p30 p30Var = new p30();
                        if (arrayList.size() > 1) {
                            Collections.sort(arrayList, p30Var);
                        }
                    }
                    this.j = 0;
                    this.C = true;
                    try {
                        y0();
                        Object objB0 = b0();
                        if (objB0 != szVar && szVar != null) {
                            F0(szVar);
                        }
                        m30 m30Var = new m30(this);
                        n30 n30Var = new n30(this);
                        o30 o30Var = new o30(szVar, this, objB0);
                        cq4 cq4Var = sp4.a;
                        o13 o13Var = (o13) cq4Var.h();
                        try {
                            Collection collection = (o13) cq4Var.h();
                            if (collection == null) {
                                collection = on4.x;
                            }
                            cq4Var.j(collection.add(new uy2(m30Var, n30Var)));
                            o30Var.invoke();
                            cq4Var.j(o13Var);
                            V();
                            this.C = false;
                            arrayList.clear();
                            sd5 sd5Var = sd5.a;
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            cq4Var.j(o13Var);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.C = false;
                        arrayList.clear();
                        J();
                        throw th2;
                    }
                }
                Object obj = ((Object[]) vh1Var.b)[i2];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                }
                wh1 wh1Var = (wh1) ((Object[]) vh1Var.c)[i2];
                tk3 tk3Var = (tk3) obj;
                Z1 z1 = tk3Var.c;
                if (z1 == null) {
                    Trace.endSection();
                    return;
                } else {
                    arrayList.add(new bs1(tk3Var, z1.a, wh1Var));
                    i2++;
                }
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void Q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        Q(this.D.l(i), i2);
        if (this.D.i(i)) {
            this.N.c(this.D.j(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public final void R(boolean z) {
        ?? r4;
        HashSet hashSet;
        f03 f03Var;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        int i;
        int i2;
        if (this.K) {
            mn4 mn4Var = this.F;
            int i3 = mn4Var.s;
            int i4 = mn4Var.b[mn4Var.n(i3) * 5];
            mn4 mn4Var2 = this.F;
            int iN = mn4Var2.n(i3);
            int[] iArr = mn4Var2.b;
            int i5 = iN * 5;
            int i6 = iArr[i5 + 1];
            Object obj = (536870912 & i6) != 0 ? mn4Var2.c[fp1.S(i6 >> 30) + iArr[i5 + 4]] : null;
            mn4 mn4Var3 = this.F;
            int iN2 = mn4Var3.n(i3);
            B0(i4, obj, fp1.t(mn4Var3.b, iN2) ? mn4Var3.c[mn4Var3.d(mn4Var3.b, iN2)] : g30.QnHx.a);
        } else {
            kn4 kn4Var = this.D;
            int i7 = kn4Var.h;
            int[] iArr2 = kn4Var.b;
            int i8 = iArr2[i7 * 5];
            Object objK = kn4Var.k(iArr2, i7);
            kn4 kn4Var2 = this.D;
            B0(i8, objK, kn4Var2.b(kn4Var2.b, i7));
        }
        int i9 = this.l;
        f03 f03Var2 = this.i;
        ArrayList arrayList2 = this.r;
        if (f03Var2 != null) {
            List<aw1> list = f03Var2.a;
            if (list.size() > 0) {
                ArrayList arrayList3 = f03Var2.d;
                HashSet hashSet2 = new HashSet(arrayList3.size());
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    hashSet2.add(arrayList3.get(i10));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList3.size();
                int size3 = list.size();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < size3) {
                    aw1 aw1Var = list.get(i11);
                    boolean zContains = hashSet2.contains(aw1Var);
                    int i14 = f03Var2.b;
                    if (zContains) {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(aw1Var)) {
                            if (i12 < size2) {
                                aw1 aw1Var2 = (aw1) arrayList3.get(i12);
                                HashMap<Integer, ya1> map = f03Var2.e;
                                if (aw1Var2 != aw1Var) {
                                    int iA = f03Var2.a(aw1Var2);
                                    linkedHashSet2.add(aw1Var2);
                                    if (iA != i13) {
                                        f03Var = f03Var2;
                                        ya1 ya1Var = map.get(Integer.valueOf(aw1Var2.c));
                                        int i15 = ya1Var != null ? ya1Var.c : aw1Var2.d;
                                        arrayList = arrayList3;
                                        int i16 = iA + i14;
                                        int i17 = i14 + i13;
                                        if (i15 > 0) {
                                            linkedHashSet = linkedHashSet2;
                                            int i18 = this.W;
                                            if (i18 > 0) {
                                                i = size2;
                                                i2 = size3;
                                                if (this.U == i16 - i18 && this.V == i17 - i18) {
                                                    this.W = i18 + i15;
                                                }
                                            } else {
                                                i = size2;
                                                i2 = size3;
                                            }
                                            d0();
                                            this.U = i16;
                                            this.V = i17;
                                            this.W = i15;
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            i = size2;
                                            i2 = size3;
                                        }
                                        if (iA > i13) {
                                            for (ya1 ya1Var2 : map.values()) {
                                                int i19 = ya1Var2.b;
                                                if (iA <= i19 && i19 < iA + i15) {
                                                    ya1Var2.b = (i19 - iA) + i13;
                                                } else if (i13 <= i19 && i19 < iA) {
                                                    ya1Var2.b = i19 + i15;
                                                }
                                            }
                                        } else if (i13 > iA) {
                                            for (ya1 ya1Var3 : map.values()) {
                                                int i20 = ya1Var3.b;
                                                if (iA <= i20 && i20 < iA + i15) {
                                                    ya1Var3.b = (i20 - iA) + i13;
                                                } else if (iA + 1 <= i20 && i20 < i13) {
                                                    ya1Var3.b = i20 - i15;
                                                }
                                            }
                                        }
                                    } else {
                                        f03Var = f03Var2;
                                        arrayList = arrayList3;
                                        linkedHashSet = linkedHashSet2;
                                        i = size2;
                                        i2 = size3;
                                    }
                                } else {
                                    f03Var = f03Var2;
                                    arrayList = arrayList3;
                                    linkedHashSet = linkedHashSet2;
                                    i = size2;
                                    i2 = size3;
                                    i11++;
                                }
                                i12++;
                                ya1 ya1Var4 = map.get(Integer.valueOf(aw1Var2.c));
                                i13 += ya1Var4 != null ? ya1Var4.c : aw1Var2.d;
                                hashSet2 = hashSet;
                                f03Var2 = f03Var;
                                arrayList3 = arrayList;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i;
                                size3 = i2;
                            } else {
                                hashSet2 = hashSet;
                            }
                        }
                    } else {
                        k0(f03Var2.a(aw1Var) + i14, aw1Var.d);
                        int i21 = aw1Var.c;
                        f03Var2.b(i21, 0);
                        kn4 kn4Var3 = this.D;
                        hashSet = hashSet2;
                        this.O = i21 - (kn4Var3.f - this.O);
                        kn4Var3.m(i21);
                        j0();
                        this.D.n();
                        e40.a(i21, this.D.h(i21) + i21, arrayList2);
                    }
                    i11++;
                    hashSet2 = hashSet;
                }
                d0();
                if (list.size() > 0) {
                    kn4 kn4Var4 = this.D;
                    this.O = kn4Var4.g - (kn4Var4.f - this.O);
                    kn4Var4.o();
                }
            }
        }
        int i22 = this.j;
        while (true) {
            kn4 kn4Var5 = this.D;
            if ((kn4Var5.i > 0) || kn4Var5.f == kn4Var5.g) {
                break;
            }
            int i23 = kn4Var5.f;
            j0();
            k0(i22, this.D.n());
            e40.a(i23, this.D.f, arrayList2);
        }
        boolean z2 = this.K;
        if (z2) {
            ArrayList arrayList4 = this.J;
            if (z) {
                arrayList4.add(this.S.b());
                i9 = 1;
            }
            kn4 kn4Var6 = this.D;
            int i24 = kn4Var6.i;
            if (!(i24 > 0)) {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
            kn4Var6.i = i24 - 1;
            mn4 mn4Var4 = this.F;
            int i25 = mn4Var4.s;
            mn4Var4.i();
            if (!(this.D.i > 0)) {
                int i26 = (-2) - i25;
                this.F.j();
                this.F.f();
                Z1 z1 = this.I;
                if (arrayList4.isEmpty()) {
                    b40 b40Var = new b40(this.E, z1);
                    e0(false);
                    l0();
                    i0(b40Var);
                    r4 = 0;
                } else {
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    arrayList4.clear();
                    f0();
                    c0();
                    c40 c40Var = new c40(this.E, z1, arrayList5);
                    r4 = 0;
                    e0(false);
                    l0();
                    i0(c40Var);
                }
                this.K = r4;
                if (!(this.c.x == 0)) {
                    C0(i26, r4);
                    D0(i26, i9);
                }
            }
        } else {
            if (z) {
                n0();
            }
            int i27 = this.D.h;
            tp1 tp1Var = this.R;
            int i28 = tp1Var.a;
            if (!((i28 > 0 ? ((int[]) tp1Var.b)[i28 + (-1)] : -1) <= i27)) {
                e40.c("Missed recording an endGroup".toString());
                throw null;
            }
            if ((i28 > 0 ? ((int[]) tp1Var.b)[i28 - 1] : -1) == i27) {
                tp1Var.d();
                m0(false, e40.c);
            }
            int i29 = this.D.h;
            if (i9 != G0(i29)) {
                D0(i29, i9);
            }
            if (z) {
                i9 = 1;
            }
            this.D.d();
            d0();
        }
        f03 f03Var3 = (f03) this.h.b();
        if (f03Var3 != null && !z2) {
            f03Var3.c++;
        }
        this.i = f03Var3;
        this.j = this.k.d() + i9;
        this.l = this.m.d() + i9;
    }

    public final void S() {
        R(false);
        tk3 tk3VarX = X();
        if (tk3VarX != null) {
            int i = tk3VarX.a;
            if ((i & 1) != 0) {
                tk3VarX.a = i | 2;
            }
        }
    }

    public final void T() {
        R(false);
        R(false);
        int iD = this.w.d();
        e40.CQf cQf = e40.a;
        this.v = iD != 0;
        this.H = null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    public final tk3 U() {
        Z1 z1A;
        sk3 sk3Var;
        boolean z;
        kr4 kr4Var = this.B;
        tk3 tk3Var = null;
        tk3 tk3Var2 = kr4Var.a.isEmpty() ^ true ? (tk3) kr4Var.b() : null;
        if (tk3Var2 != null) {
            tk3Var2.a &= -9;
        }
        if (tk3Var2 != null) {
            int i = this.A;
            uh1 uh1Var = tk3Var2.f;
            if (uh1Var == null) {
                sk3Var = null;
            } else {
                if ((tk3Var2.a & 16) != 0) {
                    sk3Var = null;
                } else {
                    int i2 = uh1Var.a;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            z = false;
                            break;
                        }
                        if (((Object[]) uh1Var.b)[i3] == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        }
                        if (((int[]) uh1Var.c)[i3] != i) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        sk3Var = new sk3(tk3Var2, i, uh1Var);
                    } else {
                        sk3Var = null;
                    }
                }
            }
            if (sk3Var != null) {
                i0(new q30(sk3Var, this));
            }
        }
        if (tk3Var2 != null) {
            int i4 = tk3Var2.a;
            if (!((i4 & 16) != 0)) {
                if (((i4 & 1) != 0) || this.p) {
                    if (tk3Var2.c == null) {
                        if (this.K) {
                            mn4 mn4Var = this.F;
                            z1A = mn4Var.b(mn4Var.s);
                        } else {
                            kn4 kn4Var = this.D;
                            z1A = kn4Var.a(kn4Var.h);
                        }
                        tk3Var2.c = z1A;
                    }
                    tk3Var2.a &= -5;
                    tk3Var = tk3Var2;
                }
            }
        }
        R(false);
        return tk3Var;
    }

    public final void V() {
        R(false);
        this.b.c();
        R(false);
        if (this.P) {
            m0(false, e40.c);
            this.P = false;
        }
        f0();
        if (!this.h.a.isEmpty()) {
            e40.c("Start/end imbalance".toString());
            throw null;
        }
        if (!(this.R.a == 0)) {
            e40.c("Missed recording an endGroup()".toString());
            throw null;
        }
        L();
        this.D.c();
    }

    public final void W(boolean z, f03 f03Var) {
        this.h.c(this.i);
        this.i = f03Var;
        this.k.e(this.j);
        if (z) {
            this.j = 0;
        }
        this.m.e(this.l);
        this.l = 0;
    }

    public final tk3 X() {
        if (this.z == 0) {
            kr4 kr4Var = this.B;
            if (!kr4Var.a.isEmpty()) {
                ArrayList arrayList = kr4Var.a;
                return (tk3) arrayList.get(arrayList.size() - 1);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    public final boolean Y() {
        boolean z;
        if (this.v) {
            return true;
        }
        tk3 tk3VarX = X();
        if (tk3VarX == null) {
            z = false;
        } else {
            if ((tk3VarX.a & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(ArrayList arrayList) {
        List<y81<jE<?>, mn4, xl3, sd5>> list;
        List<y81<jE<?>, mn4, xl3, sd5>> list2 = this.f;
        List<y81<jE<?>, mn4, xl3, sd5>> list3 = this.e;
        try {
            this.e = list2;
            i0(e40.e);
            int i = 0;
            for (int size = arrayList.size(); i < size; size = size) {
                uy2 uy2Var = (uy2) arrayList.get(i);
                ih2 ih2Var = (ih2) uy2Var.w;
                ih2 ih2Var2 = (ih2) uy2Var.x;
                Z1 z1 = ih2Var.e;
                ln4 ln4Var = ih2Var.d;
                int iA = ln4Var.a(z1);
                hl3 hl3Var = new hl3();
                f0();
                i0(new r30(hl3Var, z1));
                if (ih2Var2 == null) {
                    if (ur1.a(ln4Var, this.E)) {
                        e40.f(this.F.t);
                        ln4 ln4Var2 = new ln4();
                        this.E = ln4Var2;
                        mn4 mn4VarC = ln4Var2.c();
                        mn4VarC.f();
                        this.F = mn4VarC;
                    }
                    kn4 kn4VarB = ln4Var.b();
                    try {
                        kn4VarB.m(iA);
                        this.O = iA;
                        ArrayList arrayList2 = new ArrayList();
                        g0(null, null, null, cs0.w, new s30(this, arrayList2, kn4VarB, ih2Var));
                        if (!arrayList2.isEmpty()) {
                            i0(new t30(hl3Var, arrayList2));
                        }
                        sd5 sd5Var = sd5.a;
                        kn4VarB.c();
                    } catch (Throwable th) {
                        kn4VarB.c();
                        throw th;
                    }
                } else {
                    Z1 z2 = ih2Var2.e;
                    ln4 ln4Var3 = ih2Var2.d;
                    ArrayList arrayList3 = new ArrayList();
                    kn4 kn4VarB2 = ln4Var3.b();
                    try {
                        e40.b(kn4VarB2, arrayList3, ln4Var3.a(z2));
                        sd5 sd5Var2 = sd5.a;
                        kn4VarB2.c();
                        if (!arrayList3.isEmpty()) {
                            i0(new u30(hl3Var, arrayList3));
                            int iA2 = this.c.a(z1);
                            C0(iA2, G0(iA2) + arrayList3.size());
                        }
                        i0(new v30(this, ih2Var2, ih2Var));
                        kn4 kn4VarB3 = ln4Var3.b();
                        try {
                            kn4 kn4Var = this.D;
                            int[] iArr = this.n;
                            this.n = null;
                            try {
                                this.D = kn4VarB3;
                                int iA3 = ln4Var3.a(z2);
                                kn4VarB3.m(iA3);
                                this.O = iA3;
                                ArrayList arrayList4 = new ArrayList();
                                List<y81<jE<?>, mn4, xl3, sd5>> list4 = this.e;
                                try {
                                    this.e = arrayList4;
                                    list = list4;
                                    try {
                                        g0(ih2Var2.c, ih2Var.c, Integer.valueOf(kn4VarB3.f), ih2Var2.f, new w30(this, ih2Var));
                                        this.e = list;
                                        if (!arrayList4.isEmpty()) {
                                            i0(new x30(hl3Var, arrayList4));
                                        }
                                        this.D = kn4Var;
                                        this.n = iArr;
                                        kn4VarB3.c();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        this.e = list;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    list = list4;
                                }
                            } catch (Throwable th4) {
                                this.D = kn4Var;
                                this.n = iArr;
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            kn4VarB3.c();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        kn4VarB2.c();
                        throw th6;
                    }
                }
                i0(e40.b);
                i++;
            }
            i0(y30.w);
            this.O = 0;
            sd5 sd5Var3 = sd5.a;
            this.e = list3;
            L();
        } catch (Throwable th7) {
            this.e = list3;
            throw th7;
        }
    }

    @Override // defpackage.g30
    public final void a() {
        this.p = true;
    }

    @Override // defpackage.g30
    public final tk3 b() {
        return X();
    }

    public final Object b0() {
        Object obj;
        int i;
        boolean z = this.K;
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (z) {
            if (!this.q) {
                return c0132QnHx;
            }
            e40.c("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        kn4 kn4Var = this.D;
        if (kn4Var.i > 0 || (i = kn4Var.j) >= kn4Var.k) {
            obj = c0132QnHx;
        } else {
            kn4Var.j = i + 1;
            obj = kn4Var.d[i];
        }
        return this.x ? c0132QnHx : obj;
    }

    @Override // defpackage.g30
    public final boolean c(boolean z) {
        Object objB0 = b0();
        if ((objB0 instanceof Boolean) && z == ((Boolean) objB0).booleanValue()) {
            return false;
        }
        F0(Boolean.valueOf(z));
        return true;
    }

    public final void c0() {
        kr4 kr4Var = this.N;
        if (!kr4Var.a.isEmpty()) {
            ArrayList arrayList = kr4Var.a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = arrayList.get(i);
            }
            i0(new a40(objArr));
            arrayList.clear();
        }
    }

    @Override // defpackage.g30
    public final void d() {
        if (this.x && this.D.h == this.y) {
            this.y = -1;
            this.x = false;
        }
        R(false);
    }

    public final void d0() {
        int i = this.W;
        this.W = 0;
        if (i > 0) {
            int i2 = this.T;
            if (i2 >= 0) {
                this.T = -1;
                auxFixed auxVar = new auxFixed(i2, i);
                f0();
                c0();
                i0(auxVar);
                return;
            }
            int i3 = this.U;
            this.U = -1;
            int i4 = this.V;
            this.V = -1;
            T23 t23 = new T23(i3, i4, i);
            f0();
            c0();
            i0(t23);
        }
    }

    @Override // defpackage.g30
    public final void e(int i) {
        s0(i, null, false, null);
    }

    public final void e0(boolean z) {
        int i = z ? this.D.h : this.D.f;
        int i2 = i - this.O;
        if (!(i2 >= 0)) {
            e40.c("Tried to seek backward".toString());
            throw null;
        }
        if (i2 > 0) {
            i0(new byN(i2));
            this.O = i;
        }
    }

    @Override // defpackage.g30
    public final Object f() {
        return b0();
    }

    public final void f0() {
        int i = this.M;
        if (i > 0) {
            this.M = 0;
            i0(new EQ(i));
        }
    }

    @Override // defpackage.g30
    public final boolean g(float f) {
        Object objB0 = b0();
        if (objB0 instanceof Float) {
            if (f == ((Number) objB0).floatValue()) {
                return false;
            }
        }
        F0(Float.valueOf(f));
        return true;
    }

    public final <R> R g0(d90 d90Var, d90 d90Var2, Integer num, List<uy2<tk3, wh1<Object>>> list, h81<? extends R> h81Var) {
        R rInvoke;
        boolean z = this.Q;
        boolean z2 = this.C;
        int i = this.j;
        try {
            this.Q = false;
            this.C = true;
            this.j = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                uy2<tk3, wh1<Object>> uy2Var = list.get(i2);
                tk3 tk3Var = uy2Var.w;
                wh1<Object> wh1Var = uy2Var.x;
                if (wh1Var != null) {
                    int i3 = 0;
                    while (true) {
                        if (!(i3 < wh1Var.w)) {
                            break;
                        }
                        int i4 = i3 + 1;
                        Object obj = wh1Var.x[i3];
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        z0(tk3Var, obj);
                        i3 = i4;
                    }
                } else {
                    z0(tk3Var, null);
                }
            }
            if (d90Var != null) {
                rInvoke = (R) d90Var.b(d90Var2, num != null ? num.intValue() : -1, h81Var);
                if (rInvoke == null) {
                }
                this.Q = z;
                this.C = z2;
                this.j = i;
                return rInvoke;
            }
            rInvoke = h81Var.invoke();
            this.Q = z;
            this.C = z2;
            this.j = i;
            return rInvoke;
        } catch (Throwable th) {
            this.Q = z;
            this.C = z2;
            this.j = i;
            throw th;
        }
    }

    @Override // defpackage.g30
    public final void h() {
        this.x = this.y >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:145:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7 A[LOOP:5: B:31:0x006b->B:51:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:71:0x00fb
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void h0() {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j30.h0():void");
    }

    @Override // defpackage.g30
    public final boolean i(int i) {
        Object objB0 = b0();
        if ((objB0 instanceof Integer) && i == ((Number) objB0).intValue()) {
            return false;
        }
        F0(Integer.valueOf(i));
        return true;
    }

    public final void i0(y81<? super jE<?>, ? super mn4, ? super xl3, sd5> y81Var) {
        this.e.add(y81Var);
    }

    @Override // defpackage.g30
    public final boolean j(long j) {
        Object objB0 = b0();
        if ((objB0 instanceof Long) && j == ((Number) objB0).longValue()) {
            return false;
        }
        F0(Long.valueOf(j));
        return true;
    }

    public final void j0() {
        p0(this, this.D.f, false, 0);
        d0();
        e40.CQf cQf = e40.a;
        e0(false);
        l0();
        i0(cQf);
        int i = this.O;
        kn4 kn4Var = this.D;
        this.O = fp1.s(kn4Var.b, kn4Var.f) + i;
    }

    @Override // defpackage.g30
    public final ln4 k() {
        return this.c;
    }

    public final void k0(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                e40.c(("Invalid remove index " + i).toString());
                throw null;
            }
            if (this.T == i) {
                this.W += i2;
                return;
            }
            d0();
            this.T = i;
            this.W = i2;
        }
    }

    @Override // defpackage.g30
    public final <T> void l(h81<? extends T> h81Var) {
        if (!this.q) {
            e40.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (!this.K) {
            e40.c("createNode() can only be called when inserting".toString());
            throw null;
        }
        tp1 tp1Var = this.k;
        int i = ((int[]) tp1Var.b)[tp1Var.a - 1];
        mn4 mn4Var = this.F;
        Z1 z1B = mn4Var.b(mn4Var.s);
        this.l++;
        this.J.add(new LPt8Fixed(h81Var, z1B, i));
        this.S.c(new NUlFixed(i, z1B));
    }

    public final void l0() {
        kn4 kn4Var = this.D;
        if (kn4Var.c > 0) {
            int i = kn4Var.h;
            tp1 tp1Var = this.R;
            int i2 = tp1Var.a;
            if ((i2 > 0 ? ((int[]) tp1Var.b)[i2 - 1] : -1) != i) {
                if (!this.P && this.Q) {
                    m0(false, e40.d);
                    this.P = true;
                }
                Z1 z1A = kn4Var.a(i);
                tp1Var.e(i);
                m0(false, new PRnFixed(z1A));
            }
        }
    }

    @Override // defpackage.g30
    public final boolean m() {
        return this.K;
    }

    public final void m0(boolean z, y81<? super jE<?>, ? super mn4, ? super xl3, sd5> y81Var) {
        e0(z);
        i0(y81Var);
    }

    @Override // defpackage.g30
    public final <V, T> void n(V v, x81<? super T, ? super V, sd5> x81Var) {
        F1 f1 = new F1(v, x81Var);
        if (this.K) {
            this.J.add(f1);
            return;
        }
        f0();
        c0();
        i0(f1);
    }

    public final void n0() {
        kr4 kr4Var = this.N;
        if (!kr4Var.a.isEmpty()) {
            kr4Var.b();
        } else {
            this.M++;
        }
    }

    @Override // defpackage.g30
    public final void o(Object obj) {
        if (this.D.f() == 207 && !ur1.a(this.D.e(), obj) && this.y < 0) {
            this.y = this.D.f;
            this.x = true;
        }
        s0(207, null, false, obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    public final void o0(int i, int i2, int i3) {
        kn4 kn4Var = this.D;
        e40.CQf cQf = e40.a;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (kn4Var.l(i) == i2) {
                i3 = i2;
            } else if (kn4Var.l(i2) == i) {
                i3 = i;
            } else if (kn4Var.l(i) == kn4Var.l(i2)) {
                i3 = kn4Var.l(i);
            } else {
                int iL = i;
                int i4 = 0;
                while (iL > 0 && iL != i3) {
                    iL = kn4Var.l(iL);
                    i4++;
                }
                int iL2 = i2;
                int i5 = 0;
                while (iL2 > 0 && iL2 != i3) {
                    iL2 = kn4Var.l(iL2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iL3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iL3 = kn4Var.l(iL3);
                }
                int i8 = i5 - i4;
                int iL4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iL4 = kn4Var.l(iL4);
                }
                while (iL3 != iL4) {
                    iL3 = kn4Var.l(iL3);
                    iL4 = kn4Var.l(iL4);
                }
                i3 = iL3;
            }
        }
        while (i > 0 && i != i3) {
            if (kn4Var.i(i)) {
                n0();
            }
            i = kn4Var.l(i);
        }
        Q(i2, i3);
    }

    @Override // defpackage.g30
    public final void p(boolean z) {
        if (!(this.l == 0)) {
            e40.c("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw null;
        }
        if (this.K) {
            return;
        }
        if (!z) {
            r0();
            return;
        }
        kn4 kn4Var = this.D;
        int i = kn4Var.f;
        int i2 = kn4Var.g;
        int i3 = i;
        while (i3 < i2) {
            kn4 kn4Var2 = this.D;
            YKK ykk = new YKK(i3);
            int iY = fp1.y(kn4Var2.b, i3);
            i3++;
            ln4 ln4Var = kn4Var2.a;
            int i4 = i3 < ln4Var.x ? ln4Var.w[(i3 * 5) + 4] : ln4Var.z;
            for (int i5 = iY; i5 < i4; i5++) {
                ykk.invoke(Integer.valueOf(i5 - iY), kn4Var2.d[i5]);
            }
        }
        e40.a(i, i2, this.r);
        this.D.m(i);
        this.D.o();
    }

    @Override // defpackage.g30
    public final j30 q(int i) {
        Object obj;
        tk3 tk3Var;
        int i2;
        s0(i, null, false, null);
        boolean z = this.K;
        kr4 kr4Var = this.B;
        d90 d90Var = this.g;
        if (z) {
            tk3 tk3Var2 = new tk3((n40) d90Var);
            kr4Var.c(tk3Var2);
            F0(tk3Var2);
            tk3Var2.e = this.A;
            tk3Var2.a &= -17;
        } else {
            ArrayList arrayList = this.r;
            int iD = e40.d(arrayList, this.D.h);
            bs1 bs1Var = iD >= 0 ? (bs1) arrayList.remove(iD) : null;
            kn4 kn4Var = this.D;
            int i3 = kn4Var.i;
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (i3 > 0 || (i2 = kn4Var.j) >= kn4Var.k) {
                obj = c0132QnHx;
            } else {
                kn4Var.j = i2 + 1;
                obj = kn4Var.d[i2];
            }
            if (ur1.a(obj, c0132QnHx)) {
                tk3Var = new tk3((n40) d90Var);
                F0(tk3Var);
            } else {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                }
                tk3Var = (tk3) obj;
            }
            if (bs1Var != null) {
                tk3Var.a |= 8;
            } else {
                tk3Var.a &= -9;
            }
            kr4Var.c(tk3Var);
            tk3Var.e = this.A;
            tk3Var.a &= -17;
        }
        return this;
    }

    @Override // defpackage.g30
    public final void r(int i, Object obj) {
        s0(i, obj, false, null);
    }

    public final void r0() {
        kn4 kn4Var = this.D;
        int i = kn4Var.h;
        this.l = i >= 0 ? fp1.x(kn4Var.b, i) : 0;
        this.D.o();
    }

    @Override // defpackage.g30
    public final void s() {
        s0(125, null, true, null);
        this.q = true;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    public final void s0(int i, Object obj, boolean z, Object obj2) {
        f03 f03Var;
        Object objI0;
        kn4 kn4Var;
        ArrayList arrayList;
        int i2;
        int[] iArr;
        Object obj3 = obj;
        int iX = 1;
        if (!(!this.q)) {
            e40.c("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        A0(i, obj3, obj2);
        boolean z2 = this.K;
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (z2) {
            this.D.i++;
            mn4 mn4Var = this.F;
            int i3 = mn4Var.r;
            if (z) {
                mn4Var.K(125, c0132QnHx, true, c0132QnHx);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = c0132QnHx;
                }
                mn4Var.K(i, obj3, false, obj2);
            } else {
                if (obj3 == null) {
                    obj3 = c0132QnHx;
                }
                mn4Var.K(i, obj3, false, c0132QnHx);
            }
            f03 f03Var2 = this.i;
            if (f03Var2 != null) {
                int i4 = (-2) - i3;
                aw1 aw1Var = new aw1(i, i4, -1, -1);
                f03Var2.e.put(Integer.valueOf(i4), new ya1(-1, this.j - f03Var2.b, 0));
                f03Var2.d.add(aw1Var);
            }
            W(z, null);
            return;
        }
        if (this.i == null) {
            if (this.D.f() != i) {
                kn4Var = this.D;
                kn4Var.getClass();
                arrayList = new ArrayList();
                if (kn4Var.i <= 0) {
                    i2 = kn4Var.f;
                    while (i2 < kn4Var.g) {
                        int i5 = i2 * 5;
                        iArr = kn4Var.b;
                        int i6 = iArr[i5];
                        Object objK = kn4Var.k(iArr, i2);
                        if (fp1.u(iArr, i2)) {
                            iX = fp1.x(iArr, i2);
                        }
                        arrayList.add(new aw1(i6, i2, iX, objK));
                        i2 += iArr[i5 + 3];
                        iX = 1;
                    }
                }
                this.i = new f03(arrayList, this.j);
            } else {
                kn4 kn4Var2 = this.D;
                int i7 = kn4Var2.f;
                if (ur1.a(obj3, i7 < kn4Var2.g ? kn4Var2.k(kn4Var2.b, i7) : null)) {
                    x0(obj2, z);
                } else {
                    kn4Var = this.D;
                    kn4Var.getClass();
                    arrayList = new ArrayList();
                    if (kn4Var.i <= 0) {
                        i2 = kn4Var.f;
                        while (i2 < kn4Var.g) {
                            int i8 = i2 * 5;
                            iArr = kn4Var.b;
                            int i9 = iArr[i8];
                            Object objK2 = kn4Var.k(iArr, i2);
                            if (fp1.u(iArr, i2)) {
                                iX = fp1.x(iArr, i2);
                            }
                            arrayList.add(new aw1(i9, i2, iX, objK2));
                            i2 += iArr[i8 + 3];
                            iX = 1;
                        }
                    }
                    this.i = new f03(arrayList, this.j);
                }
            }
        }
        f03 f03Var3 = this.i;
        if (f03Var3 == null) {
            f03Var = null;
        } else {
            Object us1Var = obj3 != null ? new us1(Integer.valueOf(i), obj3) : Integer.valueOf(i);
            HashMap map = (HashMap) f03Var3.f.getValue();
            e40.CQf cQf = e40.a;
            LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(us1Var);
            if (linkedHashSet == null || (objI0 = wu.I0(linkedHashSet)) == null) {
                objI0 = null;
            } else {
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) map.get(us1Var);
                if (linkedHashSet2 != null) {
                    linkedHashSet2.remove(objI0);
                    if (linkedHashSet2.isEmpty()) {
                        map.remove(us1Var);
                    }
                    sd5 sd5Var = sd5.a;
                }
            }
            aw1 aw1Var2 = (aw1) objI0;
            HashMap<Integer, ya1> map2 = f03Var3.e;
            ArrayList arrayList2 = f03Var3.d;
            int i10 = f03Var3.b;
            if (aw1Var2 != null) {
                arrayList2.add(aw1Var2);
                this.j = f03Var3.a(aw1Var2) + i10;
                int i11 = aw1Var2.c;
                ya1 ya1Var = map2.get(Integer.valueOf(i11));
                int i12 = ya1Var != null ? ya1Var.a : -1;
                int i13 = f03Var3.c;
                int i14 = i12 - i13;
                if (i12 > i13) {
                    for (ya1 ya1Var2 : map2.values()) {
                        int i15 = ya1Var2.a;
                        if (i15 == i12) {
                            ya1Var2.a = i13;
                        } else if (i13 <= i15 && i15 < i12) {
                            ya1Var2.a = i15 + 1;
                        }
                    }
                } else if (i13 > i12) {
                    for (ya1 ya1Var3 : map2.values()) {
                        int i16 = ya1Var3.a;
                        if (i16 == i12) {
                            ya1Var3.a = i13;
                        } else if (i12 + 1 <= i16 && i16 < i13) {
                            ya1Var3.a = i16 - 1;
                        }
                    }
                }
                kn4 kn4Var3 = this.D;
                this.O = i11 - (kn4Var3.f - this.O);
                kn4Var3.m(i11);
                if (i14 > 0) {
                    RBi rBi = new RBi(i14);
                    e0(false);
                    l0();
                    i0(rBi);
                }
                x0(obj2, z);
                f03Var = null;
            } else {
                this.D.i++;
                this.K = true;
                this.H = null;
                if (this.F.t) {
                    mn4 mn4VarC = this.E.c();
                    this.F = mn4VarC;
                    mn4VarC.G();
                    this.G = false;
                    this.H = null;
                }
                this.F.e();
                mn4 mn4Var2 = this.F;
                int i17 = mn4Var2.r;
                if (z) {
                    mn4Var2.K(125, c0132QnHx, true, c0132QnHx);
                } else if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = c0132QnHx;
                    }
                    mn4Var2.K(i, obj3, false, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = c0132QnHx;
                    }
                    mn4Var2.K(i, obj3, false, c0132QnHx);
                }
                this.I = this.F.b(i17);
                int i18 = (-2) - i17;
                aw1 aw1Var3 = new aw1(i, i18, -1, -1);
                map2.put(Integer.valueOf(i18), new ya1(-1, this.j - i10, 0));
                arrayList2.add(aw1Var3);
                f03Var = new f03(new ArrayList(), z ? 0 : this.j);
            }
        }
        W(z, f03Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    @Override // defpackage.g30
    public final boolean t() {
        boolean z;
        if (this.K || this.x || this.v) {
            return false;
        }
        tk3 tk3VarX = X();
        if (tk3VarX == null) {
            z = false;
        } else {
            if ((tk3VarX.a & 8) != 0) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public final void t0() {
        s0(-127, null, false, null);
    }

    @Override // defpackage.g30
    public final void u() {
        this.x = false;
    }

    public final void u0(int i, gv2 gv2Var) {
        s0(i, gv2Var, false, null);
    }

    @Override // defpackage.g30
    public final jE<?> v() {
        return this.a;
    }

    public final void v0() {
        int i = 125;
        if (!this.K && (!this.x ? this.D.f() == 126 : this.D.f() == 125)) {
            i = 126;
        }
        s0(i, null, true, null);
        this.q = true;
    }

    @Override // defpackage.g30
    public final void w(rk3 rk3Var) {
        tk3 tk3Var = rk3Var instanceof tk3 ? (tk3) rk3Var : null;
        if (tk3Var == null) {
            return;
        }
        tk3Var.a |= 1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w0(ng3<?>[] ng3VarArr) {
        p13<p40<Object>, is4<Object>> p13VarE0;
        boolean zA;
        p13<p40<Object>, is4<Object>> p13VarN = N(null);
        u0(RCHTTPStatusCodes.CREATED, e40.g);
        u0(203, e40.i);
        MZ mz = new MZ(ng3VarArr, p13VarN);
        sb5.d(2, mz);
        p13<p40<Object>, ? extends is4<? extends Object>> p13VarInvoke = mz.invoke(this, 1);
        R(false);
        if (!this.K) {
            kn4 kn4Var = this.D;
            Object objG = kn4Var.g(kn4Var.f, 0);
            if (objG == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            p13<p40<Object>, is4<Object>> p13Var = (p13) objG;
            kn4 kn4Var2 = this.D;
            Object objG2 = kn4Var2.g(kn4Var2.f, 1);
            if (objG2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            p13 p13Var2 = (p13) objG2;
            if (t() && ur1.a(p13Var2, p13VarInvoke)) {
                this.l = this.D.n() + this.l;
                p13VarE0 = p13Var;
            } else {
                p13VarE0 = E0(p13VarN, p13VarInvoke);
                zA = true ^ ur1.a(p13VarE0, p13Var);
            }
            if (zA && !this.K) {
                this.u.put(Integer.valueOf(this.D.f), p13VarE0);
            }
            this.w.e(this.v ? 1 : 0);
            this.v = zA;
            this.H = p13VarE0;
            s0(202, e40.h, false, p13VarE0);
        }
        p13VarE0 = E0(p13VarN, p13VarInvoke);
        this.G = true;
        zA = false;
        if (zA) {
            this.u.put(Integer.valueOf(this.D.f), p13VarE0);
        }
        this.w.e(this.v ? 1 : 0);
        this.v = zA;
        this.H = p13VarE0;
        s0(202, e40.h, false, p13VarE0);
    }

    @Override // defpackage.g30
    public final void x() {
        if (!(this.l == 0)) {
            e40.c("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw null;
        }
        tk3 tk3VarX = X();
        if (tk3VarX != null) {
            tk3VarX.a |= 16;
        }
        if (this.r.isEmpty()) {
            r0();
        } else {
            h0();
        }
    }

    public final void x0(Object obj, boolean z) {
        if (!z) {
            if (obj != null && this.D.e() != obj) {
                m0(false, new d40(obj));
            }
            this.D.p();
            return;
        }
        kn4 kn4Var = this.D;
        if (kn4Var.i <= 0) {
            if (!fp1.u(kn4Var.b, kn4Var.f)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            kn4Var.p();
        }
    }

    @Override // defpackage.g30
    public final void y(h81<sd5> h81Var) {
        i0(new FJCM(h81Var));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void y0() {
        ln4 ln4Var = this.c;
        this.D = ln4Var.b();
        s0(100, null, false, null);
        l40 l40Var = this.b;
        l40Var.m();
        this.t = l40Var.e();
        tp1 tp1Var = this.w;
        boolean z = this.v;
        e40.CQf cQf = e40.a;
        tp1Var.e(z ? 1 : 0);
        this.v = I(this.t);
        this.H = null;
        if (!this.p) {
            this.p = l40Var.d();
        }
        Set<Object> set = (Set) q0(xo1.a, this.t);
        if (set != null) {
            set.add(ln4Var);
            l40Var.k(set);
        }
        s0(l40Var.f(), null, false, null);
    }

    @Override // defpackage.g30
    public final la0 z() {
        return this.b.g();
    }

    public final boolean z0(tk3 tk3Var, Object obj) {
        Z1 z1 = tk3Var.c;
        if (z1 == null) {
            return false;
        }
        int iA = this.c.a(z1);
        if (!this.C || iA < this.D.f) {
            return false;
        }
        ArrayList arrayList = this.r;
        int iD = e40.d(arrayList, iA);
        wh1 wh1Var = null;
        if (iD < 0) {
            int i = -(iD + 1);
            if (obj != null) {
                wh1Var = new wh1();
                wh1Var.add(obj);
            }
            arrayList.add(i, new bs1(tk3Var, iA, wh1Var));
        } else if (obj == null) {
            ((bs1) arrayList.get(iD)).c = null;
        } else {
            wh1<Object> wh1Var2 = ((bs1) arrayList.get(iD)).c;
            if (wh1Var2 != null) {
                wh1Var2.add(obj);
            }
        }
        return true;
    }
}
