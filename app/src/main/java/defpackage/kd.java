package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.QnHx;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public class kd implements i91 {
    public static Method B;
    public static boolean C;
    public static Field D;
    public static boolean E;

    @SuppressLint({"StaticFieldLeak"})
    public static Context w;
    public static ej1 z;
    public static final py4 x = new py4("UNDEFINED");
    public static final py4 y = new py4("REUSABLE_CLAIMED");
    public static final kd A = new kd();

    public static final void B(SpannableString spannableString, z42 z42Var, int i, int i2) {
        Object localeSpan;
        if (z42Var != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = c52.a.a(z42Var);
            } else {
                localeSpan = new LocaleSpan(((XX) (z42Var.isEmpty() ? new y42(f53.a.a().get(0)) : z42Var.w.get(0)).a).a);
            }
            C(spannableString, localeSpan, i, i2);
        }
    }

    public static final void C(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final Object E(u54 u54Var, u54 u54Var2, x81 x81Var) throws Throwable {
        Object iyVar;
        Object objH0;
        try {
            sb5.d(2, x81Var);
            iyVar = x81Var.invoke(u54Var2, u54Var);
        } catch (Throwable th) {
            iyVar = new iy(th, false);
        }
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (iyVar == va0Var || (objH0 = u54Var.H0(iyVar)) == ym.y) {
            return va0Var;
        }
        if (objH0 instanceof iy) {
            throw ((iy) objH0).a;
        }
        return ym.g(objH0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ii3 F(d24 d24Var, w80 w80Var, wr4 wr4Var, Float f) {
        uj4 uj4Var;
        oo ooVar;
        mz0 mz0VarJ;
        jo.c.getClass();
        jo.QnHx qnHx = jo.QnHx.a;
        boolean z2 = d24Var instanceof oo;
        lg lgVar = lg.SUSPEND;
        if (!z2 || (mz0VarJ = (ooVar = (oo) d24Var).j()) == null) {
            uj4Var = new uj4(xr0.w, d24Var);
        } else {
            int i = ooVar.x;
            if (i == -3 || i == -2 || i == 0) {
                lg lgVar2 = ooVar.y;
            }
            uj4Var = new uj4(ooVar.w, mz0VarJ);
        }
        QnHx qnHxO = FWT.o(f);
        return new ii3(qnHxO, fp1.j0(w80Var, uj4Var.b, ur1.a(wr4Var, vj4.QnHx.a) ? 1 : 4, new p01(wr4Var, uj4Var.a, qnHxO, f, null)));
    }

    public static final vo G(mz0 mz0Var, y81 y81Var) {
        int i = i01.a;
        return new vo(y81Var, mz0Var, xr0.w, -2, lg.SUSPEND);
    }

    public static final byte[] a(String str) {
        return str.getBytes(up.a);
    }

    public static mz0 b(mz0 mz0Var, int i) {
        int i2;
        lg lgVar;
        lg lgVar2 = lg.SUSPEND;
        if (!(i >= 0 || i == -2 || i == -1)) {
            throw new IllegalArgumentException(GM.a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
        }
        if (i == -1) {
            lgVar = lg.DROP_OLDEST;
            i2 = 0;
        } else {
            i2 = i;
            lgVar = lgVar2;
        }
        return mz0Var instanceof q91 ? q91.QnHx.a((q91) mz0Var, null, i2, lgVar, 1) : new uo(mz0Var, null, i2, lgVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable c(z80 z80Var, mz0 mz0Var, nz0 nz0Var) throws Throwable {
        yz0 yz0Var;
        Throwable th;
        jl3 jl3Var;
        Throwable th2;
        boolean z2;
        boolean z3;
        ms1 ms1Var;
        if (z80Var instanceof yz0) {
            yz0Var = (yz0) z80Var;
            int i = yz0Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                yz0Var.B = i - Integer.MIN_VALUE;
            } else {
                yz0Var = new yz0(z80Var);
            }
        } else {
            yz0Var = new yz0(z80Var);
        }
        Object obj = yz0Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = yz0Var.B;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jl3Var = yz0Var.z;
            try {
                C0239D.H(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
                th2 = (Throwable) jl3Var.w;
                z2 = false;
                if (th2 == null && ur1.a(th2, th)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw th;
                }
                ms1Var = (ms1) yz0Var.x.j(ms1.CQf.w);
                if (ms1Var != null && ms1Var.isCancelled()) {
                    CancellationException cancellationExceptionP = ms1Var.P();
                    z2 = cancellationExceptionP == null && ur1.a(cancellationExceptionP, th);
                }
                if (!z2) {
                    throw th;
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    Th.a(th2, th);
                    throw th2;
                }
                Th.a(th, th2);
                throw th;
            }
        }
        C0239D.H(obj);
        jl3 jl3Var2 = new jl3();
        try {
            zz0 zz0Var = new zz0(nz0Var, jl3Var2);
            yz0Var.z = jl3Var2;
            yz0Var.B = 1;
            if (mz0Var.a(zz0Var, yz0Var) == va0Var) {
                return va0Var;
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            jl3Var = jl3Var2;
            th2 = (Throwable) jl3Var.w;
            z2 = false;
            if (th2 == null) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw th;
            }
            ms1Var = (ms1) yz0Var.x.j(ms1.CQf.w);
            if (ms1Var != null) {
                CancellationException cancellationExceptionP2 = ms1Var.P();
                z2 = cancellationExceptionP2 == null && ur1.a(cancellationExceptionP2, th);
            }
            if (!z2) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                Th.a(th2, th);
                throw th2;
            }
            Th.a(th, th2);
            throw th;
        }
    }

    public static final String d(pa4 pa4Var, ws1 ws1Var) {
        for (Annotation annotation : pa4Var.getAnnotations()) {
            if (annotation instanceof lt1) {
                return ((lt1) annotation).discriminator();
            }
        }
        return ws1Var.a.j;
    }

    public static final Object e(mz0 mz0Var, x81 x81Var, z80 z80Var) {
        int i = i01.a;
        Object objA = b(G(mz0Var, new h01(x81Var, null)), 0).a(hp2.w, z80Var);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objA != va0Var) {
            objA = sd5.a;
        }
        return objA == va0Var ? objA : sd5.a;
    }

    public static final u01 f(mz0 mz0Var, mz0 mz0Var2, mz0 mz0Var3, a91 a91Var) {
        return new u01(new mz0[]{mz0Var, mz0Var2, mz0Var3}, a91Var);
    }

    @SuppressLint({"VisibleForTests"})
    public static final AdRequest g(Vb5 vb5) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Iterator<T> it = vb5.c.iterator();
        while (it.hasNext()) {
            builder.addKeyword((String) it.next());
        }
        return builder.addNetworkExtrasBundle(AdMobAdapter.class, vb5.d).build();
    }

    public static final Object h(tt1 tt1Var, zj0 zj0Var) {
        String str;
        if (!(zj0Var instanceof QX) || tt1Var.e0().a.i) {
            return zj0Var.c(tt1Var);
        }
        String strD = d(zj0Var.a(), tt1Var.e0());
        vt1 vt1VarY = tt1Var.y();
        pa4 pa4VarA = zj0Var.a();
        if (!(vt1VarY instanceof pu1)) {
            throw AY.g(-1, "Expected " + nl3.a(pu1.class) + " as the serialized body of " + pa4VarA.a() + ", but had " + nl3.a(vt1VarY.getClass()));
        }
        pu1 pu1Var = (pu1) vt1VarY;
        vt1 vt1Var = (vt1) pu1Var.get(strD);
        String strA = null;
        if (vt1Var != null) {
            su1 su1Var = vt1Var instanceof su1 ? (su1) vt1Var : null;
            if (su1Var == null) {
                throw new IllegalArgumentException("Element " + nl3.a(vt1Var.getClass()) + " is not a JsonPrimitive");
            }
            strA = su1Var.a();
        }
        zj0 zj0VarF = ((QX) zj0Var).f(tt1Var, strA);
        if (zj0VarF != null) {
            return h(new wu1(tt1Var.e0(), pu1Var, strD, zj0VarF.a()), zj0VarF);
        }
        if (strA == null) {
            str = "missing class discriminator ('null')";
        } else {
            str = "class discriminator '" + strA + '\'';
        }
        throw AY.h(b70.a("Polymorphic serializer was not found for ", str), pu1Var.toString(), -1);
    }

    public static final mz0 i(mz0 mz0Var) {
        tz0.CQf cQf = tz0.a;
        if (mz0Var instanceof js4) {
            return mz0Var;
        }
        Object obj = tz0.a;
        tz0.QnHx qnHx = tz0.b;
        if (mz0Var instanceof lm0) {
            lm0 lm0Var = (lm0) mz0Var;
            if (lm0Var.x == obj && lm0Var.y == qnHx) {
                return mz0Var;
            }
        }
        return new lm0(mz0Var);
    }

    public static final Object j(z80 z80Var, mz0 mz0Var, nz0 nz0Var) throws Throwable {
        if (nz0Var instanceof o75) {
            throw ((o75) nz0Var).w;
        }
        Object objA = mz0Var.a(nz0Var, z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    public static final db4 k(QX qx, ls0 ls0Var, Object obj) {
        db4 db4VarG = qx.g(ls0Var, obj);
        if (db4VarG != null) {
            return db4VarG;
        }
        ar arVarA = nl3.a(obj.getClass());
        fv1 fv1VarH = qx.h();
        String strA = arVarA.a();
        if (strA == null) {
            strA = String.valueOf(arVarA);
        }
        ddf.k(strA, fv1VarH);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, py4] */
    public static final Object l(mz0 mz0Var, z80 z80Var) throws Throwable {
        l01 l01Var;
        jl3 jl3Var;
        AbortFlowException e;
        j01 j01Var;
        if (z80Var instanceof l01) {
            l01Var = (l01) z80Var;
            int i = l01Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                l01Var.C = i - Integer.MIN_VALUE;
            } else {
                l01Var = new l01(z80Var);
            }
        } else {
            l01Var = new l01(z80Var);
        }
        Object obj = l01Var.B;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = l01Var.C;
        ?? r3 = v3A.x;
        if (i2 == 0) {
            C0239D.H(obj);
            jl3 jl3Var2 = new jl3();
            jl3Var2.w = r3;
            j01 j01Var2 = new j01(jl3Var2);
            try {
                l01Var.z = jl3Var2;
                l01Var.A = j01Var2;
                l01Var.C = 1;
                if (mz0Var.a(j01Var2, l01Var) != obj2) {
                    jl3Var = jl3Var2;
                    obj2 = jl3Var.w;
                    if (obj2 == r3) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (AbortFlowException e2) {
                jl3Var = jl3Var2;
                e = e2;
                j01Var = j01Var2;
                if (e.w != j01Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j01Var = l01Var.A;
            jl3Var = l01Var.z;
            try {
                C0239D.H(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.w != j01Var) {
                    throw e;
                }
            }
            obj2 = jl3Var.w;
            if (obj2 == r3) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6.a(r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0069, please report this as an issue */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, py4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(defpackage.mz0 r6, defpackage.x81 r7, defpackage.z80 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.m01
            if (r0 == 0) goto L13
            r0 = r8
            m01 r0 = (defpackage.m01) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            m01 r0 = new m01
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.C
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.D
            py4 r3 = defpackage.v3A.x
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            k01 r6 = r0.B
            jl3 r7 = r0.A
            x81 r0 = r0.z
            defpackage.C0239D.H(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L64
        L2f:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            defpackage.C0239D.H(r8)
            jl3 r8 = new jl3
            r8.<init>()
            r8.w = r3
            k01 r2 = new k01
            r2.<init>(r7, r8)
            r0.z = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.A = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.B = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.D = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r6 != r1) goto L62
            goto L68
        L5b:
            r6 = move-exception
            r0 = r6
            r6 = r2
        L5e:
            nz0<?> r1 = r0.w
            if (r1 != r6) goto L7d
        L62:
            r0 = r7
            r7 = r8
        L64:
            T r1 = r7.w
            if (r1 == r3) goto L69
        L68:
            return r1
        L69:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd.m(mz0, x81, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(t70 t70Var, v70 v70Var, z80 z80Var) {
        o01 o01Var;
        jl3 jl3Var;
        AbortFlowException e;
        n01 n01Var;
        if (z80Var instanceof o01) {
            o01Var = (o01) z80Var;
            int i = o01Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                o01Var.C = i - Integer.MIN_VALUE;
            } else {
                o01Var = new o01(z80Var);
            }
        } else {
            o01Var = new o01(z80Var);
        }
        Object obj = o01Var.B;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = o01Var.C;
        if (i2 == 0) {
            C0239D.H(obj);
            jl3 jl3Var2 = new jl3();
            n01 n01Var2 = new n01(v70Var, jl3Var2);
            try {
                o01Var.z = jl3Var2;
                o01Var.A = n01Var2;
                o01Var.C = 1;
                if (t70Var.a(n01Var2, o01Var) == obj2) {
                    return obj2;
                }
                jl3Var = jl3Var2;
            } catch (AbortFlowException e2) {
                jl3Var = jl3Var2;
                e = e2;
                n01Var = n01Var2;
                if (e.w != n01Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n01Var = o01Var.A;
            jl3Var = o01Var.z;
            try {
                C0239D.H(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.w != n01Var) {
                    throw e;
                }
            }
        }
        return jl3Var.w;
    }

    public static final mz0 o(mz0 mz0Var, oa0 oa0Var) {
        if (oa0Var.j(ms1.CQf.w) == null) {
            if (ur1.a(oa0Var, xr0.w)) {
                return mz0Var;
            }
            return mz0Var instanceof q91 ? q91.QnHx.a((q91) mz0Var, oa0Var, 0, null, 6) : new uo(mz0Var, oa0Var, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + oa0Var).toString());
    }

    public static final ej1 p() {
        ej1 ej1Var = z;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.HighQuality");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(19.0f, 4.0f);
        le3Var.g(5.0f, 4.0f);
        le3Var.d(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        le3Var.n(12.0f);
        le3Var.d(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        le3Var.f(14.0f);
        le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        le3Var.g(21.0f, 6.0f);
        le3Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        le3Var.b();
        le3Var.i(19.0f, 18.0f);
        le3Var.g(5.0f, 18.0f);
        le3Var.g(5.0f, 6.0f);
        le3Var.f(14.0f);
        le3Var.n(12.0f);
        le3Var.b();
        le3Var.i(7.5f, 13.0f);
        le3Var.f(2.0f);
        le3Var.n(2.0f);
        le3Var.g(11.0f, 15.0f);
        le3Var.g(11.0f, 9.0f);
        le3Var.g(9.5f, 9.0f);
        le3Var.n(2.5f);
        le3Var.f(-2.0f);
        le3Var.g(7.5f, 9.0f);
        le3Var.g(6.0f, 9.0f);
        le3Var.n(6.0f);
        le3Var.f(1.5f);
        le3Var.b();
        le3Var.i(14.0f, 15.0f);
        le3Var.f(0.75f);
        le3Var.n(1.5f);
        le3Var.f(1.5f);
        le3Var.g(16.25f, 15.0f);
        le3Var.g(17.0f, 15.0f);
        le3Var.d(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        le3Var.n(-4.0f);
        le3Var.d(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        le3Var.f(-3.0f);
        le3Var.d(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        le3Var.n(4.0f);
        le3Var.d(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        le3Var.b();
        le3Var.i(14.5f, 10.5f);
        le3Var.f(2.0f);
        le3Var.n(3.0f);
        le3Var.f(-2.0f);
        le3Var.n(-3.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        z = ej1VarD;
        return ej1VarD;
    }

    public static final String q(qu4 qu4Var) {
        Context context = w;
        if (context != null) {
            return qu4Var.a(context);
        }
        ur1.e("context");
        throw null;
    }

    public static final qr4 r(mz0 mz0Var, ua0 ua0Var) {
        return fp1.k0(ua0Var, null, 0, new sz0(mz0Var, null), 3);
    }

    public static final zo s(Iterable iterable) {
        int i = i01.a;
        return new zo(iterable, xr0.w, -2, lg.SUSPEND);
    }

    public static final ko t(nk3 nk3Var) {
        return new ko(nk3Var, false);
    }

    public static final Object u(Object obj) {
        return obj instanceof iy ? new fq3.QnHx(((iy) obj).a) : obj;
    }

    public static final float v(long j, float f, ij0 ij0Var) {
        long jB = z55.b(j);
        if (a65.a(jB, 4294967296L)) {
            return ij0Var.x0(j);
        }
        if (a65.a(jB, 8589934592L)) {
            return z55.c(j) * f;
        }
        return Float.NaN;
    }

    public static final void w(z80 z80Var, Object obj, j81 j81Var) {
        Object iyVar;
        if (!(z80Var instanceof il0)) {
            z80Var.x(obj);
            return;
        }
        il0 il0Var = (il0) z80Var;
        Throwable thA = fq3.a(obj);
        boolean z2 = false;
        if (thA == null) {
            iyVar = j81Var != null ? new jy(obj, j81Var) : obj;
        } else {
            iyVar = new iy(thA, false);
        }
        z80<T> z80Var2 = il0Var.A;
        il0Var.getContext();
        oa0 oa0Var = il0Var.z;
        if (oa0Var.o()) {
            il0Var.B = iyVar;
            il0Var.y = 1;
            oa0Var.g(il0Var.getContext(), il0Var);
            return;
        }
        gu0 gu0VarA = f75.a();
        if (gu0VarA.h0()) {
            il0Var.B = iyVar;
            il0Var.y = 1;
            gu0VarA.T(il0Var);
            return;
        }
        gu0VarA.Z(true);
        try {
            ms1 ms1Var = (ms1) il0Var.getContext().j(ms1.CQf.w);
            if (ms1Var != null && !ms1Var.c()) {
                CancellationException cancellationExceptionP = ms1Var.P();
                il0Var.a(iyVar, cancellationExceptionP);
                il0Var.x(new fq3.QnHx(cancellationExceptionP));
                z2 = true;
            }
            if (!z2) {
                Object obj2 = il0Var.C;
                la0 context = z80Var2.getContext();
                Object objB = e75.b(context, obj2);
                od5<?> od5VarC = objB != e75.a ? ma0.c(z80Var2, context, objB) : null;
                try {
                    z80Var2.x(obj);
                    sd5 sd5Var = sd5.a;
                    if (od5VarC == null || od5VarC.X0()) {
                        e75.a(context, objB);
                    }
                } catch (Throwable th) {
                    if (od5VarC == null || od5VarC.X0()) {
                        e75.a(context, objB);
                    }
                    throw th;
                }
            }
            while (gu0VarA.l0()) {
            }
        } catch (Throwable th2) {
            try {
                il0Var.f(th2, null);
            } finally {
                gu0VarA.I(true);
            }
        }
    }

    public static uw x(x81 x81Var) {
        return new uw(new v9L(ha1.w, xr0.w, x81Var, 7));
    }

    public static final void y(SpannableString spannableString, long j, int i, int i2) {
        if (j != yu.h) {
            C(spannableString, new ForegroundColorSpan(hH.A(j)), i, i2);
        }
    }

    public static final void z(SpannableString spannableString, long j, ij0 ij0Var, int i, int i2) {
        long jB = z55.b(j);
        if (a65.a(jB, 4294967296L)) {
            C(spannableString, new AbsoluteSizeSpan(sy4.c(ij0Var.x0(j)), false), i, i2);
        } else if (a65.a(jB, 8589934592L)) {
            C(spannableString, new RelativeSizeSpan(z55.c(j)), i, i2);
        }
    }

    public void A(View view, int i, int i2, int i3, int i4) {
        if (!C) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                B = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            C = true;
        }
        Method method = B;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void D(View view, int i) {
        if (!E) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                D = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            E = true;
        }
        Field field = D;
        if (field != null) {
            try {
                D.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        int iOrdinal = ((xs1) obj).ordinal();
        if (iOrdinal == 0) {
            return Ytae.Single;
        }
        if (iOrdinal == 1) {
            return Ytae.MainScreenOnly;
        }
        throw new NoWhenBranchMatchedException();
    }
}
