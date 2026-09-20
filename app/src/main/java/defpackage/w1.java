package defpackage;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.request.metrics.AdOperationMetric;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 {
    public static final w1 a = new w1();

    public static final class CQf implements kq2<bc0.F1> {
        public static final CQf a = new CQf();
        public static final yw0 b = yw0.a(SubscriberAttributeKt.JSON_NAME_KEY);
        public static final yw0 c = yw0.a("value");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.F1 f1 = (bc0.F1) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, f1.a());
            lq2Var2.a(c, f1.b());
        }
    }

    public static final class EQ implements kq2<bc0.NUlFixed.LPt8Fixed.QnHx> {
        public static final EQ a = new EQ();
        public static final yw0 b = yw0.a("execution");
        public static final yw0 c = yw0.a("customAttributes");
        public static final yw0 d = yw0.a("internalKeys");
        public static final yw0 e = yw0.a("background");
        public static final yw0 f = yw0.a("uiOrientation");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.QnHx qnHx = (bc0.NUlFixed.LPt8Fixed.QnHx) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, qnHx.c());
            lq2Var2.a(c, qnHx.b());
            lq2Var2.a(d, qnHx.d());
            lq2Var2.a(e, qnHx.a());
            lq2Var2.e(f, qnHx.e());
        }
    }

    public static final class F1 implements kq2<bc0> {
        public static final F1 a = new F1();
        public static final yw0 b = yw0.a("sdkVersion");
        public static final yw0 c = yw0.a("gmpAppId");
        public static final yw0 d = yw0.a("platform");
        public static final yw0 e = yw0.a("installationUuid");
        public static final yw0 f = yw0.a("buildVersion");
        public static final yw0 g = yw0.a("displayVersion");
        public static final yw0 h = yw0.a("session");
        public static final yw0 i = yw0.a("ndkPayload");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0 bc0Var = (bc0) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, bc0Var.g());
            lq2Var2.a(c, bc0Var.c());
            lq2Var2.e(d, bc0Var.f());
            lq2Var2.a(e, bc0Var.d());
            lq2Var2.a(f, bc0Var.a());
            lq2Var2.a(g, bc0Var.b());
            lq2Var2.a(h, bc0Var.h());
            lq2Var2.a(i, bc0Var.e());
        }
    }

    public static final class FJCM implements kq2<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx> {
        public static final FJCM a = new FJCM();
        public static final yw0 b = yw0.a("baseAddress");
        public static final yw0 c = yw0.a("size");
        public static final yw0 d = yw0.a(MediationMetaData.KEY_NAME);
        public static final yw0 e = yw0.a("uuid");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx abstractC0052QnHx = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.f(b, abstractC0052QnHx.a());
            lq2Var2.f(c, abstractC0052QnHx.c());
            lq2Var2.a(d, abstractC0052QnHx.b());
            String strD = abstractC0052QnHx.d();
            lq2Var2.a(e, strD != null ? strD.getBytes(bc0.a) : null);
        }
    }

    public static final class LPt6Fixed implements kq2<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx> {
        public static final LPt6Fixed a = new LPt6Fixed();
        public static final yw0 b = yw0.a("pc");
        public static final yw0 c = yw0.a("symbol");
        public static final yw0 d = yw0.a("file");
        public static final yw0 e = yw0.a("offset");
        public static final yw0 f = yw0.a("importance");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx abstractC0050QnHx = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.f(b, abstractC0050QnHx.d());
            lq2Var2.a(c, abstractC0050QnHx.e());
            lq2Var2.a(d, abstractC0050QnHx.a());
            lq2Var2.f(e, abstractC0050QnHx.c());
            lq2Var2.e(f, abstractC0050QnHx.b());
        }
    }

    public static final class LPt8Fixed implements kq2<bc0.LPt8Fixed> {
        public static final LPt8Fixed a = new LPt8Fixed();
        public static final yw0 b = yw0.a("files");
        public static final yw0 c = yw0.a("orgId");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.LPt8Fixed lPt8 = (bc0.LPt8Fixed) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, lPt8.a());
            lq2Var2.a(c, lPt8.b());
        }
    }

    public static final class LPt9Fixed implements kq2<bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8> {
        public static final LPt9Fixed a = new LPt9Fixed();
        public static final yw0 b = yw0.a("content");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            lq2Var.a(b, ((bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8) obj).a());
        }
    }

    public static final class MZ implements kq2<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8> {
        public static final MZ a = new MZ();
        public static final yw0 b = yw0.a(MediationMetaData.KEY_NAME);
        public static final yw0 c = yw0.a("importance");
        public static final yw0 d = yw0.a("frames");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8 abstractC0049LPt8 = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, abstractC0049LPt8.c());
            lq2Var2.e(c, abstractC0049LPt8.b());
            lq2Var2.a(d, abstractC0049LPt8.a());
        }
    }

    public static final class NUlFixed implements kq2<bc0.LPt8Fixed.QnHx> {
        public static final NUlFixed a = new NUlFixed();
        public static final yw0 b = yw0.a("filename");
        public static final yw0 c = yw0.a("contents");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.LPt8Fixed.QnHx qnHx = (bc0.LPt8Fixed.QnHx) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, qnHx.b());
            lq2Var2.a(c, qnHx.a());
        }
    }

    public static final class PRnFixed implements kq2<bc0.NUlFixed.LPt8Fixed.QnHx.CQf> {
        public static final PRnFixed a = new PRnFixed();
        public static final yw0 b = yw0.a("threads");
        public static final yw0 c = yw0.a("exception");
        public static final yw0 d = yw0.a("appExitInfo");
        public static final yw0 e = yw0.a("signal");
        public static final yw0 f = yw0.a("binaries");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.QnHx.CQf cQf = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, cQf.e());
            lq2Var2.a(c, cQf.c());
            lq2Var2.a(d, cQf.a());
            lq2Var2.a(e, cQf.d());
            lq2Var2.a(f, cQf.b());
        }
    }

    public static final class QnHx implements kq2<bc0.QnHx> {
        public static final QnHx a = new QnHx();
        public static final yw0 b = yw0.a("pid");
        public static final yw0 c = yw0.a("processName");
        public static final yw0 d = yw0.a("reasonCode");
        public static final yw0 e = yw0.a("importance");
        public static final yw0 f = yw0.a("pss");
        public static final yw0 g = yw0.a("rss");
        public static final yw0 h = yw0.a("timestamp");
        public static final yw0 i = yw0.a("traceFile");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.QnHx qnHx = (bc0.QnHx) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.e(b, qnHx.b());
            lq2Var2.a(c, qnHx.c());
            lq2Var2.e(d, qnHx.e());
            lq2Var2.e(e, qnHx.a());
            lq2Var2.f(f, qnHx.d());
            lq2Var2.f(g, qnHx.f());
            lq2Var2.f(h, qnHx.g());
            lq2Var2.a(i, qnHx.h());
        }
    }

    public static final class RBi implements kq2<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1> {
        public static final RBi a = new RBi();
        public static final yw0 b = yw0.a(MediationMetaData.KEY_NAME);
        public static final yw0 c = yw0.a("code");
        public static final yw0 d = yw0.a("address");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1 f1 = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, f1.c());
            lq2Var2.a(c, f1.b());
            lq2Var2.f(d, f1.a());
        }
    }

    public static final class T23 implements kq2<bc0.NUlFixed.F1> {
        public static final T23 a = new T23();
        public static final yw0 b = yw0.a("arch");
        public static final yw0 c = yw0.a("model");
        public static final yw0 d = yw0.a("cores");
        public static final yw0 e = yw0.a("ram");
        public static final yw0 f = yw0.a("diskSpace");
        public static final yw0 g = yw0.a("simulator");
        public static final yw0 h = yw0.a(AdOperationMetric.INIT_STATE);
        public static final yw0 i = yw0.a("manufacturer");
        public static final yw0 j = yw0.a("modelClass");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.F1 f1 = (bc0.NUlFixed.F1) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.e(b, f1.a());
            lq2Var2.a(c, f1.e());
            lq2Var2.e(d, f1.b());
            lq2Var2.f(e, f1.g());
            lq2Var2.f(f, f1.c());
            lq2Var2.d(g, f1.i());
            lq2Var2.e(h, f1.h());
            lq2Var2.a(i, f1.d());
            lq2Var2.a(j, f1.f());
        }
    }

    public static final class Xn1 implements kq2<bc0.NUlFixed.LPt8Fixed.F1> {
        public static final Xn1 a = new Xn1();
        public static final yw0 b = yw0.a("batteryLevel");
        public static final yw0 c = yw0.a("batteryVelocity");
        public static final yw0 d = yw0.a("proximityOn");
        public static final yw0 e = yw0.a(AdUnitActivity.EXTRA_ORIENTATION);
        public static final yw0 f = yw0.a("ramUsed");
        public static final yw0 g = yw0.a("diskUsed");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.F1 f1 = (bc0.NUlFixed.LPt8Fixed.F1) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, f1.a());
            lq2Var2.e(c, f1.b());
            lq2Var2.d(d, f1.f());
            lq2Var2.e(e, f1.d());
            lq2Var2.f(f, f1.e());
            lq2Var2.f(g, f1.c());
        }
    }

    public static final class YKK implements kq2<bc0.NUlFixed.QnHx> {
        public static final YKK a = new YKK();
        public static final yw0 b = yw0.a("identifier");
        public static final yw0 c = yw0.a(MediationMetaData.KEY_VERSION);
        public static final yw0 d = yw0.a("displayVersion");
        public static final yw0 e = yw0.a("organization");
        public static final yw0 f = yw0.a("installationUuid");
        public static final yw0 g = yw0.a("developmentPlatform");
        public static final yw0 h = yw0.a("developmentPlatformVersion");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.QnHx qnHx = (bc0.NUlFixed.QnHx) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, qnHx.d());
            lq2Var2.a(c, qnHx.g());
            lq2Var2.a(d, qnHx.c());
            lq2Var2.a(e, qnHx.f());
            lq2Var2.a(f, qnHx.e());
            lq2Var2.a(g, qnHx.a());
            lq2Var2.a(h, qnHx.b());
        }
    }

    public static final class auxFixed implements kq2<bc0.NUlFixed.QnHx.AbstractC0056QnHx> {
        public static final auxFixed a = new auxFixed();
        public static final yw0 b = yw0.a("clsId");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            ((bc0.NUlFixed.QnHx.AbstractC0056QnHx) obj).a();
            lq2Var.a(b, null);
        }
    }

    public static final class byN implements kq2<bc0.NUlFixed> {
        public static final byN a = new byN();
        public static final yw0 b = yw0.a("generator");
        public static final yw0 c = yw0.a("identifier");
        public static final yw0 d = yw0.a("startedAt");
        public static final yw0 e = yw0.a("endedAt");
        public static final yw0 f = yw0.a("crashed");
        public static final yw0 g = yw0.a("app");
        public static final yw0 h = yw0.a("user");
        public static final yw0 i = yw0.a("os");
        public static final yw0 j = yw0.a("device");
        public static final yw0 k = yw0.a("events");
        public static final yw0 l = yw0.a("generatorType");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed nUl = (bc0.NUlFixed) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, nUl.e());
            lq2Var2.a(c, nUl.g().getBytes(bc0.a));
            lq2Var2.f(d, nUl.i());
            lq2Var2.a(e, nUl.c());
            lq2Var2.d(f, nUl.k());
            lq2Var2.a(g, nUl.a());
            lq2Var2.a(h, nUl.j());
            lq2Var2.a(i, nUl.h());
            lq2Var2.a(j, nUl.b());
            lq2Var2.a(k, nUl.d());
            lq2Var2.e(l, nUl.f());
        }
    }

    public static final class ck32 implements kq2<bc0.NUlFixed.YKK> {
        public static final ck32 a = new ck32();
        public static final yw0 b = yw0.a("identifier");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            lq2Var.a(b, ((bc0.NUlFixed.YKK) obj).a());
        }
    }

    public static final class lPt3Fixed implements kq2<bc0.NUlFixed.AbstractC0055NUl> {
        public static final lPt3Fixed a = new lPt3Fixed();
        public static final yw0 b = yw0.a("platform");
        public static final yw0 c = yw0.a(MediationMetaData.KEY_VERSION);
        public static final yw0 d = yw0.a("buildVersion");
        public static final yw0 e = yw0.a("jailbroken");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.AbstractC0055NUl abstractC0055NUl = (bc0.NUlFixed.AbstractC0055NUl) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.e(b, abstractC0055NUl.b());
            lq2Var2.a(c, abstractC0055NUl.c());
            lq2Var2.a(d, abstractC0055NUl.a());
            lq2Var2.d(e, abstractC0055NUl.d());
        }
    }

    public static final class ta implements kq2<bc0.NUlFixed.LPt8Fixed> {
        public static final ta a = new ta();
        public static final yw0 b = yw0.a("timestamp");
        public static final yw0 c = yw0.a("type");
        public static final yw0 d = yw0.a("app");
        public static final yw0 e = yw0.a("device");
        public static final yw0 f = yw0.a("log");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed lPt8 = (bc0.NUlFixed.LPt8Fixed) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.f(b, lPt8.d());
            lq2Var2.a(c, lPt8.e());
            lq2Var2.a(d, lPt8.a());
            lq2Var2.a(e, lPt8.b());
            lq2Var2.a(f, lPt8.c());
        }
    }

    public static final class y implements kq2<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf> {
        public static final y a = new y();
        public static final yw0 b = yw0.a("type");
        public static final yw0 c = yw0.a("reason");
        public static final yw0 d = yw0.a("frames");
        public static final yw0 e = yw0.a("causedBy");
        public static final yw0 f = yw0.a("overflowCount");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, abstractC0048CQf.e());
            lq2Var2.a(c, abstractC0048CQf.d());
            lq2Var2.a(d, abstractC0048CQf.b());
            lq2Var2.a(e, abstractC0048CQf.a());
            lq2Var2.e(f, abstractC0048CQf.c());
        }
    }

    public final void a(ns0<?> ns0Var) {
        F1 f1 = F1.a;
        st1 st1Var = (st1) ns0Var;
        st1Var.a(bc0.class, f1);
        st1Var.a(p2.class, f1);
        byN byn = byN.a;
        st1Var.a(bc0.NUlFixed.class, byn);
        st1Var.a(v2.class, byn);
        YKK ykk = YKK.a;
        st1Var.a(bc0.NUlFixed.QnHx.class, ykk);
        st1Var.a(x2.class, ykk);
        auxFixed auxVar = auxFixed.a;
        st1Var.a(bc0.NUlFixed.QnHx.AbstractC0056QnHx.class, auxVar);
        st1Var.a(y2.class, auxVar);
        ck32 ck32Var = ck32.a;
        st1Var.a(bc0.NUlFixed.YKK.class, ck32Var);
        st1Var.a(l3.class, ck32Var);
        lPt3Fixed lpt3 = lPt3Fixed.a;
        st1Var.a(bc0.NUlFixed.AbstractC0055NUl.class, lpt3);
        st1Var.a(k3.class, lpt3);
        T23 t23 = T23.a;
        st1Var.a(bc0.NUlFixed.F1.class, t23);
        st1Var.a(z2.class, t23);
        ta taVar = ta.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.class, taVar);
        st1Var.a(a3.class, taVar);
        EQ eq = EQ.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.QnHx.class, eq);
        st1Var.a(b3.class, eq);
        PRnFixed pRn = PRnFixed.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.QnHx.CQf.class, pRn);
        st1Var.a(c3.class, pRn);
        MZ mz = MZ.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.class, mz);
        st1Var.a(g3.class, mz);
        LPt6Fixed lPt6 = LPt6Fixed.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx.class, lPt6);
        st1Var.a(h3.class, lPt6);
        y yVar = y.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf.class, yVar);
        st1Var.a(e3.class, yVar);
        QnHx qnHx = QnHx.a;
        st1Var.a(bc0.QnHx.class, qnHx);
        st1Var.a(r2.class, qnHx);
        RBi rBi = RBi.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1.class, rBi);
        st1Var.a(f3.class, rBi);
        FJCM fjcm = FJCM.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx.class, fjcm);
        st1Var.a(d3.class, fjcm);
        CQf cQf = CQf.a;
        st1Var.a(bc0.F1.class, cQf);
        st1Var.a(s2.class, cQf);
        Xn1 xn1 = Xn1.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.F1.class, xn1);
        st1Var.a(i3.class, xn1);
        LPt9Fixed lPt9 = LPt9Fixed.a;
        st1Var.a(bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8.class, lPt9);
        st1Var.a(j3.class, lPt9);
        LPt8Fixed lPt8 = LPt8Fixed.a;
        st1Var.a(bc0.LPt8Fixed.class, lPt8);
        st1Var.a(t2.class, lPt8);
        NUlFixed nUl = NUlFixed.a;
        st1Var.a(bc0.LPt8Fixed.QnHx.class, nUl);
        st1Var.a(u2.class, nUl);
    }
}
