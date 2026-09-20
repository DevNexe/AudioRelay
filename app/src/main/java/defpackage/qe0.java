package defpackage;

import android.content.Context;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class qe0 implements a90, pm0, i91, qf6 {
    public static ej1 w;
    public static ej1 y;
    public static final jt x = new jt(null);
    public static final /* synthetic */ qe0 z = new qe0();

    public static final void b(ls0 ls0Var) {
        if ((ls0Var instanceof eu1 ? (eu1) ls0Var : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + nl3.a(ls0Var.getClass()));
    }

    public static final tt1 c(pf0 pf0Var) {
        tt1 tt1Var = pf0Var instanceof tt1 ? (tt1) pf0Var : null;
        if (tt1Var != null) {
            return tt1Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + nl3.a(pf0Var.getClass()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r7 == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Long d(defpackage.wj r11, defpackage.wj r12, long r13, defpackage.z80 r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.oa4
            if (r0 == 0) goto L13
            r0 = r15
            oa4 r0 = (defpackage.oa4) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            oa4 r0 = new oa4
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.D
            int r1 = r0.E
            r2 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L7a
            if (r1 == r4) goto L64
            r11 = 2
            if (r1 == r11) goto L3f
            r11 = 3
            if (r1 != r11) goto L37
            long r11 = r0.C
            long r13 = r0.B
            wj r1 = r0.A
            wj r6 = r0.z
            defpackage.C0239D.H(r15)
            r7 = r2
            goto L55
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            long r11 = r0.C
            long r13 = r0.B
            wj r1 = r0.A
            wj r6 = r0.z
            defpackage.C0239D.H(r15)
            java.lang.Number r15 = (java.lang.Number) r15
            long r7 = r15.longValue()
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 != 0) goto L55
            goto L9e
        L55:
            long r11 = r11 - r7
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 > 0) goto L60
            r9 = r11
            r12 = r1
            r11 = r6
            r6 = r13
            r13 = r9
            goto L98
        L60:
            r1.getClass()
            throw r5
        L64:
            long r11 = r0.C
            long r13 = r0.B
            wj r0 = r0.z
            defpackage.C0239D.H(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L76
            goto L9e
        L76:
            r0.getClass()
            throw r5
        L7a:
            defpackage.C0239D.H(r15)
            if (r11 == r12) goto L81
            r15 = 1
            goto L82
        L81:
            r15 = 0
        L82:
            if (r15 == 0) goto Lb3
            java.lang.Throwable r15 = r11.n()
            if (r15 == 0) goto L97
            java.lang.Throwable r11 = r11.n()
            r12.a(r11)
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r2)
            return r11
        L97:
            r6 = r13
        L98:
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 > 0) goto La5
            r11 = r13
            r13 = r6
        L9e:
            long r13 = r13 - r11
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r13)
            return r11
        La5:
            r0.z = r11
            r0.A = r12
            r0.B = r6
            r0.C = r13
            r0.E = r4
            r11.getClass()
            throw r5
        Lb3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed requirement."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe0.d(wj, wj, long, z80):java.lang.Long");
    }

    public static final ej1 e() {
        ej1 ej1Var = w;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.Bluetooth");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(17.71f, 7.71f);
        le3Var.g(12.0f, 2.0f);
        le3Var.f(-1.0f);
        le3Var.n(7.59f);
        le3Var.g(6.41f, 5.0f);
        le3Var.g(5.0f, 6.41f);
        le3Var.g(10.59f, 12.0f);
        le3Var.g(5.0f, 17.59f);
        le3Var.g(6.41f, 19.0f);
        le3Var.g(11.0f, 14.41f);
        le3Var.g(11.0f, 22.0f);
        le3Var.f(1.0f);
        le3Var.h(5.71f, -5.71f);
        le3Var.h(-4.3f, -4.29f);
        le3Var.h(4.3f, -4.29f);
        le3Var.b();
        le3Var.i(13.0f, 5.83f);
        le3Var.h(1.88f, 1.88f);
        le3Var.g(13.0f, 9.59f);
        le3Var.g(13.0f, 5.83f);
        le3Var.b();
        le3Var.i(14.88f, 16.29f);
        le3Var.g(13.0f, 18.17f);
        le3Var.n(-3.76f);
        le3Var.h(1.88f, 1.88f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        w = ej1VarD;
        return ej1VarD;
    }

    public static tw2 f(g30 g30Var) {
        g30Var.e(1809802212);
        JHf.QnHx qnHx = JHf.a;
        g30Var.e(-81138291);
        Context context = (Context) g30Var.E(Ll.b);
        rw2 rw2Var = (rw2) g30Var.E(sw2.a);
        g30Var.e(511388516);
        boolean zI = g30Var.I(context) | g30Var.I(rw2Var);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = rw2Var != null ? new HdLS(context, rw2Var) : JHf.a;
            g30Var.B(objF);
        }
        g30Var.G();
        tw2 tw2Var = (tw2) objF;
        g30Var.G();
        g30Var.G();
        return tw2Var;
    }

    @Override // defpackage.pm0
    public List a(String str) throws UnknownHostException {
        try {
            return oV9.j0(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(ur1.d(str, "Broken system behaviour for dns lookup of "));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        int iOrdinal = ((ct1) obj).ordinal();
        coNFixed con = coNFixed.Rectangle;
        if (iOrdinal == 0 || iOrdinal == 1) {
            return con;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.a90
    public /* bridge */ /* synthetic */ Object then(w05 w05Var) {
        return null;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(u77.x.zza().zzc());
    }
}
