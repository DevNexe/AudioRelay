package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    public static final t1 a = new t1();

    public static final class CQf implements kq2<p9> {
        public static final CQf a = new CQf();
        public static final yw0 b = yw0.a("logRequest");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            lq2Var.a(b, ((p9) obj).a());
        }
    }

    public static final class F1 implements kq2<gs> {
        public static final F1 a = new F1();
        public static final yw0 b = yw0.a("clientType");
        public static final yw0 c = yw0.a("androidClientInfo");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            gs gsVar = (gs) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, gsVar.b());
            lq2Var2.a(c, gsVar.a());
        }
    }

    public static final class LPt8Fixed implements kq2<k52> {
        public static final LPt8Fixed a = new LPt8Fixed();
        public static final yw0 b = yw0.a("eventTimeMs");
        public static final yw0 c = yw0.a("eventCode");
        public static final yw0 d = yw0.a("eventUptimeMs");
        public static final yw0 e = yw0.a("sourceExtension");
        public static final yw0 f = yw0.a("sourceExtensionJsonProto3");
        public static final yw0 g = yw0.a("timezoneOffsetSeconds");
        public static final yw0 h = yw0.a("networkConnectionInfo");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            k52 k52Var = (k52) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.f(b, k52Var.b());
            lq2Var2.a(c, k52Var.a());
            lq2Var2.f(d, k52Var.c());
            lq2Var2.a(e, k52Var.e());
            lq2Var2.a(f, k52Var.f());
            lq2Var2.f(g, k52Var.g());
            lq2Var2.a(h, k52Var.d());
        }
    }

    public static final class NUlFixed implements kq2<o52> {
        public static final NUlFixed a = new NUlFixed();
        public static final yw0 b = yw0.a("requestTimeMs");
        public static final yw0 c = yw0.a("requestUptimeMs");
        public static final yw0 d = yw0.a("clientInfo");
        public static final yw0 e = yw0.a("logSource");
        public static final yw0 f = yw0.a("logSourceName");
        public static final yw0 g = yw0.a("logEvent");
        public static final yw0 h = yw0.a("qosTier");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            o52 o52Var = (o52) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.f(b, o52Var.f());
            lq2Var2.f(c, o52Var.g());
            lq2Var2.a(d, o52Var.a());
            lq2Var2.a(e, o52Var.c());
            lq2Var2.a(f, o52Var.d());
            lq2Var2.a(g, o52Var.b());
            lq2Var2.a(h, o52Var.e());
        }
    }

    public static final class QnHx implements kq2<QlK2> {
        public static final QnHx a = new QnHx();
        public static final yw0 b = yw0.a("sdkVersion");
        public static final yw0 c = yw0.a("model");
        public static final yw0 d = yw0.a("hardware");
        public static final yw0 e = yw0.a("device");
        public static final yw0 f = yw0.a("product");
        public static final yw0 g = yw0.a("osBuild");
        public static final yw0 h = yw0.a("manufacturer");
        public static final yw0 i = yw0.a("fingerprint");
        public static final yw0 j = yw0.a("locale");
        public static final yw0 k = yw0.a("country");
        public static final yw0 l = yw0.a("mccMnc");
        public static final yw0 m = yw0.a("applicationBuild");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            QlK2 qlK2 = (QlK2) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, qlK2.l());
            lq2Var2.a(c, qlK2.i());
            lq2Var2.a(d, qlK2.e());
            lq2Var2.a(e, qlK2.c());
            lq2Var2.a(f, qlK2.k());
            lq2Var2.a(g, qlK2.j());
            lq2Var2.a(h, qlK2.g());
            lq2Var2.a(i, qlK2.d());
            lq2Var2.a(j, qlK2.f());
            lq2Var2.a(k, qlK2.b());
            lq2Var2.a(l, qlK2.h());
            lq2Var2.a(m, qlK2.a());
        }
    }

    public static final class YKK implements kq2<gn2> {
        public static final YKK a = new YKK();
        public static final yw0 b = yw0.a("networkType");
        public static final yw0 c = yw0.a("mobileSubtype");

        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            gn2 gn2Var = (gn2) obj;
            lq2 lq2Var2 = lq2Var;
            lq2Var2.a(b, gn2Var.b());
            lq2Var2.a(c, gn2Var.a());
        }
    }

    public final void a(ns0<?> ns0Var) {
        CQf cQf = CQf.a;
        st1 st1Var = (st1) ns0Var;
        st1Var.a(p9.class, cQf);
        st1Var.a(n2.class, cQf);
        NUlFixed nUl = NUlFixed.a;
        st1Var.a(o52.class, nUl);
        st1Var.a(v3.class, nUl);
        F1 f1 = F1.a;
        st1Var.a(gs.class, f1);
        st1Var.a(o2.class, f1);
        QnHx qnHx = QnHx.a;
        st1Var.a(QlK2.class, qnHx);
        st1Var.a(j2.class, qnHx);
        LPt8Fixed lPt8 = LPt8Fixed.a;
        st1Var.a(k52.class, lPt8);
        st1Var.a(u3.class, lPt8);
        YKK ykk = YKK.a;
        st1Var.a(gn2.class, ykk);
        st1Var.a(x3.class, ykk);
    }
}
