package defpackage;

import io.ktor.client.call.UnsupportedContentTypeException;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class tt2 extends df1 {

    @Deprecated
    public static final ry4 F = new ry4(CQf.w);
    public final ry4 A = new ry4(new NUlFixed());
    public final Set<ff1<?>> B = Th.u(ah1.d, ml5.a);
    public final la0 C;
    public final la0 D;
    public final Map<ah1.QnHx, rt2> E;
    public final st2 z;

    public static final class CQf extends cx1 implements h81<rt2> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final rt2 invoke() {
            return new rt2(new rt2.QnHx());
        }
    }

    public /* synthetic */ class F1 extends l91 implements j81<ah1.QnHx, rt2> {
        public F1(Object obj) {
            super(1, obj, tt2.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        }

        @Override // defpackage.j81
        public final rt2 invoke(ah1.QnHx qnHx) {
            ah1.QnHx qnHx2 = qnHx;
            st2 st2Var = ((tt2) this.x).z;
            st2Var.getClass();
            rt2 rt2Var = (rt2) tt2.F.getValue();
            rt2Var.getClass();
            rt2.QnHx qnHx3 = new rt2.QnHx(rt2Var);
            qnHx3.a = new ll0();
            st2Var.b.invoke(qnHx3);
            if (qnHx2 != null) {
                Long l = qnHx2.b;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue == Long.MAX_VALUE) {
                        jLongValue = 0;
                    }
                    qnHx3.x = qf5.b(jLongValue, TimeUnit.MILLISECONDS);
                }
                Long l2 = qnHx2.c;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    long j = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    qnHx3.y = qf5.b(j, timeUnit);
                    qnHx3.z = qf5.b(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, timeUnit);
                }
            }
            return new rt2(qnHx3);
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<rt2, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(rt2 rt2Var) {
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<oa0> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final oa0 invoke() {
            qh0 qh0Var = rl0.a;
            return rl0.c.v(tt2.this.z.a);
        }
    }

    @if0(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", l = {58}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return tt2.this.new QnHx(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            tt2 tt2Var = tt2.this;
            try {
                if (i == 0) {
                    C0239D.H(obj);
                    ms1 ms1Var = (ms1) tt2Var.C.j(ms1.CQf.w);
                    this.A = 1;
                    if (ms1Var.K(this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                Iterator<Map.Entry<ah1.QnHx, rt2>> it = tt2Var.E.entrySet().iterator();
                while (it.hasNext()) {
                    rt2 value = it.next().getValue();
                    value.x.h();
                    ((ThreadPoolExecutor) value.w.a()).shutdown();
                }
                ((Closeable) ((oa0) tt2Var.A.getValue())).close();
                return sd5.a;
            } catch (Throwable th) {
                Iterator<Map.Entry<ah1.QnHx, rt2>> it2 = tt2Var.E.entrySet().iterator();
                while (it2.hasNext()) {
                    rt2 value2 = it2.next().getValue();
                    value2.x.h();
                    ((ThreadPoolExecutor) value2.w.a()).shutdown();
                }
                ((Closeable) ((oa0) tt2Var.A.getValue())).close();
                throw th;
            }
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class T23 extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ zp3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(zp3 zp3Var) {
            super(1);
            this.w = zp3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            zp3 zp3Var = this.w;
            if (zp3Var != null) {
                zp3Var.close();
            }
            return sd5.a;
        }
    }

    @if0(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {71, 78, 80}, m = "execute")
    public static final class YKK extends b90 {
        public jg1 A;
        public /* synthetic */ Object B;
        public int D;
        public tt2 z;

        public YKK(z80<? super YKK> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return tt2.this.y0(null, this);
        }
    }

    @if0(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {113}, m = "executeHttpRequest")
    public static final class auxFixed extends b90 {
        public la0 A;
        public jg1 B;
        public u91 C;
        public /* synthetic */ Object D;
        public int F;
        public tt2 z;

        public auxFixed(z80<? super auxFixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            tt2 tt2Var = tt2.this;
            ry4 ry4Var = tt2.F;
            return tt2Var.e(null, null, null, null, this);
        }
    }

    @if0(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {102}, m = "executeWebSocketRequest")
    public static final class byN extends b90 {
        public la0 A;
        public u91 B;
        public au2 C;
        public /* synthetic */ Object D;
        public int F;
        public tt2 z;

        public byN(z80<? super byN> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            ry4 ry4Var = tt2.F;
            return tt2.this.h(null, null, null, this);
        }
    }

    public tt2(st2 st2Var) {
        this.z = st2Var;
        this.E = DesugarCollections.synchronizedMap(new ax1(new F1(this), LPt8Fixed.w, st2Var.c));
        la0 la0VarA = la0.QnHx.a(new xw4((ms1) super.g().j(ms1.CQf.w)), new ab0());
        this.C = la0VarA;
        this.D = super.g().g0(la0VarA);
        fp1.j0(ha1.w, super.g(), 3, new QnHx(null));
    }

    public static sg1 c(xp3 xp3Var, u91 u91Var, Object obj, la0 la0Var) {
        ag1 ag1Var;
        ag1 ag1Var2;
        zg1 zg1Var = new zg1(xp3Var.z, xp3Var.y);
        int iOrdinal = xp3Var.x.ordinal();
        if (iOrdinal == 0) {
            ag1Var = ag1.f;
        } else if (iOrdinal == 1) {
            ag1Var = ag1.e;
        } else {
            if (iOrdinal != 2) {
                ag1 ag1Var3 = ag1.d;
                if (iOrdinal == 3 || iOrdinal == 4) {
                    ag1Var2 = ag1Var3;
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ag1Var = ag1.h;
                }
                return new sg1(zg1Var, u91Var, new du2(xp3Var.B), ag1Var2, obj, la0Var);
            }
            ag1Var = ag1.g;
        }
        ag1Var2 = ag1Var;
        return new sg1(zg1Var, u91Var, new du2(xp3Var.B), ag1Var2, obj, la0Var);
    }

    @Override // defpackage.ze1
    public final st2 D() {
        return this.z;
    }

    @Override // defpackage.df1, defpackage.ze1
    public final Set<ff1<?>> G() {
        return this.B;
    }

    @Override // defpackage.df1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        int i = ms1.j;
        la0.CQf cQfJ = this.C.j(ms1.CQf.w);
        if (cQfJ == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        }
        ((jx) cQfJ).h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(rt2 rt2Var, cp3 cp3Var, la0 la0Var, jg1 jg1Var, z80<? super sg1> z80Var) throws Throwable {
        auxFixed auxVar;
        tt2 tt2Var;
        u91 u91Var;
        Object obj;
        yh yhVarC;
        if (z80Var instanceof auxFixed) {
            auxVar = (auxFixed) z80Var;
            int i = auxVar.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                auxVar.F = i - Integer.MIN_VALUE;
            } else {
                auxVar = new auxFixed(z80Var);
            }
        } else {
            auxVar = new auxFixed(z80Var);
        }
        Object obj2 = auxVar.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = auxVar.F;
        if (i2 == 0) {
            C0239D.H(obj2);
            u91 u91VarA = df0.a(null);
            auxVar.z = this;
            auxVar.A = la0Var;
            auxVar.B = jg1Var;
            auxVar.C = u91VarA;
            auxVar.F = 1;
            xm xmVar = new xm(1, ps0.L(auxVar));
            xmVar.r();
            rt2Var.getClass();
            bj3 bj3Var = new bj3(rt2Var, cp3Var, false);
            bj3Var.h(new qt2(jg1Var, xmVar));
            xmVar.B(new cu2(bj3Var));
            Object objP = xmVar.p();
            if (objP == va0Var) {
                return va0Var;
            }
            tt2Var = this;
            obj2 = objP;
            u91Var = u91VarA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u91Var = auxVar.C;
            jg1Var = auxVar.B;
            la0Var = auxVar.A;
            tt2Var = auxVar.z;
            C0239D.H(obj2);
        }
        xp3 xp3Var = (xp3) obj2;
        zp3 zp3Var = xp3Var.C;
        ((ms1) la0Var.j(ms1.CQf.w)).r0(new T23(zp3Var));
        if (zp3Var == null || (yhVarC = zp3Var.c()) == null || (obj = xnX3.c(ha1.w, la0Var, false, new yt2(yhVarC, la0Var, jg1Var, null)).x) == null) {
            fk.a.getClass();
            obj = (fk) fk.QnHx.b.getValue();
        }
        tt2Var.getClass();
        return c(xp3Var, u91Var, obj, la0Var);
    }

    @Override // defpackage.df1, defpackage.ua0
    public final la0 g() {
        return this.D;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(rt2 rt2Var, cp3 cp3Var, la0 la0Var, z80<? super sg1> z80Var) throws Throwable {
        byN byn;
        tt2 tt2Var;
        u91 u91Var;
        au2 au2Var;
        if (z80Var instanceof byN) {
            byn = (byN) z80Var;
            int i = byn.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                byn.F = i - Integer.MIN_VALUE;
            } else {
                byn = new byN(z80Var);
            }
        } else {
            byn = new byN(z80Var);
        }
        Object obj = byn.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = byn.F;
        if (i2 == 0) {
            C0239D.H(obj);
            u91 u91VarA = df0.a(null);
            this.z.getClass();
            au2 au2Var2 = new au2(rt2Var, cp3Var, la0Var);
            au2Var2.y.G0(au2Var2);
            byn.z = this;
            byn.A = la0Var;
            byn.B = u91VarA;
            byn.C = au2Var2;
            byn.F = 1;
            Object objU = au2Var2.z.U(byn);
            if (objU == va0Var) {
                return va0Var;
            }
            tt2Var = this;
            u91Var = u91VarA;
            obj = objU;
            au2Var = au2Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            au2Var = byn.C;
            u91Var = byn.B;
            la0Var = byn.A;
            tt2Var = byn.z;
            C0239D.H(obj);
        }
        tt2Var.getClass();
        return c((xp3) obj, u91Var, au2Var, la0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.ze1
    public final Object y0(jg1 jg1Var, z80<? super sg1> z80Var) throws Throwable {
        YKK ykk;
        jg1 jg1Var2;
        tt2 tt2Var;
        String string;
        String string2;
        jg1 jg1Var3;
        B8C dp3Var;
        if (z80Var instanceof YKK) {
            ykk = (YKK) z80Var;
            int i = ykk.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykk.D = i - Integer.MIN_VALUE;
            } else {
                ykk = new YKK(z80Var);
            }
        } else {
            ykk = new YKK(z80Var);
        }
        YKK ykk2 = ykk;
        Object objE = ykk2.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = ykk2.D;
        if (i2 == 0) {
            C0239D.H(objE);
            ykk2.z = this;
            ykk2.A = jg1Var;
            ykk2.D = 1;
            Set<String> set = bg5.a;
            la0 la0Var = ((zw1) ykk2.x.j(zw1.x)).w;
            if (la0Var == va0Var) {
                return va0Var;
            }
            jg1Var2 = jg1Var;
            objE = la0Var;
            tt2Var = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C0239D.H(objE);
                }
                if (i2 == 3) {
                    C0239D.H(objE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jg1 jg1Var4 = ykk2.A;
            tt2 tt2Var2 = ykk2.z;
            C0239D.H(objE);
            jg1Var2 = jg1Var4;
            tt2Var = tt2Var2;
        }
        la0 la0Var2 = (la0) objE;
        cp3.QnHx qnHx = new cp3.QnHx();
        String strD = jg1Var2.a.h;
        if (iv4.x(strD, "ws:", true)) {
            strD = ur1.d(strD.substring(3), "http:");
        } else if (iv4.x(strD, "wss:", true)) {
            strD = ur1.d(strD.substring(4), "https:");
        }
        ch1.QnHx qnHx2 = new ch1.QnHx();
        qnHx2.d(null, strD);
        qnHx.a = qnHx2.a();
        xt2 xt2Var = new xt2(qnHx);
        Set<String> set2 = bg5.a;
        mc1 mc1Var = jg1Var2.c;
        dw2 dw2Var = jg1Var2.d;
        zf5 zf5Var = new zf5(mc1Var, dw2Var);
        oc1 oc1Var = new oc1(0);
        zf5Var.invoke(oc1Var);
        qn qnVar = new qn();
        for (Map.Entry<String, List<String>> entry : oc1Var.b.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            int i3 = 0;
            while (i3 < size) {
                arrayList.add(value.get(i3));
                i3++;
                value = value;
            }
            qnVar.put(key, arrayList);
        }
        ag5 ag5Var = new ag5(xt2Var);
        Iterator it = qnVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ag5Var.invoke((String) entry2.getKey(), (List) entry2.getValue());
        }
        List<String> list = rf1.a;
        if (mc1Var.get("User-Agent") == null && dw2Var.c().get("User-Agent") == null) {
            boolean z = v53.a;
            xt2Var.invoke("User-Agent", "Ktor client");
        }
        n80 n80VarB = dw2Var.b();
        if ((n80VarB == null || (string = n80VarB.toString()) == null) && (string = dw2Var.c().get("Content-Type")) == null) {
            string = mc1Var.get("Content-Type");
        }
        Long lA = dw2Var.a();
        if ((lA == null || (string2 = lA.toString()) == null) && (string2 = dw2Var.c().get("Content-Length")) == null) {
            string2 = mc1Var.get("Content-Length");
        }
        if (string != null) {
            xt2Var.invoke("Content-Type", string);
        }
        if (string2 != null) {
            xt2Var.invoke("Content-Length", string2);
        }
        uf1 uf1Var = jg1Var2.b;
        if (!eu.g(uf1Var.a)) {
            jg1Var3 = jg1Var2;
            dp3Var = null;
        } else if (dw2Var instanceof dw2.QnHx) {
            byte[] bArrD = ((dw2.QnHx) dw2Var).d();
            int length = bArrD.length;
            jg1Var3 = jg1Var2;
            qf5.c(bArrD.length, 0, length);
            dp3Var = new dp3(length, 0, bArrD);
        } else {
            jg1Var3 = jg1Var2;
            if (dw2Var instanceof dw2.F1) {
                dp3Var = new ku4(dw2Var.a(), new ut2(dw2Var));
            } else if (dw2Var instanceof dw2.LPt8Fixed) {
                dp3Var = new ku4(dw2Var.a(), new wt2(dw2Var, la0Var2));
            } else {
                if (!(dw2Var instanceof dw2.CQf)) {
                    throw new UnsupportedContentTypeException(dw2Var);
                }
                long j = 0;
                qf5.c(j, j, j);
                dp3Var = new dp3(0, 0, new byte[0]);
            }
        }
        qnHx.c(uf1Var.a, dp3Var);
        cp3 cp3VarA = qnHx.a();
        Map<ah1.QnHx, rt2> map = tt2Var.E;
        ah1.CQf cQf = ah1.d;
        rt2 rt2Var = map.get(jg1Var3.a());
        if (rt2Var == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed".toString());
        }
        if (dw2Var instanceof rs) {
            ykk2.z = null;
            ykk2.A = null;
            ykk2.D = 2;
            objE = tt2Var.h(rt2Var, cp3VarA, la0Var2, ykk2);
            return objE == va0Var ? va0Var : objE;
        }
        ykk2.z = null;
        ykk2.A = null;
        ykk2.D = 3;
        objE = tt2Var.e(rt2Var, cp3VarA, la0Var2, jg1Var3, ykk2);
        return objE == va0Var ? va0Var : objE;
    }
}
